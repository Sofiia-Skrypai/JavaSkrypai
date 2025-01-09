package MateTask;

public class LoopPractice {
    /* Доповни код у редакторі так, щоби значення i,
     * починаючи з одиниці, додалося в змінну result ту кількість разів, що передана в параметрі n.*/
    public static int getSum(int n) {
        int result = 0;

        for (int i = 0; i <= n ; i = i + 1) {
            result += i;
        }

        return result;
    }

    public static int getSumOfFirstTenNumbers() {
        /* Заміни коментар на коректну умову циклу так,
        * щоб у результаті до змінної result додалися числа від 0 до 10 (не включаючи 10) */
        int result = 0;

        for (int i =0; i < 10; i++) {
            result += i;
        }

        return result;
    }

    /*Доповни код у редакторі так, щоби до змінної result
    додавалися числа від 0 до n включно з кроком step.*/
    public static int getSum(int n, int step) {
        int result = 0;

        for (int i = 0; i <= n ; i += step ) {
            result += i;
        }

        return result;
    }

    /*Тепер тобі потрібно створити зворотний цикл.
    Доповни код у редакторі так, щоби до змінної result додавалися числа від n до 0 включно.*/
    public static int getSum2(int n) {
        int result = 0;

        for (int i = n; i > 0 ; i--) {
            result += i;
        }

        return result;
    }

    /*Реалізуй метод getDrinks(), який приймає int numberOfGuests — скільки всього буде гостей,
    і повертає необхідну кількість порцій.

    Якщо гостей 5, то всього знадобиться 15 порцій (1 + 2 + 3 + 4 + 5).

    Якщо 10, то 55 порцій (1 + 2 + 3 + ... + 10).
    */

    public static int getDrinks(int numberOfGuests) {
        int sum = 0;
        for (int i = 1; i <= numberOfGuests; i++){
            sum += i;
        }
        return sum;
    }

    /*якщо step = 1, то, як і раніше, тост говорить кожен гість, що прийшов;
    якщо step = 2, то 1-й, 3-й, 5-й тощо;
    якщо step = 3, то 1-й, 4-й, 7-й, 10-й тощо.
    Реалізуй метод getDrinksWithStep(), який приймає int guestNumber та int step
    та повертає потрібну кількість порцій.*/

    public static int getDrinksWithStep(int guestNumber, int step) {
        int sum = 0;
        for (int i = 1; i <= guestNumber; i += step){
            sum += i;
        }
        return sum;
    }

    /* створи змінну int solutionAttempts - кількість спроб вирішити завдання;
створи цикл do while, всередині якого solutionAttempts збільшуватиметься на 1;
повторюй цикл, допоки solutionAttempts залишається меншою, ніж maxAttempts;
поверни результат solutionAttempts із методу.*/
    public static int reviewCode(int maxAttempts) {
        int solutionAttempts = 0;
        do {
            solutionAttempts++;
        }
        while(solutionAttempts < maxAttempts);
        return solutionAttempts;
    }
}


