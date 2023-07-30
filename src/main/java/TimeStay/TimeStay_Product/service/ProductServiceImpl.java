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
    public List<String> PcateLength(String pcategorySub) {
        return productDAO.PcateLength(pcategorySub);
    }


    @Override
    public List<String> Pcategory(String pcategorySub) {
        return productDAO.Pcategory(pcategorySub);
    }


    @Override
    public List<ProductVO> PcategoryidxTest(int pcategoryidx,String pcategorySub) {
        return productDAO.PcategoryidxTest(pcategoryidx,pcategorySub);
    }

    @Override
    public List<ProductVO> ProductDetail(String ptitle) {
        return productDAO.ProductDetail(ptitle);

    }

    @Override
    public int InsertReview(ProductReviewVO rvo) {
        return productDAO.InsertReview(rvo);
    }

    @Override
    public List<ProductReviewVO> ReviewList(int pidx) {
        return productDAO.ReviewList(pidx);
    }

    @Override
    public int delReview(ProductReviewVO dvo) {
        return productDAO.delReview(dvo);
    }

    @Override
    public int upReview(ProductReviewVO uvo) {
        return productDAO.upReview(uvo);
    }

    @Override
    public String dateCheck(ProductReviewVO rwdate) {
        return productDAO.dateCheck(rwdate);
    }


}



