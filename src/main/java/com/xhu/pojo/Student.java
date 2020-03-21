package com.xhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 * @author maps
 * @create 2020-03-07 15:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {

    private Integer id;
    private String name;
    private String gender;
    private String school;
    private String phone;
    private String email;
    private String password;


}
