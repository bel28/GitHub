package by.bsu.computer.entity;

import java.util.List;

public class Motherboard {
    private String formFactor;
    private List<String> processors;

    /**
     * @return the formFactor
     */
    public String getFormFactor() {
        return formFactor;
    }

    /**
     * @return the processors
     */
    public List<String> getProcessors() {
        return processors;
    }

    /**
     * @param formFactor the formFactor to set
     */
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    /**
     * @param processors the processors to set
     */
    public void setProcessors(List<String> processors) {
        this.processors = processors;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.formFactor != null ? this.formFactor.hashCode() : 0);
        hash = 61 * hash + (this.processors != null ? this.processors.hashCode() : 0);
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
        final Motherboard other = (Motherboard) obj;
        if ((this.formFactor == null) ? (other.formFactor != null) : !this.formFactor.equals(other.formFactor)) {
            return false;
        }
        if (this.processors != other.processors && (this.processors == null || !this.processors.equals(other.processors))) {
            return false;
        }
        return true;
    }
    
    
    
}
