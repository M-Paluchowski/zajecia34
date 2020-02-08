package proxy;

public class ProxyList implements List {

    private final List list;

    public ProxyList(final List list) {
        this.list = list;
    }

    @Override
    public Object get(final int index) {
        System.out.println("Fetching data from database");
        return list.get(index);
    }

    @Override
    public void add(final Object object) {
        list.add(object);
    }
}
