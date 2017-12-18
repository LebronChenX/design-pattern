package com.lebron.design.command;

public class Test {
    
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Command command = new LightOnCommand(new Light());
        remoteControl.setCommand(command);
        remoteControl.buttonOn();
        
    }
}
