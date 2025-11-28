package com.homework.aliceandherbakery;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary
@ConditionalOnProperty(name = "frosting.type", havingValue = "Chocolate")
@Component
public class ChocolateFrosting implements Frosting {


    @Override
    public void getFrostingType() {
        System.out.println("I am Chocolate Frosting");
    }
}
