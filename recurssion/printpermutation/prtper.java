package recurssion.printpermutation;
import java.io.*;
import java.util.*;

public class prtper {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) { 
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i  =0 ; i < str.length();i++){
            char ch = str.charAt(i);
            String rq = str.substring(0,i);
            String lq = str.substring(i+1);
            String whole = rq+lq;
            printPermutations(whole,asf+ch);
        }
        
    }

}