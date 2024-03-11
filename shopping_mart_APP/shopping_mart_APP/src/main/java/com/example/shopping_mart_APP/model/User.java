package com.example.shopping_mart_APP.model;

import com.example.shopping_mart_APP.dto.enums.User_role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long userId;
    private String userName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)// tell sb that enum variable stores enum.string type
    private User_role role;
}
