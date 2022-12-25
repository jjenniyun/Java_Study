package chap_04;
// 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차시 20000원
// 경차 5시간 주차시 10000원
// 장애인 차량 10시간 주차 시 15000원

// 실행 결과 : 주차요금은 **원 입니다
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차 시간
        boolean small = false; // 경차 여부
        boolean disable = false; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 : 시간 당 4000원

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량 경우 50% 할인
        if (small || disable){
            fee /= 2; // 50% 할인
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 "+fee+"원 입니다.");

        //커밋한게 어디간거니...?
    }

}
