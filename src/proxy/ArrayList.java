package proxy;

public class ArrayList implements List{

    private Object[] data = new Object[5];
    private int index;

    @Override
    public Object get(final int index) {
        return data[index];
    }

    @Override
    public void add(final Object object) {
        data[index++] = object;
    }
}
