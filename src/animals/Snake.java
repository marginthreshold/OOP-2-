package animals;

import terminal.command.Command;

public class Snake extends Animal implements Comparable<Snake> {
    private int bodyLength;
    protected static final int MAX_WEIGHTS = 10;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLength) {
        super(age, weight, countLimbs);
        this.bodyLength = bodyLength;
    }
    public Snake(Command command){
        super(command.getCommandParameters().get(3), command.getCommandParameters().get(4),
                command.getCommandParameters().get(5));
        this.bodyLength = command.getCommandParameters().get(2);
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return "Snake:" +
                "bodyLength=" + bodyLength +
                ", age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs;
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
