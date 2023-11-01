package de.baaasty.vehiclevibes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/v1/auth")
@RestController
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "Login";      
    }

    @PostMapping("/register")
    public String register() {
        return "Register";      
    }

    // (!Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?])(?=\\S+$).{8,}$")

}
