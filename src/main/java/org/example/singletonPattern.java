package org.example;

public class singletonPattern {

        private static singletonPattern instance;
        private singletonPattern(){

        }

        public static singletonPattern getInstance(){

            if(instance == null){
                instance = new singletonPattern();
            }
            return instance;
        }
        public static void main(String[] args){
            singletonPattern obj1 = singletonPattern.getInstance();
            singletonPattern obj2 = singletonPattern.getInstance();
            System.out.println("Singleton Object 1 is created = "+ obj1);
            System.out.println("Singleton Object 2 is created = "+ obj2);
            System.out.println();

            if(obj1 == obj2){
                System.out.println("Success: Both variables point to the exact same object!");
            } else {
                System.out.println("Error: Two different objects were created.");
            }
        }


    }
