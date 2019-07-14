package com.zy.designPattern.adapter.interfacePattern;

public interface DCOutput {
    /**
     * 5V直流电
     * @return
     */
    int output5V();
    /**
     * 9V直流电
     * @return
     */
    int output9V();
    /**
     * 12V直流电
     * @return
     */
    int output12V();
    /**
     * 24V直流电
     * @return
     */
    int output24V();
}
