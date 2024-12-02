package work8;

/**
 * The Builder interface declares methods for creating components of a composite structure.
 */
public interface CompositeBuilder {
    /**
     * Builds and returns the composite structure.
     *
     * @return the root component of the composite structure
     */
    Component build();

    /**
     * Adds a leaf component with the specified name.
     *
     * @param name the name of the leaf component
     * @return the builder instance
     */
    CompositeBuilder addLeaf(String name);

    /**
     * Adds a composite component with the specified name.
     *
     * @param name the name of the composite component
     * @return the builder instance
     */
    CompositeBuilder addComposite(String name);

    /**
     * Moves up to the parent component in the composite structure.
     *
     * @return the builder instance
     */
    CompositeBuilder up();
}

