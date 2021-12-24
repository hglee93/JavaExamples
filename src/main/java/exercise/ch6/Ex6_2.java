package exercise.ch6;

public class Ex6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {

    private int num;

    private boolean isKwang;

    public SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    public SutdaCard(int num, boolean isKwang) {

        if(!isValidNum(num)) {
            this.num = 1;
            this.isKwang = true;
            return;
        }

        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return String.valueOf(this.num) + (this.isKwang ? "K" : "");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int number) {

        if(!isValidNum(num)) { return; }

        this.num = num;

    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
    }

    private boolean isValidNum(int num) {
        if(num < 1 || num > 10) { return false; }
        return true;
    }
}




