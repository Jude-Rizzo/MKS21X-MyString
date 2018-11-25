public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  
  public MyString(CharSequence s){
    data = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int i){
    //pretty straightfoward just go to that character
    if(i < 0 || i >= data.length){
      throw new IndexOutOfBoundsException();
    }
      return data[i];
  }

  public int length(){
    //just array length
    return data.length;
  }

  public CharSequence subSequence(int s, int l){
    //loop through and copy over all the chars within the bounds
    if(l < s || s > data.length || s < 0 || l < 0 )
      throw new IndexOutOfBoundsException();
    //dont forget to check for errors
    String ans = "";
    for(int i = s; i < l; i++){
    ans += data[i];
    }
    return ans;
  }

  public int compareTo(CharSequence T){

  }

  public String toString(){

  }


  }
