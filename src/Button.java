public class Button {
    private OnClickListener onClickListener;
    private String title;

    public Button(String title) {
        this.title = title;
    }

    public boolean isOnClickListenerSet() {
        if(onClickListener == null) {
            return false;
        } else {
            return true;
        }
    }

    public void onClick() {
        onClickListener.onClick(title);
    }

    public void setOnClickListener(OnClickListener listener) {
        onClickListener = listener;
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
