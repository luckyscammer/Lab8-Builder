package work8;

/**
 * The Component interface declares common operations for both simple and complex objects
 * of a composition.
 */
public interface Component {
    /**
     * Performs an operation on the component.
     */
    void operation();

    /**
     * Adds a child component to the composite component.
     *
     * @param component the child component to add
     */
    void add(Component component);

    /**
     * Removes a child component from the composite component.
     *
     * @param component the child component to remove
     */
    void remove(Component component);

    /**
     * Retrieves a child component by index.
     *
     * @param index the index of the child component
     * @return the child component at the specified index
     */
    Component getChild(int index);
}

