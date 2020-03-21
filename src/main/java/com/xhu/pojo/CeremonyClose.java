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
public class CeremonyClose {

    private String ceremonyId;
    private String ceremonyName;
    private String ceremonyStartTime;
    private String ceremonyEndTime;
    private String ceremonyPlace;
    private String ceremonyHost;
}
