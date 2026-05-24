package org.example;

public class reverseString {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Reverse a String without Built in Methods");
        System.out.println();

        String str = "This is a new String to be reversed";
        char[] arr = str.toCharArray();
        int left=0;
        int right = arr.length - 1;
        while(left < right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Original String = " + str);
        System.out.println();
        System.out.println("Reversed String = "+ new String(arr));
        System.out.println();
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Reverse a String with Built in Methods");
        System.out.println();

        String str1 = "This is a New String to be entered";
        String reverse = new StringBuilder(str1).reverse().toString();

        System.out.println("Orignal String = " + str1);
        System.out.println();
        System.out.println("Reversed String = "+ reverse);
        System.out.println();
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Reverse a String Each letter");
        System.out.println();

        String str3 = "Each word is getting Reversed this time";
        String[] word = str3.split(" ");
        String reversedstring = " ";
        for(String words:word)
        {
            String Reversedwords = "";
            for(int i=words.length() - 1; i>=0;i--){
                Reversedwords = Reversedwords + words.charAt(i);
            }
            reversedstring = reversedstring + Reversedwords + " ";
        }
        System.out.println("Orignal String = " + str3);
        System.out.println();
        System.out.println("Reversed String = "+ reversedstring);
        System.out.println();
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Reverse the String without reversing the Special Characters");
        System.out.println();
        String input = "S@a#$l%es*f&o$rc@!e";
        System.out.println("Input String is = "+input);
        System.out.println();
        char[] ch = input.toCharArray();
        int left1 = 0;
        int right1 = input.length() - 1;
        char temp;
        while(left1<right1){
            if(!Character.isLetter(ch[left1])){
                left1++;
            }
            else if(!Character.isLetter(ch[right1])){
                right1--;
            }
            else {
                temp = ch[left1];
                ch[left1] = ch[right1];
                ch[right1] = temp;

                left1++;
                right1--;
            }


        }
        System.out.println("Reversed String = " +new String(ch));
        System.out.println();
        System.out.println("==============================================");
        System.out.println();
    }

}
