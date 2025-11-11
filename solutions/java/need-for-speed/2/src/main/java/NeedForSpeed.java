class NeedForSpeed {
    private int speed;
    private int battery = 100;
    private int batteryDrain;
    private int milleage = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBattery() {
        return this.battery;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }
    
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return milleage;
    }

    public void drive() {
        if (!batteryDrained()) {
            milleage += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int validDrive = car.getBattery() / car.getBatteryDrain();
        return (car.getSpeed() * validDrive) >= this.distance;
    }
}
