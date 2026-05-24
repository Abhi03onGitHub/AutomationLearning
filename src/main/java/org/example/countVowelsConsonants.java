package org.example;

public class countVowelsConsonants {
    static void main(String[] args){
        String str = "Salesforce".toLowerCase();
        System.out.println("Input is "+str );

        int vowels = 0;
        int consonants = 0;
        for(int i = 0;i<=str.length() -1; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                vowels++;}
            else{
                consonants++;}
        }
        System.out.println("Vowels Count = "+vowels );
        System.out.println("Consonants Count = "+consonants );
    }

}
