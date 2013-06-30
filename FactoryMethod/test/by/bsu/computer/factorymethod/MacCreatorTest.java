/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.computer.factorymethod;

import by.bsu.computer.entity.Computer;
import by.bsu.computer.entity.ComputerType;
import by.bsu.computer.entity.Cpu;
import by.bsu.computer.entity.Motherboard;
import by.bsu.computer.entity.Rom;
import by.bsu.computer.transferobject.ComputerTO;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MacCreatorTest {
    
    private ComputerCreator creator;
    private ComputerTO computerTO;
    
    @Before
    public void setUp() {
        creator = MacCreator.getInstance();
        
        computerTO = new ComputerTO();
        
        computerTO.cpuCacheSize = 111;
        computerTO.cpuFirmName = "firmName";
        computerTO.cpuKernelNumber = 4;
        
        computerTO.motherboardFormFactor = "asdf";
        computerTO.motherboardProcessors = Arrays.asList("asdf","sdf");
        
        computerTO.romReadingSpeed = 100.0;
        computerTO.romTypeName = "typeName";
    }
    
    @Test
    public void factoryMethod() {
        
        Cpu cpu = new Cpu();
        cpu.setFirmName(computerTO.cpuFirmName);
        cpu.setCacheSize(computerTO.cpuCacheSize);
        cpu.setFirmName(computerTO.cpuFirmName);
        cpu.setKernelNumber(computerTO.cpuKernelNumber);
        
        Motherboard motherboard = new Motherboard();
        motherboard.setFormFactor( computerTO.motherboardFormFactor );
        motherboard.setProcessors( computerTO.motherboardProcessors );
        
        Rom rom = new Rom();
        rom.setReadingSpeed( computerTO.romReadingSpeed );
        rom.setTypeName( computerTO.romTypeName );
        
        Computer computer = creator.factoryMethod(computerTO);
        
        Assert.assertEquals("Computer type must be 'PC'!", ComputerType.MAC, 
                computer.TYPE);
        
        Assert.assertEquals( "Cpu must be equals!", cpu, computer.getCpu() );
        Assert.assertEquals( "Motherboards must be equals!", motherboard, 
                computer.getMotherboard() );
        Assert.assertEquals( "Roms must be equals!", rom, 
                computer.getRom() );
    }
}