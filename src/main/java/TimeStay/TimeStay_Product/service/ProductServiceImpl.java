package TimeStay.TimeStay_Product.service;

//import TimeStay.TimeStay_Product.dao.ProductDAO;
import TimeStay.TimeStay_Product.mapper.ProductMapper;
import TimeStay.TimeStay_Product.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<ProductVO> ProductList(int Pcategoryidx) {
        return productDAO.ProductList(Pcategoryidx);
    }

    @Override
    public ProductVO Pcategory(int Pcaategoryidx) {
        return productDAO.Pcategory(Pcaategoryidx);
    }


}



