package lang.print.gaps.task3;

import java.io.FileWriter;

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



        try{
            FileWriter fw=new FileWriter("D:\\test.txt");
            fw.write("First line = " + linkToFirst + linkToSecond + linkToThird);
            fw.write("Second line = " + first + second + third);
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
