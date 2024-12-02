package work8;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * The DFSIterator class implements an iterator for traversing the composite
 * structure using depth-first search (DFS).
 */
public class DFSIterator implements Iterator<Component> {
    /**
     * A stack used to keep track of the traversal path for DFS.
     */
    private Stack<Component> stack = new Stack<>();

    /**
     * Constructs a DFSIterator starting from the specified root component.
     *
     * @param root the root component to start traversal
     */
    public DFSIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        Component current = stack.pop();
        if (current instanceof Composite) {
            List<Component> children = ((Composite) current).getChildren();
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }
        return current;
    }
}

