package com.homework.aliceandherbakery;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@ConditionalOnProperty(name = "frosting.type", havingValue = "Strawberry")
@Component
public class StrawberryFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("I am Strawberry Frosting");
    }
}
