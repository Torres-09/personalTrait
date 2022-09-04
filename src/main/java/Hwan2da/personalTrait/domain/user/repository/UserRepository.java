package Hwan2da.personalTrait.domain.user.repository;

import Hwan2da.personalTrait.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByNickName(String nickName);
}