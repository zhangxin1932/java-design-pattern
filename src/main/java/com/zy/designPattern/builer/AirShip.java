package com.zy.designPattern.builer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirShip {

    private OrbitalModule orbitalModule; // 飞船的轨道舱模块

    private EngineModule engineModule; // 发动机模块

    private EscapeTower escapeTower; // 逃逸塔模块

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class OrbitalModule {
    private String name;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class EngineModule {
    private String name;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class EscapeTower {
    private String name;
}