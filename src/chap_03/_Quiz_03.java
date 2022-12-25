package chap_03;
// "901231-1234567" 인 경우 901231-1까지 출력
// "030708-4567890" 인 경우 030708-4까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0,8)); // 0 위치부터 8위치 직전까지
        id = "030708-45667890";
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 0 위치부터 하이픈 위치+2직전까지

        //커밋한게 어디간거니...?
    }
}
