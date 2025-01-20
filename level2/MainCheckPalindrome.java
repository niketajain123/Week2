//class CheckPalindrome
class CheckPalindrome{
    //private member text
    private String text;
    //constructor
    public CheckPalindrome(String text){
        this.text=text;
    }
    //method to check palindrome
    public boolean checkPalindrome(){
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public void display(){
        boolean result=checkPalindrome();
        if(result==true)
            System.out.println("Text \""+text+"\" is palindrome!");
        else
            System.out.println("Text \""+text+"\" is not palindrome!");

    }

}
//Main class
public class MainCheckPalindrome {
    public static void main(String[] args) {
        CheckPalindrome palindrome1=new CheckPalindrome("abcdcba");
        CheckPalindrome palindrome2=new CheckPalindrome("abcccb");
        //checking and displaying result
        palindrome1.display();
        palindrome2.display();
    }
}
