package units;

import java.util.ArrayList;

// Крестьянин. Своё свойство - количество стрел
public class Peasant extends Unit {
    int countArrow;
    public Peasant(String name, Position position) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40, position);
        countArrow = 0;
    }
    protected void printname() {
        System.out.println("Name: " + name);
    }
    @Override
    public String toString(){
        return name;
    }


    @Override
    public void step(ArrayList<Unit> enemy) {

    }
}
