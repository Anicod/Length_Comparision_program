package lengthcomparision;

class InputCoordinates {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public InputCoordinates(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }



    Double lengthOfTheLine() {
        Double lengthOfTheLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lengthOfTheLine;
    }
      void caculationOfLines(Double lengthOfLineOne, Double lengthOfLineTwo){
          if (lengthOfLineOne.equals(lengthOfLineTwo))
              System.out.println("\nlines are equal in length");
          else if (lengthOfLineOne.compareTo(lengthOfLineTwo) > 0)
              System.out.println("First line is greater than Second line\n");
          else
              System.out.println("First line is less than Second line");
      }
}