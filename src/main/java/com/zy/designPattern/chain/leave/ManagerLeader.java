package com.zy.designPattern.chain.leave;

public class ManagerLeader extends Boss{
    public ManagerLeader(String bossName) {
        super(bossName);
    }
    @Override
    public void handler(LeaveRequest request) {
        if (request.getDays() <= 3) {
            System.out.println(String.format("%s同意了%s的请假,请假时间为%s天, 请假原因:%s",
                    this.getBossName(), request.getName(), request.getDays(), request.getReason()));
        } else {
            if (this.getNextBoss() != null) {
                this.getNextBoss().handler(request);
            } else {
                System.out.println(String.format("%s不能批", this.getBossName()));
            }
        }
    }
}
