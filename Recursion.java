public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance) {
      // calling private helper method + giving input random guess
      return sqrtHelper(n, 1, tolerance);
    }

    private static double sqrtHelper(double n, double g, double tolerance) {
      // base case of 0
      if (n == 0) {
        return 0;
      } double error = ((g * g - n ) / n );
        if (error < 0) error *= -1;
       if ( error <= tolerance) {
        // sees the percent error as compared to the tolerance (this is if satisfactory)
        return g;
      }
      // calling recursive step
      return sqrtHelper(n, ((n/g +g)/2), tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */

    public static int fib(int n){

    }
    
    /*As Per classwork*/
  /*
    public static ArrayList<Integer> makeAllSums(){

    }
  */
  public static void main(String[] args) {
    System.out.println("--------TESTING SQRT METHOD----------")
    System.out.println(sqrt(1,0.00000000001));
    System.out.println(sqrt(0,0.00000000001));
    System.out.println(sqrt(4,0.00000000001));
    System.out.println(sqrt(9,0.00000000001));
    System.out.println(sqrt(400,0.00000000001));
    System.out.println(sqrt(32,0.00000000001));
    System.out.println(sqrt(0.25,0.00000000001));
  }
}
