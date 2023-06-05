package TimeStay.TimeStay_Product.service;

//import TimeStay.TimeStay_Product.dao.ProductDAO;
import TimeStay.TimeStay_Product.mapper.ProductMapper;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productDAO;

    @Override
    public List<ProductVO> test() {
        return productDAO.test();
    }

    @Override
    public List<ProductVO> ProductList(String Pcategory) {
        return productDAO.ProductList(Pcategory);
    }

    @Override
    public List<String> Pcategory(int Pcategoryidx) {
        return productDAO.Pcategory(Pcategoryidx);
    }


    @Override
    public List<ProductVO> PcategoryidxTest(int Pcategoryidx) {
        return productDAO.PcategoryidxTest(Pcategoryidx);
    }


}



