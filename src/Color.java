public enum Color {
    RED('1'), YELLOW('2'), NULL;

    private char code;

    private Color(char code){
        this.code= code;
    }
    private Color(){
        this.code= 0;
    }

    public char getCode(){
        return code;
    }
}
