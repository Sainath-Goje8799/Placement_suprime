import java.util.Arrays;

public class MethodsofString
{
    public static void main(String[] args)
    {
        String myName = "Sainath";
        String myName2 = "Goje";

        //charAt();
        System.out.println("Character of staing at index 0 is "+myName.charAt(0));

        //length();
        System.out.println("Length of string is "+myName.length());

        myName = myName + "Linguram";

        System.out.println("My name after updating is "+myName);
        System.out.println("My surname is "+myName2);


        //split();
        String sentence = new String("I live in Nanded");  
        String[] s1 = sentence.split(" ");      //splits the string
        System.out.println(Arrays.toString(s1));


        //toCharArray()
        char[] s2 = myName.toCharArray();                       //Returns each character in array form
        System.out.println(Arrays.toString(s2));

        //isEmpty()
        boolean empty = myName.isEmpty();
        System.out.println(empty);

        //concat()
        String s5 = myName.concat(" Goje");
        System.out.println(s5);

        //contains()
        System.out.println(myName.contains("in"));

        //indexOf()
        System.out.println(myName.indexOf("na"));
    }
}
