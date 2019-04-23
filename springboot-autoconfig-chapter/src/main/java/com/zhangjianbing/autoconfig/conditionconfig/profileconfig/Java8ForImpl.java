package com.zhangjianbing.autoconfig.conditionconfig.profileconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author 张建兵 Ryan
 * time 2019/4/23
 */
@Profile("java8")
@Service
public class Java8ForImpl implements ICalculatorService {

    @Override
    public Integer sum(Integer... values) {
        System.out.println("java8---------执行");
        int sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }

    public static void main(String[] args) {
        Java8ForImpl i = new Java8ForImpl();
        Integer sum = i.sum(1, 2, 3);
        System.out.println(sum);
    }

}
