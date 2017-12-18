package ufo.cache;

import java.util.Hashtable;

/**
 * This class has been implemented to achieve second goal "Second objective 
 * Optimize it to be as fast as it can be".
 * 
 * @author lpasquinelli
 *
 */
public class CacheManager {
    private static CacheManager INSTANCE;

    private final Hashtable<String, Object> data;

    private CacheManager() {
        super();
        data = new Hashtable<String, Object>();
    }

    public Object getEntry(String key) {
    		return data.get(key);
    }

    public void addEntry(String key, Object value) {
    		if ((key !=null) && (value!= null)) 
    			data.put(key, value);
    }

    public static CacheManager getInstance() {
        synchronized (CacheManager.class) {
            if (CacheManager.INSTANCE == null) {
                CacheManager.INSTANCE = new CacheManager();
            }
        }
        return INSTANCE;
    }
}
