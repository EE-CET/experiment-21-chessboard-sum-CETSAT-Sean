import java.util.Scanner;
public class ChessboardSum {
        static Scanner sc = new Scanner(System.in);

        public static int[][] arrInput(int n){
                int[][] arr = new int[n][n];
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;
        }

        public static int[] chessSum(int[][] arr,int n){
                int[] ans = new int[2];
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                if((i+j)%2 ==0){
                                        ans[0] += arr[i][j];
                                }
                                else{
                                        ans[1] += arr[i][j];
                                }
                        }
                }
                return ans;
        }

        // TODO: Read N
        // TODO: Read the matrix
        // TODO: Iterate through the matrix
        // TODO: Check if (i + j) is even (Black) or odd (White)
        // TODO: Accumulate sums and print them
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[][] arr = arrInput(n);
                int[] ans = chessSum(arr, n);
                System.out.println(ans[0]);
                System.out.println(ans[1]);
        }
}
