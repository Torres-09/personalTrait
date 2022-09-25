package Hwan2da.personalTrait.domain.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom{

    private final UserRepository userRepository;

    @Override
    public void customMethod() {
    }
}
