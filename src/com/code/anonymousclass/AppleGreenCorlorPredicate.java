package com.code.anonymousclass;

public class AppleGreenCorlorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        // TODO Auto-generated method stub
        
        return Corlor.GREEN.equals(apple.getColor());//true
    }
    
}
