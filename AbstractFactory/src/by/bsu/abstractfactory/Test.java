package by.bsu.abstractfactory;

import by.bsu.abstractfactory.entity.Computer;
import by.bsu.abstractfactory.factory.ComputerFactory;
import by.bsu.abstractfactory.factory.ComputerPartsFactory;
import by.bsu.abstractfactory.factory.MacFactory;
import by.bsu.abstractfactory.factory.MacPartsFactory;
import by.bsu.abstractfactory.factory.PcFactory;
import by.bsu.abstractfactory.factory.PcPartsFactory;

public class Test {

    public static void main(String[] args) {
        
        ComputerFactory computerFactory = PcFactory.getInstance();
        Computer pcComputer = computerFactory.createComputer();

        ComputerPartsFactory computerPartsFactory = PcPartsFactory.getInstance();
        pcComputer.setCpu( computerPartsFactory.createCpu() );
        pcComputer.setMotheboard( computerPartsFactory.createMotherboard() );
        pcComputer.setRom( computerPartsFactory.createRom() );
        
        System.out.println("computerType: " + pcComputer.getType());
        System.out.println("cpu type: " + pcComputer.getCpu().getSupportedComputerType() );
        System.out.println("motherboard type: " + pcComputer.getMotheboard().getSupportedComputerType());
        
        computerFactory = MacFactory.getInstance();
        Computer macComputer = computerFactory.createComputer();
        
        computerPartsFactory = MacPartsFactory.getInstance();
        macComputer.setCpu( computerPartsFactory.createCpu() );
        macComputer.setMotheboard( computerPartsFactory.createMotherboard() );
        macComputer.setRom( computerPartsFactory.createRom() );
        
        System.out.println("computerType: " + macComputer.getType());
        System.out.println("cpu type: " + macComputer.getCpu().getSupportedComputerType() );
        System.out.println("motherboard type: " + macComputer.getMotheboard().getSupportedComputerType());
        
    }
}
