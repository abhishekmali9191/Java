package day5;

public class DemoGeneric <T> {
    T data;
    public DemoGeneric(T data) {
        this.data = data;
    }

    public String getClassName() {
        return data.getClass().getName();
    }

    public static void main(String[] args) {
        DemoGeneric<Integer> iobj = new DemoGeneric<Integer>(111);
        System.out.println(iobj.getClassName());

        DemoGeneric<String> sobj = new DemoGeneric<String>("Hello");
        System.out.println(sobj.getClassName());
    }
}
