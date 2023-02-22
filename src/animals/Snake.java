package animals;

public class Snake extends Animal implements Comparable<Snake> {
    private int bodyLength;
    protected static final int MAX_WEIGHTS = 10;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLength) {
        super(age, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }


    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHTS;
    }


    @Override
    public int compareTo(Snake o) {
        if (this.bodyLength > o.bodyLength) return 1;
        else if (this.bodyLength < o.bodyLength) return -1;
        return 0;
    }
}
