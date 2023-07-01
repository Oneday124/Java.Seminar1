// Вывести все простые числа от 1 до 100 (простое число - число которое делится только само на себя и на 1)
package seminar1.HomeWork;

public class Task6 {
    public static void simpleNumber(int n){
        for (int i = 1; i <= n; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
               if (i % j == 0) count++;
            }
            if (count == 2) System.out.println(i);
        }
    }
}
