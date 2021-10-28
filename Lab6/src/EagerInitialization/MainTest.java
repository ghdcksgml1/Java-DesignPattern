package EagerInitialization;

import java.time.Duration;
import java.time.Instant;

public class MainTest {
    static final int numThread = 5;

    public static void main(String[] args) throws InterruptedException {
        Instant startTime = Instant.now(); // 프로그램 시작시간 저장
        Thread[] th = new Thread[numThread]; // 스레드 생성
        for(int i=0;i<numThread;i++){ // 모든 스레드 동작
            th[i] = new Thread(new Runnable() { // Runnable Interface 구현
                @Override
                public void run() { // 스레드의 동작을 입력
                    Singleton inst = Singleton.getInstance(); // 객체 반환
                    inst.print(); // 객체정보 출력
                    System.out.println(Integer.toHexString(System.identityHashCode(inst))); // 객체의 16진수값 출력
                }
            });
            th[i].start();
        }
        for(Thread t : th){
            t.join();
        }
        Instant endTime = Instant.now(); // 프로그램 종료시간 저장
        long elapseTime = Duration.between(startTime,endTime).toMillis(); // 프로그램을 시작하고 종료하기까지의 시간 저장
        System.out.println(elapseTime+"ms"); // 출력
    }
}
