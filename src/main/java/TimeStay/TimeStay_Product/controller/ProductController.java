package TimeStay.TimeStay_Product.controller;

import java.util.*;
import java.util.stream.DoubleStream;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductServiceImpl productServiceImpl;

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
    @RequestMapping("/product/{PcategorySub}/{Ptitle}")
    public  String productDetail(Model model,@PathVariable String PcategorySub,@PathVariable String Ptitle) {
        List<ProductVO> pitem = productServiceImpl.ProductDetail(Ptitle);

        Map ratingOptions = new HashMap();
        ratingOptions.put(0, "☆☆☆☆☆");
        ratingOptions.put(1, "★☆☆☆☆");
        ratingOptions.put(2, "★★☆☆☆");
        ratingOptions.put(3, "★★★☆☆");
        ratingOptions.put(4, "★★★★☆");
        ratingOptions.put(5, "★★★★★");
        model.addAttribute("ratingOptions", ratingOptions);
        model.addAttribute("pitem",pitem);
        return "ProductDetail";
    }

}
