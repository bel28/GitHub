package by.bsu.abstractfactory.entity.mac;

import by.bsu.abstractfactory.entity.ComputerType;
import by.bsu.abstractfactory.entity.Motheboard;

public class MacMotherboard extends Motheboard{

    @Override
    public ComputerType getSupportedComputerType() {
        return ComputerType.MAC;
    }
    
}
