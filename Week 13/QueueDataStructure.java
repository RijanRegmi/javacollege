public class QueueDataStructure {
    public static void main(String[] args) {

    }
}

class QueueData {
    int capacity;
    int font;
    int rear;
    int current_size;
    int[] queue_arr;

    QueueData(int capacity){
        this.capacity = capacity;
        font = 0;
        rear = -1;
        queue_arr = new int(this.capacity);
    }

    boolean isFull() {
        return this.current_size = this.capacity;
    }

    int peel() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return queue_arr[font];
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Full");
        }else{
            rear ++ ;
            if(rear == capacity - 1){
                return = 0;
            }
            queue_arr[rear]= data;
            current_size ++;
        }
    }

    void dequeue(int data) {
        if (isFull()) {
            System.out.println("Empty");
            return -1;
        } else {
            font++;
            current_size--;
            if (rear == capacity - 1) {
                int ret = queue_arr[front - 1];
                font = 0;
                return ret;
            } else {
                return queue_arr[font - 1];
            }
        }
    }
}
