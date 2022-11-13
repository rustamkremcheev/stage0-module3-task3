package lang.print.gaps.task3;

import java.io.FileWriter;

public class BasicVariablesInitialization {
    public static void main(String[] args) {

        int first = 1;
        int second = 10;
        int third = 100;

        try{
            FileWriter fw=new FileWriter("D:\\test.txt");
            fw.write("line1 = " + first + " \n" + second + " \n" + third);
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("finish");
        }
    }
}
