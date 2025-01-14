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
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("hello"))); // ["Hello", "hellO"]
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("example"))); // ["Example", "examplE"]
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("Bob"))); // ["Bob", "BoB"]
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("ALICE"))); // ["ALICE", "ALICE"]
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("wow!"))); // ["Wow!", "wow!"]
//        System.out.println(Arrays.toString(BasicPractice.markStringEnds("o"))); // ["O", "O"]


//      getOccurrenceCount
//        System.out.println(BasicPractice.getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue")); // 3
//        System.out.println(BasicPractice.getOccurrenceCount(new String[] {"blue", "green", "red"}, "red")); // 1
//        System.out.println(BasicPractice.getOccurrenceCount(new String[] {"blue", "green", "red"}, "white")); // 0
//        System.out.println(BasicPractice.getOccurrenceCount(new String[0], "blue")); // 0

//      getAverageSalary
//        System.out.println(BasicPractice.getAverageSalary(new double[] {1000.00, 500.00})); // 750.00
//        System.out.println(BasicPractice.getAverageSalary(new double[] {100.00, 200.00, 300.00})); // 200.00
//        System.out.println(BasicPractice.getAverageSalary(new double[0])); // 0.00

//      getAverageSalary
        System.out.println(Arrays.toString(BasicPractice.countTheMonkeys(5))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(BasicPractice.countTheMonkeys(8))); // [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println(Arrays.toString(BasicPractice.countTheMonkeys(0))); // [] (порожній масив)

//      getHighestAndLowestAge
        System.out.println(Arrays.toString(BasicPractice.getHighestAndLowestAge(new int[]{10, 40, 36}))); // [40, 10]
        System.out.println(Arrays.toString(BasicPractice.getHighestAndLowestAge(new int[]{60, 4, 14, 20, 97}))); // [97, 4]
        System.out.println(Arrays.toString(BasicPractice.getHighestAndLowestAge(new int[]{35}))); // [35, 35]

    }
}
