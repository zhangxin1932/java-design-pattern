package com.zy.designPattern.state;

import lombok.Data;

/**
 * ATM
 */
@Data
public class ATM {

    /**
     * 所有状态
     */
    private ATMState readyState; // 就绪状态
    private ATMState noCashState; // 无现金状态
    private ATMState noServiceState; // 服务异常状态
    private ATMState currentState; // 当前状态
    private int totalAmount; // 机内现钞数量

    /**
     * 插卡
     */
    public void insertCard() {
        currentState.insertCard();
    }
    /**
     * 验证密码
     */
    public void verifyPwd() {
        currentState.verifyPwd();
    }
    /**
     * 取款
     */
    public void getCash() {
        currentState.getCash();
    }
    /**
     * 显示余额
     */
    public void queryBalance() {
        currentState.queryBalance();
    }
    /**
     * 退卡
     */
    public void exitCard() {
        currentState.exitCard();
    }

    /*测试用的临时变量*/
    private String pwd;//密码
    private int balance;//余额
    private int amount;//取款金额

    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception{
        //初始化所有状态
        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);

        if(totalAmount > 0){
            currentState = readyState;
        }
        else if(totalAmount == 0){
            currentState = noCashState;
        }
        else{
            throw new Exception();
        }

        //初始化测试数据
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }

}
