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
    public double Distance(Unit unit1, Unit unit2){
        Position pos1 = unit1.position;
        int x1 = pos1.getX();
        int y1 = pos1.getY();

        Position pos2 = unit2.position;
        int x2 = pos2.getX();
        int y2 = pos2.getY();

        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        return d;
    }





}

