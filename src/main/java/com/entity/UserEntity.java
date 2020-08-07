package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private Integer id;
    private String mobile;
    private String password;
    private String sex;
    private LocalDate birthday;
    private String address;
    private String email;
    private String state;
    private LocalDate createTime;
    private LocalDate updateTime;


}
