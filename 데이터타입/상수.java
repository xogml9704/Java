package 데이터타입;

public class 상수 {
    public static void main(String args[]) {
        /*
         * 상수
         *  변수는 변하는 값을 의미한다. 그 대척점에 있는 것이 상수인데,
         *  상수란 변하지 않는 값을 의미한다.
         */
        int a = 1;
        // a = 변수, 1 = 상수

        // 실수의 표현
        // int a = 2.2; -> 오류가 남 변수와 상수가 맞지 않음

        double b = 2.2;

        float c = 2.2F;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        long d = 2147483648L;

        System.out.println(d);

        byte e = 100;
        // 무엇을 붙이지 않으면 기본 형으로 잡히게 됨.

        short f = 200;

        System.out.println(e);



    }
}
