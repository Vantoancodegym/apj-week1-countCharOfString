import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your stirng");
        String string=input.nextLine();
        System.out.println("enter your char");
        char s=input.next().charAt(0);
        System.out.println(s +" appear "+count(string,s)+" times");
    }
    public static int count(String str,char s){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==s){
                count++;
            }
        }
        return count;
    }
}
