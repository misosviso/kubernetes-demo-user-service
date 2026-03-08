package sk.demo.kubernetes.userservice.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.demo.kubernetes.userservice.entity.UserEntity;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
