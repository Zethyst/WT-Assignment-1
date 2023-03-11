import java.util.*;

public class merge {

    static void show(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "  ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A[] = { 1, 3, 6, 9, 35, 63, 99 };
        int B[] = { 7, 9, 12, 17, 49 };
        int size = A.length + B.length;
        int C[] = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
                k++;
            }
            if (A[i] > B[j]) {
                C[k] = B[j];
                j++;
                k++;
            }
        }
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            C[k] = B[i];
            i++;
            k++;
        }
        System.out.print("Array 1: ");
        show(A);
        System.out.println();
        System.out.print("Array 2: ");
        show(B);
        System.out.println();
        System.out.print("Merged Sorted Array: ");
        show(C);
    }
}
