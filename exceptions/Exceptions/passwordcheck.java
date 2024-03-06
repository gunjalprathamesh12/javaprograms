package exceptions.Exceptions;

import java.lang.*;

import typecasting.explicittypecatsing;

import java.io.*;

class NoMatchException extends Exception {
    NoMatchException(String s) {
        super(s);
    }
}

public class passwordcheck {
    public static void main(String[] args)throws IOException{
        {
            BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter password=");
            String str=bf.readLine();
            try{
                if(str.compareTo("MSBTE")!=0);
                {
                    System.out.println("Opppps!!!!! \n Wrong password");
                }
             else
                System.out.println("WElcome to AV poly");
            }catch(NoMatchException e){
                System.out.println(e);
            }
        }
        
    }

}
