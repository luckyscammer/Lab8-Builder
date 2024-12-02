import work8.*;

/**
 * The Main class demonstrates the creation of a composite structure using the Builder pattern
 * and traverses it using both DFS and BFS iterators.
 */
public class Msain {
    /**
     * The main method to run the demonstration.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Component root = new ConcreteCompositeBuilder("Root")
                .addComposite("Branch1")
                .addLeaf("Leaf1")
                .addLeaf("Leaf2")
                .up()
                .addComposite("Branch2")
                .addLeaf("Leaf3")
                .up()
                .addLeaf("Leaf4")
                .build();

        System.out.println("DFS Traversal:");
        DFSIterator dfsIterator = new DFSIterator(root);
        while (dfsIterator.hasNext()) {
            Component component = dfsIterator.next();
            component.operation();
        }

        System.out.println("\nBFS Traversal:");
        BFSIterator bfsIterator = new BFSIterator(root);
        while (bfsIterator.hasNext()) {
            Component component = bfsIterator.next();
            component.operation();
        }
    }
}
