package TimeStay.TimeStay_Product.controller;

import TimeStay.TimeStay_Product.service.UserServiceImpl;
import TimeStay.TimeStay_Product.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserServiceImpl userServiceImpl;

    @GetMapping("/login")
    public String index (Model model){

        return "login";
    }
    @PostMapping("/auth")
    public String UserAuth(HttpServletRequest req, RedirectAttributes re, HttpSession session) {
        UserVO uv = new UserVO();
        uv.setUmail(req.getParameter("UMAIL"));
        uv.setUpwd(req.getParameter("UPWD"));
        System.out.println(userServiceImpl.login(uv));
        if(userServiceImpl.login(uv)==null) {
            // re.addAttribute("loginFail", true);
            re.addFlashAttribute("loginFail", true);
            return "redirect:/login";
        }
        session.setAttribute("UMAIL", req.getParameter("UMAIL"));
        return "redirect:/products/bakery";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest req) {
        // getSession 세션이 있으면 세션을 반환, true = 없을시 새 세션 생성, false = 없을시 null
        HttpSession session = req.getSession(false);
        if(session != null) {
            session.invalidate();
        }
        return "redirect:/user/login";
    }
}
