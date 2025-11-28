package com.homework.aliceandherbakery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

     Frosting frosting;
     Syrup syrup;

    @Autowired
    public CakeBaker(Frosting frosting,Syrup syrup)
    {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
