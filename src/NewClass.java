
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        while (true) {

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter size of the list: ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println("Enter elements of the list: ");

            for(int i = 0; i < n; i++){
                Scanner s1 = new Scanner(System.in);
                int x = s1.nextInt();
                list.add(x);
            }

            System.out.println("Choose the sorting method: 1 for QuickSort, 2 for MergeSort");
            System.out.println("1-QuickSort");
            System.out.println("2-MergeSort");
            int choice = s.nextInt();

            Sortable sorter;
            switch (choice) {
                case 1:
                    sorter = new QuickSort();
                    break;
                case 2:
                    sorter = new MergeSort();
                    break;
                default:
                    System.out.println("Wrong choice...");
                    continue;
            }
            sorter.sort(list);

            System.out.println("Sorted array in descending order: ");
            System.out.println(list);
            System.out.println();

            System.out.println("Do you want to enter another array? (Yes / No)");
            String continueChoice = s.next();
            if (!continueChoice.equals("Yes") && !continueChoice.equals("yes")) {
                break;
            }
        }
    }
}