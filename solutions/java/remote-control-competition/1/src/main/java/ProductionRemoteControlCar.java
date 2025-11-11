class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceDrived = 0;
    private int numberOfVictories;
    
    public void drive() {
        distanceDrived += 10;
    }

    public int getDistanceTravelled() {
        return distanceDrived;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return other.getNumberOfVictories() - this.getNumberOfVictories(); 
        // For descending order, you could do: return other.id - this.id;
    }
}
