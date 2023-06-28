package ch02;

public class Arithmetic {
    public static void main(String[] args) {
        // arithmetic(산술) 연산(operation)
        // +, -, 나누기, 곱하기
        // 컴퓨터 공학: 수학 -> 이산수학(dicrete mathmatic), 선형대수학(linear algebra)
        // 이산수학: 수열, 순열, 조합, 경우의 수 (수학1, 고2)
        //          -> 2n + 1,
        // 패턴(규칙)을 찾고, 수식화한다
        // 선형대수학: 행렬, 벡터
        //         -> 일반적인 개발자들은 거의 몰라도됨(게임그래픽스, 인공지능)

        // 대입 연산
        // = (할당,대입, assignment)

        // 더하기, +
        int a = 10;
        int b = 5;
        // 합산을 나타내는 단어를 sum
        int sum= a + b;
        int sum1 = 10 + b;
        System.out.println(sum);
        System.out.println(sum1);

        // 빼기, -
        int difference = a - b;
        System.out.println(difference);

        // 곱셈, *(별표, asterisk)
        // product,, multiply
        int product = a * b;
        System.out.println(product);

        // 나누기, / (slash)
        // div(divide): 나누다
        //몫을 나눠주려는것
        double quotient = a / b;
        System.out.println(quotient);

        // 나머지, %(remainer)
        int remainer = a % b;
        System.out.println(remainer);

}
}




