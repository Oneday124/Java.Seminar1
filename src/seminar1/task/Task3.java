// Дан масств двоичных чисел, например [1, 1, 0, 1, 1, 1],
// Вывести максимальное количество подряд идущих единиц.

package seminar1.task;

public class Task3 {
    public static int getMaxOneCount(int[] array) {
        int maxCount = 0;
        int count = 0;
        for (int item : array) {
            if (item == 1) count++;
            else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
