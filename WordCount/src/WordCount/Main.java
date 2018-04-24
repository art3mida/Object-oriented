package WordCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text, search;
        Scanner sc = new Scanner(System.in);
        System.out.println("This program counts the number of times a certain word is used in the text.");

        System.out.println("Enter the text: ");
        text = sc.next();
        System.out.println("Enter the word that you're counting: ");
        search = sc.next();

        int currIndex = 0;
        int count = 0;
        currIndex = text.indexOf(search, currIndex);
        while(currIndex != -1){
            currIndex = text.indexOf(search, currIndex+1);
            count++;
        }

        System.out.println("The word that you're looking for appears " + count + " times in the text.");
        sc.close();
    }
}
