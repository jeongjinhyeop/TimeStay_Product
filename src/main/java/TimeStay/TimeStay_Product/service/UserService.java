package TimeStay.TimeStay_Product.service;

import TimeStay.TimeStay_Product.vo.UserVO;

import java.util.List;

public interface UserService {

    List<UserVO> login(UserVO login);

}
