package main.datastructure;

/**
 * 用洪逸課堂上講的Bottom-up法建立
 */
public class MaxHeap {

    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public int[] getHeap(){
        return heap;
    }

    public MaxHeap(int[] initArray) {

        this.maxSize = initArray.length;
        this.size = this.maxSize;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
        int count = 0;
        for(int i =1;i<=maxSize;i++){
            heap[i] = initArray[count++];
        }
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return pos * 2;
    }

    private int rightChild(int pos) {
        return pos * 2 + 1;
    }

    private void adjust(int pos){
        int k = heap[pos];
        int j = leftChild(pos);
        while ( j <= size) {
            if( j < size) {
                if(heap[j] < heap[j+1]){
                    j++;
                }
                if (k>=heap[j]){
                    break;
                }else {
                    heap[j/2] = heap[j]; //挑戰成功
                    j = 2*j;
                }
            }
        }
        heap[j/2] = k;
    }

    public void createHeap(){
        for (int j = (size/2);j>=1 ; j--){
            this.adjust(j);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i]
                    + " LEFT CHILD : " + heap[2 * i]
                    + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

}
