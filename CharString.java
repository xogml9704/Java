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
        // 한 글자도 문자열이 될 수 있기 때문이다...
        System.out.println("ab");
    }
}
