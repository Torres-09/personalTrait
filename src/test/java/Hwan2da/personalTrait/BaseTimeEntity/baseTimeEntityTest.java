package Hwan2da.personalTrait.BaseTimeEntity;

import Hwan2da.personalTrait.entity.User;
import Hwan2da.personalTrait.repository.UserRepository;
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
                .username("임세환")
                .nickname("hwan2da")
                .build();
        //when
        userRepository.save(user);

        //then
        Assertions.assertThat(user.getCreatedAt()).isAfter(localDateTime);
    }
}
