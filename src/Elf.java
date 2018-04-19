public class Elf extends RPGCharacter {

    public Elf(String name) {
        super(name);
        this.power = r.generateFromRange(30, 80);
        this.intelligence = r.generateFromRange(60, 100);
        this.luck = r.generateFromRange(20, 100);
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}