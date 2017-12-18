package com.lebron.design.command;

public class SimpleRemoteControl {
    
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void buttonOn(){
        command.excute();
    }
}
