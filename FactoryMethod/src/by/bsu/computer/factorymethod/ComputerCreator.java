package by.bsu.computer.factorymethod;

import by.bsu.computer.entity.Computer;
import by.bsu.computer.transferobject.ComputerTO;


public interface ComputerCreator {
    public abstract Computer factoryMethod( ComputerTO computerTO );
}