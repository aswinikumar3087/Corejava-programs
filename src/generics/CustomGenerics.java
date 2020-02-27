package generics;
import java.util.List;

public class CustomGenerics<T> {

    private T object;
    private List<T> list;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        CustomGenerics<String> customGenerics = new CustomGenerics<>();
        customGenerics.setObject("aswini");

        System.out.println(customGenerics.getObject());

        CustomGenerics<Integer> customGenerics1 = new CustomGenerics<>();
        customGenerics1.setObject(30);
        System.out.println(customGenerics1.getObject());

        CustomGenerics<Float> customGenerics3 = new CustomGenerics<>();
        customGenerics3.setObject(23.6f);
        System.out.println(customGenerics3.getObject());

    }
}
