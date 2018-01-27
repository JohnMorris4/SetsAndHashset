package com.morrisje.SolarSystem;

import com.morrisje.HeavenlyBody;

/**
 * Created by jmorris on 1/26/18
 */
public class Star extends HeavenlyBody{
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }
}
