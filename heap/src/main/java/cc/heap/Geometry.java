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

  public Geometry(int length) {
    
    _length = length;
    
    _tree_height = (int) (Math.log(_length) / Math.log(2));

    _tree_leaves = (int) Math.pow(2, _tree_height);
    
    _tree_width = (int) (_NUMBER_WIDTH + _NUMBER_WIDTH_BUFFER) * _tree_leaves;
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
    
    return (int) (Math.log(index + 1) / Math.log(2));
  }

  public int calcSectionsFromIndex(int index) {
    
    return (int) Math.pow(2, index) + 1;
  }
  
}

