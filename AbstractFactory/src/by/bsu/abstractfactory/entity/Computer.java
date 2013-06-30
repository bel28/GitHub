package by.bsu.abstractfactory.entity;

public abstract class Computer {
    
    private Motheboard motheboard;
    private Rom rom;
    private Cpu cpu;

    /**
     * @return the motheboard
     */
    public Motheboard getMotheboard() {
        return motheboard;
    }

    /**
     * @return the rom
     */
    public Rom getRom() {
        return rom;
    }

    /**
     * @return the cpu
     */
    public Cpu getCpu() {
        return cpu;
    }

    /**
     * @param motheboard the motheboard to set
     */
    public void setMotheboard(Motheboard motheboard) {
        this.motheboard = motheboard;
    }

    /**
     * @param rom the rom to set
     */
    public void setRom(Rom rom) {
        this.rom = rom;
    }

    /**
     * @param cpu the cpu to set
     */
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public abstract  ComputerType getType();

}
