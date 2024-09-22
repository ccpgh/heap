package cc.heap;

public class Geometry {

  //
  
  private final int _length;
  
  private final int _tree_height;

  private final int _tree_leaves;

  private final int _tree_width;

  //
  
  private final int _NUMBER_WIDTH = 6;

  private final int _NUMBER_WIDTH_BUFFER = 2;

  private final int _NUMBER_WIDTH_TABLE_BUFFER = 40;

  public Geometry(int length) {
    
    _length = length;
    
    _tree_height = (int) (Math.log10(_length) / Math.log10(2));

    _tree_leaves = (int) Math.pow(2, _tree_height);
    
    _tree_width = (int) (_NUMBER_WIDTH + _NUMBER_WIDTH_BUFFER) * _tree_leaves + _NUMBER_WIDTH_TABLE_BUFFER;
  }
  
  public int getTreeHeight() {
    
    return _tree_height;
  }
  
  public int getTreeLeaves() {
    
    return _tree_leaves;
  }

  public int getTreeWidth() {
    
    return _tree_width;
  }

  //
  
  public int calcLevelFromIndex(int index) {
    
    return (int) (Math.log10(index + 1) / Math.log10(2));
  }

  public int calcSectionsFromIndex(int index) {
    
    return (int) Math.pow(2, index) + 1;
  }
  
  public int calcUnitWidth(int index) {
    
    return _tree_width / calcSectionsFromIndex(index);
  }
  
  public int calcPositionOnLevel(int index) {
    
    return (index + 1) - ((int) Math.pow(2,  calcLevelFromIndex(index)) - 1);
  }

  public int calcTotalOnLevel(int index) {
   
    return (int) Math.pow(2,  calcLevelFromIndex(index));
  }
  
  public boolean isEndOfLine(int index) {
    
    return calcPositionOnLevel(index) == calcTotalOnLevel(index);
  }
  
  public int calcNumberWidth(int number) {
    
    return (int) Math.log10(number) + 1;
  }
  
  public int calcPadWidth() {
    
    return _NUMBER_WIDTH + _NUMBER_WIDTH_BUFFER;
  }
  
  public String getOffset(int index) {

    /*
    int tree_middle = getTreeMiddle();
  
    int elements_offset = (int) (calcTotalOnLevel(index) * calcPadWidth(index)) / 2;

    if (calcPositionOnLevel(index) == 1) {

      int result = tree_middle - elements_offset;

      System.out.println("getTreeWidth: " + getTreeWidth() );

      System.out.println("getTreeMiddle: " + getTreeMiddle() );

      System.out.println("result: " + result );

      return String.format("%" + Integer.toString(result) + "s", "");
    }*/
    
    return "";
  }
    
  public int getTreeMiddle() {
    
    return (int) getTreeWidth() / 2;
  }
}

