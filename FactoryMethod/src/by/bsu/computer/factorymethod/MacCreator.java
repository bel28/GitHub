package by.bsu.computer.factorymethod;

import by.bsu.computer.entity.Computer;
import by.bsu.computer.entity.Cpu;
import by.bsu.computer.entity.MacComputer;
import by.bsu.computer.entity.Motherboard;
import by.bsu.computer.entity.Rom;
import by.bsu.computer.transferobject.ComputerTO;


public class MacCreator implements ComputerCreator {

    private static  volatile MacCreator instance;

    private MacCreator() {
    }
    
    public static MacCreator getInstance() {
        if (null == instance) {
            
            synchronized(MacCreator.class) {
                if ( null == instance ) {
                    instance = new MacCreator();
                }
            }
            
        }
        return instance;
    }
    
    @Override
    public Computer factoryMethod(ComputerTO computerTO) {
        Computer computer = new MacComputer();
        
        Cpu cpu = new Cpu();
        cpu.setCacheSize( computerTO.cpuCacheSize );
        cpu.setFirmName( computerTO.cpuFirmName );
        cpu.setKernelNumber( computerTO.cpuKernelNumber );
        computer.setCpu(cpu);
        
        Motherboard motherboard = new Motherboard();
        motherboard.setFormFactor( computerTO.motherboardFormFactor );
        motherboard.setProcessors( computerTO.motherboardProcessors );
        computer.setMotherboard(motherboard);
        
        Rom rom = new Rom();
        rom.setReadingSpeed( computerTO.romReadingSpeed );
        rom.setTypeName( computerTO.romTypeName );
        computer.setRom(rom);
        
        return computer;
    }
    
}
