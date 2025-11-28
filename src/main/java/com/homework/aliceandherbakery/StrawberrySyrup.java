package com.homework.aliceandherbakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "Strawberry")
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("I am Strawberry Syrup");
    }
}
