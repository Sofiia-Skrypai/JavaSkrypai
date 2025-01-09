package MateTask;

public class ArraysPractice {
    /*У тебе є метод returnArrayLength(), який приймає масив input типу String.
    Поверни з методу довжину цього масиву.*/
    public static int returnArrayLength(String[] input) {
        return input.length;
    }
    /*Твоє завдання: в методі createEmptyArray()
    створи порожній масив типу String з довжиною 0 та поверни його з методу.*/
    public static String[] createEmptyArray() {
        String[] arr = new String[0];
        return arr;
    }
    /* Твоє завдання: зміни значення першого елементу масиву (з індексом 0) на plum, а потім поверни оновлений масив. */
    public static String[] changeArrayElement(String[] fruits) {
        fruits[0] = "plum";
        return fruits;
    }
    /*Для цього, створи порожній масив numbers типу int із довжиною 5. За допомогою циклу for наповни цей масив цифрами від 1 до 5, а потім поверни його.*/
    public static int[] createArray() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        return numbers;
    }
    /*Реалізуй метод getDoublePower(), що приймає масив цілих чисел powers та повертає масив, у якому кожне значення елементу помножене на 2.*/
    public static int[] getDoublePower(int[] powers) {
        for( int i = 0; i < powers.length; i++){
            powers[i] *= 2;
        }
        return powers;
    }
    /*реалізуй метод getMaxNumber(), щоби він повертав найбільший елемент масиву.*/
    public static int getMaxNumber(int[] numbers) {
        int max = numbers[0];
        for(int maxNumber: numbers){
            if (maxNumber > max){
                max = maxNumber;
            }
        }
        return max;
        // Write code above this line
    }
    /*Реалізуй метод getSum(), який приймає масив цілих чисел numbers. Метод повинен повернути суму елементів масиву. Однак, не треба додавати до суми число, якщо воно парне (ділиться на 2 без залишку).*/
    public static int getSum(int[] numbers){
        int sumNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                continue;
            }
            sumNumber += numbers[i];
        }
        return sumNumber;
    }
    /*Твоє завдання: виправ код так, щоб в результаті метод повернув масив з елементом lemon під індексом 2.*/
    public static String[] createArray2() {
        //change code below this line
        String[] fruits = new String[3];
        fruits[2] = "lemon";
        //change code above this line

        return fruits;
    }
    /*Твоє завдання: реалізуй метод getSum(), дотримуючись певних умов:
    - метод повинен повернути суму значень елементів, починаючи із середини масиву. Для цього, при оголошенні циклу, замість int i = 0; підстав коректний вираз;
    - якщо зустрінеш число 1, вийди повністю з усього циклу за допомогою оператору break (не додавай 1 до суми);
    - не використовуй оператор continue.*/
    public static int getSum3(int[] numbers) {
        int middle = numbers.length / 2;
        int sum = 0;
        for (int i = middle; i < numbers.length; i++){
            if (numbers[i] == 1){
                break;
            }
            sum += numbers[i];
        }
        return sum;
    }

}
