// Разбойник. Своё свойство - воровство(крадет здоровье)
class Outlaw extends Unit {
    int theft;
    public Outlaw(String name, Position position) {
        super(name, 150, "blade", 30, 6, 15, 50, 80, position);
        theft = 10;
    }
    @Override
    public String toString(){
        return name;
    }
}
