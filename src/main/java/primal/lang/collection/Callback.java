package primal.lang.collection;

/**
 * Callback for async workers
 *
 * @author cyberpwn
 *
 * @param <T>
 *            the type of object to be returned in the runnable
 */
@FunctionalInterface
public interface Callback<T>
{
	/**
	 * Called when the callback calls back...
	 *
	 * @param t
	 *            the object to be called back
	 */
    void run(T t);
}
