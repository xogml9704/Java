package programmers.gym_suit;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {4,2};
        int[] reserve = {3,5};

        int count = 0; // 체육복을 빌린 학생들의 수
        int sum = 0; // 최종적으로 값을 내릴 수

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = 35;
                    reserve[j] = 33;
                    count++;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]-1 == reserve[j]) {
                    count++;
                    break;
                } else if(lost[i]+1 == reserve[j]) {
                    count++;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            System.out.println("lost"+ i +" : "+lost[i]);
        }

        for(int i=0; i<reserve.length; i++) {
            System.out.println("reserve"+ i +" : "+reserve[i]);
        }

        System.out.println(count);

        sum = n -(lost.length-count);

        System.out.println(sum);


    }
}
