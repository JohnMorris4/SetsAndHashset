package com.morrisje.SolarSystem;

import com.morrisje.HeavenlyBody;

/**
 * Created by jmorris on 1/27/18
 */
public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
