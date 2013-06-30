package by.bsu.abstractfactory.entity.mac;

import by.bsu.abstractfactory.entity.ComputerType;
import by.bsu.abstractfactory.entity.Cpu;

public class MacCpu extends Cpu{

    @Override
    public ComputerType getSupportedComputerType() {
        return ComputerType.MAC;
    }
    
}
