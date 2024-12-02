package work8;

/**
 * The Leaf class represents end objects of a composition. A leaf cannot have any children.
 */
public class Leaf implements Component {
    /**
     * The name of the leaf.
     */
    private String name;

    /**
     * Constructs a Leaf object with the given name.
     *
     * @param name the name of the leaf
     */
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Operation performed on Leaf: " + name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Leaf nodes cannot add components.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Leaf nodes cannot remove components.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Leaf nodes do not have children.");
    }
}

