package exercise.ch6.test;

public class Marine {

    int x=0, y=0; // Marine의 위치좌표(x,y) int hp = 60; // 현재 체력
    public static int weapon = 6; // 공격력
    public static int armor = 0; // 방어력

    public static void weaponUp() {
        weapon++;
    }

    public static void armorUp() {
        armor++;
    }

    void move(int x, int y) { this.x = x;
        this.y = y;
    }
}
