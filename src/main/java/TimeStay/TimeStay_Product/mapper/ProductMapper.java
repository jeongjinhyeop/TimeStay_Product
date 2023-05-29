package TimeStay.TimeStay_Product.mapper;

import TimeStay.TimeStay_Product.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {


    public List<ProductVO> test();
    public List<ProductVO> ProductList(int Pcategoryidx);
    public ProductVO Pcategory(int Pcategoryidx);

}
