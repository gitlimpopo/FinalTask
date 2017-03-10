/**
 * Created by Maxim on 10.03.2017.
 */
public interface SimpleList {
    void add(String s);
    String get();
    String get(int id);
    String remove();
    String remove(int id);
    boolean delete();
}
