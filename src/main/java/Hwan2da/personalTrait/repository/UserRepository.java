package Hwan2da.personalTrait.repository;

import Hwan2da.personalTrait.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByNickName(String nickName);
}
