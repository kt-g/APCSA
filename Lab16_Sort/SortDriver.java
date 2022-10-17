import java.util.*;
public class SortDriver
{
    //count and comment steps for:
    //assignment statements
    //comparisons
    //method calls
    private long steps;
    public SortDriver()
    {
        steps = 0;
    }
    public static void driver()
    {
        SortDriver a = new SortDriver();
        a.go();
    }
    public void go()
    {   
        int choice = 0;
        while (choice < 4)
        {
            Scanner keys = new Scanner(System.in);
            System.out.print("Enter number of items: ");
            int size = keys.nextInt();
            int[] list = generateList(size);
            print(list);
            System.out.println("\n1 Bubble, 2 Selection, 3 Insertion, 4 Quit\n");
            choice = keys.nextInt();
            if (choice == 1){
                bubbleSort(list);
            }
            else if (choice == 2){
                sort1(list);
            }
            else if (choice == 3){
                sort2(list);}
            if (choice < 4){
                print(list);
            }
        }
    }
    // returns a list of size elements with values from 1 to 5 * size
    public int[] generateList(int size)
    {
        steps= 0;
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = (int)(Math.random() * size * 5 + 1);
        }
        return list;    
    }
    public void print(int[] list)
    {
        if (steps > 0){
            System.out.println("This sort took " + steps + " steps to sort " + list.length + " numbers");
        }
        if (list.length <= 100)
        {
            for (int i = 0; i < list.length; i++){
                System.out.print(list[i] + " ");
            }
        }       
        System.out.println();
    }
    // bubble sort goes through the list comparing two neighboring values and swaps them if necessary
    // once the list is gone through once, the biggest is at the end
    // it then goes through the remaining spots to put the second biggest at the end, and so on
    public void bubbleSort(int[] list)
    {
        System.out.println("Bubble Sort");
        steps++;                                // outer = 
        for (int outer = list.length - 1; outer >= 0 ; outer--)
        {
            steps += 3;                         // outer >=, outer--, inner =
            for(int inner = 0; inner < outer; inner++)
            {
                steps += 3;                    // inner <, inner++, list[inner] >
                if (list[inner] > list[inner + 1])
                {
                    steps++;                    // swap call
                    swap(list, inner, inner + 1);
                }
            }
        }
    }
    //finds minimum, puts at beginning, repeats with remaining part of array
    public void sort1(int[] list)
    {
        System.out.println("Selection Sort");
        steps++; //int i=0
        for(int i=0; i<list.length; i++){
            steps+=3; //i<list.length; i++; int minIdx=i
            int minIdx=i;
            for(int j=i+1; j<list.length; j++){
                steps+=4; //int j=i+1; j<list.length; j++; list[j]<list[minIdx]
                if(list[j]<list[minIdx]){
                    minIdx=j;
                    steps++; //minIdx=j;
                }
            }
            swap(list, i, minIdx);
            steps++; //swap(list, i, minIdx);
        }
    }
    //
    public void sort2(int[] list)
    {
        System.out.println("Insertion Sort");
        steps++; //int i=1;
        for(int i=1; i<list.length; i++){
            int j=i;
            steps+=3; //i<list.length; i++; int j=i
            while(j>0 && list[j]<list[j-1]){
                steps+=4; //j>0, list[j]<list[j-1], swap(list, j, j-1);j--;
                swap(list, j, j-1);
                j--;
            }
        }
    }
    // swaps list[a] with list[b]
    public void swap (int[] list, int a, int b)
    {
        steps += 3;         // temp =, list[a] =, list[b] =
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}