package task4_3.task03;

public final class Range {
    private final double min;
    private final double max;

    public Range(double min, double max) {
        if (min <= max){
            this.min = min;
            this.max = max;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getLength() {
        return max - min;
    }

    public boolean contains(double number) {
        if (max >= number && number >= min){
            return true;
        }

        return false;
    }

    public boolean overlaps(Range range) {
        if (this.min <= range.max && range.min <= this.max) {
            return true;
        }

        return false;
    }

    public Range intersection(Range range) {
        if (this.min <= range.max && range.min <= this.max) {
            return new Range(Math.max(this.min, range.min), Math.min(this.max, range.max));
        }

        return null;
    }

    public Range union(Range range) {
        if (this.min <= range.max && range.min <= this.max) {
            return new Range(Math.min(this.min, range.min), Math.max(this.max, range.max));
        }

        return null;
    }

    @Override
    public String toString() {
        return "[" + this.min + "; " + this.max + "]";
    }

    public static void main(String[] args) {
        Range range1 = new Range(5, 10);
        Range range2 = new Range(3, 15);

        System.out.println(range1);
        System.out.println(range2);

        Range range3 = range1.intersection(range2);

        System.out.println(range3.toString());
    }
}
