public class MergeSort {

  public static void mergeSort(int[] arr) {
    mergeSortBetween(arr, new int[arr.length], 0, arr.length - 1);
  }

  private static void mergeSortBetween(int[] arr, int[] aux, int startIdx, int endIdx) {
    if (startIdx >= endIdx) {
      return;
    }

    int midIdx = (((endIdx - startIdx) + 1) / 2) + startIdx;
    mergeSortBetween(arr, aux, startIdx, midIdx - 1);
    mergeSortBetween(arr, aux, midIdx, endIdx);
    merge(arr, aux, startIdx, midIdx - 1, midIdx, endIdx);
  }

  private static void merge(int[] arr, int[] aux, int leftStartIdx, int leftEndIdx,
  int rightStartIdx, int rightEndIdx) {
    int startIdx = leftStartIdx;
    int insertIdx = leftStartIdx;
    while (leftStartIdx <= leftEndIdx && rightStartIdx <= rightEndIdx) {
      if (arr[leftStartIdx] < arr[rightStartIdx]) {
        aux[insertIdx] = arr[leftStartIdx];
        leftStartIdx++;
      } else {
        aux[insertIdx] = arr[rightStartIdx];
        rightStartIdx++;
      }
      insertIdx++;
    }
    while (leftStartIdx <= leftEndIdx) {
      aux[insertIdx] = arr[leftStartIdx];
      leftStartIdx++;
      insertIdx++;
    }
    while (rightStartIdx <= rightEndIdx) {
      aux[insertIdx] = arr[rightStartIdx];
      rightStartIdx++;
      insertIdx++;
    }

    for (int idx = startIdx; idx <= rightEndIdx; idx++) {
      arr[idx] = aux[idx];
    }
  }

  public static void main(String[] args) {
    // int[] to_merge = {1, 3, 4, 5, 2, 6, 7, 8};
    // merge(to_merge, new int[8], 0, 3, 4, 7);
    // System.out.println(java.util.Arrays.toString(to_merge));

    int[] subject = {7, 4, 5, 1, 8, 3, 2, 6};
    mergeSort(subject);
    System.out.println(java.util.Arrays.toString(subject));
  }

}
