package sk.demo.kubernetes.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sk.demo.kubernetes.userservice.entity.UserEntity;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

//    private final UserRepository repo;

    public UserEntity create(UserEntity user) {
        return user;
    }

    public UserEntity get(UUID id) {
        return new UserEntity(UUID.randomUUID(), "TEST", "TEST-XXX");
    }
}