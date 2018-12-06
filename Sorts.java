public class Sorts {

  /* WORKS BUT NOT RIGHT ALGORITHM
  public static void selectionSort (int[] ary) {
    while (!isSorted (ary)) {
      for (int x = 0; x + 1 < ary.length; x ++) {
        int one = ary[x];
        int oneafter = ary [x +1];
        if (oneafter < one) {
          ary [x] = oneafter;
          ary [x + 1] = one;
        }
      }
    }
  }
  */

  public static void selectionSort (int[] ary) {
    int x = 0;
    while (x < ary.length) {
      int minvalue = ary [x];
      int minvalueindex = x;
      int old = ary[x];
      for (int i = x; i < ary.length; i ++) {
        if (ary[i] < minvalue) {
          minvalueindex = i;
          minvalue = ary [i];
        }
      }
      ary [x] = minvalue;
      ary [minvalueindex] = old;
      x ++ ;
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

  public static String toString (int[] ary) {
    String ans = "[";
    for (int x = 0; x< ary.length ; x ++) {
      if (x != ary.length -1) {
        ans += ary[x] + " ";
      }
      else {
        ans += ary[x] + "]";
      }
    }
    return ans;
  }

  public static void main (String[] args) {
    int[] t1 = {2,3,4,7,5,3,5};
    int[] t2 = {1,2,3,4,5};
    int[] t3 = {6,2,45,865,4,8,-1};
    int[] t4 = {1,1,1,1,1,2,4};
    int[] t5 = {1,45,7,3,2,6,3,242,-23,304,20,20,-35,9,10,11,1,0,-5,14};
    /*
    System.out.println (isSorted (t1));
    System.out.println (isSorted (t2));
    System.out.println (isSorted (t3));
    System.out.println (isSorted (t4));
    */

    System.out.println (toString (t1));
    System.out.println (toString (t2));
    System.out.println (toString (t3));
    System.out.println (toString (t4));
    System.out.println (toString (t5));


    System.out.println ("SORTED");

    selectionSort (t1);
    selectionSort (t2);
    selectionSort (t3);
    selectionSort (t4);
    selectionSort (t5);


    System.out.println (toString (t1));
    System.out.println (toString (t2));
    System.out.println (toString (t3));
    System.out.println (toString (t4));
    System.out.println (toString (t5));
    
  }

}
