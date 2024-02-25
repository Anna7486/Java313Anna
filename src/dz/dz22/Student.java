package dz.dz22;

public class Student {
    private String name;
    private String group;
    private double averageScore;

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(String name, String group, double averageScore) {
        this.name = name;
        this.group = group;
        this.averageScore = averageScore;
    }

    public double getScholarship() {
        if (averageScore == 6) {
            return 1000.0;
        } else {
            return 800.0;
        }
    }

    public String toString() {
        return name + ", группа " + group + ", сумма стипендии: " + getScholarship();
    }
}
