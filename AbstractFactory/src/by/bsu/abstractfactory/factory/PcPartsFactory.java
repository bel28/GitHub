package by.bsu.abstractfactory.factory;

import by.bsu.abstractfactory.entity.Cpu;
import by.bsu.abstractfactory.entity.Motheboard;
import by.bsu.abstractfactory.entity.Rom;
import by.bsu.abstractfactory.entity.pc.PcCpu;
import by.bsu.abstractfactory.entity.pc.PcMotherboard;
import by.bsu.abstractfactory.entity.pc.PcRom;

public class PcPartsFactory extends ComputerPartsFactory {
    
    private static volatile PcPartsFactory instance;
    
    private PcPartsFactory() {
    }
    
    private static void init() {
        instance = new PcPartsFactory();
    }
    
    public static PcPartsFactory getInstance() {
        
        if ( null == instance ) {
            synchronized ( PcPartsFactory.class ) {
                if ( null == instance ) {
                    init();
                }
            }
        }
        
        return instance;
    }

    @Override
    public Cpu createCpu() {
        return new PcCpu();
    }

    @Override
    public Motheboard createMotherboard() {
        return new PcMotherboard();
    }

    @Override
    public Rom createRom() {
        return new PcRom();
    }
        
}
