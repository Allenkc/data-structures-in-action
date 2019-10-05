package main.datastructure;

/**
 * 用洪逸課堂上講的Bottom-up法建立
 */
public class MaxHeap {

    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public int[] getHeap() {
        return heap;
    }

    public MaxHeap(int[] initArray) {

        this.maxSize = initArray.length;
        this.size = initArray.length;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 1; i <= size; i++) {
            heap[i] = initArray[count++];
        }
    }

    // Returns true of given node is leaf
    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
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

    private void adjust(int pos) {

        int k = heap[pos];
        int leftChildPos = leftChild(pos);
        while (leftChildPos <= size) {
            // 檢查有無右子
            if (leftChildPos < size) {
                // 表示有右子，看左子大還是右子大
                if (heap[leftChildPos] < heap[leftChildPos + 1]) {
                    leftChildPos++;
                }
            }

            if (k >= heap[leftChildPos]) {
                break;
            } else {
                heap[parent(leftChildPos)] = heap[leftChildPos]; //挑戰成功
                leftChildPos = 2 * leftChildPos;
            }
        }
        heap[parent(leftChildPos)] = k;
    }

    public void createHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            this.adjust(pos);
        }
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i]);
            if (2 * i + 1 <= size) {
                System.out.print(" RIGHT CHILD :" + heap[2 * i + 1]);
            }
            System.out.println();
        }
    }

    public int delete() {
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        adjust(FRONT);
        return popped;
    }

}
