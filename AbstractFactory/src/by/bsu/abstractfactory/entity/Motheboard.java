package by.bsu.abstractfactory.entity;

public abstract class Motheboard {

    public String model;

    public String getType() {
        return model;
    }

    public void setType(String type) {
        this.model = type;
    }
    
    public abstract ComputerType getSupportedComputerType();
}
