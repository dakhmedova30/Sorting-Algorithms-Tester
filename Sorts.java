import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Sorts {

  static int _bubbleSwap = 0;
  static int _selectionSwap = 0;
  static int _insertionSwap = 0;

  static int _bubbleComparison = 0;
  static int _selectionComparison = 0;
  static int _insertionComparison = 0;

  public static void bubbleSort( ArrayList<Comparable> data )
  {
    for(int i = 0; i < data.size()-1; i++) {
      for(int j = data.size() - 1; j > i; j--) {
	      _bubbleComparison++;
        if(data.get(j).compareTo(data.get(j - 1)) < 0) {
	        _bubbleSwap++;
          int temp = (int)data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
        }
      }
    }
    System.out.println("Comparisons: " + _bubbleComparison);
    System.out.println("Swaps: " + _bubbleSwap);
    _bubbleSwap = 0;
    _bubbleComparison = 0;
  }

  public static void selectionSort( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    for(int pass = data.size()-1; pass >= 0; pass--) {
      maxPos = 0;
      for( int i = 0; i < pass+1; i++ ) {
        _selectionComparison++;
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
          _selectionSwap++;
        }
      }
      if (maxPos != pass){
        data.add(pass+1,data.get(maxPos));
        data.remove(maxPos);
        _selectionSwap++;
      }
    }
    System.out.println("Comparisons: " + _selectionComparison);
    System.out.println("Swaps: " + _selectionSwap);
    _selectionSwap = 0;
    _selectionComparison = 0;
  }//end selectionSort

  public static void insertionSort( ArrayList<Comparable> data )
  {
    for(int x = 0; x < data.size()-1; x++  ) {
      //partition marks first item in unsorted region
      int partition = x;
      //traverse sorted region from right to left
      for( int i = x+1; i>0; i-- ) {
	       _insertionComparison++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0  ) {
          _insertionSwap++;
          data.add(i-1,data.get(i));
          data.remove(i+1);
        }
        else{
          break;
        }
      }
    }
    System.out.println("Comparisons: " + _insertionComparison);
    System.out.println("Swaps: " + _insertionSwap);
    _insertionComparison = 0;
    _insertionSwap = 0;
  }//end insertionSortV

}
