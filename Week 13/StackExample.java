public class StackExample {
    public static void main(String[] args) {
        StackDataStructure s = new StackDataStructure(5);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}

class StackDataStructure {
    int max_size;
    int[] stack_arr;
    int top;

    StackDataStructure(int max_size) {
        this.max_size = max_size;
        top = -1;
        stack_arr = new int[this.max_size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max_size - 1;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            return stack_arr[top];
        }
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            top++;
            stack_arr[top] = data;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            return stack_arr[top--];
        }
    }
}