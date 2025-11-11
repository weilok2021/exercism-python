public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceDrived = 0;
    
    public void drive() {
        distanceDrived += 20;
    }

    public int getDistanceTravelled() {
        return distanceDrived;
    }
}
