package EagerInitialization;

// 클래스가 초기화되는 시점에 정적바인딩을 통해 객체를 생성
public class Singleton {
    private static Singleton inst = new Singleton(); // 클래스가 초기화될때 객체를 생성해준다.
    private Singleton(){
        System.out.println("Eager Initialization Constructor");
    }

    public static Singleton getInstance(){
        return inst;
    }
    public void print(){
        System.out.println("Eager Initialization hashcode : "+inst.hashCode());
    }
}

