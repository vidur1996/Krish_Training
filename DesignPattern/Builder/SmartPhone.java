package Builder;

import java.util.Locale;

public class SmartPhone {
    private final String camera;
    private final Boolean dualSim;
    private final Boolean audioJack;
    private final int externalMemory;

    public SmartPhone(Builder builder){
        this.camera = builder.camera;
        this.dualSim = builder.dualSim;
        this.audioJack = builder.audioJack;
        this.externalMemory = builder.externalMemory;
    }

    static class Builder{
        private String camera;
        private Boolean dualSim;
        private Boolean audioJack;
        private int externalMemory;

        public SmartPhone build() {
            return new SmartPhone(this);
        }

        public  Builder(String camera){
            this.camera = camera;

        }
        public Builder dualSim( Boolean dualSim){
            this.dualSim = dualSim;
            return this;
        }

        public Builder audioJack( Boolean audioJack){
            this.audioJack = audioJack;
            return this;
        }
        public Builder externalMemory( int externalMemory){
            this.externalMemory = externalMemory;
            return this;
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera='" + camera + '\'' +
                ", dualSim=" + dualSim +
                ", audioJack=" + audioJack +
                ", externalMemory=" + externalMemory +
                '}';
    }
}
