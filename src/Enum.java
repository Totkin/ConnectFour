public class Enum {
    enum Season{
        nullColor(0), RED(1), YELLOW(2);

        private int value;
       private Season(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }
  }