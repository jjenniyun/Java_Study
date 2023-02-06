package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        // \n, \t \\ \" \'
        //System.out.println("자바가");
        //System.out.println("너무");
        //System.out.println("재밌어요");

        // \n: 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // 경로 표시 → \\: 역슬래시2번
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰 따옴표
        // 단비가 "냐옹"이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \': 작은 따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        // 작은 따옴표 사이에 '표시하기 위해서
        // \'를 넣어주기
        c = '\'';
        System.out.println(c);

        //커밋한게 어디간거니...?
    }
}
