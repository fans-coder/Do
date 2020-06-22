import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class fen {
    static class Recruit {
        double english, politics, math, profession, fushi;
        String name;
        private Recruit that;

        public Recruit(String name, double english, double politics, double math, double profession, double fushi) {
            super();
            this.name = name;
            this.english = english;
            this.profession = profession;
            this.politics = politics;
            this.math = math;
            this.fushi = fushi;
        }

        double getFirstScore() {
            return english + politics + math + profession;
        }

        double getTotalScore() {
            return getFirstScore() * 0.6 + fushi * 0.4;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double English = cin.nextDouble(), Politics = cin.nextDouble(), Math = cin.nextDouble(), Profession = cin.nextDouble(), Sum = cin.nextDouble();
        Vector<Recruit> v1 = new Vector();
        while (cin.hasNext()) {
            String name = cin.next();
            double english = cin.nextDouble();
            double politics = cin.nextDouble();
            double math = cin.nextDouble();
            double profession = cin.nextDouble();
            double fushi = cin.nextDouble();
            Recruit recruits = new Recruit(name, english, politics, math, profession, fushi);
            if (recruits.english >= English && recruits.politics >= Politics && recruits.math >= Math && recruits.profession >= Profession && recruits.fushi >= 60 && recruits.getFirstScore() >= Sum)
                v1.add(recruits);
        }
        Collections.sort(v1, new Comparator<Recruit>() {
            @Override
            public int compare(Recruit o1, Recruit o2) {
                Double d1 = o1.getTotalScore();
                Double d2 = o2.getTotalScore();
                return d2.compareTo(d1);
            }
        });
        int m = 1;
        for (Recruit vector : v1) {
            System.out.printf("%s %.0f %.0f %.1f %d\n", vector.name, vector.getFirstScore(), vector.fushi, vector.getTotalScore(), m++);
        }
        cin.close();
    }
}