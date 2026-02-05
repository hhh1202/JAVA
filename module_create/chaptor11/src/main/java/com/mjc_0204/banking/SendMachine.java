package com.mjc_0204.banking;

public class SendMachine implements IMachine{
    public boolean isActive() throws MachineNotWorkingException {
        if ( Math.random() >= 0.3 ) {
            return true;
        } else {
            throw new MachineNotWorkingException("Machine broken !!");
        }
    }
}
