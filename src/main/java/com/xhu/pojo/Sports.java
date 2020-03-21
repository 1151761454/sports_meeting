package com.xhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maps
 * @create 2020-03-11 12:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sports {
    private Integer sportsId;
    private String sportsName;
    private String sportsType;
    private Integer sportsNumber;
    private String sportsTime;
    private String sportsPlace;
    private String sportsStatus;
    private String sportsReferee;
}
