package units;

import java.util.ArrayList;

// Снайпер. Своё свойство - нет уникальностей
public class Sniper extends Unit {
    public Sniper(String name, Position position) {

        super(name, 150, "slingshot", 40, 2, 15, 50, 100, position);
    }
    @Override
    public String toString(){
        return name;
    }


    @Override
    public void step(ArrayList<Unit> enemy) {

    }
}