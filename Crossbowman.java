// Арбалетчик. Своё свойство - количество стрел
class Crossbowman extends Unit {
    int countArrow;
    public Crossbowman(String name) {
        super(name, 150, "crossbow", 20, 4, 15, 50, 40);
        countArrow = 0;
    }
    @Override
    public String toString(){
        return name;
    }
}
