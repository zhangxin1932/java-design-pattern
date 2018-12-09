package com.zy.designPattern;

import com.zy.designPattern.builer.AirShipBuilderChina;
import com.zy.designPattern.builer.AirShipDirectorChina;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void fn(){
        AirShipDirectorChina airShipDirectorChina = new AirShipDirectorChina(new AirShipBuilderChina());
        airShipDirectorChina.directAirShip();
    }
}
