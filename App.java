import java.util.Random;
public class App {
    public static void main(String[] args){
        System.out.println("Discando...");
        do{
            System.out.println(tocando());
        }while(tocando());
        System.out.println("Hello!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        return atendeu;
    }
}
