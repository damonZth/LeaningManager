package com.zth.damon.FactoryMethod;

/**
 * Created by Damon on 2017/8/6.
 *  ConcreteCreator
 * 重新定义工厂方法，返回一个ConcreteProduct实例
 */
public class TeacherWorkFactory implements WorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
