public  class Parrot {



    //    private ParrotTypeEnum type;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {

        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }



    public double getVoltage() {
        return voltage;
    }


    public boolean isNailed() {
        return isNailed;
    }

    public void setNailed(boolean nailed) {
        isNailed = nailed;
    }

    public double getSpeed() {

        try{throw new RuntimeException("Should be unreachable");}
        catch(RuntimeException e){
            System.out.println("Should be unreachable");
        }
        return 0;
    }



   public static double getLoadFactor() {
        return 9.0;
    }

    public static double getBaseSpeed() {
        return 12.0;
    }

}
