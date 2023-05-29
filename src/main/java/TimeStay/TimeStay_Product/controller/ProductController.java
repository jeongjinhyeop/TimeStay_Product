package TimeStay.TimeStay_Product.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping("/product")
    public  String product(Model model, int Pcategoryidx) {
        ProductVO pcategory = productServiceImpl.Pcategory(Pcategoryidx);
        System.out.println("Pcategoryidx:"+Pcategoryidx);
        List<ProductVO> productList = productServiceImpl.ProductList(Pcategoryidx);//href로 Pcategoryidx만 넘겨주면될듯.. 만약 숫자가 두개 넘어갈땐? @Requestparam도 고려
        System.out.println("productList:"+productList);
        model.addAttribute("pcategory",pcategory);
        model.addAttribute("productList",productList);
        return "Product";
    }

}
