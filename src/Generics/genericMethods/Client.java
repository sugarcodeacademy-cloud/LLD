package Generics.genericMethods;

public class Client {

    public static void main(String[] args) {

       String[] names = {"Priya", "Mani","Alok"};
        Integer[] scores = {96, 76, 89};
//       Utility<String> utility= new Utility<>();
//       utility.printArray(names);

        Utility.printArray(names); //T is a string type
        Utility.printArray(scores); //T is a Integer type

        String firstName = Utility.getFirst(names);

    }


}
