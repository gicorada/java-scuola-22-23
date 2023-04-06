import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Integer[] a = {7, 4, 3, 1, 5, 10, 4};
        Sort.selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static <T extends Comparable> void selectionSort(T[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int posMin = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[j].compareTo(a[posMin]) < 0) posMin = j;
            }
            if(posMin != i) {
                T tmp = a[i];
                a[i] = a[posMin];
                a[posMin] = tmp;
            }
        }
    }
} 
