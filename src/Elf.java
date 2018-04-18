import java.util.Random;

public class Elf extends RPGCharacter {

    public Elf(String name) {
        super(name);
        Random rand = new Random();
        this.power = rand.nextInt(50) + 30;
        this.intelligence = rand.nextInt(40) + 60;
        this.luck = rand.nextInt(80) + 20;
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}