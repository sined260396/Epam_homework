package stringBuilder;

import java.nio.charset.Charset;

public class Main {
    public static void main(String args[]){
        String str = "Java - строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle";

        System.out.println("1) lenght: " + str.length());
        System.out.println("2) equals str and str: " + str.equals(str));
        String string = new String("Sun Microsystems"); // intern что бы не создавал новый объект
        System.out.println("3) new string: " + string);
        String newString = str + string;
        System.out.println("4) new object: " + newString);
        String newestString = newString;
        newestString = newestString.concat(" ");
        System.out.println("5) without new object: " + newestString);

        char[] chars = str.toCharArray();

        System.out.println("6) Array of char[]: " + chars + " or :");
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
            if(i == chars.length - 1){
                System.out.println();
            }
        }

        System.out.print("7) Arrays to byte[]: ");
        byte[] strBytes = str.getBytes();
        int charCode;
        for(byte b : strBytes){
            charCode = b;
            if (charCode < 0) {
                charCode = b + 256;
            }
            System.out.print(charCode + " ");
        }
        System.out.println();
        System.out.println("8) To upperCase: " + newString.toUpperCase());
        System.out.println("9) Index first 'a' in text: " + newString.indexOf("а"));
        System.out.println("10) Index last 'a' in text: " + newString.lastIndexOf("а"));
        System.out.println("11) Have got 'Sun': " + newString.contains("Sun"));  //выводит индекс, а надо true или false
        System.out.println("12) End of 'Oracle': " + str.endsWith("Oracle"));
        System.out.println("13) Start of 'Java': " + str.startsWith("Java"));
        System.out.println("14) 'a' on 'o': " + str.replace("а", "о"));
        System.out.println("15) at 44 to 90: " + str.substring(44, 90));
        String[] splitedString = str.split(" ");
        System.out.println("16) " );
        for (String editedString : splitedString){
            System.out.println(editedString);
        }
        StringBuilder stringBuilder = new StringBuilder(str);  //17
        stringBuilder.append(". "); //18
        stringBuilder.delete(str.indexOf(", разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle"), str.length()); //19
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse()); //20
    }
}
