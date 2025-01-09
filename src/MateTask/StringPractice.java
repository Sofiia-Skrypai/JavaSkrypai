package MateTask;


public class StringPractice {
    /*Реалізуй метод stringToUpperCase() так, щоби він повертав вхідний рядок input у верхньому регістрі.*/
    public static String stringToUpperCase(String input) {
        String toUpper = input.toUpperCase();
        return toUpper;
    }

    /*Ми створили метод getValue(), який приймає рядок dataFromDatabase у вигляді data=value.
    Твоє завдання: прибрати з рядку data та =, а потім повернути value у нижньому регістрі. Будь уважним, бо value в собі теж може містити символ =.*/
    public static String getValue(String dataFromDatabase) {

        int indexOfEqual = dataFromDatabase.indexOf('=');
        String dataWithoutEqual = dataFromDatabase.substring(indexOfEqual + 1);
        String dataWithoutEqualLower = dataWithoutEqual.toLowerCase();
        dataFromDatabase = dataWithoutEqualLower;

        return dataFromDatabase;
    }
    /*У методі returnStringLength() поверни довжину рядку input.*/
    public static int returnStringLength(String input) {
        return input.length();
    }

    /*Виправ код так, щоби метод createGreeting() виконував свою функцію.*/
    public static String createGreeting(String input) {
        //change the code below
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append(input);
        String reversedBuilder = builder.toString();
        return reversedBuilder;
    }

    /*У методі combineStrings() з'єднай вхідні рядки one і two. В результаті поверни новий рядок. Для з`єднання рядків використай клас StringBuilder.*/
    public static String combineStrings(String one, String two) {
        StringBuilder builder = new StringBuilder(one);
        builder.append(two);
        String stringBuilder = builder.toString();
        return stringBuilder;
    }

    /*Є вхідний рядок input. З'єднай елементи під індексами 1 та 3 в новий рядок, а потім поверни його.*/
    public static String createNewString(String input) {
        char value1 = input.charAt(1);
        String str1 = String.valueOf(value1);
        char value2 = input.charAt(3);
        String str2 = String.valueOf(value2);
        StringBuilder str12 = new StringBuilder(str1);
        str12.append(str2);
        return str12.toString();
    }
    /*Реверсни вхідний рядок input та поверни його з методу reverseString().*/
    public static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        String reversedInput = builder.toString();
        return reversedInput;
    }

    /*Реалізуй метод isWerewolf(), який покаже, чи рядок target можна прочитати задом наперед*/
    public static boolean isWerewolf(String target) {
        StringBuilder bilder = new StringBuilder (target);
        bilder.reverse();
        String reversedTarget = bilder.toString();
        if (target.equals(reversedTarget)){
            return true;
        }
        else{
            return false;
        }
    }

    /*Ми хочемо створити метод makeAbbr(), який буде повертати для них абревіатури.*/
    public static String makeAbbr(String fullName) {
        char firstLetter = fullName.charAt(0);
        String firstLetterStr = String.valueOf(firstLetter);
        StringBuilder builder = new StringBuilder(firstLetterStr);

        int findIndex = 0;

        int indexNextLetter = fullName.indexOf(' ');
        while(indexNextLetter != -1){
            findIndex = indexNextLetter + 1;
            char valueNextLetter = fullName.charAt(findIndex);
            builder.append(valueNextLetter);
            indexNextLetter = fullName.indexOf(' ', 0 + findIndex);
        }
        String abbr = String.valueOf(builder);
        return abbr.toUpperCase();
    }

    /*Твоє завдання: перевір, скільки пачок тіста ми купили. Поверни true, якщо ми купили 2 або більше пачки, або false, якщо менше.*/
    public static boolean doughIsEnough(String[] ingredients) {
        String dough = "dough";
        int count = 0;
        for (String checkDough : ingredients){
            if (checkDough.equals(dough)){
                count++;
            }
        }
        return count >= 2;
    }

    /*Після збору статистики вона відправляє дані на сервер у вигляді рядку 111001010111011, де 1 - це студент, що зрозумів тему, а 0 - відповідно, ні.
    *Твоє задання: реалізуй метод getSuccessRate(), який приймає рядок statistic та повертає частку студентів, які зрозуміли матеріал, у вигляді змінної типу double.     */
    public static double getSuccessRate(String statistic) {
        int count1 = 0;
        int count2 = 0;

        if (statistic.isEmpty()){
            return 0.0;
        }
        else {
            for(int i = 0; i < statistic.length(); i++){
                char value = statistic.charAt(i);
                String valueStr = String.valueOf(value);
                if (valueStr.equals("1")){
                    count1++;
                }
                else {
                    count2++;
                }
            }
            double total = count1 + count2;
            return count1 / total;

        }
    }

    /*Допиши метод getUpperCase() так, щоби він повертав рядок "The string is null!", якщо inputString дорівнює null.*/
    public static String getUpperCase(String inputString) {
        if (inputString == null){
            return "The string is null!";
        }
        else {
            return inputString.toUpperCase();
        }
    }

    /*Реалізуй метод compareStrings(), який приймає рядки firstString і secondString та повертає true, якщо вони однакові, або false, якщо ні.
    Зверни увагу: якщо обидва рядки мають значення null, вони також вважаються однаковими.*/
    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString == null && secondString == null){
            return true;
        }
        else {
            if (firstString == null || secondString == null){
                return false;
            }
            else {
                return firstString.equals(secondString);
            }
        }
    }

}



