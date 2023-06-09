package TimeStay.TimeStay_Product.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductServiceImpl productServiceImpl;

    @RequestMapping("/")
    public  String test1(Model model) {

        return "1234";
    }
    @RequestMapping("/index")
    public String test(Model model) {
        List<ProductVO> test =productServiceImpl.test();
        model.addAttribute("test",test);
        System.out.println("test456"+test);
        return "index";
    }
    @RequestMapping("/product/{PcategorySub}")
    public  String product(Model model,@PathVariable String PcategorySub) {
        ArrayList<Object> pv =new ArrayList<>();
        int len=productServiceImpl.PcateLength(PcategorySub).size();
        for (int i = 1; i <=len; i++) {
            pv.add(productServiceImpl.PcategoryidxTest(i,PcategorySub));
        }
        List<String> cate=productServiceImpl.Pcategory(PcategorySub);
        model.addAttribute("pv",pv);
        model.addAttribute("cate",cate);
        return "Product";
    }

}
