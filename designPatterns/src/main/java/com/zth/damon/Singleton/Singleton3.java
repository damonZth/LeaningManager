package com.zth.damon.Singleton;

/**
 * Created by Damon on 2017/8/7.
 */
public class Singleton3 {
    public static Singleton3 singleton3 = null;

    private Singleton3(){
        //...
    }

    private static class SingletonFactory{
        private static Singleton3 singleton3 = new Singleton3();
    }

    /**
     * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
     * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
     * 并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
     * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题.
     * @return
     */
    public static Singleton3 getInstance(){
        return SingletonFactory.singleton3;
    }


    public Object readResolve(){
        return singleton3;
    }
}
