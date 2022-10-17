public class Disks{
    public Disks(){
    }
    public void datang(int numDisks, char from, char to, char extra){
        if(numDisks==1){
            System.out.println("Move disk " + numDisks + " from " + from + " to " + to);
        }
        else{
            datang(numDisks-1, from, extra, to);
            System.out.println("Move disk " + numDisks + " from " + from + " to " + to);
            datang(numDisks-1, extra, to, from);
        }   
    }
    public boolean isPalindrome(String str) {
        if(str.charAt(0)==str.charAt(str.length()-1)&&str.length()<4){
            return true;
        }
        else if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        else{
            return isPalindrome(str.substring(1,str.length()-1));
        }
    }
    public boolean isAlphabetical(String str){
        if(str.charAt(0)<=str.charAt(str.length()-1)&&str.length()==2){
            return true;
        }
        else if(str.charAt(0)>str.charAt(1)){
            return false; 
        }
        else{
            return isAlphabetical(str.substring(1,str.length()));
        }
    }
}
