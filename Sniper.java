// Снайпер. Своё свойство - нет уникальностей
class Sniper extends Unit {
    public Sniper(String name) {
        super(name, 150, "slingshot", 40, 2, 15, 50, 100);
    }
    @Override
    public String toString(){
        return name;
    }
}