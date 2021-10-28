package Classic;

public class Singleton {
    private static Singleton inst = null; // static 변수 선언
    private Singleton(){
        System.out.println("classic Singleton Constructor");
    }

    // 객체를 반환해주는 메소드
    public static Singleton getInstance(){
        if(inst == null){ // 객체가 없다면
            inst = new Singleton(); // 객체 생성
        }
        return inst; // 객체 반환
    }
    public void print(){
        System.out.println("classic singleton instatnce hashcode : "+inst.hashCode());
    }
}

