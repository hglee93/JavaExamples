package exercise.ch6;

public class Ex6_1 {

    public static void main(String[] args) {

    }
    class SutdaCart {

        private int num;

        private boolean isKwang;

        public int getNum() {
            return num;
        }

        public void setNum(int number) {

            if(number < 1 || number > 10) { return; }

            this.num = num;

        }

        public boolean isKwang() {
            return isKwang;
        }

        public void setKwang(boolean kwang) {
            isKwang = kwang;
        }
    }
}
