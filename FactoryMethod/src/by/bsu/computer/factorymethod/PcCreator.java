package by.bsu.computer.factorymethod;

import by.bsu.computer.entity.Computer;
import by.bsu.computer.entity.Cpu;
import by.bsu.computer.entity.Motherboard;
import by.bsu.computer.entity.PcComputer;
import by.bsu.computer.entity.Rom;
import by.bsu.computer.transferobject.ComputerTO;


public class PcCreator implements ComputerCreator {

    private static  volatile PcCreator instance;

    private PcCreator() {
    }
    
    public static PcCreator getInstance() {
        if (null == instance) {
            
            synchronized(PcCreator.class) {
                if ( null == instance ) {
                    instance = new PcCreator();
                }
            }
            
        }
        return instance;
    }
    
    @Override
    public Computer factoryMethod( ComputerTO computerTO ) {
        Computer computer = new PcComputer();

        Cpu cpu = new Cpu();
        cpu.setCacheSize( computerTO.cpuCacheSize );
        cpu.setFirmName( computerTO.cpuFirmName );
        cpu.setKernelNumber( computerTO.cpuKernelNumber );
        computer.setCpu( cpu );
        
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
