
public class Triangle {
    private int side1, side2, side3;

    public void setter(int sid1, int sid2, int sid3) {
       side1=sid1 ;
       side2=sid2 ;
       side3=sid3 ;
    }

    public double calc_area() {
        double premter = (side1+side2+side3)/2.0 ;
        double ans = Math.sqrt(premter*(premter-side1)*(premter-side2)*(premter-side3)) ;
        return  ans ;
    }
    public int calc_circum()
    {
        return side1+side2+side3 ;
    }

}
