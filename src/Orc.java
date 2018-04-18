import java.util.Random;

public class Orc extends RPGCharacter {

    public Orc(String name) {
        super(name);
        Random rand = new Random();
        this.power = rand.nextInt(50) + 50;
        this.intelligence = rand.nextInt(15) + 5;
        this.luck = rand.nextInt(99) + 1;
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}