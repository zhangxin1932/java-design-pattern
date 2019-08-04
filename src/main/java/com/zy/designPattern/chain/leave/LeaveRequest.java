package com.zy.designPattern.chain.leave;
/**
 * 员工请假，每个领导的权限不一样
 * 比如小组长只能批1天假，经历能批3天的假，董事长能批15天的假等等。
 * 1："请假人" 为发送者，发送请假申请。
 * 2："虚线里面的各个领导"是接收者。
 * 3：而"虚线里面的各个领导"又组成了一个"领导链"（因为请假需要各级领导签字审批）
 * 4：而 "请假人"和"领导链"之间是又是解耦的，因为“请假人”并不知道“领导链”中的具体结构，请假审批到哪一步等等，"请假人"也并不需要关心。
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 发起者（请假人）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {
    private String name; // 请假人
    private int days; // 请假天数
    private String reason; // 请假原因
}
