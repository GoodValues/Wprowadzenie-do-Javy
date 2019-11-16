package generics;

public class Backpack<T1, T2, T3, T4> {
    private T1 val1;
    private T2 val2;
    private T3 val3;
    private T4 val4;

    public T1 getVal1() {
        return val1;
    }

    public void setVal1(T1 val1) {
        this.val1 = val1;
    }

    public T2 getVal2() {
        return val2;
    }

    public void setVal2(T2 val2) {
        this.val2 = val2;
    }

    public T3 getVal3() {
        return val3;
    }

    public void setVal3(T3 val3) {
        this.val3 = val3;
    }

    public T4 getVal4() {
        return val4;
    }

    public void setVal4(T4 val4) {
        this.val4 = val4;
    }
}
