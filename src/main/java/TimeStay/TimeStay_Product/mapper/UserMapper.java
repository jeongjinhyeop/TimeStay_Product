package TimeStay.TimeStay_Product.mapper;

import TimeStay.TimeStay_Product.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserVO> login(UserVO login);

}
