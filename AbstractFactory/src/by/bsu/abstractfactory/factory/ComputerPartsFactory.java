package by.bsu.abstractfactory.factory;

import by.bsu.abstractfactory.entity.Cpu;
import by.bsu.abstractfactory.entity.Motheboard;
import by.bsu.abstractfactory.entity.Rom;

public abstract class ComputerPartsFactory {
    
    public abstract Cpu createCpu();
    public abstract Motheboard createMotherboard();
    public abstract Rom createRom();
    
}
