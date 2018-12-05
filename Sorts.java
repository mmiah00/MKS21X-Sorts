public class Sorts {
  public static void selectionsort (int[] ary) {
    int smallest = ary[0];
    int x = 0;
    while (!isSorted (ary)) {
       for (int i = 0; i < ary.length; i ++) {
         if (ary[i] < smallest) {
           smallest = ary[i];
         }
       }
       ary [x] = smallest;
       x += 1;
    }
  }

  private static boolean isSorted (int[] ary) {
    for (int x = 0; x + 1< ary.length; x ++) {
      if (ary[x + 1] < ary [x] ) {
        return false;
      }
    }
    return true;
  }

}
