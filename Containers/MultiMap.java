import java.util.*;

public class MultiMap<K,V> extends HashMap<K, List<V>> /*pour pas devoir reecrire toutes les methode de implements*/ implements Map<K, List<V>>{

	public void putOneValue(K aKey, V aVal){
		List<V> lst = get(aKey);
		if(lst==null){
			lst = new ArrayList<V>();
		}
		lst.add(aVal);
		put(aKey,lst);
	}

	/*public containsOneValue(Element v){
		
	}*/

	
}
