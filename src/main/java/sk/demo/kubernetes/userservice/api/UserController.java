package sk.demo.kubernetes.userservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sk.demo.kubernetes.userservice.entity.UserEntity;
import sk.demo.kubernetes.userservice.service.UserService;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return service.create(user);
    }

    @GetMapping("/default")
    public UserEntity getDefault() {
        return service.getDefault();
    }

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable UUID id) {
        System.out.println("Zdes");
        return service.get(id);
    }
}