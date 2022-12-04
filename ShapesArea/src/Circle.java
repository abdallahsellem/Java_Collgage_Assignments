public class Circle {
     private int diameter ;
     public void setter(int dia)
     {
         diameter=dia ;
     }
     public int getter()
     {
         return diameter ;
     }
     public double calc_area ()
     {
         double r =diameter/2.0 ;
         return r*r*Math.PI ;
     }
     public double calc_circum()
     {
         double r =diameter/2.0 ;
         return 2 * r *Math.PI ;
     }

}
