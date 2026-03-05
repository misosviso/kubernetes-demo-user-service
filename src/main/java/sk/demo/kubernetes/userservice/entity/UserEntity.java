package sk.demo.kubernetes.userservice.entity;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class UserEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
}
