//package TimeStay.TimeStay_Product.controller;
//
//import TimeStay.TimeStay_Product.service.ProductServiceImpl;
//import TimeStay.TimeStay_Product.vo.ProductReviewVO;
//import TimeStay.TimeStay_Product.vo.ProductVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Controller
//@RequiredArgsConstructor
//public class RestProductController {
//    @Autowired
//    private final ProductServiceImpl productServiceImpl;
//
//    @GetMapping("/")
//    public String index (Model model){
//        return "index";
//    }
//    @GetMapping("/products/{PcategorySub}")
//    public  String product(Model model,@PathVariable String PcategorySub) {
//        ArrayList<Object> pv =new ArrayList<>();
//        int len=productServiceImpl.PcateLength(PcategorySub).size();
//        for (int i = 1; i <=len; i++) {
//            pv.add(productServiceImpl.PcategoryidxTest(i,PcategorySub));
//        }
//        List<String> cate=productServiceImpl.Pcategory(PcategorySub);
//        model.addAttribute("pv",pv);
//        model.addAttribute("cate",cate);
//        return "Product";
//    }
//
//    @GetMapping("/products/{PcategorySub}/{Ptitle}")
//    public  List<ProductVO> productDetail(Model model, @PathVariable String PcategorySub, @PathVariable String Ptitle, ProductReviewVO rvo) {
//
//        return productServiceImpl.ProductDetail(Ptitle);
//    }
//
//
//
//
//}
