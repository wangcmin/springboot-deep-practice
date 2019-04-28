package com.zhangjianbing.autoconfig.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
@Data
@NoArgsConstructor
public class Pig {

    private String name;

    private String gender;

    public Pig(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

}
