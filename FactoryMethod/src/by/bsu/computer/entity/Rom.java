package by.bsu.computer.entity;


public class Rom {
    private double readingSpeed;
    private String typeName;

    /**
     * @return the readingSpeed
     */
    public double getReadingSpeed() {
        return readingSpeed;
    }

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param readingSpeed the readingSpeed to set
     */
    public void setReadingSpeed(double readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    /**
     * @param typeName the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.readingSpeed) ^ (Double.doubleToLongBits(this.readingSpeed) >>> 32));
        hash = 83 * hash + (this.typeName != null ? this.typeName.hashCode() : 0);
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
        final Rom other = (Rom) obj;
        if (Double.doubleToLongBits(this.readingSpeed) != Double.doubleToLongBits(other.readingSpeed)) {
            return false;
        }
        if ((this.typeName == null) ? (other.typeName != null) : !this.typeName.equals(other.typeName)) {
            return false;
        }
        return true;
    }
 
    
}
