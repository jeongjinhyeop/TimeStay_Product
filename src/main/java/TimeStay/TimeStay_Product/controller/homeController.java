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
@RequiredArgsConstructor
public class homeController {
    @Autowired
    private final UserServiceImpl userServiceImpl;

    @GetMapping("/")
    public String index (Model model){

        return "login";
    }

}
