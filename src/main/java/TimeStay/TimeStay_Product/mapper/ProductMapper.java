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

    public List<String> PcateLength(String PcategorySub);
    public List<String> Pcategory(String PcategorySub);
    public List<ProductVO> PcategoryidxTest(int Pcategoryidx,String PcategorySub);
    public List<ProductVO> ProductDetail(String Ptitle);
    public int InsertReview(ProductReviewVO rvo);
    public List<ProductReviewVO> ReviewList(int Pidx);
    public int delReview(ProductReviewVO dvo);
    public String dateCheck(ProductReviewVO Rwdate);
}
