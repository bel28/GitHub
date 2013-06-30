package by.bsu.abstractfactory.factory;

import by.bsu.abstractfactory.entity.Computer;
import by.bsu.abstractfactory.entity.mac.MacComputer;

public class MacFactory extends ComputerFactory{

    private static volatile MacFactory instance;
    
    private MacFactory() {
    }
    
    private static void init() {
        instance = new MacFactory();
    }
    
    public static MacFactory getInstance() {
        
        if (null == instance) {
            synchronized ( MacFactory.class ) {
                if ( null == instance ) {
                    init();
                }
            }
        }
        
        return instance;
    }

    @Override
    public Computer createComputer() {
        return new MacComputer();
    }

}
