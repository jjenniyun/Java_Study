package chap_07.camera;
// Factorycam is a camera(IS - A)
public class FactoryCam extends Camera { // 자식 클래스(하나의 부모클래스만 상속가능)
    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");
    }
    public void recordVideo(){
        super.recordVideo(); // 부모클래스의 recordVideo 사용
        detectFire();
    }
    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature(){
        System.out.println(this.name+"의 주요 기능 : 화재 감지");
    }
}
