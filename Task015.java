public class Task015 {
    public static void main (String[] args){
        String str1= "Java strings";  //string literal   heap - str1
        String str11= "Java strings";
        String str111= "Java strings";

        String str2= new String(str1);  //object of String class made using new keyword  heap str2
        String str6=new String(str1);

        String str5 = str1;
        String str3= new String ("are easy to learn");
        char ch[]= {'s', 't', 'r', 'n', 'g'};
        String str4=new String(ch);
        System.out.println(str1 + "\n" + str2 +"\n" + str3 + "\n" +str4);
        if(str1.equals(str2))  //values comparions
            System.out.println("true");
            else
            System.out.println("false");
     
            if(str1 == str2)  //checks for references
            System.out.println("str 2 comparsion with str1 via ==: true");
            else
            System.out.println("str 2 comparsion with str1 via ==: false");

            if(str5 == str1)  //checks for references
            System.out.println("str 5 comparsion with str1 via ==: true");
            else
            System.out.println("str 5 comparsion with str1 via ==: false");
            if(str6 == str2)  //checks for references
            System.out.println("str 6 comparsion with str2 via ==: true");
            else
            System.out.println("str 6 comparsion with str2 via ==: false");
            if(str1.equals(str2) && str1.equals(str6))  //values comparions
            System.out.println("true");

            System.out.println("final test");
            System.out.println(str1==str11);
}   
}

