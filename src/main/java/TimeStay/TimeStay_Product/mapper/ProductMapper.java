package TimeStay.TimeStay_Product.mapper;

import TimeStay.TimeStay_Product.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Mapper
public interface ProductMapper {


    public List<ProductVO> test();
    public List<ProductVO> ProductList(String Pcategory);
    public List<String> Pcategory(int Pcategoryidx);

    public List<ProductVO> PcategoryidxTest(int Pcategoryidx);

}
