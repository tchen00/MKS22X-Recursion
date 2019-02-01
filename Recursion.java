public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrtHelper(n, 1, tolerance);
    }

    private static double sqrtHelper(double n, double g, double tolerance) {
      if (n == 0){
        return 0;
      } else if (((g*g - n ) / n ) <= tolerance) {
        return g;
      }
      return sqrtHelper(n, ((n/g +g)/2), tolerance);
    }
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    /*
    public static int fib(int n){

    }
    */
    /*As Per classwork*/
  /*
    public static ArrayList<Integer> makeAllSums(){

    }
  */
}
