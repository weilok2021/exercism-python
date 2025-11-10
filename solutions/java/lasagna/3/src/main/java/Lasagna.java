public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private static final int expectedMinutes = 40;
    private static final int minutesPerLayer = 2;
    
    public int expectedMinutesInOven() {
        return expectedMinutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesHasBeen) {
        return expectedMinutesInOven() - minutesHasBeen;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * minutesPerLayer;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numLayers, int minutesHasBeen) {
        return this.preparationTimeInMinutes(numLayers) + minutesHasBeen;
    }
}
