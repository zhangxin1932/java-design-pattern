package com.zy.designPattern.state;

public class NoCashState implements ATMState {
    //保留状态持有者的引用，以便对其进行操作
    private ATM atm;

    public NoCashState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡完成");
    }

    @Override
    public void verifyPwd() {
        System.out.println("密码已提交");
        if ("123456".equals(atm.getPwd())) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }

    @Override
    public void getCash() {
        System.out.println("取款失败, ATM里无钞票");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额是:--->" + atm.getBalance());
    }

    @Override
    public void exitCard() {
        System.out.println("卡已退出");
    }
}
