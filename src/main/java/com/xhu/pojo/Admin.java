package com.xhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maps
 * @create 2020-03-08 20:06
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {

    private Integer adminId;
    private String adminName;
    private String adminGender;
    private Integer adminAge;
    private String adminPhone;
    private String adminPassword;
}
