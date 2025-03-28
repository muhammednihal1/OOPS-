import java.util.Scanner;
import java.util.Arrays;

class BinarySearch {
void bSearch(int[] arr, int l, int r, int item) {
if (l > r) {
System.out.println("Not Found");
return;
}
 int m = (l + r) / 2;
if (arr[m] == item) {
System.out.println("Found");
} else if (arr[m] < item) {
bSearch(arr, m + 1, r, item);  
} else {
bSearch(arr, l, m - 1, item); 
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.print("Enter " + n + " numbers: ");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
System.out.print("Enter item to search: ");
int item = sc.nextInt();
        new BinarySearch().bSearch(arr, 0, n - 1, item);
    }
}

