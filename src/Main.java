public class Main {
    public static void main(String[] args)
    {
        String partyaffiliation = "D = democrat R = republican I = Independent O =other";
        String party = "O";

        if ( party.equals("D")){
            System.out.println(" You get a Democratic Donkey");
        }
        if ( party.equals("R")){
            System.out.println(" You get a Republican Elephant");
        }
        if ( party.equals("I")){
            System.out.println(" You get a Independent Person");
        }
        if ( party.equals("O")){
            System.out.println(" You get a other");
        }
    }
}