public class AfricanParrot extends Parrot{

//int numberOfCoconuts;
  public  AfricanParrot( int numberOfCoconuts, double voltage, boolean isNailed){
        super(  numberOfCoconuts, voltage,  isNailed);

    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }
}
