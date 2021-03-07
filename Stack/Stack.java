class Stack {
    static final int max = 1000;
    int arr[] = new int[max];
    int top;

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    void push(int data) {
        if (top >= max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed into stack");
    }

    int pop() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = arr[top];
        arr[top--] = 0;
        System.out.println(x + " popped from stack");
        return x;
    }

    int peek() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = arr[top];
        System.out.println(x + " is peeked from stack");
        return x;
    }

    void printfunction() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " > ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.printfunction();

        st.pop();
        st.pop();
        st.printfunction();
    }
}
