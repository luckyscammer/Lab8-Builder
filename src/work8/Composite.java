package work8;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite class represents complex components that may have children.
 * It implements methods to manipulate its children.
 */
public class Composite implements Component {
    /**
     * The name of the composite component.
     */
    private String name;

    /**
     * The list of child components in the composite.
     */
    private List<Component> children = new ArrayList<>();

    /**
     * Constructs a Composite object with the given name.
     *
     * @param name the name of the composite
     */
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Operation performed on Composite: " + name);
        for (Component child : children) {
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
        System.out.println("Added component to " + name);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
        System.out.println("Removed component from " + name);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    /**
     * Retrieves the list of child components.
     *
     * @return the list of child components
     */
    public List<Component> getChildren() {
        return children;
    }
}

