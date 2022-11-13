package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {

        int first = 1;
        int second = 10;
        int third = 100;

        System.out.println(first + " \n" + second + " \n" + third);

        var linkToFirst = first;
        var linkToSecond = second;
        var linkToThird = third;

        first = 15;
        second = 6;
        third = 4;

        System.out.println("l1: " + linkToFirst);
        System.out.println("l2: " + linkToSecond);
        System.out.println("l3: " + linkToThird);
        System.out.println("f: " + first);
        System.out.println("s: " + second);
        System.out.println("t: " + third);

    }
}
