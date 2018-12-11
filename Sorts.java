import java.util.Random;
public class Sorts {

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

  public static void bubbleSort (int[] ary) {
    /*while (!isSorted (ary)) {
      for (int x = 0; x + 1 < ary.length; x ++) {
        int one = ary[x];
        int oneafter = ary [x +1];
        if (oneafter < one) {
          ary [x] = oneafter;
          ary [x + 1] = one;
        }
        //System.out.println (toString (ary));
      }
    }
    */
    boolean swapped = true;
    while (swapped) {
      int numswaps = 0;
      for (int x = 0; x + 1 < ary.length; x ++)  {
        int one = ary [x];
        int oneafter = ary [x + 1];
        if (oneafter < one) {
          ary [x] = oneafter;
          ary [x + 1] = one;
          numswaps ++;
        }
      }
      if (numswaps == 0) {
        swapped = false;
      }
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

  public static void insertionSort (int[] ary) {
    int sortedindex = 0; //divider between assorted and not
    while (sortedindex < ary.length) {
      int beingsorted = ary [sortedindex];
      for (int x = sortedindex; x >= 0; x --) { //going backwards to find the smallest
        int now = ary [x];
        if (now > beingsorted) {
          ary [x + 1] = now;
          ary [x] = beingsorted;
        }
      }
      sortedindex ++;
      //System.out.println (toString (ary));
    }
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
    if (args.length == 0){
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

      /*
      selectionSort (t1);
      selectionSort (t2);
      selectionSort (t3);
      selectionSort (t4);
      selectionSort (t5);
      */
      /*
      bubbleSort (t1);
      bubbleSort (t2);
      bubbleSort (t3);
      bubbleSort (t4);
      bubbleSort (t5);
      */

      insertionSort (t1);
      insertionSort (t2);
      insertionSort (t3);
      insertionSort (t4);
      insertionSort (t5);


      System.out.println (toString (t1));
      System.out.println (toString (t2));
      System.out.println (toString (t3));
      System.out.println (toString (t4));
      System.out.println (toString (t5));

    }
    else {
      int len = Integer.parseInt (args[0]);
      int[] nums = new int[len];
      Random rand = new Random ();
      int i = 0;
      for (int x = 0; i < len; x ++) {
        nums [i] = rand.nextInt() % 1000;
        i ++;
      }

      //System.out.println (toString (nums));
      //System.out.println ("SORTED");
      bubbleSort (nums);
      //System.out.println (toString (nums));
    }

  }

}
