import java.util.ArrayList;
import java.util.List;

public class Position {
    int x;
    int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPosition(int value1, int value2) {
        this.x = value1;
        this.y = value2;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString(){
        return x + "," + y;
    }
    // Метод нахождения расстояния между двумя персонажами
//    public double minDistance(Unit unit1, Unit unit2){
//
//        return Math.sqrt(Math.pow(unit1.position().getX))
//


}

