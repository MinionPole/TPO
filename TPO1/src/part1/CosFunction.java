package part1;

public class CosFunction {
    final static int n = 15;

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    public static double cosCals(double number) {
        while(number > Math.PI){
            number -= 2 * Math.PI;
        }
        while(number < -Math.PI){
            number += 2 * Math.PI;
        }

        double res = 0;
        for(int i = 1;i <= n;i++){
            res += Math.pow(-1, i-1) *(Math.pow(number, 2 * i - 2))/(factorial(2 * i - 2));
        }
        return res;
    }
}
