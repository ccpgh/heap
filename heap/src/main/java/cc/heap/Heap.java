package cc.heap;

public class Heap {

  private int[] _hash = new int[] { 5, 13, 2, 25, 7, 17, 20, 8, 4};

  public Heap() {
  }

  public String toString() {
    StringBuilder buffer = new StringBuilder();

    buffer.append(toString(0));
    
    return buffer.toString();
  }

  public static void main(String[] args) {
    System.out.println("start.");
    
    System.out.println("stop.");
  }
  
  private String toString(int i) {
    StringBuilder buffer = new StringBuilder();
    
    buffer.append(_hash[0]);
    
    return buffer.toString();
  }
}
