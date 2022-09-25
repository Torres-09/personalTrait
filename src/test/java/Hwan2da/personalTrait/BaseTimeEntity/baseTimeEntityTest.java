package Hwan2da.personalTrait.BaseTimeEntity;

import Hwan2da.personalTrait.domain.user.model.User;
import Hwan2da.personalTrait.domain.user.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class baseTimeEntityTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void baseTimeEntityByUserTest() throws Exception{
        //given
        LocalDateTime localDateTime = LocalDateTime.now();

        User user = User.builder()
                .name("임세환")
                .nickName("hwan2da")
                .build();
        //when
        userRepository.save(user);

        //then
        Assertions.assertThat(user.getCreatedAt()).isAfter(localDateTime);
    }
}
