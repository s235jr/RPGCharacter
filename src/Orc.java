public class Orc extends RPGCharacter {

    public Orc(String name) {
        super(name);
        this.power = r.generateFromRange(50, 100);
        this.intelligence = r.generateFromRange(5, 20);
        this.luck = r.generateFromRange(1, 100);
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}