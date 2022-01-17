public class Command {
    private String command;
    private String argument;

    public Command(String input) {
        this.command = input;
    }

    public void run() {
        System.out.printf(" ");

        if(command.equals("bye")) {
            System.out.println("See you again! :)");
            System.exit(0);
        } else {
            System.out.println(command);
        }
        System.out.println("__________________________________________________________");
        return;
    }
}