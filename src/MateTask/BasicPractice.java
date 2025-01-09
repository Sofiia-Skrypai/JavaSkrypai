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
}
