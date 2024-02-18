
public class myBinaryNumber {
    String number;
   myBinaryNumber(int n){
       for(int i=0;i<n;i++)
           number = number + "0";
   }
   myBinaryNumber(String s)
   {
       number= s;
   }
   int getSize(){
       return number.length();
   }
   int getBit(int p){
       for(int i=0;i<number.length();i++){
           if(p==i)
               return number.charAt(i);
       }
       return -1;
   }
   void setBit(int p,int b){
       if (p < 0 || p >= number.length() || b < 0 || b > 1) {
           throw new IllegalArgumentException("Invalid input");
       }
       char[] chars = number.toCharArray();
       chars[p] = (char) (b + '0');
       this.number = new String(chars);
   }
    public void printNumber() {
        System.out.println(number);
    }
}
class test{
    public static void main(String[] args) {
        myBinaryNumber b=new myBinaryNumber("110110");
        b.printNumber();
        b.setBit(2,2);
        b.printNumber();
    }
}

