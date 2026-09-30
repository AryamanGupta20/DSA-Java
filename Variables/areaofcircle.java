package Variables;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the Radius :");
        int r = sc.nextInt();

        double pi = 3.14;

        double area = pi*r*r;

        System.out.print(area);
    }
}
