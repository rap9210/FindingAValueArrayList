import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueArrayList {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scn = new Scanner(System.in);
        ArrayList <Integer> random_array = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++){
            random_array.add(1+r.nextInt(50));
        }
        System.out.println(random_array);
        System.out.println("Enter a number to check if it's in the array: ");
        int user_number = scn.nextInt();
        System.out.println("Searching for "+user_number+"...");
        for(int i=0; i<50;i++){
            if (random_array.get(i) == user_number){
                System.out.println(user_number+" is in the array.");
            }
        }
    }
}
