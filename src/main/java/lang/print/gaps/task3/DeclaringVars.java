package lang.print.gaps.task3;

import java.io.FileWriter;

public class DeclaringVars {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        a = 10;
        b = a;
        c = b;

        try{
            FileWriter fw=new FileWriter("D:\\test.txt");
            fw.write("Welcome to java to point." + c);
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
