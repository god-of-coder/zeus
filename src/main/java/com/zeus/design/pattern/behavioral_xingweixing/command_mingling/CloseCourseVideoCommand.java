package com.zeus.design.pattern.behavioral_xingweixing.command_mingling;

/**
 * @Author liangyu
 * @create 2020/4/21 9:51 下午
 * @Description
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
