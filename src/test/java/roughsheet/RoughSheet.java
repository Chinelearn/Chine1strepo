package roughsheet;

public class RoughSheet {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i = i+1)
//        {
//            for (int j = 0; j < 10; j = j+1)
//            {
//                System.out.println(i+"*"+j+ "=" +(i*j));
//            }
//        }

//       String s2 = "HelloWorld";
//  //      String s = (s2.length()%2==0) ? s2.substring(0,s2.length()/2) : s2;
//        String s = s2.substring(0,5);
//        System.out.println(s);

        String browser = "Chrome";

        switch (browser) {
            case "CHROME":
                System.out.println("Using Chrome Browser in my laptop");
                break;

            case "FIREFOX":
                System.out.println("Using Firefox Browser in my laptop");
                break;
            case "EDGE":
                System.out.println("Using Edge Browser in my laptop");
                break;
            default:
                System.out.println("Neither of the Browsers are installed on my laptop");

        }
    }
}