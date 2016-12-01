package treePractice;

public interface Tree<T> {
    public void insert(T newData);
    public void delete(T data);
    public void traversal();
    public T getMaxNodeValue();
    public T getMinNodeValue();
}
