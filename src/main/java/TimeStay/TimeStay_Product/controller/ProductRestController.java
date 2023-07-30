package TimeStay.TimeStay_Product.controller;

import TimeStay.TimeStay_Product.service.ProductServiceImpl;
import TimeStay.TimeStay_Product.vo.ProductReviewVO;
import TimeStay.TimeStay_Product.vo.ProductVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestController {
    @Autowired
    private final ProductServiceImpl productServiceImpl;

    //rest api 적용
    @GetMapping("/Reviews/{ptitle}")
    public List<ProductReviewVO> getReview(@PathVariable String ptitle){
        List<ProductVO> pitem = productServiceImpl.ProductDetail(ptitle);
        return productServiceImpl.ReviewList(pitem.get(0).getPidx());
    }
    @PostMapping("/Reviews/{id}")
    public int postReview(@PathVariable String id, @RequestBody ProductReviewVO review){
        System.out.println("check"+review);
        review.setUserid(id);
        System.out.println("check1"+review);
        return productServiceImpl.InsertReview(review);
    }

}
