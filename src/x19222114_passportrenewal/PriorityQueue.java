package x19222114_passportrenewal;

/**
 *
 * @author Alex.Selby x19222114
 */
import java.util.*;

public class PriorityQueue implements RenewalInterface
{
    private ArrayList<PQElement> thePQueue;

    public PriorityQueue(){
        thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty(){
        return thePQueue.isEmpty();
    }

    @Override
    public int size(){
	  return thePQueue.size();
    }

    private int findInsertPosition(int newkey){
        
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position =0;                   
          
        while (position < thePQueue.size() && !found){
            elem = thePQueue.get(position);
            if(elem.getKey() > newkey){
                position = position + 1;
            }
            else{
                found = true;
            }
        }
        return position;
    }

    // Enqueue adds to the queue and the priority will be entered alongside it
    @Override
    public void enqueue(int priorkey, Object item){
        int index;
        PQElement elem = new PQElement(priorkey, item);
        index = findInsertPosition(priorkey);
        if (index > size())
            thePQueue.add(elem);
        else
            thePQueue.add(index, elem);
    }

    //Dequeue removes the first element.
    @Override
    public Object dequeue(){
       return thePQueue.remove(0);
    }

    @Override
    //Used to print the queue
    public void printPQueue(){
        PQElement elem;
        for (int i = 0; i<thePQueue.size();i++){
            elem = thePQueue.get(i);
            System.out.println("Key ="+elem.getKey()+" Element = "+elem.getElement());
        }
    }
    //Search by index
    public Object get (int index){
        return thePQueue.get(index);
    }

    //Remove by item
    public boolean removeObject(Object item) {
        return thePQueue.remove(item);
    }
}
