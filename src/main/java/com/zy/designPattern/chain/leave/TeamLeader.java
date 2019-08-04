package com.zy.designPattern.chain.leave;

/**
 * 组长继承领导抽象类，组长的职能是批一天以内的假
 */
public class TeamLeader extends Boss {
    public TeamLeader(String name) {
        super(name);
    }
    @Override
    public void handler(LeaveRequest request) {
        if (request.getDays() <= 1) {
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
