import java.util.Scanner;
//CollabAppleTree
//1. find all the duplicate charecters
//2. find duplicates which adjucent
import java.util.HashSet;
public class amdocsInterview {
    public static void main(String[] args){
    String word = "collabappletree";
    HashSet<Character> hash = new HashSet<Character>();
    HashSet<Character> hash2 = new HashSet<Character>();

    for(int i = 0; i < word.length(); i++){
       if(i+1 < word.length() && word.charAt(i) == word.charAt(i+1)){
        //System.out.println(word.charAt(i));\
        hash.add(word.charAt(i));
        }
    }
    for(int i = 0; i < word.length(); i++){
        for(int j = i+1; j < word.length(); j++){
            if(word.charAt(i) == word.charAt(j)){
                //System.out.println(word.charAt(i));
                hash2.add(word.charAt(i));
            }
        }
    }
    System.out.println("hash 1: " + hash);
    System.out.println("hash 2 : "+ hash2);
}
}
