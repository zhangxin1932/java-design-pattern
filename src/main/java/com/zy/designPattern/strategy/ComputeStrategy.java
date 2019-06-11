package com.zy.designPattern.strategy;

/**
 * 策略接口
 */
public interface ComputeStrategy {

    /**
     * 策略抽象方法
     * @param scores
     * @return
     */
    double computeScore(double[] scores);
}
