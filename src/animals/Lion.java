package animals;

public class Lion extends Animal implements Comparable<Lion>{
    private int maneVolume;
    protected static final int MAX_WEIGHTS = 300;
    protected static final String TYPE = "Lion";


    public Lion(int age, int weight, int countLimbs, int maneVolume) {
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;
    }


    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    @Override
    public String toString() {
        return "Lion: " +
                "maneVolume=" + maneVolume +
                ", age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                " ";
    }

    @Override
    public void feed(int foodWeight) {
        if (weight + foodWeight > MAX_WEIGHTS) {
            weight = MAX_WEIGHTS;
        } else {
            weight = weight + foodWeight;
        }
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
    public int compareTo(Lion o) {
        if(this.age>o.age) return 1;
        else if(this.age<o.age) return -1;
        return 0;
    }
}
