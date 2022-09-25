public enum Color {
    RED('1'), YELLOW('2');

    private char graphicRepresentation;

    private Color(char graphicRepresentation){
        this.graphicRepresentation= graphicRepresentation;
    }

    public char getGraphicRepresentation(){
        return graphicRepresentation;
    }
}
