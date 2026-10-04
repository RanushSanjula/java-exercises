public class palindrome {
    public static void main(String[] args) {

        String str = "121";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("This is not a Palindrome");
        }

    }

}
