package com.zy.designPattern.command;

import lombok.Setter;

public class Invoker {

    @Setter
    private Command command;

    public void run() {
        command.execute();
    }

}
