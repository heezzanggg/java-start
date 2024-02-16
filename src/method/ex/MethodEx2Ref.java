package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("hello",3);
    }

    static void printMessage(String msg, int times){
        for(int i = 0; i<times;i++){
            System.out.println(msg);
        }
    }
}
