package org.example.LinkedList;

import java.util.HashMap;

class DoubleNode {
    int key;
    int val;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class LRUCache {
    int cap;
    HashMap<Integer, DoubleNode> cache;
    DoubleNode oldest;
    DoubleNode latest;

    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();
        oldest = new DoubleNode(0,0);
        latest = new DoubleNode(0,0);
        oldest.next = latest;
        latest.prev = oldest;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            DoubleNode fetched_node = cache.get(key);
            remove(fetched_node);
            insert(fetched_node);
            return fetched_node.val;
        }
        return -1;

    }

    private void remove(DoubleNode node) {
        DoubleNode prev_element = node.prev;
        DoubleNode next_element = node.next;
        prev_element.next = next_element;
        next_element.prev = prev_element;
    }

    private void insert(DoubleNode node) {
        DoubleNode prev_element = latest.prev;
        DoubleNode next_element = latest;
        prev_element.next = node;
        next_element.prev = node;
        node.next = next_element;
        node.prev = prev_element;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            cache.remove(key);
        }
        DoubleNode newNode = new DoubleNode(key,value);
        cache.put(key,newNode);
        insert(newNode);
        if(cache.size()>cap){
            DoubleNode lru = oldest.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

}
