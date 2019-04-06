package com.zy.designPattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  非共享对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {

    private int x, y;
}
