public class JedliksToyCar {
    private int meter = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meter + " meters";
    }

    public String batteryDisplay() {
        if (this.battery <= 0)
            return "Battery empty";
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        if (battery > 0) {
            this.meter += 20;
            this.battery  -= 1;   
        }
    }
}
