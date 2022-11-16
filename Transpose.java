package array;

public class Transpose {

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3, 4},
            {4, 3, 7, 2},
            {2, 4, 8, 1}
        };
        int n = a.length, m = a[0].length;

        int[][] trans = new int[m][n];
        System.out.println("Print Orginal Matrix: ");
        for(int[] x:a){
            for(int data:x)
            {
                System.out.print(data+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i]=a[i][j];
            }
        }

        System.out.println("Print Transpose Matrix: ");
            for(int[] b:trans){
                for(int v:b){
                    System.out.print(v+" ");
                }
                System.out.println();
            }
    }

}
