package chap_08;

import chap_08.Camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

// 인터페이스 이용하여 과속 단속 카메라에 교통사고 감지 및 신고기능 추가하기
// 조건 과속단속 카메라인 SpeedCam 클래스의 detect(), report() 개선
// 교통사고 감지하는 accidentDetector 클래스 신규 생성
// 신고 기능: VideoReporter 클래스 활용
// 모든 클래스 적절한 위치에 정의
public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
