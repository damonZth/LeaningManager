package com.zth.damon.Bridge;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Person man = new Man();
        Person lady = new Lady();

        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);

    }
}
