package cc.heap;

public class Heap {

  private final int[] _values;
  
  private final String _demarcation = "'"; // TODO "'";
  
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
    
    buffer.append(String.format("%" + Integer.toString(_geometry.getTreeMiddle()) + "s", "") + "|\n");

    buffer.append(toString(0));
    
    return buffer.toString();
  }
  
  private String toString(int index) {
    
    StringBuilder buffer = new StringBuilder();
    
    if (index >= _values.length) {
      
      return "";
    }

    //buffer.append("index: " + index + "\n");

    //buffer.append("level: " + _geometry.calcLevelFromIndex(index) + "\n");

    //buffer.append("sections: " + _geometry.calcSectionsFromIndex(index) + "\n");

    //buffer.append("sections: " + _geometry.calcUnitWidth(index) + "\n");

    //buffer.append("position on level: " + _geometry.calcPositionOnLevel(index) + "\n");

    //buffer.append("total on level: " + _geometry.calcTotalOnLevel(index) + "\n");
    
    buffer.append(_demarcation + _geometry.getOffset(index) + _demarcation);
    
    String padded = _demarcation + pad(index) + _demarcation;
    
    buffer.append(padded);
    
    if (_geometry.isEndOfLine(index)) {
      
      buffer.append("\n");
    }

    buffer.append(toString(index + 1));

    return buffer.toString();
  }

  private String pad(int index) {

    String number = Integer.toString(_values[index]);
    
    int padding_total = _geometry.calcPadWidth() - number.length();
    
    String lhs = String.format("%" + Integer.toString(number.length() + (padding_total / 2)) + "s", number);

    String rhs = String.format("%-" + Integer.toString(number.length() + padding_total) + "s", lhs);
    
    return rhs.replace(' ', '0');
  }
  
}
