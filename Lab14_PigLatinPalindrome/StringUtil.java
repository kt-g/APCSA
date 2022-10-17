import java.util.Scanner;
import java.util.ArrayList;
public class StringUtil {
    private String phrase;
    public StringUtil() {
        System.out.println("Enter a phrase");
        Scanner input = new Scanner(System.in);
        phrase = input.nextLine();
        System.out.print("Reversed: ");
        System.out.println(reverse(phrase));
        System.out.print("Cleaned: ");
        System.out.println(clean(phrase));
        System.out.print("Palindrome? ");
        System.out.println(palindrome(phrase));
        System.out.print("Pig Latin: ");
        System.out.println(pigLatin(phrase));
    }
    //exactly reverses String
    public String reverse(String p){
        String reversed = "";
        for(int i=p.length()-1; i>-1; i--){
            reversed+=String.valueOf(p.charAt(i));
        }
        return reversed;
    }
    //removes punctuation/non-letter characters, makes all letters lowercase
    public String clean(String p){
        String cleaned = "";
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i)>96 && p.charAt(i)<123){
                cleaned += p.charAt(i);
            }
            else if (p.charAt(i)>64 && p.charAt(i)<91){
                cleaned += (char)((int)p.charAt(i)+32);
            }
        }
        return cleaned;
    }
    //returns true if is palindrome
    public boolean palindrome(String p){
        String a = clean(p);
        String b = reverse(a);
        return a.equals(b);
    }
    //pig Latin 
    public String pigLatin(String p){
        ArrayList<String> words = new ArrayList<String>();
        int j=0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)==' '){
                words.add(p.substring(j,i));
                j=i+1;
            }
            else if (i==p.length()-1){
                words.add(p.substring(j,i+1));
            }
        }
        String word="";
        String pigLatin="";
        char letter;
        for(int i=0;i<words.size();i++){
            for(int k=0;k<words.get(i).length();k++){
                word = words.get(i);
                letter = word.charAt(k);
                if(k!=0) {
                   if(letter=='A'||letter=='a') {
                        word=word.substring(k,word.length())+word.substring(0,k);
                        break;
                   }
                   else if(letter=='E'||letter=='e') {
                        word=word.substring(k,word.length())+word.substring(0,k);
                        break;
                   }
                   else if(letter=='I'||letter=='i') {
                        word=word.substring(k,word.length())+word.substring(0,k);
                        break;
                   }
                   else if(letter=='O'||letter=='o') {
                        word=word.substring(k,word.length())+word.substring(0,k);
                        break;
                   }
                   else if(letter=='U'||letter=='u') {
                        word=word.substring(k,word.length())+word.substring(0,k);
                        break;
                   } 
                }
                else {
                   if(letter=='A'||letter=='a') {
                        break;
                   }
                   else if(letter=='E'||letter=='e') {
                        break;
                   }
                   else if(letter=='I'||letter=='i') {
                        break;
                   }
                   else if(letter=='O'||letter=='o') {
                        break;
                   }
                   else if(letter=='U'||letter=='u') {
                        break;
                   } 
                }
            }
            word+="ay";
            words.set(i,word);
        }
        for(int i=0;i<words.size();i++){
            pigLatin += words.get(i)+" ";
        }
        return pigLatin;
    }
}