import java.util.ArrayList;
import java.util.Arrays;

/**
* An example of creating a simple number set.
*
* @author Zane Hamilton
*/
public class NumberSet {
  int[] data;
  int index;
  static int DEFAULT_SIZE = 2;

  public NumberSet(){
    data = new int[DEFAULT_SIZE];
    index = 0;
  }

  public void add(int element){
    if (!hasElement(element)){
      data[index] = element;
      index++;
      if (index >= data.length){
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++){
          newData[i] = data[i];
        }
        data = newData;
      }
    }
  }

  //Method level comment
  public boolean isEmpty(){
    return index == 0;
  }

  public boolean hasElement(int element){
    for(int i = 0; i < index; i++){
      if(data[i] == element){
        return true;
      }
    }
    return false;
  }

  public void remove(int element){
    if (hasElement(element)){
      int indexToRemove = -1;
      for (int i = 0; i < index; i++){
        if (data[i] == element){
          indexToRemove = i;
        }
      }
      if (indexToRemove != -1){
        for (int i = indexToRemove; i < index - 1; i++){
          data[i] = data[i + 1];
        }
        data[index - 1] = 0;
        index--;
      }
    }
  }

  
  public void print(){
    System.out.println(Arrays.toString(data));
  }
  
}