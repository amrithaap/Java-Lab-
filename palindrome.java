package scenarioquestions;
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str;
        int count=0;
        System.out.println("Enter a sentence: ");
        str=sc.nextLine();
        str=str.replace("."," ");
        str=str.replace("?"," ");
        str=str.replace("!"," ");
        String result="", ar[]= str.split(" ");
        for(int i=0;i < ar.length;i++)
        {
            if(isPal(ar[i]))
            {
                count++;
                result += ar[i] + " ";
            }
        }
        System.out.println("Palindrome Words: "+result);
    }
    public static boolean isPal(String str)
    {
        String rev = new StringBuffer(str).reverse().toString();
        if(str.equals(rev))
            return true;
        return false;
    }
}