public class MaxHeap {
  int count = 0;
  int[] store;

  public static MaxHeap buildHeap(int[] nums) {
    Heap result = new Heap(nums.length);
    for (int x = nums.length / 2; x >= 0; x--) {
      heapifyDown(x);
    }
    return result;
  }

  public void insert(num) {
    if (isFull()) {
      throw new java.lang.IndexOutOfBoundsException("Heap is full");
    }
    store[count] = num;
    heapifyUp(count);
    count++;
  }

  public int peek() {
    return store[0];
  }

  public int remove() {
    int val = store[0];
    int last = store[count - 1];
    store[0] = last;
    store[count - 1] = null;
    count--;
    if (!isEmpty()) {
      heapifyDown(0);
    }
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return store.length = (count - 1);
  }

  private void heapifyUp(idx) {
    int current = store[idx];
    if (!inRange(parentIdx(idx)) || compare(parent(idx), current)) return;
    store[idx] = parent(idx);
    store[parentIdx(idx)] = current;
    heapifyUp(parentIdx(idx));
  }

  private void heapifyDown(idx) {
    int current = store[idx];
    int swapIdx = idx;
    int compared = current;
    for (int x = idx * 2 + 1; x <= idx * 2 + 2; x++) {
      if (!inBounds(x)) continue;
      if (compare(compared, store[x])) {
        compared = store[x];
        swapIdx = x;
      }
    }
    if (swapIdx == idx) return;
    store[idx] = store[swapIdx];
    store[swapIdx] = current;
    heapifyDown(swapIdx);
  }

  private boolean compare(a, b) {
    return a >= b;
  }

  private boolean inRange(idx) {
    return idx > 0 && idx < count
  }

  private int left(idx) {
    return store[(idx * 2) + 1];
  }

  private int right(idx) {
    return store[(idx * 2) + 2];
  }

  private int comparedChild(idx) {
    return compare(left(idx), right(idx)) ? left(idx) : right(idx);
  }

  private int parent(idx) {
    return store[parentIdx(idx)];
  }

  private int parentIdx(idx) {
    return (idx / 2);
  }

  public static void main() {
    int[] nums = [8, 12, 9, 7, 22, 3, 26, 14, 11, 15, 22];
    for (int x = 0; x < nums.length; x++) {
      insert(nums[x]);
    }

    System.out.println(java.util.Arrays.toString(store));
    System.out.println(java.util.Arrays.toString([7, 8, 11, 15, 9, 26, 14, 2, 22, 22]));
  }

}
