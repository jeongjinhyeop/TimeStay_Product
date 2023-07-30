package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.ProductReviewVO;
import TimeStay.TimeStay_Product.vo.ProductVO;

import java.util.HashMap;
import java.util.List;

public interface ProductService {

     List<String> PcateLength(String pcategorySub);

     List<String> Pcategory(String pcategorySub);

     List<ProductVO> PcategoryidxTest(int pcategoryidx,String pcategorySub);

     List<ProductVO> ProductDetail(String ptitle);

     int InsertReview(ProductReviewVO rvo);

     List<ProductReviewVO> ReviewList(int pidx);
     int delReview(ProductReviewVO dvo);
     int upReview(ProductReviewVO uvo);
     public String dateCheck(ProductReviewVO rwdate);

}
