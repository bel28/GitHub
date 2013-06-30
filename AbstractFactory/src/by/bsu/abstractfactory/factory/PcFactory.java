package by.bsu.abstractfactory.factory;

import by.bsu.abstractfactory.entity.Computer;
import by.bsu.abstractfactory.entity.pc.PcComputer;

public class PcFactory extends ComputerFactory{

    private static volatile PcFactory instance;
    
    private PcFactory(){
    }
    
    private static void init() {
        instance = new PcFactory();
    }
    
    public static PcFactory getInstance() {
        
        if ( null == instance ) {
            synchronized ( PcFactory.class ) {
                if ( null == instance ) {
                    init();
                }
            }
        }
        
        return instance;
    }

    @Override
    public Computer createComputer() {
        return new PcComputer();
    }
    
}
