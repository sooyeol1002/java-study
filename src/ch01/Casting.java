package ch01;

public class Casting {
    public static void main(String[] args) {
        // 형변환(형식 변환, Casting, Conversion)
        // casting(배우, 마법주문을 외운다.)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정
        // 테스트

        // 1. 묵시적 형변환 (자동 형변환, implicit conversion)
        // implicit(묵시적): 표기/표현을 안해줘도 내부적으로 알아서 해주는것
        // 웬만하면 잘 안쓰는게 좋음.
//        int x = 10;
//        System.out.println(x);
//        double y = x;
//        System.out.println(y);
        // 묵시적 변환의 원리는
        // 더 좁은 값을 저장할 수 있는 변수를 더 넓은 값을 저장할 수 있는 변수에 대입
        // double a = 10.5;
        // 에러 발생
        // int b = a;


        // 명시적 형변환(explicit Conversion)
        // 명시적(explicit): 표기를 해주는 것
//         double a = 10.5;
//         int b = (int) a;
//        System.out.println(b);

        // 완성형 코드를 저장한다
//        char c = '궯';
//        int num = c;
//        System.out.println(num);

        // 문자열 <-> 숫자
        // "10" -> 10
//        int number = 10;
//        String str = Integer.toString(x);
//        System.out.println(str);
//        String strValue = String.valueOf(x);
//        System.out.println(strValue);

        // 소숫점이 있는 10진수: decimal
//        double decimal = 10.5;
//        String strDecimal = Double.toString(decimal);
//        System.out.println(strDecimal);
//        String strDecimalValue = String.valueOf(10.5);
//        System.out.println(strDecimalValue);

        // 숫자 => 문자열
        // String.valueOf(아무데이터타입값)

        // 문자열 -> 숫자
//        String numStr = "10";
        // 자료형클래스.valueOf(문자열)
//        int num1 = Integer.valueOf(numStr);
//        int num2 = Integer.parseInt(numStr);
//        System.out.println(num1);
//        System.out.println(num2);
//        double num3 = Double.valueOf(numStr);

        // String.valueOf(숫자자료형) : 숫자 -> 문자열
        // Interger.valueOf(문자열) : 문자열 -> 정수
        // Double.valueOf(문자열) : 문자열 -> 실수
        // 데이터타입.valueOf(입력값) : 입력값을 데이터타입의 값으로 변환한다.

        // 자바의 숫자를 저장하자
        // 소수점 X : int
        // 소수점 X, 20억 넘을 것 같아 : long
        // 소수점 O : double
        // 글자를 저장 : String

    }
}


