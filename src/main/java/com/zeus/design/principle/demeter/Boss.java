package com.zeus.design.principle.demeter;


/**
 * Created by liangyu
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
