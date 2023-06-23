package TimeStay.TimeStay_Product.service;

//import TimeStay.TimeStay_Product.dao.ProductDAO;
import TimeStay.TimeStay_Product.mapper.ProductMapper;
import TimeStay.TimeStay_Product.vo.ProductReviewVO;
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
    public List<String> PcateLength(String PcategorySub) {
        return productDAO.PcateLength(PcategorySub);
    }


    @Override
    public List<String> Pcategory(String PcategorySub) {
        return productDAO.Pcategory(PcategorySub);
    }


    @Override
    public List<ProductVO> PcategoryidxTest(int Pcategoryidx,String PcategorySub) {
        return productDAO.PcategoryidxTest(Pcategoryidx,PcategorySub);
    }

    @Override
    public List<ProductVO> ProductDetail(String Ptitle) {
        return productDAO.ProductDetail(Ptitle);

    }

    @Override
    public int InsertReview(ProductReviewVO rvo) {
        return productDAO.InsertReview(rvo);
    }

    @Override
    public List<ProductReviewVO> ReviewList(int Pidx) {
        return productDAO.ReviewList(Pidx);
    }

    @Override
    public int delReview(ProductReviewVO dvo) {
        return productDAO.delReview(dvo);
    }

    @Override
    public String dateCheck(ProductReviewVO Rwdate) {
        return productDAO.dateCheck(Rwdate);
    }


}



