package com.zy.designPattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StrategyTest {

    public static void main(String[] args) {
        SubjectAvgScore subjectAvgScore = new SubjectAvgScore();
        ComputeStrategyAvg computeStrategyAvg = new ComputeStrategyAvg();
        double[] zhangsanScores = {1, 2, 3, 4, 8};
        Stu zhangsan = new Stu();
        zhangsan.setName("zhangsan");
        subjectAvgScore.setComputeStrategy(computeStrategyAvg);
        System.out.println(zhangsan.getName() + "---->" + subjectAvgScore.getAvgScore(zhangsanScores));
        ComputeStrategyAvgFreeHeadAndTail computeStrategyAvgFreeHeadAndTail = new ComputeStrategyAvgFreeHeadAndTail();
        double[] lisiScores = {1, 2, 3, 4, 8};
        Stu lisi = new Stu();
        lisi.setName("lisi");
        subjectAvgScore.setComputeStrategy(computeStrategyAvgFreeHeadAndTail);
        System.out.println(lisi.getName() + "----->" + subjectAvgScore.getAvgScore(lisiScores));
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Stu {
        private String name;
        private double score;
    }

}
