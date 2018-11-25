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
    //get null pointer exception out of the way
    if(T == null) throw new NullPointerException();
    //If the MyStrings are different length return the difference of the first chars
    if(T.length == 0) return data.length();
      //s is the minumum length
      int s;
      if(T.length() < this.length()){
        s = T.length();
      } else {
        s = this.length();
      }
      //now compare the first difference in chars
      //if there isnt one return the difference in length
      int counter = 0;
      for(int i = 0; i < s; i ++){
        if(data[i] != T.charAt(i))
          return data[i] - T.charAt(i);
        counter++
        if(counter == s)
          return this.length() - T.length();
      }


  }






  }

  public String toString(){

  }


  }
