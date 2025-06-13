public interface Identificable<K> {
    public abstract K getId();
    public abstract void setId(K id);
    public abstract boolean igualID(K otraId);
}
