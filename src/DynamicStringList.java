import java.util.Arrays;

public class DynamicStringList implements SimpleList {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] array;
    private int index;
    
    public DynamicStringList() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStringList(int capacity) {
        array = new String[capacity];
    }

    @Override
    public void add(String s) {
        if (index == array.length) {
            extensionArray();
        }
        array[index++] = s;
    }

    @Override
    public String get() {

        if (index == 0) {
            throw new IllegalArgumentException("List is empty");
        }
        return array[index - 1];
    }

    @Override
    public String get(int id) {
        checkIndex(id);
        return array[id];
    }

    @Override
    public String remove() {
        if (index == 0) {
            throw new RuntimeException("List is empty");
        }
        String result = array[index - 1];
        index--;
        return result;
    }

    @Override
    public String remove(int id) {
        String result = get(id);
        System.arraycopy(array, id + 1, array, id, index - id - 1);
        array[id + 1] = null;
        index--;
        return result;
    }

    @Override
    public boolean delete() {
        if (index == 0) {
            return false;
        }
        index = 0;
        array = new String[DEFAULT_CAPACITY];
        return true;
    }

    @Override
    public String toString() {
        return "DynamicStringList{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                '}';
    }
    private void extensionArray() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }
}
