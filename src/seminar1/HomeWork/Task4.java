// Вычислить n-ое треугольное число (сумма чисел от 1 до n)
package seminar1.HomeWork;

public class Task4 {
    public static int nTriangularNumber(int n){
        int count = 0;
        for (int i = 0; i <= n; i++){
            count = count + i;
        }
        return count;
    }
}
