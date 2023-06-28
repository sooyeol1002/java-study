package ch01;

public class Strings {
    public static void main(String[] args) {
        // string(문자열)
        // 문자를 여러개로 연결 (문자의 배열)
        String greeting = "Hello, World!";

        // 자바에서 문자열(String)은 기본 자료형이 아니다.
        // char(문자타입) 를 여러개 연결해서 작동되도록 구현
        // Ctrl + /, 선택영역만큼 주석이 생성
        //  /* ... */ 여러줄을 주석으로 표시
        /*
         String str = "abc";
         is equivalent to:
         char data[] = {'a', 'b', 'c'};
         */


        // 문자열 초기화 방법
        // 문자열 값을 코드에 직접 입력한 것을 리터럴(literal)
        String firstName = new String("John");
        String lastName = "Doe";

        // 문자열 결합(concat)
        // 변수를 참조해서 사용할 때는 이름은 대소문자를 가립니다(case-sensitive)
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 쌍따옴표, 탭
        // String message = ""이렇게 하고 싶은데"";
        // "메시지입니다."
        // 메시지입니다
        //줄바꿈
        String message = "Hello\nWorld";
        System.out.println(message);

        //일반적으로 4칸, 8칸짜리도 있음
        String tabMessage = "Hello\tWorld";
        System.out.println(tabMessage);

        //쌍따옴표 넣기
        String doubleQuote = "\"Hello, World\"";
        System.out.println(doubleQuote);

        //백슬래시 삽입
        String back = "Hello\\World";
        System.out.println(back);


    }
}
