package array;

public class Array {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        int[] a = {7, 3, 2, 5, 8, 9, 1};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max is: "+max);
    }

}
