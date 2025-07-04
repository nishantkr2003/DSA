package Hashing;
import java.util.*;

public class hashMapCode {
    static class HashMap<K, V> {

        private class Node{
            K key;
            V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n;   // n
        private int N;   // N
        private LinkedList<Node>[] buckets; //N=buckets.length


       @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; 
            this.buckets = new LinkedList[4]; // Initial capacity
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }


        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)% N; // Ensure non-negative index
        }


        private int SerachInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1; // Not found
        }


        @SuppressWarnings("unchecked")
        private void rehash(){
             LinkedList<Node>[] oldBuckets = buckets;
             buckets = new LinkedList[2 * N]; // Double the size
             N = 2 * N;

             for(int i=0;i<buckets.length;i++){
                 buckets[i] = new LinkedList<>();
             }

             // node ->add in new buckets

             for(int i=0;i<oldBuckets.length;i++){
                 LinkedList<Node> ll = oldBuckets[i];
                 for(Node node : ll){
                     int bi = hashFunction(node.key);
                     buckets[bi].add(node);
                 }
             }
        }


        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SerachInLL(key,bi); // valid,-1

            if(di !=-1){
                Node node = buckets[bi].get(di);
                node.value = value; // Update value if key exists
            }
            else{
               buckets[bi].add(new Node(key, value));
               n++; 
            }

            double lambda = (double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }


        public V get(K key) {
            int bi = hashFunction(key);
            int di = SerachInLL(key,bi); // valid,-1

            if(di !=-1){
                Node node = buckets[bi].get(di);
                return node.value; // Return value if key exists
            }
            else{
               return null;
            }
        }


        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SerachInLL(key,bi); // valid,-1

            if(di !=-1){
                return true; // Key exists
            }
            else{
               return false; 
            }
        }


        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SerachInLL(key,bi); // valid,-1

            if(di !=-1){
                Node node = buckets[bi].remove(di); // Remove the node
                n--; // Decrease size
                return node.value; // Return removed value  
            }
            else{
               return null;
            } 
        }


        public int size() {
            return n; // Return the number of elements   
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key); // Add each key to the list
                }
            }
            return keys; // Return the list of keys
        }
        

        public boolean isEmpty() {
            return n == 0; // Check if the map is empty
        }
    }

    


    public static void main(String[] args) {
        HashMap<String, Integer>  map = new HashMap<>();
        map.put("India", 1);
        map.put("USA", 2);
        map.put("UK", 3);
        map.put("Australia", 4);
        map.put("Japan", 5);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
