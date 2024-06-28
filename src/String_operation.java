
import java.util.Arrays;
import java.util.Scanner;

class String_operation {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        String str;
        int count=0;
        int count1=0;
        char ch1;
        String revstr="";
        System.out.println("enter the string");
        str=scanner.nextLine();//Entering string
        scanner.close();
        System.out.println(str.toLowerCase());//changing to lower case
        System.out.println(str.toUpperCase());//changing to upper case
        char ch[]=str.toCharArray();//string to array
        Arrays.sort(ch);//sorting
        System.out.println(ch);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')//counting the no of words
            {
                count++;
            }
        }
        System.out.println(count);
        for(int j=0;j<str.length();j++)//reverse of string
        {
            ch1=str.charAt(j);
            revstr=ch1+revstr;
        }
        System.out.println(revstr);
        if(str.equals(revstr))// check for palindrome
        {
            System.out.println("string is a palindrome");
        }else
        {
            System.out.println("string is not a palindrome");
        }
        String str1;//string concting
        str1=str+revstr;
        System.out.println(str1);
        for(int k=0;k<str.length();k++)
        {
            if(str.charAt(k)=='A'||str.charAt(k)=='a'||str.charAt(k)=='E'||str.charAt(k)=='e'||str.charAt(k)=='I'||str.charAt(k)=='i'||str.charAt(k)=='O'||str.charAt(k)=='o'||str.charAt(k)=='U'||str.charAt(k)=='u')
            {
                count1++;
            }
            
        }
        System.out.println("the no of vowels are" +count1);
    }        
    }        
    
