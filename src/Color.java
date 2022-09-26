public enum Color {
    RED('1'), YELLOW('2'), NULL;

    private final char code;

     Color(char code){
        this.code= code;
    }
     Color(){
        this.code= 0;
    }

    public char getCode(){
        return code;
    }
}
