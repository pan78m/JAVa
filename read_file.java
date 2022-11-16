
package File_Handling;

 
 
 class readFile {
    public static void main(String[] args) {
        System.out.println("Here We are use File Handling!!!");
        String str = "One Apple";
        String str2, str3;
        str3 = str.toLowerCase();
        System.out.println(str);
        str2 = str.toUpperCase();
        System.out.println("Str2 :" + str2);
        System.out.println("Str3 :" + str3);
        System.out.println(str.equals(str3));
        //
        System.out.println(str.equalsIgnoreCase(str3));
        //
        System.out.println(str.replace("One", "three"));
        //Length is ??
        System.out.println(str.length());
        //to compare??
        int v = str.compareTo(str2);
        System.out.println(v);
        //concatenate??
        System.out.println(str.concat(str3));
        //
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf(str3));
        System.out.println();
        
    }
}