package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.ProductVO;

import java.util.HashMap;
import java.util.List;

public interface ProductService {
     List<ProductVO> test();
     List<ProductVO> ProductList(String Pcategory);

     List<String> Pcategory(int Pcategoryidx);

     List<ProductVO> PcategoryidxTest(int Pcategoryidx,String Pcategory);

}
