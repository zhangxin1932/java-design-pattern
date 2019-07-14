package com.zy.designPattern.state;

public class NoServiceState implements ATMState {
    //保留状态持有者的引用，以便对其进行操作
    private ATM atm;

    public NoServiceState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡失败，机器发生了故障");
    }

    @Override
    public void verifyPwd() {
        System.out.println("密码提交失败，机器发生了故障");
    }

    @Override
    public void getCash() {
        System.out.println("取款失败, 机器故障");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额查询失败，机器发生了故障");
    }

    @Override
    public void exitCard() {
        System.out.println("取卡失败，机器发生了故障");
    }
}
