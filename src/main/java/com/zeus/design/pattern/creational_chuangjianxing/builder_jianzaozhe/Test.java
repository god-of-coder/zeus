package com.zeus.design.pattern.creational_chuangjianxing.builder_jianzaozhe;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        // rec：参数尽量使用抽象类和接口
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

        /**
         * 建造者方法总结：
         *
         * 抽象工厂，针对的是产品族，即从美的工厂里面取出的东西都是美的的
         *
         *
         * 1、优点
         * rec: 具体产品在应用层代码隔离，无需关心创建细节
         * rec: 将一个系列的产品族统一到一起创建
         *
         * 2、缺点
         * rec: 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
         * rec: 增加了系统的抽象性和理解难度
         *
         * */

    }
}
