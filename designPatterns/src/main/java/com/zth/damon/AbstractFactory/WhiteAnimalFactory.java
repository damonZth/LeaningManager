package com.zth.damon.AbstractFactory;

/**
 * Created by Damon on 2017/8/6.
 * 实现创建具体产品对象的操作。
 */
public class WhiteAnimalFactory implements AnimalFactory {
    @Override
    public Cat createCat() {
        return new WhiteCat();
    }

    @Override
    public Dog createDog() {
        return new WhiteDog();
    }
}
