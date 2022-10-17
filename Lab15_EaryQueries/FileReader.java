import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class FileReader{
    private ArrayList <String> words;
    public FileReader(){
        words = new ArrayList<String>();
        try{
            Scanner scan = new Scanner(new File("BabySharkLyrics.txt"));
            while(scan.hasNext()) {
                String line = scan.nextLine();
                separate(line);
            }
        }
        catch(FileNotFoundException ex){
        }
        System.out.println("-------------------");
        //System.out.println(words);
        clean();
        //System.out.println(words);
    }
    public ArrayList clean(){ 
        for(int i=0; i<words.size(); i++){
            if(words.get(i).equals("")){
                words.remove(i);
            }
        }
        for(int i=0; i<words.size(); i++){
            if(words.get(i).charAt(0)<'a'){
                char first = (char)((int)(words.get(i).charAt(0)+32));
                words.set(i,first + words.get(i).substring(1));
            }
            if(words.get(i).charAt(words.get(i).length()-1)<'a'||words.get(i).charAt(words.get(i).length()-1)>'z'){
                words.set(i,words.get(i).substring(0,words.get(i).length()-1));
            }
            if(words.get(i).charAt(0)<'a'||words.get(i).charAt(0)>'z'){
                words.set(i,words.get(i).substring(1));
            }
        }
        return words;
    }
    public void separate(String str){
        while(str.indexOf(" ")!=-1){
            int space = str.indexOf(" ");
            words.add(str.substring(0,space));
            str = str.substring(space+1);
        }
        words.add(str);
    }    
    public double avgLength(){
        double total = 0;
        for(int i=0; i<words.size(); i++){
            total+=words.get(i).length();
        }
        return total/words.size();
    }
    public int numWord(String w){
        int num = 0;
        for(int i=0; i<words.size(); i++){
            if(words.get(i).equals(w)){
                num++;
            }
        }
        return num;
    }
    public String longestWord(){
        String longest=words.get(0);
        int numChar=words.get(0).length();
        for (int i=1; i<words.size(); i++){
            if(words.get(i).length()>numChar){
                longest = words.get(i);
                numChar=words.get(i).length();
            }
        }
        return longest;
    }
    public String shortestWord(){
        String shortest=words.get(0);
        int numChar=words.get(0).length();
        for (int i=1; i<words.size(); i++){
            if(words.get(i).length()<numChar){
                shortest = words.get(i);
                numChar=words.get(i).length();
            }
        }
        return shortest;
    }
}

