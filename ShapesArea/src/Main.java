import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle tr = new Triangle();
        Circle cr = new Circle();
        //enter Triangle Sides
        int side1, side2, side3;
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();
        tr.setter(side1, side2, side3);
        System.out.print(tr.calc_area()+" ");
        System.out.println(tr.calc_circum());

        // enter diameter
        int diameter = sc.nextInt();
        cr.setter(diameter);
        System.out.print(cr.calc_area() + " ");
        System.out.print(cr.calc_circum());
    }
}