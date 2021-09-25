package com.code.anonymousclass;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, Corlor.GREEN), new Apple(155, Corlor.GREEN),
                new Apple(80, Corlor.RED));

        // List<Apple> redAppleList = filterAppleByCorlor(inventory, Corlor.RED);

        // List<Apple> greedAppleList = filterAppleByCorlor(inventory, Corlor.GREEN);

        ApplePredicate appleGreenPredicate = new AppleGreenCorlorPredicate();

        List<Apple> greedAppleList = filterApples(inventory, appleGreenPredicate);

        // ApplePredicate redAndHeavy = new AppleRedAndHeavyPredicate() ;

        List<Apple> redAppleAndHeavyList = filterApples(inventory, new AppleRedAndHeavyPredicate());

        System.out.println(redAppleAndHeavyList);

        ApplePredicate heavyApplePredicate = new AppleHeavyPredicate();
        List<Apple> heavyApplesList = filterApples(inventory, heavyApplePredicate);
        
        System.out.println(heavyApplesList);

        // System.out.println(greedAppleList);

        List<Apple> redAppleList = filterApples(inventory, new ApplePredicate() {

            @Override
            public boolean test(Apple apple) {
                return Corlor.RED.equals(apple.getColor());
            }

        });

        System.out.println(redAppleList);

    }

    static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }

        }
        return result;
    }

    static List<Apple> filterAppleByCorlor(List<Apple> inventory, Corlor corlor) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(corlor)) {
                result.add(apple);
            }
        }
        return result;
    }

    static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(Corlor.GREEN)) {
                result.add(apple);
            }
        }
        return result;
    }

    static List<Apple> filterRedApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(Corlor.RED)) {
                result.add(apple);
            }
        }
        return result;
    }

}
