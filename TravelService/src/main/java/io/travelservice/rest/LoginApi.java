package io.travelservice.rest;

import io.travelservice.database.UsersRepository;
import io.travelservice.user.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
public class LoginApi {

    @PostMapping("/login")
    public boolean login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        return User.authenticateUser(username, password);
    }
}