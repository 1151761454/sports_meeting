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
public class SportsScore {

    private Integer stuId;
    private Integer sportsIdScore;
    private String grade;
    private Integer score;

}
