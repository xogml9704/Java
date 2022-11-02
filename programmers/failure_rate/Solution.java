package programmers.failure_rate;

public class Solution {
    public static void main(String[] args) {
        int N = 4;
        int[] stages = {4,4,4,4,4};
        int minus = stages.length;
        double[][] sum = new double[N][2];
        double[][] tmp = new double[1][2];


        for(int i=1; i<=N; i++) {
            int count = 0;
            for(int j=0; j<stages.length; j++) {
                if(stages[j] == i) {
                    stages[j] = 0;
                    count++;
                }
            }
            sum[i-1][1] = (double) count / minus;
            sum[i-1][0] = i;
            
            minus -= count;
        }


        for(int i=0; i<sum.length; i++) {
            for(int j=i+1; j<sum.length; j++) {
                if(sum[i][1]<sum[j][1]) {
                    tmp[0] = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp[0];
                } else if(sum[i][0]>sum[j][0]) {
                    tmp[0] = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp[0];
                }
            }
            System.out.println(sum[i][0]);
            
        }
        int[] sum_arr = new int[sum.length];
        
        for(int i=0; i<sum.length; i++) {
            sum_arr[i] = (int) sum[i][0];
        }
        for (int i=0; i<sumlength; i++) {
            System.out.println(i);
        }
    }
}
