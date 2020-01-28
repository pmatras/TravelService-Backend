package io.travelservice.rest;

import io.travelservice.user.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class LoginApi {

    @PostMapping("/login")
    public boolean loginUser(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        return User.authenticateUser(username, password);
    }
}
