public abstract class Transport implements Drawable{

    private String mark;

    public Transport(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}