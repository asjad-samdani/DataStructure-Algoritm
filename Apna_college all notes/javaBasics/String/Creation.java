package String;
public class Creation {
    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd', 'e' };
        // String str = "Asjad";
        // String str2 = new String("xyz");
        // System.out.println(arr);
        // System.out.println(str);
        // System.out.println(str2);

        // input by user

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // // Concatenation

        String fname = "Asjad";
        String lname = "Samdani";
        String fullname = fname + lname;


        printLatters(fullname);

        // System.out.println(fullname + " ");

        // find Allchar

    }

    public static void printLatters(String fullname) {
        for (int i = 0; i < fullname.charAt(0); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }

    }

}
