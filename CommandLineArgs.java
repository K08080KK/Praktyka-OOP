
public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Передані аргументи:");
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}

