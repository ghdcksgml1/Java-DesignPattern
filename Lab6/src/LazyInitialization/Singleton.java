package LazyInitialization;

public class Singleton {
    private static volatile Singleton inst = null; // volatile 키워드를 통해 변수 값 불일치 문제 해결
    private Singleton(){
        System.out.println("LazyInitialization Constructor");
    }

    public static Singleton getInstance(){
        if(inst == null){
            // synchronized 키워드를 통해 멀티스레드 환경에서 객체가 여러개 생성되는것을 방지
            synchronized (Singleton.class){
                if(inst == null){
                    inst = new Singleton();
                }
            }
        }
        return inst;
    }
    public void print(){
        System.out.println("LazyInitialization singleton instatnce hashcode : "+inst.hashCode());
    }
}

