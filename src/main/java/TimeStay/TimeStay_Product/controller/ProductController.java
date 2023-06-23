package TimeStay.TimeStay_Product.controller;

import java.util.*;
import java.util.stream.DoubleStream;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductReviewVO;
import TimeStay.TimeStay_Product.vo.ProductVO;
import TimeStay.TimeStay_Product.vo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/product/{PcategorySub}/{Ptitle}")
    public  String productDetail(Model model,@PathVariable String PcategorySub,@PathVariable String Ptitle,ProductReviewVO rvo) {
        List<ProductVO> pitem = productServiceImpl.ProductDetail(Ptitle);
        List<ProductReviewVO> review=productServiceImpl.ReviewList(pitem.get(0).getPidx());
        model.addAttribute("review",review);
        model.addAttribute("pitem",pitem);
        return "ProductDetail";
    }
    @PostMapping("/product/{PcategorySub}/{Ptitle}")
    public  String Review(Model model,@PathVariable String PcategorySub,@PathVariable String Ptitle,
                          @ModelAttribute("Insert") ProductReviewVO review ,int Ridx){
        System.out.println("delReview"+review);
        String date =productServiceImpl.dateCheck(review);
        System.out.println("date"+date);
        review.setRidx(Ridx);
        System.out.println("delReview111"+review);
        System.out.println("delReview111"+review.getRidx());
        System.out.println("RRRRidx"+Ridx);


        if (review.getRidx()==0) {
            int del = productServiceImpl.delReview(review);
            System.out.println("ininin");
        }else if (review.getRidx()!=0){
            int rvo=productServiceImpl.InsertReview(review);
            System.out.println("deldel");
        }else if (review.getRwdate()==null) {
            System.out.println("upup");
        }
        return "redirect:/product/{PcategorySub}/{Ptitle}";
    }


}
