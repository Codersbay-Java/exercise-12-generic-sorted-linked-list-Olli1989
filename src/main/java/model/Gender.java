package model;

public class Gender implements Comparable<Gender>{
    private boolean isMale;

    public Gender(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public int compareTo(Gender o) {
        return Boolean.compare(isMale(),o.isMale());
    }

    @Override
    public String toString() {
        return  Boolean.toString(isMale());
    }
}
