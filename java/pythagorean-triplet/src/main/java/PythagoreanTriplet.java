import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static TripletBuilder makeTripletsList() {
        return new TripletBuilder();
    }

    public static class TripletBuilder {
        private int sum = 0;
        private int maxFactor = 0;

        private TripletBuilder() {
        }

        public TripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            if(this.maxFactor == 0){
                this.maxFactor = sum;
            }
            return this;
        }

        public TripletBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            if(this.sum == 0){
                this.sum = maxFactor;
            }
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();

            for (int a = 1; a < maxFactor; a++) {
                for (int b = a + 1; b < maxFactor; b++) {
                    int c = (int) Math.sqrt(a * a + b * b);
                    if (c * c == a * a + b * b && a + b + c == sum && c <= maxFactor) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }

            return triplets;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        return a == other.a && b == other.b && c == other.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}
