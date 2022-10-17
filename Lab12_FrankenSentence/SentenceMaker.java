import java.util.ArrayList;
public class SentenceMaker {
    private ArrayList<String> nouns;
    private ArrayList<String> verbs;
    private ArrayList<String> phrases;
    public SentenceMaker() {
       nouns = new ArrayList<String>();
       verbs = new ArrayList<String>();
       phrases = new ArrayList<String>();
       
       nouns.add("The fire drill");
       nouns.add("Poker cards");
       nouns.add("Rubik's cube");
       nouns.add("The spherical cow");
       nouns.add("Magician's map");
       nouns.add("Potato chip");
       nouns.add("Airpod-user");
       nouns.add("Dusty cabinet");
       nouns.add("Anthropomorphic blobfish");
       nouns.add("Kingdom of the Elves");
       
       verbs.add("festers");
       verbs.add("consumes");
       verbs.add("demolishs");
       verbs.add("tap-dances");
       verbs.add("points at");
       verbs.add("looks down on");
       verbs.add("roars at");
       verbs.add("turns around");
       verbs.add("claws at");
       verbs.add("screeches");
       
       phrases.add("the soul");
       phrases.add("the pastoral plains");
       phrases.add("Spain (but without the s)");
       phrases.add("mirrors");
       phrases.add("violists");
       phrases.add("gas leaks");
       phrases.add("TI-84 Plus calculators");
       phrases.add("math class");
       phrases.add("the cracked phone screen");
       phrases.add("sinking ship");
    }
    public void makeSentences() {
        for (int i=0; i<6; i++) {
            String n = nouns.get((int)(Math.random()*10));
            String v = verbs.get((int)(Math.random()*10));
            String p = phrases.get((int)(Math.random()*10));
            System.out.println(n + " " + v + " " + p + ".");
        }
    }
}