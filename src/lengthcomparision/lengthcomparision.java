package lengthcomparision;

import java.util.Scanner;

public class lengthcomparision {
        public static void main(String[] args) {
            System.out.println("welcome to line comparision computation");
            int x1, x2, y1, y2, a1, a2, b1, b2;
            double lineDistance1;
            double lineDistance2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x1 point for line 1 : ");
            x1 = sc.nextInt();
            System.out.println("Enter x2 point for line 1 : ");
            x2 = sc.nextInt();
            System.out.println("Enter y1 point for line 1 : ");
            y1 = sc.nextInt();
            System.out.println("Enter y2 point for line 1 : ");
            y2 = sc.nextInt();
            System.out.println("Enter a1 point for line 2 : ");
            a1 = sc.nextInt();
            System.out.println("Enter a2 point for line 2 : ");
            a2 = sc.nextInt();
            System.out.println("Enter b1 point for line 2 : ");
            b1 = sc.nextInt();
            System.out.println("Enter b2 point for line 2 : ");
            b2 = sc.nextInt();
            lineDistance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            lineDistance2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
            System.out.println("The Length of the Line 1 : " + lineDistance1);
            System.out.println("The Length of the Line 2 : " + lineDistance2);



        }
    }
