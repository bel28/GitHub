package by.bsu.computer.entity;


public abstract class Computer {
    public final ComputerType TYPE;
    
    private Motherboard motherboard;
    private Cpu cpu;
    private Rom rom;

    public Computer(ComputerType TYPE) {
        this.TYPE = TYPE;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.TYPE != null ? this.TYPE.hashCode() : 0);
        hash = 89 * hash + (this.motherboard != null ? this.motherboard.hashCode() : 0);
        hash = 89 * hash + (this.cpu != null ? this.cpu.hashCode() : 0);
        hash = 89 * hash + (this.rom != null ? this.rom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Computer other = (Computer) obj;
        if (this.TYPE != other.TYPE) {
            return false;
        }
        if (this.motherboard != other.motherboard && (this.motherboard == null || !this.motherboard.equals(other.motherboard))) {
            return false;
        }
        if (this.cpu != other.cpu && (this.cpu == null || !this.cpu.equals(other.cpu))) {
            return false;
        }
        if (this.rom != other.rom && (this.rom == null || !this.rom.equals(other.rom))) {
            return false;
        }
        return true;
    }
    
    
    
}
