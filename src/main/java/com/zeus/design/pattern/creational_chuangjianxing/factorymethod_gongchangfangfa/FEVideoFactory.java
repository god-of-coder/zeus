package com.zeus.design.pattern.creational_chuangjianxing.factorymethod_gongchangfangfa;

/**
 * Created by liangyu
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
