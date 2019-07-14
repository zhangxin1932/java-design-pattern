package com.zy.designPattern.state;

/**
 * 定义ATM状态
 */
public interface ATMState {
    /**
     * 插卡
     */
    void insertCard();
    /**
     * 验证密码
     */
    void verifyPwd();
    /**
     * 取款
     */
    void getCash();
    /**
     * 显示余额
     */
    void queryBalance();
    /**
     * 退卡
     */
    void exitCard();
}
