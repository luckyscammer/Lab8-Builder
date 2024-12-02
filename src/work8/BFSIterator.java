package work8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The BFSIterator class implements an iterator for traversing the composite
 * structure using breadth-first search (BFS).
 */
public class BFSIterator implements Iterator<Component> {
    /**
     * A queue used to keep track of the traversal path for BFS.
     */
    private Queue<Component> queue = new LinkedList<>();

    /**
     * Constructs a BFSIterator starting from the specified root component.
     *
     * @param root the root component to start traversal
     */
    public BFSIterator(Component root) {
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component current = queue.poll();
        if (current instanceof Composite) {
            List<Component> children = ((Composite) current).getChildren();
            queue.addAll(children);
        }
        return current;
    }
}

