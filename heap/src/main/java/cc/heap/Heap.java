package cc.heap;

public class Heap {

  private final int[] _values;
  
  private final Geometry _geometry;

  public Heap(int[] values) {

    _values = values;
    
    _geometry = new Geometry(values.length);
  }
  
  public String toString() {
    
    StringBuilder buffer = new StringBuilder();

    buffer.append("tree height: " + _geometry.getTreeHeight() + "\n");
    
    buffer.append("tree leaves: " + _geometry.getTreeLeaves() + "\n");

    buffer.append("tree width: " + _geometry.getTreeWidth() + "\n");

    buffer.append(toString(0));
    
    return buffer.toString();
  }
  
  private String toString(int index) {
    
    StringBuilder buffer = new StringBuilder();
    
    if (index >= _values.length) {
      
      return "";
    }

    buffer.append("index: " + index + "\n");

    buffer.append("level: " + _geometry.calcLevelFromIndex(index) + "\n");

    buffer.append("sections: " + _geometry.calcSectionsFromIndex(index) + "\n");

//    
//    int unit_width = _line / sections;
//    
//    if (debug) {
//      
//      buffer.append("unit_width " + unit_width);
//
//      buffer.append("\n");
//    }
//    
//    int element_on_lint = (i + 1) - ((int) Math.pow(2,  level) - 1);
//
//    if (debug) {
//      buffer.append("element_on_lint " + element_on_lint);
//
//      buffer.append("\n");
//    }
//    
//    buffer.append(String.format("%" + unit_width + "s", pad(_hash[i])));
//
//    buffer.append(toString(i + 1));
//        
//    return element_on_lint == 1 ? "\n" + buffer.toString() : buffer.toString();

    return buffer.toString();
  }

//  private String pad(int i) {
//
//    int padding = _width - (int) Math.log(i);
//
//    return String.format("%-" + Integer.toString(padding) + "s",
//        String.format("%" + Integer.toString((int) (padding + 1) - ((int) padding / 2)) + "s", Integer.toString(i)));
//  }
  
  ///  ;
  
}
