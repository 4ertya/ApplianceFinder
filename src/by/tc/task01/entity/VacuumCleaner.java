package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
    private final int POWER_CONSUMPTION;
    private final String FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;
    private final int MOTOR_SPEED_REGULATION;
    private final int CLEANING_WIDTH;

    private VacuumCleaner(Builder builder) {
        POWER_CONSUMPTION = builder.powerConsumption;
        FILTER_TYPE = builder.filterType;
        BAG_TYPE = builder.bagType;
        WAND_TYPE = builder.wandType;
        MOTOR_SPEED_REGULATION = builder.motorSpeedRegulation;
        CLEANING_WIDTH = builder.cleaningWidth;
    }

    public static class Builder {
        private int powerConsumption;
        private String filterType;
        private String bagType;
        private String wandType;
        private int motorSpeedRegulation;
        private int cleaningWidth;

        public Builder() {
        }

        public Builder(int powerConsumption, String filterType, String bagType, String wandType,
                       int motorSpeedRegulation, int cleaningWidth) {
            this.powerConsumption = powerConsumption;
            this.filterType = filterType;
            this.bagType = bagType;
            this.wandType = wandType;
            this.motorSpeedRegulation = motorSpeedRegulation;
            this.cleaningWidth = cleaningWidth;
        }

        public Builder powerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder filterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder bagType(String bagType) {
            this.bagType = bagType;
            return this;
        }

        public Builder wandType(String wandType) {
            this.wandType = wandType;
            return this;
        }

        public Builder motorSpeedRegulation(int motorSpeedRegulation) {
            this.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public Builder cleaningWidth(int cleaningWidth) {
            this.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner build() {
            return new VacuumCleaner(this);
        }
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public int getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public int getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

}
