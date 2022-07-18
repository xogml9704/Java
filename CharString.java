public class CharString {
    // 문자와 문자열
    // 자바는 문자(Character)와 문자열(String)을 구분한다. 문자는
    // 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합한 것을 의미한다.
    // 자바에서 문자는 '(작은따옴표)로 감싸야 한다.
    public static void main(String[] args) {
        System.out.println('a');
        // 문자열은 "(큰따옴표)로 감싸야 한다.
        System.out.println("문자열");
        // 만약 문자열을 작은 따옴표로 감싸면 에러가 발생한다.
        // 하나의 문자를 큰 따옴표로 감싼다고 에러가 발생하지는 않는다.
        // 한 글자도 문자열이 될 수 있기 때문이다.
        System.out.println("ab");

        System.out.println("생활코딩"+"입니다.");
        // 문자열과 문자열을 더 해서 출력 할 수 있다.

        System.out.println("1"+"1");
        // 출력 결과  : 11

        //이스케이프
        //만약 문자열 안에 큰 따옴표를 넣으려면 어떻게 해야하는가?
        System.out.println("egoing said \"Welcome programming world\"");
        // \를 "앞에 위치 시키면 "를 문자열의 시작과 끝을 구분하는 구분자가 아니라
        // 단순히 문자로 해석하도록 강제할 수 있다.
        // 이러한 기법을 escape(이스케이프)라고 한다.
        // 큰 따옴표가 가진 문법적인 역할에서 도망쳐서 문자로 인식하도록 한다는 의미

        // 여러줄의 표시
        System.out.println("egoing said \n \"Welcome programming world\"");
        // 여러 줄을 표시하고 싶을 때는 \n 을 사용하면 된다.

    }
}
