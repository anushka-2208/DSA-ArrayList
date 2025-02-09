import java.util.ArrayList;

public class max_min_num {
    public static void main(String[] args) {
        mx_mn();
    }
    // finding max number
    public static void mx_mn() {
        ArrayList<Integer> normal_ArrayList = new ArrayList<>();
        for(int i = 5; i>=0; i--){
            normal_ArrayList.add(i);
        }
        System.out.println(normal_ArrayList);
        int size = normal_ArrayList.size();
        System.out.println(size);

        int max_value = normal_ArrayList.get(0);
        for(int j=1; j< normal_ArrayList.size(); j++){
            if(normal_ArrayList.get(j) > max_value){
                max_value = normal_ArrayList.get(j);
            }
        }
        System.out.println("The max value is: ");
        System.out.println(max_value); 
        
        int min_value = normal_ArrayList.get(0);
        for(int k = 0; k<normal_ArrayList.size(); k++){
            if(normal_ArrayList.get(k)<min_value){
                min_value = normal_ArrayList.get(0);
            }
        }

        System.out.println("The minimum value is: ");
        System.out.println(min_value);
    }
}
