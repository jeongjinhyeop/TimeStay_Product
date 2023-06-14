package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.ProductVO;

import java.util.HashMap;
import java.util.List;

public interface ProductService {

     List<String> PcateLength(String PcategorySub);

     List<String> Pcategory(String PcategorySub);

     List<ProductVO> PcategoryidxTest(int Pcategoryidx,String PcategorySub);

     List<ProductVO> ProductDetail(String Ptitle);

}
