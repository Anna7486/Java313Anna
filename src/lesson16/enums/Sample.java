package lesson16.enums;

public class Sample {
    public enum Length{
        KM("километр", 1000), M("метр", 1), DM("дециметр", 0.1), CM("сантиметр", 0.01), MM("меллиметр", 0.001);
        String name;
        double d;

        Length(String name, double d) {
            this.name = name;
            this.d = d;
        }

        @Override
        public String toString() {
            return name;
        }

        double coefficient(Length inp){
            return this.d / inp.d;
        }
    }

    public static void main(String[] args) {
        for (Length l1: Length.values()){
            for (Length l2: Length.values()) {
                if (l1 != l2) {
                    System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " + l2);
                }
            }
            System.out.println();
        }
    }
}
