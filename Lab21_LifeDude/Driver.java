public class Driver {
    public static void main(){
        Life l = new Life();
        for(int i=0; i<5; i++){
            System.out.println("Generation "+ i);
            l.print();
            System.out.println();
            l.generation();
        }
    }
}
