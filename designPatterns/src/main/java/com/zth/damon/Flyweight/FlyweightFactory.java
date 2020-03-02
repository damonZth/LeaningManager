package com.zth.damon.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Damon on 2017/8/7.
 */
public class FlyweightFactory {
    private static Map flyweights = new HashMap();

    public FlyweightFactory(String arg){
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key){
        if(flyweights.get(key) == null){
            flyweights.put(key, new FlyweightImpl());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize(){
        return flyweights.size();
    }
}
