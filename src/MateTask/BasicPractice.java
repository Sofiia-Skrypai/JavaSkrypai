package MateTask;


public class BasicPractice {
    /*У цьому завданні реалізуй метод getMiddleString(), що приймає рядок і повертає центральний символ у вигляді рядку.*/
    public static String getMiddleString(String originalString) {
        if(!originalString.isEmpty()){
            int middleIndex = originalString.length() / 2;
            if(originalString.length() % 2 == 0){
                return originalString.substring(middleIndex-1, middleIndex + 1);
            }
            else {
                return originalString.substring(middleIndex, middleIndex + 1);
            }
        }
        else {
            return "";
        }
    }

    /*В цьому завданні реалізуй метод removeOddChars(), який приймає рядок і видаляє в ньому всі непарні символи, а потім повертає результат.*/
    public static String removeOddChars(String originalString) {
        if(!originalString.isEmpty()){
            StringBuilder builder = new StringBuilder(originalString);
            for (int i = 1; i < builder.length(); i += 1){
                builder.delete(i, i+1);
            }
            return String.valueOf(builder);
        }
        else {
            return "";
        }
    }

    /*реалізуй метод так, щоби він повертав масив типу String з двох елементів: originalString з першим символом у верхньому регістрі та originalString з останнім символом у верхньому регістрі.*/
    public static String[] markStringEnds(String originalString) {
        if (!originalString.isEmpty()) {
            String[] resultSTR = new String[2];
            String firstUpper = Character.toUpperCase(originalString.charAt(0)) + originalString.substring(1);
            resultSTR[0] = firstUpper;

            String lastUpper = originalString.substring(0, originalString.length() - 1) + Character.toUpperCase(originalString.charAt(originalString.length() - 1));
            resultSTR[1] = lastUpper;

            return resultSTR;
        } else {

            return new String[0];
        }
    }

    /*Реалізуй метод getOccurrenceCount() так, щоби він повертав кількість разів, яку targetColor зустрічається в масиві colors.*/
    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int cout = 0;
        if (colors.length != 0){
            for ( int i = 0; i < colors.length; i++){
                if (colors[i].equals(targetColor)){
                    cout++;
                }
            }
            return cout;
        }
        else {
            return 0;
        }
    }

    /*Реалізуй метод getAverageSalary() так, щоби він повертав середнє значення елементів масиву salaries.*/
    public static double getAverageSalary(double[] salaries) {
        double sum = 0;
        if (salaries.length != 0){
            for (int i = 0; i < salaries.length; i++){
                sum += salaries[i];
            }
            return sum / salaries.length;
        }
        else {
            return 0.0;
        }
    }

    /*Реалізуй метод countTheMonkeys() так, щоби він повертав масив типу int, який містить значення від 1 до count. Зверни увагу: якщо count = 0, поверни порожній масив.*/
    public static int[] countTheMonkeys(int count) {
        int[] countArray = new int[count];
        if(count != 0){
            for(int i = 0; i < count; i++){
                countArray[i] = i+1;
            }
            return countArray;
        }
        else {
            return countArray;
        }
    }

    /*Твоє завдання: реалізуй метод getHighestAndLowestAge() так, щоби він повернув масив типу int, який містить найбільший та найменший вік із масиву ages.
    Зверни увагу: першим значенням елементу нового масиву має бути найбільший вік.*/
    public static int[] getHighestAndLowestAge(int[] ages) {
        int[] agesArray = new int[2];
        int max = ages[0];
        int min = ages[0];
        if(ages.length != 0){
            for (int i = 0; i < ages.length; i++){
                if (max < ages[i]){
                    max = ages[i];
                }
                if (min > ages[i]){
                    min = ages[i];
                }
            }
            agesArray[0] = max;
            agesArray[1] = min;
            return agesArray;
        }
        else {
            return agesArray;
        }
    }

}
