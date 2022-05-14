import java.util.Arrays;

public class Train{
    private String dest;
    private int numTrain;
    private String depatureTime;
    private int[] countOfPlaces;

    public Train(String dest, int numTrain, String depatureTime, int[] countOfPlaces) {
        this.dest = dest;
        this.numTrain = numTrain;
        this.depatureTime = depatureTime;
        this.countOfPlaces = countOfPlaces;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getNumTrain() {
        return numTrain;
    }

    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    public int[] getCountOfPlaces() {
        return countOfPlaces;
    }

    public void setCountOfPlaces(int[] countOfPlaces) {
        this.countOfPlaces = countOfPlaces;
    }

    @Override
    public String toString() {
        return "Train: " +
                "dest='" + dest + '\'' +
                ", numTrain=" + numTrain +
                ", depatureTime='" + depatureTime + '\'' +
                ", countOfPlaces=" + Arrays.toString(countOfPlaces);
    }
}