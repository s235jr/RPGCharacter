import java.util.Random;

public class Range {

    public int generateFromRange (int min, int max){
        Random rand = new Random();
        int value = rand.nextInt(max - min) + min;
        return value;
    }
}
