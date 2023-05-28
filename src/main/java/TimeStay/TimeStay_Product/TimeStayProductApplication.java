package TimeStay.TimeStay_Product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value="TimeStay.TimeStay_Product.mapper")
@SpringBootApplication
public class TimeStayProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeStayProductApplication.class, args);
	}

}
