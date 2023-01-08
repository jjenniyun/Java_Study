package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
        System.out.println("----------- 정수(%d) ------------");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1,2,3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // 6자리의 공간을 확보하고 나서 __1234 출력
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간 확보 후 1234 출력하는데 빈공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 기호 표시)
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000(쉼표도 자리차지, 세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력)

        System.out.println("----------- 실수(%f) ------------");
        System.out.printf("%f%n", Math.PI); // 3.141593(일반 출력)
        System.out.printf("%.2f", Math.PI); // 3.14 (소수점 둘째짜리)
        System.out.printf("%6.2f%n", Math.PI); // __3.14 (6자리 공간 확보하고 소수점 둘째자리)
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ (왼쪽 정렬)
        System.out.printf("%06.2f%n", Math.PI); // 003.14 (빈공간을 0으로 채우기)
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14 (항상 +- 기호 표시)

        System.out.println("----------- 문자열(%s) ------------");
        System.out.printf("%s", "Java"); // Java(일반 출력)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("---------- 응용 --------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("이재욱 "+ 90+ " "+ 80 + " "+ 85.0);
        System.out.println("황민현 "+100+" "+ 100 + " "+ 100.0);
        System.out.println("유승호 "+ 95+" "+100+" "+ 97.5);

        System.out.println("---------- 응용2 --------------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6,3,3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "이재욱", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "황민현", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "유승호", 95, 100, 97.5);

        System.out.println("---------- 참고 --------------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
