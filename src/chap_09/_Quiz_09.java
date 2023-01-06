package chap_09;

import java.util.ArrayList;

// 퀴즈 ArrayList 이용하여 학생별 프로그래밍 언어 자격증 취득 정보를 관리하고
// 자바자격증을 보유한 학생 이름 출력
// 조건 학생이름 및 자격증 취득 정보를 위한 Student 클래스 생성
// 학생 1인당 보유 자격증은 1개로 제한
// 모든 클래슨느 하나의 파일에 정의
public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이재욱","파이썬"));
        list.add(new Student("안효섭","자바"));
        list.add(new Student("황민현","자바"));
        list.add(new Student("유승호","C"));
        list.add(new Student("여진구","파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-------------------------");
        for (Student s : list) {
            if (s.certification.equals("자바")){
                System.out.println(s.name);
            }
        }

    }

}
class Student{
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
