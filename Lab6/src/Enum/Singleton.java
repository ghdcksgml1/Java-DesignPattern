package Enum;

// [추가코드]
public enum Singleton {
    INSTANCE;

    // 객체를 반환하는 메소드
    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void print(){
        System.out.println("Enum singleton instatnce hashcode : "+INSTANCE.hashCode());
    }
}

