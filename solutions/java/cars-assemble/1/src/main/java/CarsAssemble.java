public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        double success=1.0;
        if (speed >= 1 && speed <= 4) {
        success *=1;
        } else if ( 5<= speed && speed <= 8){
        success*=0.9;
        } else if (speed==9) {
        success*=0.8;
        } else if (speed==10) {
        success*=0.77;
        } 
        double amount = speed * (221 * success);
        return amount;
    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        double perHour = productionRatePerHour(speed);
        int perMinute = (int) (perHour /60);
        return perMinute;
    }
}
