package Recursion;

public class Occurrence {
    public static int firtOcurrence(int array[], int i,  int key){
        if(i==array.length){
            return -1;
        }
        if(array[i]==key){
            return i;
        }
      return  firtOcurrence(array, i+1, key);
        
    }
    public static void main(String[]args){
        int array[]={9,4,5,6,7,8,4,2,6,7,};
    System.out.println(firtOcurrence(array, 0, 2));

    }
    
}
