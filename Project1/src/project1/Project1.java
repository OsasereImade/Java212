package project1;

import java.util.StringTokenizer;

public class Project1 {
   public static TextFileInput myFile;
   public static StringTokenizer myTokens;
   public static String line;
   public static String sentence;
   public static String [] input;
   public static char upperCaseVowels;
   public static char lowerCaseVowels;
   public static int length;
   public static int distance;
   public static int meter;
   public static int kilometer;
   public static int howLong;
   public static int total;
   

    public static void main(String[] args) {
       // input = new String [];
        length = 0;
        distance = 0;
        meter = 0;
        kilometer = 0;
        howLong = 0;
        total = 0;
        myFile = new TextFileInput("input.txt");
        line = myFile.readLine();
        while(line != null) {
        //System.out.println("The first line is " + line);
        for(int i = 0; i <line.length(); i++) {
           if(line.charAt(i) == 'A' || line.charAt(i) == 'a') length++;
           else if (line.charAt(i) == 'E' || line.charAt(i) == 'e') kilometer++;
           else if (line.charAt(i) == 'i' || line.charAt(i) == 'I') distance++;
           else if (line.charAt(i) == 'o' || line.charAt(i) == '0') meter++;
           else if (line.charAt(i) == 'u' || line.charAt(i) == 'U') howLong++;

        total = length + kilometer + distance + meter + howLong;
      
        } //for loop
        System.out.println("There are: " + total  +" letter a vowels in  line 1");
        System.out.println("There are: " + total + " letter a vowels in the line 2");
        System.out.println("There are: " + total + " letter a vowels in the line 3");
        System.out.println("There are: " + total + " letter a vowels in the line 4");
        System.out.println("There are: " + total + " letter a vowels in the line 5");
        
        myFile.close();
        }
//        System.out.println("There are: " + length + " letter a vowels in the line");
//            distance = 0;
//            line = myFile.readLine();
//            System.out.println("The second line is " + line);
//            for(int i = 0; i <line.length(); i++) {
//                if(line.charAt(i) == 'e'|| line.charAt(i) == 'E') {
//                    distance++;
//                }
//            } 
//            System.out.println("There are: " + distance + " letter a vowels in the line");
//                else if (line.charAt(i) == 'i' || line.charAt(i) == 'I')
//                else if (line.charAt(i) == 'o' || line.charAt(i) == '0')
//                else if (line.charAt(i)== 'u' || line.charAt(i) == 'U');
//                length++;
             
        //System.out.println("There are " + length + " letter a vowels in the line");
    }// main
}//class

