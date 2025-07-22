import java.util.ArrayList;

class MyHashMap {
    ArrayList<Integer> keys = new ArrayList<>();
    ArrayList<Integer> values = new ArrayList<>();

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        int idx = keys.indexOf(key);
        if (idx != -1) {
            values.set(idx, value); // Update value if key exists
        } else {
            keys.add(key);
            values.add(value);
        }
    }
    
    public int get(int key) {
        int idx = keys.indexOf(key);
        return (idx != -1) ? values.get(idx) : -1; // Return -1 if key not found
    }
    
    public void remove(int key) {
        int idx = keys.indexOf(key);
        if (idx != -1) { 
            keys.remove(idx);
            values.remove(idx);
        }
    }
}
