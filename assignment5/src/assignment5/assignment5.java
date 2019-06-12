package assignment5;

import java.util.*;

public class assignment5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Which days had rain?");
        String days = scan.nextLine();
        String week[] = days.split(" ");
        int x = week.length;
        int a = 7-x; System.out.println("Number of days without rain: " + a);
   
        //------------
        
        System.out.println("Students:");
        String students= scan.nextLine();
        String Studentsarray [] = students.split(" ");
        int i = 0;
        int lentharray = Studentsarray.length;
        Arrays.sort(Studentsarray);
        while(lentharray>i&&i>=0){
        System.out.println(Studentsarray[i]);
        ++i;
        }
        */
        //------------
        System.out.println("type color of cars:");
        String color = scan.nextLine();
        String carcolor = new String (color);
        String [] carcolorarray = carcolor.split(" ");
        int arraylenth = carcolorarray.length;
        int e = 0;
        int bluenum = 0;
        int rednum = 0;
        while(arraylenth>e){ 
        if (carcolorarray[e].equals("blue")){
            ++bluenum;
        }
        if (carcolorarray[e].equals("red")){
            ++rednum;
        }
        ++e;  
        }
        System.out.println("red: "+rednum);
        System.out.println("blue: "+bluenum);
        
        //---------------
        /*
           System.out.println("code:");
        String code = scan.nextLine();
        String [] codearray = code.split(" ");
        int arraylenth = codearray.length;
        int a = arraylenth-1;
        while(arraylenth>a&&a>=0){
        char character = codearray[a].charAt(0); 
        int ascii = (int) character; 
        if (ascii>=65&&ascii<=90){
            System.out.print(codearray[a].toLowerCase());
            System.out.print(" ");
        }    
         --a;
        }
         */
        //-----------

        System.out.println("enter words:");
        String words = scan.nextLine();
        String[] wordarray = words.split(" ");
        String word1 = wordarray[0];
        String word2 = wordarray[1];
        char word1firstchar = wordarray[0].charAt(0);
        char word1lastchar = wordarray[0].charAt(word1.length() - 1);
        char word2firstchar = wordarray[1].charAt(0);
        char word2lastchar = wordarray[1].charAt(word2.length() - 1);
        String Final = "";
        int count = 0;

        if (word1.length() != word2.length()) {
            System.out.println("Huh?");
            count++;
        } else {
            if (word1firstchar == word2firstchar && word1lastchar == word2lastchar) {
                Final += word2.charAt(0);
                for (int i = 1; i < word1.length() -1; i++) {
                    String temp = String.valueOf(word1.charAt(i));
                    if (word2.contains(temp)) {
                        Final += word2.charAt(i);
                    }
                }
            }
            Final += word2.charAt(word2.length() - 1);
        }
        if (Final.equals(word2)) {
            System.out.println("Super Anagram!");
        } else if (count == 0) {
            System.out.println("Huh?");
        }
    }
}
