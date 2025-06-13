import java.util.Collection;
import java.util.Iterator;


public class Buscador<T extends Identificable,K> {
    public T buscar(Collection<? extends T> elementos, K id){
        T resultado = null;
        Iterator<? extends T> it = elementos.iterator();
        while(it.hasNext()&& resultado==null){
            T item = it.next();
            if(item.igualID(id)){
                resultado = item;
            }
        }
        return resultado;
    }
}
