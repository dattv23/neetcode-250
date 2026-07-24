class MyHashMap {

    int[] myHashMap;

    public MyHashMap() {
        myHashMap = new int[1000001];
        Arrays.fill(myHashMap, -1);
    }

    public void put(int key, int value) {
        myHashMap[key] = value;
    }

    public int get(int key) {
        return myHashMap[key];
    }

    public void remove(int key) {
        myHashMap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */