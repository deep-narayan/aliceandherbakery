package com.homework.aliceandherbakery;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("I am Chocolate Syrup");
    }
}
