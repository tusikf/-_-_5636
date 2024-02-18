package units;

import java.util.ArrayList;

// Разбойник. Своё свойство - воровство(крадет здоровье)
public class Outlaw extends Unit {
    int theft;
    public Outlaw(String name, Position position) {
        super(name, 150, "blade", 30, 6, 15, 50, 80, position);
        theft = 10;
    }
    @Override
    public String toString(){
        return name;
    }


    @Override
    public void step(ArrayList<Unit> enemy) {

    }
}
