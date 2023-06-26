package TimeStay.TimeStay_Product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(value="TimeStay.TimeStay_Product.mapper")
@ComponentScan
@SpringBootApplication
public class TimeStayProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeStayProductApplication.class, args);
	}

}
