public class NorwegianBlue extends Parrot{

    NorwegianBlue(int numberOfCoconuts, double voltage, boolean isNailed){
        super(numberOfCoconuts,voltage,isNailed);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
    @Override
    public double getSpeed() throws  RuntimeException {
        return (isNailed()) ? 0 : getBaseSpeed(getVoltage());
    }
}
