package TwoDArray.Hw;

public class Repeat {
    public static void main(String[]args){
        int arr[]={1,2,4,2,1,5,2,3,4,6,2,4,3};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
            int Secondarr[]= new int[max+1];
            for(int i=0;i<arr.length;i++){
                Secondarr[arr[i]]++;
            }
            for(int i=0;i<=max;i++){
                if (Secondarr[i]>1) {
                    System.out.println(i +", "+Secondarr[i]);
                    
                }
            }
        }
    }
    

