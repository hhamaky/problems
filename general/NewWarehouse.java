package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewWarehouse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<location> locations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            location l = new location();
            int coordinateX = sc.nextInt();
            l.setX(coordinateX);
            int coordinateY = sc.nextInt();
            l.setY(coordinateY);
            l.setLocation();
            locations.add(l);
        }

        Collections.sort(locations);
        int truckCapacity = sc.nextInt();

        for (int i = 0; i < truckCapacity; i++) {
            System.out.print("[" + "[" + locations.get(i).getX() + "]" + "," + "[" + locations.get(i).getY() + "]" + "]");
        }
    }

    static class location implements Comparable<location> {
        int x;
        int y;
        double location;

        public int compareTo(location other) {
            if (this.getLocation() > other.getLocation())
                return 0;
            else if (this.getLocation() == other.getLocation())
                return 1;
            return -1;
        }

        void setLocation() {
            location = Math.sqrt(x) + Math.sqrt(y);
        }

        public double getLocation() {
            return location;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
