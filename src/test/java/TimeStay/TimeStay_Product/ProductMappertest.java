
package TimeStay.TimeStay_Product;


import TimeStay.TimeStay_Product.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ProductMappertest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testGetTime() {
        log.info("productMapper class name: " + productMapper.getClass().getName());

        log.info("productMapper time: " + productMapper.test());
    }
}
