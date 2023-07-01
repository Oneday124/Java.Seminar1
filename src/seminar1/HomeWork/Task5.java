// n! (произведение чисел от 1 до n)
package seminar1.HomeWork;

public class Task5 {
    public static int factorial(int n){
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac = fac * i;
        }
        return fac;
    }
}
