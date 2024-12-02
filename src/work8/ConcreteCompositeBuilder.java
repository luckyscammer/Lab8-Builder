package work8;

import java.util.Stack;

/**
 * The ConcreteBuilder class implements the Builder interface to construct
 * a composite structure step by step.
 */
public class ConcreteCompositeBuilder implements CompositeBuilder {
    /**
     * A stack used to keep track of the current composite during the building process.
     * Allows for nesting of composite components by maintaining the current context.
     */
    private Stack<Composite> compositeStack = new Stack<>();

    /**
     * The root component of the composite structure.
     * This serves as the entry point for the entire composition hierarchy.
     */
    private Component root;

    /**
     * Starts building a composite structure with the specified root name.
     *
     * @param rootName the name of the root composite
     */
    public ConcreteCompositeBuilder(String rootName) {
        Composite rootComposite = new Composite(rootName);
        this.root = rootComposite;
        compositeStack.push(rootComposite);
    }

    @Override
    public Component build() {
        return root;
    }

    @Override
    public CompositeBuilder addLeaf(String name) {
        Leaf leaf = new Leaf(name);
        compositeStack.peek().add(leaf);
        return this;
    }

    @Override
    public CompositeBuilder addComposite(String name) {
        Composite composite = new Composite(name);
        compositeStack.peek().add(composite);
        compositeStack.push(composite);
        return this;
    }

    @Override
    public CompositeBuilder up() {
        if (compositeStack.size() > 1) {
            compositeStack.pop();
        }
        return this;
    }
}

