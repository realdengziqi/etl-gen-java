package com.atguigu.etl_gen;

import java.util.Random;

/**
 * @author: realdengziqi
 * @date: 2022-12-05 10:40
 * @description: 生成带汉字的浮点数
 */
public class FloatGen {

    Random random;

    public FloatGen() {
        random = new Random();
    }

    public String genOne() {
        double d1 = random.nextDouble() * 100000;
        String s =  Double.toString(d1);
        int index = random.nextInt(s.length());
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(index,(char)(0x4e00+random.nextInt(0x9fbf-0x4e00)));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        FloatGen floatGen = new FloatGen();
        System.out.println(floatGen.genOne());
    }
}
