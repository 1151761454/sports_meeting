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
public class EntryForm {
    private Integer stuId;
    private String name;
    private String school;
    private Integer sportsIdEntry;
    private String sportsName;
    private String sportsType;

}
