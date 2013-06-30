package by.bsu.abstractfactory.entity;

public abstract class Rom {

    private String size;
    private String type;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public abstract ComputerType getSupportedComputerType();
}
