public class CustomHT {
    private static final int TABLE_SIZE = 128; // ASCII range
 
    private Node[] table;
 
    public CustomHT() {
        table = new Node[TABLE_SIZE];
    }
 
    public void insert(char key) {
        int index = key % TABLE_SIZE;
 
        if (table[index] == null) {
            table[index] = new Node(key);
        } else {
            Node currentNode = table[index];
            while (currentNode.next != null) {
                if (currentNode.key == key) {
                    currentNode.count++;
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode.key == key) {
                currentNode.count++;
            } else {
                currentNode.next = new Node(key);
            }
        }
    }
 
    public char getMaxOccurrenceCharacter() {
        char maxChar = '\0';
        int maxCount = 0;
 
        for (Node node : table) {
            Node currentNode = node;
            while (currentNode != null) {
                if (currentNode.count > maxCount || (currentNode.count == maxCount && currentNode.key < maxChar)) {
                    maxChar = currentNode.key;
                    maxCount = currentNode.count;
                }
                currentNode = currentNode.next;
            }
        }
 
        return maxChar;
    }
 
    public int getMaxOccurrenceCount() {
        char maxChar = getMaxOccurrenceCharacter();
        int maxCount = 0;
 
        for (Node node : table) {
            Node currentNode = node;
            while (currentNode != null) {
                if (currentNode.key == maxChar) {
                    maxCount = currentNode.count;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
 
        return maxCount;
    }
 
    private static class Node {
        char key;
        int count;
        Node next;
 
        public Node(char key) {
            this.key = key;
            this.count = 1;
            this.next = null;
        }
    }
}