package by.tc.task01.entity;

public class Speakers extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int NUMBER_OF_SPEAKERS;
    private final int FREQUENCY_RANGE;
    private final int CORD_LENGTH;

    private Speakers(Builder builder) {
        POWER_CONSUMPTION = builder.powerConsumption;
        NUMBER_OF_SPEAKERS = builder.numberOfSpeakers;
        FREQUENCY_RANGE = builder.frequencyRange;
        CORD_LENGTH = builder.cordLength;
    }

    public static class Builder {
        private int powerConsumption;
        private int numberOfSpeakers;
        private int frequencyRange;
        private int cordLength;

        public Builder() {
        }

        public Builder(int powerConsumption, int numberOfSpeakers, int frequencyRange, int cordLength) {
            this.powerConsumption = powerConsumption;
            this.numberOfSpeakers = numberOfSpeakers;
            this.frequencyRange = frequencyRange;
            this.cordLength = cordLength;
        }

        public Builder powerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder numberOfSpeakers(int numberOfSpeakers) {
            this.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public Builder frequencyRange(int frequencyRange) {
            this.frequencyRange = frequencyRange;
            return this;
        }

        public Builder cordLength(int cordLength) {
            this.cordLength = cordLength;
            return this;
        }

        public Speakers build() {
            return new Speakers(this);
        }
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public int getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public int getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public int getCORD_LENGTH() {
        return CORD_LENGTH;
    }
}
