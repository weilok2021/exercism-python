public class CarsAssemble {
    private final int carProducePerHour = 221;
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return speed * carProducePerHour;
        }
        if (speed >= 5 && speed <= 8) {
            return speed * carProducePerHour * 0.9;
        }
        if (speed == 9) {
            return speed * carProducePerHour * 0.8;
        }

        return speed * carProducePerHour * 0.77;
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
