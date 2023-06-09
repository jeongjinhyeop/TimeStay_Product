package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.ProductVO;

import java.util.HashMap;
import java.util.List;

public interface ProductService {
     List<ProductVO> test();
     List<String> PcateLength(String PcategorySub);

     String Pcategory(int Pcategoryidx,String PcategorySub);

     List<ProductVO> PcategoryidxTest(int Pcategoryidx,String PcategorySub);

}
