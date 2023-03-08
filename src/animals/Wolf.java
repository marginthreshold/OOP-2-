package animals;

import terminal.command.Command;

public class Wolf extends Animal implements Comparable<Wolf> {
    private int angry;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public Wolf(int age, int weight, int countLimbs, int angry) {
        super(age, weight, countLimbs);
        this.angry = angry;
    }
    public Wolf(Command command){
        super(command.getCommandParameters().get(3), command.getCommandParameters().get(4),
                command.getCommandParameters().get(5));
        this.angry = command.getCommandParameters().get(2);
    }

    public void setAngry(int angry) {
        this.angry = angry;
    }

    @Override
    public String toString() {
        return "Wolf: " +
                "angry=" + angry +
                ", age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                " ";
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int compareTo(Wolf o) {
        if (this.age > o.age || (this.age == o.age && this.weight > o.weight)) {
            return 1;
        } else if (this.age < o.age || (this.age == o.age && this.weight < o.weight)) {
            return -1;
        }
        return 0;
    }

    public int getAngry() {
        return angry;
    }
}
