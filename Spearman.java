// Копейщик. Своё свойство - количество копей
class Spearman extends Unit {
    int countSpear;
    public Spearman(String name, Position position) {
        super(name, 150, "spear", 30, 6, 15, 50, 40, position);
        countSpear = 0;
    }
    @Override
    public String toString(){
        return name;
    }
}
