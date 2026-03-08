package sk.demo.kubernetes.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sk.demo.kubernetes.userservice.entity.UserEntity;
import sk.demo.kubernetes.userservice.entity.repository.UserRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private static final UUID DEFAULT_UUID = UUID.fromString("7c0e65a9-b6b3-4078-8b7e-5555fd27f2c4");

    private final UserRepository repo;

    public UserEntity create(UserEntity user) {
        return user;
    }

    public UserEntity get(UUID id) {
        return new UserEntity(UUID.randomUUID(), "TEST", "TEST-XXX");
    }

    public UserEntity getDefault() {
        return repo.findById(DEFAULT_UUID)
                .orElse(repo.save(new UserEntity(DEFAULT_UUID, "DEFAULT", "USER")));
    }
}