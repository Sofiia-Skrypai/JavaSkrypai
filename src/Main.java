import MateTask.StringPractice;
import MateTask.BasicPractice;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        getSuccessRate
//        System.out.println("MateTask.GetSuccessRate");
//        System.out.println(StringPractice.getSuccessRate("11100"));
//        System.out.println(StringPractice.getSuccessRate("1110011000"));
//        System.out.println(StringPractice.getSuccessRate("1111111"));
//        System.out.println(StringPractice.getSuccessRate("00000"));
//        System.out.println(StringPractice.getSuccessRate(""));

//      getMiddleString
//        System.out.println(BasicPractice.getMiddleString("hello")); // "l"
//        System.out.println(BasicPractice.getMiddleString("v")); // "23"
//        System.out.println(BasicPractice.getMiddleString("(())")); // "()"
//        System.out.println(BasicPractice.getMiddleString("Bob")); // "o"
//        System.out.println(BasicPractice.getMiddleString("")); // ""

//      removeOddChars
//        System.out.println(BasicPractice.removeOddChars("1234")); // "13"
//        System.out.println(BasicPractice.removeOddChars("(())")); // "()"
//        System.out.println(BasicPractice.removeOddChars("Bob")); // "Bb"
//        System.out.println(BasicPractice.removeOddChars("")); // ""

//      MarkStringEnds
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("hello"))); // ["Hello", "hellO"]
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("example"))); // ["Example", "examplE"]
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("Bob"))); // ["Bob", "BoB"]
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("ALICE"))); // ["ALICE", "ALICE"]
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("wow!"))); // ["Wow!", "wow!"]
        System.out.println(Arrays.toString(BasicPractice.markStringEnds("o"))); // ["O", "O"]

    }
}
