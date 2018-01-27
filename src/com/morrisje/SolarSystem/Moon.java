package com.morrisje.SolarSystem;

import com.morrisje.HeavenlyBody;

/**
 * Created by jmorris on 1/27/18
 */
public class Moon  extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
