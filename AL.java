import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class AL{
    public static void main(String[] args){
        rem_dup();
    }
    // add elements manually
    public static void basic(){
        ArrayList<Integer> my_list = new ArrayList<>();
        my_list.add(0);
        my_list.add(1);
        my_list.add(1);
        my_list.add(2);
        System.out.println(my_list);
        my_list.get(1);

        }      
    // reverse an arrayList 
    public static void rev_num(){
        ArrayList<Integer> rvrs = new ArrayList<>();
        for(int i = 0; i<= 5; i++){
            rvrs.add(i);
        }
        System.out.println("ORIGNAL ARRAYLIST");
        System.out.println(rvrs);


        ArrayList<Integer> rev = new ArrayList<>();
        for(int j= rvrs.size(); j>=0; j--){
            rev.add(j);
        }
        System.out.println("REVERSED ARRAYLIST");
        System.out.println(rev);

        System.out.println("Reversed using Collection Framework");
        Collections.reverse(rvrs);
        System.out.println(rvrs);
    }
    // finding max number
    public static void mx_mn() {
        ArrayList<Integer> my = new ArrayList<>();
        for(int i = 5; i>=0; i--){
            my.add(i);
        }
        System.out.println(my);
        int size = my.size();
        System.out.println(size);

        int max_value = my.get(0);
        for(int j=1; j< my.size(); j++){
            if(my.get(j) > max_value){
                max_value = my.get(j);
            }
        }
        System.out.println("The max value is: ");
        System.out.println(max_value); 
        
        int min_value = my.get(0);
        for(int k = 0; k<my.size(); k++){
            if(my.get(k)<min_value){
                min_value = my.get(0);
            }
        }

        System.out.println("The minimum value is: ");
        System.out.println(min_value);
    }
// finding occurance

    public static void ocrnc(){
        ArrayList<Integer> oc = new ArrayList<>();
        Random rndm = new Random();

        int arraySize = 15;

        for (int i=0; i<arraySize; i++){
            int rndNum = rndm.nextInt(10);
            oc.add(rndNum);
        }
        System.out.println("The random generated ArrayList is:");
        System.out.println(oc);


        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number whose occurence you want to know:");
        num = input.nextInt();

        int count = 0;
        for(int o : oc){
            if (num == o){
                count++;
            }
        }
        // System.out.println("The number is occured " + count+ " times");
        String result = String.format("The number %d occured %d times",num,count);
        System.out.println(result);
    }

    // merge 2 arrayList
    public static void merge(){
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int i=0; i<= 5; i++){
            al1.add(i);
        }
        System.out.println(al1);

        ArrayList<Integer> al2 = new ArrayList<>();
        for(int j=6; j<= 20; j*=2){
            al2.add(j);
        }
        System.out.println(al2);
        al1.addAll(al2);
        System.out.println(al1);
        // or
        for(int element : al1){
            al2.add(element);
        }
        System.out.println(al1);
    }

    // remove duplicates
        public static void rem_dup(){
            ArrayList<Integer> dup = new ArrayList<>();
            Random random = new Random();
            int arraySize = 20;

            for(int i=0; i<= arraySize; i++){
                int random_num = random.nextInt(10);
                dup.add(random_num);
            }
            System.out.println(dup);
            for(int i : dup){
                if(dup.get(i) == dup.get(i-1));
                dup.remove(i); 
            }
            System.out.println(dup);
        } 
}
    




