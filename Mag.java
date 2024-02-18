// Колдун. Своё свойство - мана и магия
class Mag extends Unit {
    int mana;
    String magic;
    public Mag(String name, Position position) {
        super(name, 150, "magicStick", 20, 2, 10, 50, 40, position);
        mana = 200;
        magic = "wizardDust";
    }
    @Override
    public String toString(){
        return name;
    }
}
