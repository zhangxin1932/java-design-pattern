package com.zy.designPattern.strategy;

import java.util.Arrays;

/**
 * 具体策略类:
 *   计算平均值: 去头去尾
 */
public class ComputeStrategyAvgFreeHeadAndTail implements ComputeStrategy {

    @Override
    public double computeScore(double[] scores) {
        if (scores == null || scores.length < 3) {
            return 0;
        }
        double sum = 0;
        Arrays.sort(scores);
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }
        return sum / (scores.length - 2);
    }
}
