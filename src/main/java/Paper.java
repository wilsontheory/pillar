public class Paper {

    private String text;

    /** GETTER/SETTER ARE FOR TESTING ONLY **/
    public String getText(){ return this.text; }
    public void setText(String text){ this.text = text; }

    public int lastIndex(){ return text.length() - 1;}

    public Paper() {
        this.text = "";
    }

    public Paper(String initial){
        this.text = initial;
    }

    public void appendChar(char c){
        text = new StringBuilder(text).append(c).toString();
    }

    public int lastIndexOfSubstring(String substring){ //get ending index of last instance of string
        int lastIdx = text.lastIndexOf(substring);
        if (lastIdx == -1 || substring.length() == 0){
            return -1; //return -1 if substring doesn't occur or substring is blank string
        }
        return lastIdx + substring.length() - 1;
    }

    public int eraseAt(int idx){
        StringBuilder sb = new StringBuilder(text);
        int eraserDurabilityCost;
        if (text.charAt(idx) == ' ' || text.charAt(idx) =='\n'){
            eraserDurabilityCost = 0;
        } else {
            eraserDurabilityCost = 1;
        }
        sb.setCharAt(idx, ' ');
        text = sb.toString();
        return eraserDurabilityCost;
    }

    public void writeCharAt(char c, int idx){
        StringBuilder sb = new StringBuilder(text);
        if (text.charAt(idx) != ' ' && text.charAt(idx) != '\n'){
            sb.setCharAt(idx, '@');
        } else {
            sb.setCharAt(idx, c);
        }
        text = sb.toString();
        //TODO: determine what to do when trying to write whitespace on top of an existing non-whitespace char
    }

    public void readContents(){
        System.out.println(text);
    }
}
