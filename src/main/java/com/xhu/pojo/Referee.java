package com.xhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maps
 * @create 2020-03-07 15:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Referee {

    private Integer refereeId;
    private String refereeName;
    private Integer refereeAge;
    private String refereeGender;
    private String refereePhone;

}
