import MateTask.StringPractice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("MateTask.GetSuccessRate");
        System.out.println(StringPractice.getSuccessRate("11100"));
        System.out.println(StringPractice.getSuccessRate("1110011000"));
        System.out.println(StringPractice.getSuccessRate("1111111"));
        System.out.println(StringPractice.getSuccessRate("00000"));
        System.out.println(StringPractice.getSuccessRate(""));
    }
}
