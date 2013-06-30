package by.bsu.abstractfactory.entity.pc;

import by.bsu.abstractfactory.entity.Computer;
import by.bsu.abstractfactory.entity.ComputerType;

public class PcComputer extends Computer{

    @Override
    public ComputerType getType() {
        return ComputerType.PC;
    }
    
}
