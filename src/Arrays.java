import java.util.Arrays;

class CheckArray{
    public static void main(String[] args) {
        int[] b={2,6,4,9,5,2,1,4,5,6,8,6,7};
        int length;
        int highest=b[0];
        length=b.length;
       System.out.println(length);
       Arrays.sort(b);
       for(int i:b)
       {
       System.out.println(i);
       if(highest<i)
       {
        highest=i;
       }
       }
       System.out.println("the highest no is" +highest);
       
    }
}   