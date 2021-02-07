package x19222114_passportrenewal;

/**
 *
 * @author Alex.Selby x19222114
 */
public interface RenewalInterface {
    
    public void enqueue(int key, Object element);//add priority key and element
    public int size();//determine the size of the queue
    public boolean isEmpty();//Checks if the string is empty
    public Object dequeue();//Remove from the queue
    public void printPQueue();//display queue
}
