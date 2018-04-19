public class RPGCharacter {

    protected String name;
    protected int power;
    protected int intelligence;
    protected int luck;
    protected Range r;

    protected RPGCharacter(String name) {
        this.name = name;
        this.r = new Range();
    }

    public static void main(String[] args) {

        RPGCharacter elf = new Elf("Naylee z Nieśmiertelnego Lasu");
        RPGCharacter dwarf = new Dwarf("Durin Kamienny Topór");
        RPGCharacter orc = new Orc("Urk'har Niszczyciel");

        dwarf.testPower(elf);
        elf.testPower(dwarf);
        dwarf.testPower(orc);

        dwarf.testIntelligence(elf);
        orc.testIntelligence(elf);

        dwarf.testLuck(elf);
        elf.testLuck(dwarf);
        dwarf.testLuck(orc);


    }

    public void testPower(RPGCharacter second) {
        String winner = "";
        if (this.power > second.power) {
            winner = this.name;
        } else if (this.power < second.power) {
            winner = second.name;
        } else {
            winner = "Remis";
        }
        System.out.println(this.name + " z siłą " + this.power + " oraz " + second.name + " z siłą " + second.power + " wykonują test siły. Zwycięzcą jest: " + winner);
    }

    public void testIntelligence(RPGCharacter second) {
        String winner = "";
        if (this.intelligence > second.intelligence) {
            winner = this.name;
        } else if (this.intelligence < second.intelligence) {
            winner = second.name;
        } else {
            winner = "Remis";
        }
        System.out.println(this.name + " z inteligencja " + this.intelligence + " oraz " + second.name + " z inteligencja " + second.intelligence + " grają w szachy. Zwycięzcą jest: " + winner);
    }

    public void testLuck(RPGCharacter second) {
        String winner = "";
        if (this.luck > second.luck) {
            winner = this.name;
        } else if (this.luck < second.luck) {
            winner = second.name;
        } else {
            winner = "Remis";
        }
        System.out.println(this.name + " ze szczęściem " + this.luck + " oraz " + second.name + " ze szczęściem " + second.luck + " rzucają monetą. Zwycięzcą jest: " + winner);
    }
}