class MyHashSet {
    
    Node head;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.head = new Node();
    }
    
    public void add(int key) {
        Node lookingNode = head;

        if (lookingNode.value== null){
          head = new Node(key);
        } else {
        	while (lookingNode.nextNode != null){
                lookingNode = lookingNode.nextNode;
            }
            
            Node newNode = new Node(key);
            
            lookingNode.nextNode = newNode;
        }
        
    
        
    }
    
    public void remove(int key) {
        Node lookingNode = head;
        Node pastNode;
        
        if (head.value == key){
            head = head.nextNode;
        } else{
            pastNode = head;
            lookingNode = head.nextNode;
            while(lookingNode.nextNode != null){
                if (lookingNode.value == key){
                    pastNode.nextNode = lookingNode.nextNode;
                }
            }
        }
        
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        boolean contain = false;
        Node lookingNode = head;
        while(lookingNode!= null){
            if (lookingNode.value == key){
                contain = true;
            }
            lookingNode = lookingNode.nextNode;
            
        }
        return contain;
    }
}


class Node {
    
    public Integer value;
    public Node nextNode;
    
    
    public Node (){
        
    }
    
    public Node(int key){
        this.value = key;
        this.nextNode = null;
        
    }
    
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

