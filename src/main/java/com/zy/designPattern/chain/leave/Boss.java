package com.zy.designPattern.chain.leave;
import lombok.Data;
/**
 * 接收者（领导链）
 */
@Data
public abstract class Boss {
    protected String bossName;
    protected Boss nextBoss;
    public Boss(String bossName) {
        this.bossName = bossName;
    }
    public abstract void handler(LeaveRequest request);
}
