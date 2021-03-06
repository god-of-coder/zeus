package com.zeus.design.pattern.behavioral_xingweixing.state_zhuangtai;

/**
 * @Author liangyu
 * @create 2020/4/21 10:42 下午
 * @Description
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进");

    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放");
    }
}
