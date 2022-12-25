package chap_06;

public class _Quiz_06 {
    // 실행 결과
    //
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0,index);
        //for (int i = index;i<data.length();i++)
        for (int i = 0; i < data.length()-index; i++) {
            hiddenData += "*"; // 심**
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "심청이"; // 이름
        String id = "990130-2234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : "+getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : "+getHiddenData(id, 8));
        System.out.println("전화번호 : "+getHiddenData(phone, 9));
    }
}
