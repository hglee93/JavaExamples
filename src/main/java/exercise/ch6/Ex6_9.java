package exercise.ch6;

import exercise.ch6.test.Marine;

import java.util.ArrayList;
import java.util.List;

public class Ex6_9 {
    public static void main(String[] args) {
        List<Marine> marineList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Marine m1 = new Marine();
            marineList.add(m1);
        }

        Marine.weaponUp();
        Marine.armorUp();

        for(int i = 0; i < 10; i++) {
            System.out.println(marineList.get(i).weapon + ", " + marineList.get(i).armor);
        }
    }
}
