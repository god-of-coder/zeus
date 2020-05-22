package com.zeus.design.pattern.creational_chuangjianxing.simplefactory_jiandangongchang;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        //rec: 用反射来弥补简单工厂的扩展性
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();

        /**
         * rec: Java的静态方法会在类的初始化的时候执行
         * rec: jdbc的驱动通过反射Class.forName(***Driver)得到类，相当于Class.forName("***Driver",true,this.getClass().getClassLoader())，会执行类的初始化过程
         * rec: 在Driver类中，静态方法会执行DriverManager.registerDriver(new Driver())，因此在DriverManager中可以直接使用
         * */


    }

}
