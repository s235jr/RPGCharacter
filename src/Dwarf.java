public class Dwarf extends RPGCharacter {

    public Dwarf(String name) {
        super(name);
        this.power = r.generateFromRange(60, 100);
        this.intelligence = r.generateFromRange(40, 80);
        this.luck = r.generateFromRange(60, 100);
        //System.out.println(this.name);
        //System.out.println(this.power + " " + this.intelligence + " " + this.luck);
    }
}