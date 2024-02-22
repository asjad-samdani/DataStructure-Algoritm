package Array;

public class Menu {
    public static int menuCardSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "Banana", "Apple", "Orange", "Lichee", "Pineapple" };
        String key = "Orange";
        int index = menuCardSearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index :" + index);
        }

    }

}
