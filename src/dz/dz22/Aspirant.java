package dz.dz22;

public class Aspirant extends Student {
    private String researchTopic;

    public Aspirant(String name, String group, double averageScore, String researchTopic) {
        super(name, group, averageScore);
        this.researchTopic = researchTopic;
    }

    @Override
    public double getScholarship() {
        if (getAverageScore() == 5) {
            return 2000.0;
        } else {
            return 1800.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", тема работы: '" + researchTopic + "'";
    }
}
