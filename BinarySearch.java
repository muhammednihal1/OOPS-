import java.util.Scanner;
import java.util.Arrays;
class BinarySearch {
void search(int arr[], int item) {
Arrays.sort(arr);
int l = 0;
int h = arr.length - 1;
while (l <= h) {
int m = (l + h) / 2;
if (arr[m] == item) {
System.out.println("Item found ");
return;
} else if (arr[m] < item) {
l = m + 1;
} else {
h = m - 1;
}
}
System.out.println("Item not found");
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
BinarySearch search = new BinarySearch();
System.out.println("Enter the number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter " + n + " numbers:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("Enter the number to search for:");
int item = sc.nextInt();
search.search(arr, item);
}
}

