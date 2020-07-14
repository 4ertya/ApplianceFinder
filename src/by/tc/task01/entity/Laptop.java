package by.tc.task01.entity;

public class Laptop extends Appliance {
    private final int BATTERY_CAPACITY;
    private final String OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final int DISPLAY_INCHES;

    private Laptop(Builder builder) {
        BATTERY_CAPACITY = builder.batteryCapacity;
        OS = builder.oS;
        MEMORY_ROM = builder.memoryRom;
        SYSTEM_MEMORY = builder.systemMemory;
        CPU = builder.cPU;
        DISPLAY_INCHES = builder.displayInches;
    }

    public static class Builder {
        private int batteryCapacity;
        private String oS;
        private int memoryRom;
        private int systemMemory;
        private double cPU;
        private int displayInches;

        public Builder() {
        }

        public Builder(int batteryCapacity, String oS, int memoryRom, int systemMemory, double cPU, int displayInches) {
            this.batteryCapacity = batteryCapacity;
            this.oS = oS;
            this.memoryRom = memoryRom;
            this.systemMemory = systemMemory;
            this.cPU = cPU;
            this.displayInches = displayInches;
        }

        public Builder batteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder oS(String oS) {
            this.oS = oS;
            return this;
        }

        public Builder memoryRom(int memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder systemMemory(int systemMemory) {
            this.systemMemory = systemMemory;
            return this;
        }

        public Builder cPU(double cPU) {
            this.cPU = cPU;
            return this;
        }

        public Builder displayInches(int displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public int getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }
}
