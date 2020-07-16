package by.tc.task01.entity;

public class Oven extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int CAPACITY;
    private final int DEPTH;
    private final double HEIGHT;
    private final double WIDTH;

    private Oven(Builder builder) {
        POWER_CONSUMPTION = builder.powerConsumption;
        WEIGHT = builder.weight;
        CAPACITY = builder.capacity;
        DEPTH = builder.depth;
        HEIGHT = builder.height;
        WIDTH = builder.width;
    }

    public static class Builder {
        private int powerConsumption;
        private int weight;
        private int capacity;
        private int depth;
        private double height;
        private double width;

        public Builder() {
        }

        public Builder(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
            this.powerConsumption = powerConsumption;
            this.weight = weight;
            this.capacity = capacity;
            this.depth = depth;
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

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder depth(int depth) {
            this.depth = depth;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder width(double width) {
            this.width = width;
            return this;
        }

        public Oven build() {
            return new Oven(this);
        }
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getDEPTH() {
        return DEPTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }


    @Override
    public String toString() {
        return "Oven{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
