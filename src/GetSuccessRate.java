//Після збору статистики вона відправляє дані на сервер у вигляді рядку 111001010111011,
// де 1 - це студент, що зрозумів тему, а 0 - відповідно, ні.
//
//Твоє задання: реалізуй метод getSuccessRate(), який приймає рядок statistic та повертає частку студентів,
// які зрозуміли матеріал, у вигляді змінної типу double.



public class GetSuccessRate {
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
}

