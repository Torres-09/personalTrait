package Hwan2da.personalTrait.domain.user.controller;

import Hwan2da.personalTrait.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
}