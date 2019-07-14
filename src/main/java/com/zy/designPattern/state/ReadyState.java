package com.zy.designPattern.state;

/**
 * ATM的就绪状态
 */
public class ReadyState implements ATMState {
    //保留状态持有者的引用，以便对其进行操作
    private ATM atm;

    public ReadyState(ATM atm) {
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
        if (atm.getTotalAmount() >= atm.getAmount() && atm.getBalance() >= atm.getAmount()) {
            // 更新账户余额
            atm.setBalance(atm.getBalance() - atm.getAmount());
            // 更新机器内现钞总数
            atm.setTotalAmount(atm.getTotalAmount() - atm.getAmount());
            System.out.println("取出现金-->" + atm.getAmount());
            System.out.println("取款完成");
            // 弹出卡片
            exitCard();
            // 检查卡内余钞
            if (atm.getTotalAmount() == 0) {
                atm.setCurrentState(atm.getNoCashState());
                System.out.println("发送无钞票信息给银行");
            }
        } else {
            System.out.println("余额不足, 取款失败");
            // 退卡
            exitCard();
        }
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
