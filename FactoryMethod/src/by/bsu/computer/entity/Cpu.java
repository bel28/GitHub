package by.bsu.computer.entity;

public class Cpu {
    private int cacheSize;
    private int kernelNumber;
    private String firmName;

    /**
     * @return the cacheSize
     */
    public int getCacheSize() {
        return cacheSize;
    }

    /**
     * @return the kernelNumber
     */
    public int getKernelNumber() {
        return kernelNumber;
    }

    /**
     * @return the firmName
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * @param cacheSize the cacheSize to set
     */
    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    /**
     * @param kernelNumber the kernelNumber to set
     */
    public void setKernelNumber(int kernelNumber) {
        this.kernelNumber = kernelNumber;
    }

    /**
     * @param firmName the firmName to set
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.cacheSize;
        hash = 61 * hash + this.kernelNumber;
        hash = 61 * hash + (this.firmName != null ? this.firmName.hashCode() : 0);
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
        final Cpu other = (Cpu) obj;
        if (this.cacheSize != other.cacheSize) {
            return false;
        }
        if (this.kernelNumber != other.kernelNumber) {
            return false;
        }
        if ((this.firmName == null) ? (other.firmName != null) : !this.firmName.equals(other.firmName)) {
            return false;
        }
        return true;
    }
    
    
    
}
