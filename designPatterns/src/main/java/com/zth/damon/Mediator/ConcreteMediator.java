package com.zth.damon.Mediator;

/**
 * Created by Damon on 2017/8/7.
 */
public class ConcreteMediator extends Mediator {
    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if (content.equals("boss")) {
            //老板来了, 通知员工A
            ca.action();
        }
        if (content.equals("client")) {
            //客户来了, 通知前台B
            cb.action();
        }

    }
}
