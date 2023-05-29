package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.ProductVO;

import java.util.List;

public interface ProductService {
     List<ProductVO> test();
     List<ProductVO> ProductList(int Pcategoryidx);

     ProductVO Pcategory(int Pcaategoryidx);
}
