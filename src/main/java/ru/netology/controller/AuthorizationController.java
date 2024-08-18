package ru.netology.controller;

import jakarta.validation.Valid;
import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.Authorities;
import ru.netology.service.AuthorizationService;

import java.util.List;

@RestController
@RequestMapping
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user.getUser(), user.getPassword());
    }
}
