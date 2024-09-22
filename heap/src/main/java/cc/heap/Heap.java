package cc.heap;

public class Heap {

 // private final int[] _hash = new int[] { 5, 13, 2, 25, 7, 17, 20, 8, 4 };

  private final int[] _hash = new int[] { 5, 13, 2, 25, 7, 17, 20, 8, 4, 13, 2, 25, 7, 17, 20, 8, 4 };

  private final int _width = 6;

  private final int _height = (int) (Math.log(_hash.length) / Math.log(2));

  private final int _leaves = (int) Math.pow(2, _height);
  
  private final int _line = (_width + 2) * _leaves;

  public Heap() {
  }

  public String toString() {
    StringBuilder buffer = new StringBuilder();

    buffer.append("total height " + _height);

    buffer.append("\n");

    buffer.append("leaves " + _leaves);

    buffer.append("\n");
    
    buffer.append(toString(0));

    return buffer.toString();
  }

  public static void main(String[] args) {
    System.out.println("start.");

    Heap h = new Heap();

    System.out.println(h.toString());

    System.out.println("stop.");
  }

  private String toString(int i) {
    
    if (i >= _hash.length) {

      return "";
    }
 
    boolean debug = false;
    
    StringBuilder buffer = new StringBuilder();

    if (debug) {
      buffer.append("i " + i);

      buffer.append("\n");
    }
    
    int level = (int) (Math.log(i+1) / Math.log(2));

    if (debug) {
    
      buffer.append("level " + level);

      buffer.append("\n");
    }
    
    int sections = (int) Math.pow(2, level) + 1;

    
    if (debug) {
    
      buffer.append("sections " + sections);

      buffer.append("\n");
    }
    
    int unit_width = _line / sections;
    
    if (debug) {
      
      buffer.append("unit_width " + unit_width);

      buffer.append("\n");
    }
    
    int element_on_lint = (i + 1) - ((int) Math.pow(2,  level) - 1);

    if (debug) {
      buffer.append("element_on_lint " + element_on_lint);

      buffer.append("\n");
    }
    
    buffer.append(String.format("%" + unit_width + "s", pad(_hash[i])));

    buffer.append(toString(i + 1));
        
    return element_on_lint == 1 ? "\n" + buffer.toString() : buffer.toString();
  }

  private String pad(int i) {

    int padding = _width - (int) Math.log(i);

    return String.format("%-" + Integer.toString(padding) + "s",
        String.format("%" + Integer.toString((int) (padding + 1) - ((int) padding / 2)) + "s", Integer.toString(i)));
  }
}
