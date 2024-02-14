// Крестьянин. Своё свойство - количество стрел
class Peasant extends Unit {
    int countArrow;
    public Peasant(String name) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40);
        countArrow = 0;
    }
    protected void printname() {
        System.out.println("Name: " + name);
    }
    @Override
    public String toString(){
        return name;
    }

}
