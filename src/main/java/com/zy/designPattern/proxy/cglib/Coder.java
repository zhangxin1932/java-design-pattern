package com.zy.designPattern.proxy.cglib;

public class Coder {
    public void code(String morningJob, String afternoonJob, String eveningJob) {
        System.out.println(String.format("程序员每天的生活是: 早上-->{%s}, 下午-->{%s}, 晚上-->{%s}.", morningJob, afternoonJob, eveningJob));
    }
}
