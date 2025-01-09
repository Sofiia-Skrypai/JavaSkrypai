package MateTask;

public class BasicPractice {
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
}
