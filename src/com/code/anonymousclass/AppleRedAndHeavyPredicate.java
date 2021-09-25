package com.code.anonymousclass;


public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        // TODO Auto-generated method stub
        return Corlor.RED.equals(apple.getColor()) &&(apple.getWeight() > 150);

    }
    
}
