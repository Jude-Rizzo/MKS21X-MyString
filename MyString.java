public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int i){
    if(i < 0 || i >= data.length){
      throw new IndexOutOfBoundsException();
    }
      return data[i];
  }

  public int length(){
    return data.length;
  }

  public CharSequence subSequence(int s, int l){
    for(int i = s; i < l; i++){

    }
  }

  public int compareTo(CharSequence T){

  }

  public String toString(){

  }


  }
