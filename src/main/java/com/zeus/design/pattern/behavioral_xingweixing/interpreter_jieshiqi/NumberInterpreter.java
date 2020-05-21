package com.zeus.design.pattern.behavioral_xingweixing.interpreter_jieshiqi;

/**
 * @Author liangyu
 * @create 2020/4/21 10:12 上午
 * @Description
 */
public class NumberInterpreter implements Interpreter {

    private int number;
    public NumberInterpreter(int number){
        this.number = number;
    }

    public NumberInterpreter(String number){
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpreter() {
        return this.number;
    }
}
