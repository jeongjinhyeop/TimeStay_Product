package TimeStay.TimeStay_Product.mapper;

import TimeStay.TimeStay_Product.vo.ProductReviewVO;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.lang.invoke.CallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Mapper
public interface ProductMapper {

    public List<String> PcateLength(String pcategorySub);
    public List<String> Pcategory(String pcategorySub);
    public List<ProductVO> PcategoryidxTest(int pcategoryidx,String pcategorySub);
    public List<ProductVO> ProductDetail(String ptitle);
    public int InsertReview(ProductReviewVO rvo);
    public List<ProductReviewVO> ReviewList(int pidx);
    public int delReview(ProductReviewVO dvo);
    public int upReview(ProductReviewVO uvo);
    public String dateCheck(ProductReviewVO rwdate);
}
