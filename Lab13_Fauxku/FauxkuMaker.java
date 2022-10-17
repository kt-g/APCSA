import java.util.ArrayList;
public class FauxkuMaker {
    private ArrayList <Word> words;
    public FauxkuMaker() {
        words = new ArrayList <Word>();
        words.add(new Word("love", 1));
        words.add(new Word("plume", 1));
        words.add(new Word("shoe", 1));
        words.add(new Word("true", 1));
        words.add(new Word("hate", 1));
        words.add(new Word("done", 1));
        words.add(new Word("can", 1));
        words.add(new Word("best", 1));
        words.add(new Word("red", 1));
        words.add(new Word("rest", 1));
        words.add(new Word("bruh", 1));
        words.add(new Word("sir", 1));
        words.add(new Word("meme", 1));
        words.add(new Word("joke", 1));
        words.add(new Word("sound", 1));
        words.add(new Word("cry", 1));
        
        words.add(new Word("crickets", 2));
        words.add(new Word("colour", 2));
        words.add(new Word("cookie", 2));
        words.add(new Word("pencil", 2));
        words.add(new Word("given", 2));
        words.add(new Word("winter", 2));
        words.add(new Word("basil", 2));
        words.add(new Word("running", 2));
        words.add(new Word("typing", 2));
        words.add(new Word("museum", 2));
        words.add(new Word("feather", 2));
        words.add(new Word("different", 2));
        words.add(new Word("London", 2));
        
        words.add(new Word("basketball", 3));
        words.add(new Word("calendar", 3));
        words.add(new Word("banana", 3));
        words.add(new Word("appointment", 3));
        words.add(new Word("musical", 3));
        words.add(new Word("attentive", 3));
        words.add(new Word("basketball", 3));
        words.add(new Word("investment", 3));
        words.add(new Word("punishment", 3));
        words.add(new Word("interview", 3));        
        words.add(new Word("related", 3));
        words.add(new Word("Schrodinger's", 3));
        words.add(new Word("whimsical", 3));
        words.add(new Word("pastoral", 3));
        
        words.add(new Word("chronological", 4));
        words.add(new Word("Schrodinger's cat", 4));
        words.add(new Word("automated", 4));
        words.add(new Word("calculator", 4));
        words.add(new Word("unexpected", 4));
        words.add(new Word("incredible", 4));
        words.add(new Word("superlative", 4));
        
        words.add(new Word("Washington DC", 5));
        words.add(new Word("opportunity", 5));
        words.add(new Word("perpendicular", 5));
        words.add(new Word("university", 5));
        words.add(new Word("excruciating", 5));
    }
    public void makeFauxku () {
        String line = "";
        int i = 0;
        while (i<5) {
            int num = (int)(Math.random()*(words.size()));
            if (words.get(num).getSyllables()+i<=5){
                line += words.get(num).getWord();
                line += " ";
                i += words.get(num).getSyllables();
            }
        }
        System.out.println(line);
        i = 0;
        line = "";
        while (i<7) {
            int num = (int)(Math.random()*(words.size()));
            if (words.get(num).getSyllables()+i<=7){
                line += words.get(num).getWord();
                line += " ";
                i += words.get(num).getSyllables();
            }
        }
        System.out.println(line);
        i = 0;
        line = "";
        while (i<5) {
            int num = (int)(Math.random()*(words.size()));
            if (words.get(num).getSyllables()+i<=5){
                line += words.get(num).getWord();
                line += " ";
                i += words.get(num).getSyllables();
            }
        }
        System.out.println(line);
    }
}
