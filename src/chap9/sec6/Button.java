package chap9.sec6;

public class Button {
    public static interface ClickListener {
        // 추상 메서드
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
    public void click(){
        this.clickListener.onClick();
    }
}
