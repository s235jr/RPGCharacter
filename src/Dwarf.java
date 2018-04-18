import java.util.Random;

public class Dwarf extends RPGCharacter {

    public Dwarf(String name) {
        super(name);
        Random rand = new Random();
        this.power = rand.nextInt(60) + 40;
        this.intelligence = rand.nextInt(40) + 40;
        this.luck = rand.nextInt(60) + 40;
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}