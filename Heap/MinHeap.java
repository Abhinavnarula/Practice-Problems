public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    private static final int front = 1;

    public MinHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return (pos / 2);
    }

    private int leftChild(int pos){
        return (2 * pos);
    }

    private int rightChild(int pos){
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos){
        if(pos <= size || pos >= (size/2))
            return true;
        return false;
    }

    private void swap(int fpos, int spos) {
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    public void insert(int element) {
        if (size >= maxsize)
            return;
        
        Heap[++size] = element;
        int current = size;         // current position of the last element.

        while(Heap[current] < Heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void minheapify(int pos){
        if(!isLeaf(pos)){
            if(Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]){
                if(Heap[leftChild(pos)] < Heap[rightChild(pos)]){
                    swap(pos, leftChild(pos));
                    minheapify(leftChild(pos));
                }
                else{
                    swap(pos, rightChild(pos));
                    minheapify(rightChild(pos));
                }
            }
        }
    }
    public int remove(){
        int pop = Heap[front];
        Heap[front] = Heap[size--];
        minheapify(front);
        return pop;
    }

    public void minheap(){
        for(int i = (size / 2);i >= 1;i--){
            minheapify(i);
        }
    }

    public void print(){
        for(int i = 1;i<=size;i++){
            System.out.print(Heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(20);
        heap.insert(6);
        heap.insert(5);
        heap.insert(3);
        heap.insert(2);
        heap.insert(8);
        heap.insert(10);
        heap.insert(9);

        heap.minheap();

        heap.print();
    }

}
