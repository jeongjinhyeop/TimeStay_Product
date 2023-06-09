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
    public List<String> PcateLength(String PcategorySub) {
        return productDAO.PcateLength(PcategorySub);
    }


    @Override
    public String Pcategory(int Pcategoryidx,String PcategorySub) {
        return productDAO.Pcategory(Pcategoryidx,PcategorySub);
    }


    @Override
    public List<ProductVO> PcategoryidxTest(int Pcategoryidx,String PcategorySub) {
        return productDAO.PcategoryidxTest(Pcategoryidx,PcategorySub);
    }



}



