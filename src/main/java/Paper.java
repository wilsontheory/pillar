public class Paper {

    private String text;

    public String getText(){ //FOR TESTING ONLY
        return this.text;
    }

    public Paper() {
        this.text = "";
    }

    public Paper(String initial){
        this.text = initial;
    }

    public void appendChar(char c){
        text = new StringBuilder(text).append(c).toString();
    }
}
