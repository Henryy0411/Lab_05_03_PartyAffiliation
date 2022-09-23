public class PartyAffiliation {
    public static void main(String[] args) {
        String party ="P";

        if( party.equals("P")){
            System.out.println("You got Person");
        }else if ( party.equals("D")){
            System.out.println("You got Donkey");
        }else if ( party.equals("I")){
            System.out.println("You got Elephant");
        }else{
            System.out.println(" You didn't type in valid party");
        }
    }
}
