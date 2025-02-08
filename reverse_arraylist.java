import java.util.ArrayList;
import java.util.Collections;

public class reverse_arraylist {
    public static void main(String[] args) {
        rev_num();
    }
        public static void rev_num(){
            ArrayList<Integer> normal_ArrayList = new ArrayList<>();
            for(int i = 0; i<= 6; i++){
                normal_ArrayList.add(i);
            }
            System.out.println("ORIGNAL ARRAYLIST");
            System.out.println(normal_ArrayList);
    

            ArrayList<Integer> rev = new ArrayList<>();
            for(int j= normal_ArrayList.size()-1; j>=0; j--){
                rev.add(j);
            }
            System.out.println("REVERSED ARRAYLIST");
            System.out.println(rev);
    
            System.out.println("Reversed using Collection Framework");
            Collections.reverse(normal_ArrayList);
            System.out.println(normal_ArrayList);
        }
}

