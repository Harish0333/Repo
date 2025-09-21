package consumer;

public interface Consumer<T> 
{
	void accept(T x);
}
