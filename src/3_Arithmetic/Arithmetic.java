public class Arithmetic{
    public static void main(String[] args){
        // Augmented Assignment Operators
        int x = 9;
        int y = 3;
        int product = x * y;
        int diff = x - y;
        int sum = x + y;

        double div = (double)x / y;


        //System.out.println(product);
        //System.out.println(diff);
        //System.out.println(sum);
        //System.out.println(div);


        // Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7-5) / 2.0;
        double res = addNumbers(x,y);
        int ress = addNumbers(29,34);
        System.out.println(result);
        System.out.println(res);
        System.out.println(ress);
    }

    static double addNumbers(double x, double y){
        return x + y;
    }
    static int addNumbers(int x, int y){
        return x + y;
    }
}