package com.zy.designPattern.chain.leave;

import org.junit.Test;
public class ChainTest {
    @Test
    public void fn01() {
        Boss teamLeader = new TeamLeader("teamLeader");
        Boss managerLeader = new ManagerLeader("managerLeader");
        teamLeader.setNextBoss(managerLeader);
        // 请假: 从小到大
        LeaveRequest request = new LeaveRequest("tom", 2, "有事了");
        teamLeader.handler(request);
    }
}
