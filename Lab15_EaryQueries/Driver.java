import java.util.Scanner;
public class Driver{
    public static void main(){
        FileReader f = new FileReader();
        Scanner input = new Scanner(System.in);
        System.out.println("Average word length: "+f.avgLength());
        System.out.println("Shortest word: "+f.shortestWord());
        System.out.println("Longest word: "+f.longestWord());
        System.out.print("Choose a word to find the number of appearances: ");
        String word = input.nextLine();
        System.out.println("Appearances of "+word+": "+f.numWord(word));
    }
}
