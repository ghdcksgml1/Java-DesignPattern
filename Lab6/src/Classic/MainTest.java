package Classic;

public class MainTest {
    static final int numThread = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread[] th = new Thread[numThread]; // 스레드 생성
        for(int i=0;i<numThread;i++){ // 5개의 스레드의 동작을 설정하고, 실행시킨다.
            th[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton inst = Singleton.getInstance(); // 객체 받아오기
                    inst.print(); // 객체정보 출력
                    System.out.println(Integer.toHexString(System.identityHashCode(inst)));// 객체의 16진수값 출력
                }
            });
            th[i].start();
        }
        for(Thread t : th){
            t.join();
        }
    }
}
