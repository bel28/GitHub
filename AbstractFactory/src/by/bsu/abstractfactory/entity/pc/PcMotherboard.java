package by.bsu.abstractfactory.entity.pc;

import by.bsu.abstractfactory.entity.ComputerType;
import by.bsu.abstractfactory.entity.Motheboard;

public class PcMotherboard extends Motheboard{

    @Override
    public ComputerType getSupportedComputerType() {
        return ComputerType.PC;
    }
    
}
