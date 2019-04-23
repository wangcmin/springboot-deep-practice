package com.zhangjianbing.autoconfig.conditionconfig.profileconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author 张建兵 Ryan
 * time 2019/4/23
 */
@Profile("java7")
@Service
public class Java7ForImpl implements ICalculatorService {

    @Override
    public  Integer sum(Integer... values) {
        System.out.println("java7---------执行");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Java7ForImpl i = new Java7ForImpl();
        Integer sum = i.sum(1, 2, 3);
        System.out.println(sum);
    }

}
