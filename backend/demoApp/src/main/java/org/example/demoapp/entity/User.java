package org.example.demoapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User {


    private String name;
    @Id
    private String email;
    private String phone;
    private String gender;
    private String birthday;
    private String password;
}
