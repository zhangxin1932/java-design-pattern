package com.zy.designPattern.builer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirShipDirectorChina implements AirShipDirector {

    @Setter
    private AirShipBuilder airShipBuilder;

    @Override
    public AirShip directAirShip() {
        OrbitalModule orbitalModule = airShipBuilder.buildOrbitalModule();
        EngineModule engineModule = airShipBuilder.buildEngineModule();
        EscapeTower escapeTower = airShipBuilder.buildEscapeTower();
        return new AirShip(orbitalModule, engineModule, escapeTower);
    }
}
