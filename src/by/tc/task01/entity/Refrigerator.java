package by.tc.task01.entity;

public class Refrigerator extends Appliance {

    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int FREEZER_CAPACITY;
    private final int OVERALL_CAPACITY;
    private final int HEIGHT;
    private final int WIDTH;

    private Refrigerator(Builder builder) {
        POWER_CONSUMPTION = builder.powerConsumption;
        WEIGHT = builder.weight;
        FREEZER_CAPACITY = builder.freezerCapacity;
        OVERALL_CAPACITY = builder.overallCapacity;
        HEIGHT = builder.height;
        WIDTH = builder.width;
    }

    public static class Builder {
        private int powerConsumption;
        private int weight;
        private int freezerCapacity;
        private int overallCapacity;
        private int height;
        private int width;

        public Builder() {
        }

        public Builder(int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height, int width) {
            this.powerConsumption = powerConsumption;
            this.weight = weight;
            this.freezerCapacity = freezerCapacity;
            this.overallCapacity = overallCapacity;
            this.height = height;
            this.width = width;
        }

        public Builder powerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder freezerCapacity(int freezerCapacity) {
            this.freezerCapacity = freezerCapacity;
            return this;
        }

        public Builder overallCapacity(int overallCapacity) {
            this.overallCapacity = overallCapacity;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public int getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }
}
