package com.mjc_0204.banking;

public interface IMachine {
    boolean isActive() throws MachineNotWorkingException;
}
