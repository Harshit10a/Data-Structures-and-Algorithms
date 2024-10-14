public class Shortest_path {
    public static float getpath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            //south
            if (dir == 'S') {
                y--;
            }
            else  if (dir == 'N') {
                y++;
            }
            else  if (dir == 'E') {
                x++;
            }
            else
                x--;
        }
        int Xsqr=x*x;
        int Ysqr=y*y;
        return (float)Math.sqrt(Xsqr+Ysqr);
    }

    public static void main(String[] args) {
String path ="WNEENESENNN";
        System.out.println(getpath(path));
    }
}
