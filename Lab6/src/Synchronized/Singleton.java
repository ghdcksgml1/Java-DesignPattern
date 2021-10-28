package Synchronized;

public class Singleton {
    private static Singleton inst = null;
    private Singleton(){
        System.out.println("Threadsafe Singleton Constructor");
    }

    // synchronized 키워드를 사용함으로써, Classic Singleton 패턴을 사용했을때 발생하는
    // 멀티스레드 환경에서 객체가 여러개 생성되는 문제를 해결
    public static synchronized Singleton getInstance(){
        if(inst == null){
            inst = new Singleton();
        }
        return inst;
    }
    public void print(){
        System.out.println("Threadsafe Singleton instatnce hashcode : "+inst.hashCode());
    }
}

