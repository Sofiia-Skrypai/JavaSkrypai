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
}
