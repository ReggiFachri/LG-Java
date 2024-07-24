package com.lgcns.chapter13;

public class CakeEatings{
    public static void main(String[] args){
        CakePlate plate = new CakePlate();
        CakeEater eater = new CakeEater(plate);
        CakeMaker maker = new CakeMaker(plate);

        eater.start();
        maker.start();
    }
}
