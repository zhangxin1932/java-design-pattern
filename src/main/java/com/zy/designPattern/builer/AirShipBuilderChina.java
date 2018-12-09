package com.zy.designPattern.builer;

public class AirShipBuilderChina implements AirShipBuilder {
    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("构建轨道舱");
    }

    @Override
    public EngineModule buildEngineModule() {
        return new EngineModule("构建发动机");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("构建逃逸塔");
    }
}
