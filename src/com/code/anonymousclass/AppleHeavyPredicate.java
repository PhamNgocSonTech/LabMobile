package com.code.anonymousclass;

public class AppleHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        // TODO Auto-generated method stub
        return apple.getWeight() > 150;
    }
    
}
