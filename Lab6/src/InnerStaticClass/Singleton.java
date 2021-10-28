package InnerStaticClass;

public class Singleton {
    private static class SingletonHolder{
        private static final Singleton inst = new Singleton(); // final 키워드를 통해 1번만 객체생성
    }

    private Singleton(){
        System.out.println("InnerStatic Singleton Constructor");
    }

    public static Singleton getInstance(){
        return SingletonHolder.inst;
    }
    public void print(){
        System.out.println("InnerStatic singleton instatnce hashcode : "+SingletonHolder.inst.hashCode());
    }
}

