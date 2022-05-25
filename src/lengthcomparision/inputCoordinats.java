package lengthcomparision;

class inputCoordinats {
    int x1, y1, x2, y2;

    void lineLength() {
        double lineDistance;
        lineDistance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(lineDistance);
    }
}
