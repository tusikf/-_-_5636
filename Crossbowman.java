// Арбалетчик. Своё свойство - количество стрел
class Crossbowman extends Unit {
    int countArrow;
    public Crossbowman(String name, Position position) {
        super(name, 150, "crossbow", 20, 4, 15, 50, 40, position);
        countArrow = 0;
    }
    @Override
    public String toString(){
        return name;
    }
}
