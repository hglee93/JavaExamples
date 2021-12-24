package exercise.ch6;

import java.util.StringJoiner;

public class Ex6_3 {
}

class Student {

    private String name;

    private int ban;

    private int no;

    private int kor;

    private int eng;

    private int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        StringJoiner sj = new StringJoiner(",");
        sj.add(name);
        sj.add(String.valueOf(ban));
        sj.add(String.valueOf(no));
        sj.add(String.valueOf(kor));
        sj.add(String.valueOf(eng));
        sj.add(String.valueOf(math));
        return sj.toString();
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        //return Math.round((getTotal() / 3.0d * 100) / 100);
        return Math.round(getTotal() / 3.0d * 10) / 10.0d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}


