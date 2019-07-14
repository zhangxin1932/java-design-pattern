package com.zy.designPattern.state;

public class StateTest {

    public static void main(String[] args) throws Exception {
        test(1000, 500, 200, "123456");
    }

    private static void test(int totalAmount, int balance, int amount, String pwd) throws Exception {
        ATM atm = new ATM(totalAmount, balance, amount, pwd);
        // 输出初始状态
        System.out.println(atm.toString());
        atm.insertCard();
        atm.verifyPwd();
        atm.getCash();
        // 输出结束状态
        System.out.println(atm.toString());
    }
}
