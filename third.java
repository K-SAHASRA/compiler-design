import java.io.*;
import java.util.*;
public class third{
    public static void main(String[] args){
        System.out.println("enter the condition and action");
        Scanner sc = new Scanner(System.in);
        String condition = sc.nextLine();
        String action = sc.nextLine();
        String ans = getcondition(condition,action);
        System.out.println(ans);

    }
    public static String getcondition(String condition , String action){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("if(").append(condition).append("){/n");
        codeBuilder.append("/t").append(action);
        codeBuilder.append("}");
        return codeBuilder.toString();
    }

}