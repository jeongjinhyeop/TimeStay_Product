package TimeStay.TimeStay_Product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductMapper {
    @Select("select sysdate from dual")
    public String getTime();

    public String getTime2();
}
