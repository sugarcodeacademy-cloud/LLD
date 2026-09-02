package DesignPatterns.Flyweight;

public class Client {
    public static void main(String[] args) {
        /*
        I want one million tress
         */
        /*
        Without Fly weight pattern
        Each tree is an object with its own properties x, y, color, texture, size

        Problem:
        Even though color texture size are same for all trees
         */
//        Tree tree1 = new Tree(100, 150, "green", "oak", "medium");
//        Tree tree2 = new Tree(130, 180, "green", "oak", "medium");
//        Tree tree3 = new Tree(200, 220, "green", "oak", "medium");
//        Tree tree4 = new Tree(240, 300, "green", "oak", "medium");
//        Tree tree5 = new Tree(300, 350, "green", "oak", "medium");
//        Tree tree6 = new Tree(380, 150, "green", "oak", "medium");

         /*
        With Fly weight pattern
        Each tree is an object with its own properties x, y, TreeType

        Problem:
        Even though color texture size are same for all trees
         */
        TreeType oakTree = TreeTypeFactory.getTreeType(TreeTypes.OAK);

        Tree okaTree1 = new Tree(100, 150, oakTree);
        Tree okaTree2 = new Tree(150, 200, oakTree);
        Tree okaTree3 = new Tree(200, 150, oakTree);
        Tree okaTree4 = new Tree(300, 250, oakTree);


    }
}
