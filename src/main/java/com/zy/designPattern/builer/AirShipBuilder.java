package com.zy.designPattern.builer;

/**
 * 构建者
 */
public interface AirShipBuilder {

    OrbitalModule buildOrbitalModule();

    EngineModule buildEngineModule();

    EscapeTower buildEscapeTower();
}
