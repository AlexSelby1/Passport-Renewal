package x19222114_passportrenewal;

/**
 *
 * @author Alex.Selby x19222114
 */
    public class PQElement {
     //This will be to create the priority queue based on the reason for passport renewal   
    private int key;
    private Object element;

    public PQElement(int priority, Object e){
	key = priority;
        element = e;
    }

    public int getKey() {
	return key;
    }

    public void setKey(int val) {
	key = val;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object e) {
        element = e;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
