package by.bsu.abstractfactory.factory;

import by.bsu.abstractfactory.entity.Cpu;
import by.bsu.abstractfactory.entity.Motheboard;
import by.bsu.abstractfactory.entity.Rom;
import by.bsu.abstractfactory.entity.mac.MacCpu;
import by.bsu.abstractfactory.entity.mac.MacMotherboard;
import by.bsu.abstractfactory.entity.mac.MacRom;

public class MacPartsFactory extends ComputerPartsFactory {

    private static volatile MacPartsFactory instance;
    
    private MacPartsFactory() {
    }
    
    private static void init() {
        instance = new MacPartsFactory();
    }
    
    public static MacPartsFactory getInstance() {
        
        if ( null == instance ) {
            synchronized ( MacPartsFactory.class ) {
                if ( null == instance ) {
                    init();
                }
            }
        }
        
        return instance;
    }
    
    @Override
    public Cpu createCpu() {
        return new MacCpu();
    }

    @Override
    public Motheboard createMotherboard() {
        return new MacMotherboard();
    }

    @Override
    public Rom createRom() {
        return new MacRom();
    }
    
}
