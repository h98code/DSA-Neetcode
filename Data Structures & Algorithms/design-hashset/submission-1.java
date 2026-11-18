class MyHashSet {

    Integer[] arr;

    public MyHashSet() {
        arr = new Integer[(int)1e6 + 1];
    }
    
    public void add(int key) {
        arr[key] = key;
    }
    
    public void remove(int key) {
        arr[key] = null;
    }
    
    public boolean contains(int key) {
        if(arr[key] == null) return false;

        return true;
    }
}

// create an array of some default size sz OR create a large sized array that can contain all the keys;
    // what happens when we over flow the size.
// then insert the key in the hashset 
// what will be the default value present in the array ? null OR some specific value. 
// update the count of the elements 

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */