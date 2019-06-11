package com.zy.designPattern.strategy;

/**
 * 上下文类包含策略声明的变量，此变量可用于保存具体策略的引用
 */
public class SubjectAvgScore {

    private ComputeStrategy computeStrategy;

    public void setComputeStrategy(ComputeStrategy computeStrategy) {
        this.computeStrategy = computeStrategy;
    }

    public double getAvgScore(double[] scores) {
        if (computeStrategy != null) {
            return computeStrategy.computeScore(scores);
        }
        return 0;
    }
}
