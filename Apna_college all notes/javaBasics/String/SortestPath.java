package String;

public class SortestPath {
    public static float findSortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // South
            if (direction == 'S') {
                y--;
            } else if (direction == 'N') {
                y++;

            } else if (direction == 'W') {
                x--;

            } else {
                x++;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findSortestPath(path));
    }

}
