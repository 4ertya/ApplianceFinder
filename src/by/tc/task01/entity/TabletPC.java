package by.tc.task01.entity;

public class TabletPC extends Appliance {
    private final int BATTERY_CAPACITY;
    private final int DISPLAY_INCHES;
    private final int MEMORY_ROM;
    private final int FLASH_MEMORY_CAPACITY;
    private final String COLOR;

    private TabletPC(Builder builder) {
        BATTERY_CAPACITY = builder.batteryCapacity;
        DISPLAY_INCHES = builder.displayInches;
        MEMORY_ROM = builder.memoryRom;
        FLASH_MEMORY_CAPACITY = builder.flashMemoryCapacity;
        COLOR = builder.color;
    }

    public static class Builder {
        private int batteryCapacity;
        private int displayInches;
        private int memoryRom;
        private int flashMemoryCapacity;
        private String color;

        public Builder() {

        }

        public Builder(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
            this.batteryCapacity = batteryCapacity;
            this.displayInches = displayInches;
            this.memoryRom = memoryRom;
            this.flashMemoryCapacity = flashMemoryCapacity;
            this.color = color;
        }

        public Builder batteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder displayInches(int displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public Builder memoryRom(int memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder flashMemoryCapacity(int flashMemoryCapacity) {
            this.flashMemoryCapacity = flashMemoryCapacity;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public TabletPC build() {
            return new TabletPC(this);
        }
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public int getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }
}
