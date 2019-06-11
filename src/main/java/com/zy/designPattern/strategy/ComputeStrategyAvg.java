package com.zy.designPattern.strategy;

/**
 * 具体策略类:
 *   计算平均值
 */
public class ComputeStrategyAvg implements ComputeStrategy {

    @Override
    public double computeScore(double[] scores) {
        if (scores == null) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i ++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

}
