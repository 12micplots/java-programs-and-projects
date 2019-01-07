import java.util.*;
public class PresenceinArray {
    public static void main(String args[]){
        System.out.println("Enter the element to check presence");
        Scanner s = new Scanner(System.in);
        int isPresent = s.nextInt();
        System.out.println("Enter the number of elements in the array\n number of elements must be a natural number");
        int n = s.nextInt();
        if (n<=0){
            System.out.println("invalid input");
        }
        else
            {
                System.out.println("Enter the elements of the array");
                int myArray[] = new int[n];
                for(int i=0; i<n; i++){
                    int element = s.nextInt();
                     myArray[i]= element;
                }
                for(int i=0; i<n; i++) {
                    if (isPresent == myArray[i]) {
                        int k = i + 1;
                        System.out.println("yes the element is present, and the element is: " + myArray[i] + " and is at the position: " + k);
                        continue;
                    }
                }

                System.out.println("element is not present");
        }
    }
}
