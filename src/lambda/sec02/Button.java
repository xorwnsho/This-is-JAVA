package lambda.sec02;

public class Button {
    @FunctionalInterface
    public static interface ClickListener{
        // 추상 메서드
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
