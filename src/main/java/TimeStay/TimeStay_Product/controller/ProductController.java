package TimeStay.TimeStay_Product.controller;

import java.util.*;
import java.util.stream.DoubleStream;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductReviewVO;
import TimeStay.TimeStay_Product.vo.ProductVO;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductServiceImpl productServiceImpl;

    @GetMapping("/{PcategorySub}")
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
    @GetMapping("/{PcategorySub}/{Ptitle}")
    public  String productDetail(Model model,@PathVariable String PcategorySub,@PathVariable String Ptitle,ProductReviewVO rvo
                                  ,HttpSession session) {
        List<ProductVO> pitem = productServiceImpl.ProductDetail(Ptitle);
        String id =(String)session.getAttribute("UMAIL");
        model.addAttribute("Umail",id);
        model.addAttribute("pitem",pitem);
        return "ProductDetail";
    }

    //rest api 사용하지 않고 코드 줄여보기
/*    @PostMapping("/{PcategorySub}/{Ptitle}")
    public  String Review(Model model,@PathVariable String PcategorySub,@PathVariable String Ptitle,
                          @ModelAttribute("Insert") ProductReviewVO review){
        if (review.getRidx()!=0&& review.getRtext()!=null){
            productServiceImpl.upReview(review);
        }else if (review.getRidx()!=0 ){
            productServiceImpl.delReview(review);
        }else {
            productServiceImpl.InsertReview(review);
        }
        return "redirect:/products/{PcategorySub}/{Ptitle}";
    }*/


    //rest api 적용해보기
    @GetMapping("/Reviews/{Ptitle}")
    @ResponseBody
    public List<ProductReviewVO> getReview(@PathVariable String Ptitle){
        List<ProductVO> pitem = productServiceImpl.ProductDetail(Ptitle);
        return productServiceImpl.ReviewList(pitem.get(0).getPidx());
    }
    @PostMapping("/Reviews/{id}")
    @ResponseBody
    public int postReview(@PathVariable String id, @RequestBody ProductReviewVO review){
        ProductReviewVO  productReviewVO =new ProductReviewVO();
        review.setUserid(id);
//        review.setPidx(4);
////        review.setRscore(4);
//        review.setRtext("123");
//        review.setRdelyn("N");
        System.out.println(review);


        return productServiceImpl.InsertReview(review);
    }

}
