package stringassignment;

public class StringAssignmentC {
    public static void main(String[] args) {
       // String str = "abcde".repeat(100);
       // System.out.println(str.length()); //500
       // System.out.println(str.charAt(450)); //a
       // System.out.println(str.charAt(451)); //b

        //String str = "Counting characters in a string.";
       // System.out.println("Character at index 10:"+ str.charAt(10));// Character at index 10: h
       // System.out.println(str.indexOf(10)); // -1

       // String str1 = "HelloWorld";
       // String str2 = str1.substring(5);
      //  System.out.println(str1.substring(5)); //World
      // String str3 = "World";
      // System.out.println(str2==str3); // false? why? what is "=="?
      //  System.out.println(str2.equals(str3)); // false, World is not equal to Worl.

       // String str = "concatenate";
       // str = str.substring(3,8).concat(str.substring(1,4)).concat(str.substring(0,2));
       // System.out.println(str); //catenoncco - I got this one

      //  String str = "hellojava";
      //  int index = str.indexOf("java")-1;
      //  System.out.println(str.substring(index)); // because the substring of index is 5, 5 -1 = 4, index of 4 = ojava

       // String str = "Welcome";
       // System.out.println(str.substring(0,0).isEmpty()); // true
       // System.out.println(str.substring(0,0).isBlank()); // true isEmpty same as isBlank?

       // String str = "immutable";
       // str = str.substring(5).concat(str.substring(0,5)).replace('i','I');
       // System.out.println(str); //ableImmut

      //  String str = "abababa";
      //  int count = str.length()-str.replaceAll("aba", "").length();
      //  System.out.println(count); // query, please explain why the answer is 6

  // String str = "abcdefgh";
  // str = str.substring(2,6).concat(str.substring(6)).replace("e","X").replace("c","Y");
  // System.out.println(str); //YdXfgh

     //   String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ".repeat(5);
    //  String strp = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";
     //System.out.println(strp.length()); // 57? but counting from 0 is = 56, so how?
//        System.out.println(str.length());
    //  System.out.println(str.charAt(120)); //i, how? i am confused

 // String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 // int randomIndex = (int)(Math.random()*str.length());
 // System.out.println(str.charAt(randomIndex));

 //12.  // String str1 = "Hello, ";
        // String str2 = "World! Welcome to Java programming.";
        //  String combined = str1+str2;
        // System.out.println(combined.charAt(13)); // ""

 //String str1 = "Java";
 //String str2 = null;
 //String result = String.join("+", str1, str2);
 //System.out.println(result);

 // String str = "Very long string loaded from a file...";
//  System.out.println(str.charAt(100)); Gave an error message

//        String str = "Hello\nWorld\tJava";
//        System.out.println(str);
//        System.out.println(str.length()); //16 How?
//        System.out.println(str.charAt(6)); //W  How?

   //16     String str1 = new String("Hello");
          // String str2 = new String("Hello");
          // System.out.println(str1.equals(str2));

          //  String str1 = "Hello";
        //  String str2 = str1;
          //  str1 = "World"; // Whats the relevance of this ?
           // System.out.println(str2); //Hello

   //18.     String str = "abcdef";
            //str = str.replace('a', 'A').substring(1,4);
            //System.out.println(str); // bcd

   //19.     String str = " Java Programming ";
            //System.out.println(str.trim().toUpperCase().substring(0,4)); JAVA

  // String[] words = {"Java", "is", "fun"};
  // System.out.println(String.join("",words)); // Javaisfun

       // String str = "123";
      //  int num = Integer.parseInt(str);
      //  System.out.println(num==123); // i learnt that parseint converts number to string, please explain.

       // String str = "Mississippi";
       // int count = str.length()-str.replace("s", "").length();
      //  System.out.println(count); // if replace replaces all "S", how about 'replace all'

       // String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz";
        //for(int i=0; i<str.length(); i+=5){
          //  System.out.println(str.charAt(i)+""); // Please break this down for me

//    String str = "The quick brown fox jumps over the lazy dog.";
//    int index = str.indexOf("j")+2;
 //       System.out.println(str.charAt(index));

//        String str = "Java";
//        str.replace('J', 'K');
//        System.out.println(str); // It didnt change because their was no assignment, yes?

       // String str = " OpenAI ";
       // String result = str.trim();
       // System.out.println("Result: [" + result + "]"); // please explain
       //  System.out.println(result.length());

       // String str = "JavaJavaJava";
       // System.out.println(str.indexOf("java"));
       // System.out.println(str.toLowerCase().indexOf("java"));

//         String str = "abcdefgh";
//         String subStr1 = str.substring(2, 5);
//         String subStr2 = "cde";
//         System.out.println(subStr1==subStr2); // false , i need this == explained well please
//         System.out.println(subStr1.equals(subStr2)); //true

  //      String str1 = "Java";
  //     String str2 = "Programming";
  //     System.out.println(str1+"" +str2); // JavaProgramming, relevance of "" and +

    }
}
