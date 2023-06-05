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
    @RequestMapping("/product/{Pcategory}")
    public  String product(Model model,@PathVariable String Pcategory) {
        ArrayList<Object> pv =new ArrayList<>();//hashmap key값으로 category받고 value값으로 object가져와도 될거같은데
        ArrayList<Object> cate =new ArrayList<>();
        if (Pcategory.equals("bread")) {
            for (int i = 1; i < 3; i++) {
                pv.add(productServiceImpl.PcategoryidxTest(i));
                cate.add(productServiceImpl.Pcategory(i));

            }
        }
        String[] str = new String[2];
        str[0]="빵";
        str[1]="디저트";
        System.out.println("pv1"+pv.get(0));//문제
        System.out.println("pv2"+pv.get(1));
        System.out.println("cate"+cate);
        System.out.println("pv:"+pv);
       // List<ProductVO> pcategory = productServiceImpl.Pcategory();
        List<ProductVO> productList = productServiceImpl.ProductList(Pcategory);//href로 Pcategoryidx만 넘겨주면될듯.. 만약 숫자가 두개 넘어갈땐? @Requestparam도 고려
        model.addAttribute("str",str);
       model.addAttribute("pv",pv);
        model.addAttribute("cate",cate);
        model.addAttribute("productList",productList);
        return "Product";
    }

}
