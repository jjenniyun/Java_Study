package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵(Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("이재욱",10);
        map.put("황민현",5);
        map.put("여진구",3);
        map.put("유승호",15);

        System.out.println("총 고객 수 : "+map.size());
        System.out.println("-------------------------");

        // 조회
        System.out.println("이재욱 님의 포인트 : "+map.get("이재욱"));
        System.out.println("황민현 님의 포인트 : "+map.get("황민현"));
        System.out.println("-------------------------");

        // 확인
        if (map.containsKey("유승호")){
            int point = map.get("유승호");
            map.put("유승호",++point);
            System.out.println("유승호 님의 누적 포인트 : "+map.get("유승호"));
        }else {
            map.put("유승호",1);
            System.out.println("유승호님 신규 등록 (포인트 1)");
        }
        System.out.println("------------------------------------");

        // 삭제
        map.remove("이재욱");
        System.out.println(map.get("이재욱"));
        System.out.println("-------------------------------");

        // 전체삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수 : "+map.size());
            System.out.println("가게 접자");
        }
        System.out.println("----------------------------");

        // 새로운 데이터 추가
        map.put("이재욱",10);
        map.put("황민현",5);
        map.put("여진구",3);
        map.put("유승호",15);

        // Key 확인
        for (String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("----------------------------");

        // Value 확인
        for (int value: map.values()){
            System.out.println(value);
        }
        System.out.println("-------------------------------");

        // Key & Value 확인
        for (String key: map.keySet()){
            System.out.println("고객 이름 : "+key+"\t포인트 : "+map.get(key));
        }
        System.out.println("--------------------------------");

        // 맵 : 중복x, 순서x
        map.put("이재욱", 10);
        map.put("이재욱", 30);
        map.put("이재욱", 50);
        for (String key: map.keySet()){
            System.out.println("고객 이름 : "+key+"\t포인트 : "+map.get(key));
        }
        System.out.println("--------------------------------");

    }
}
