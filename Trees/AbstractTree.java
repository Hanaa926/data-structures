package Trees;

public abstract class AbstractTree<E> implements Tree<E> {

	public boolean isInternal(Position<E> p) throws IllegalArgumentException {
		return numChildren(p) > 0;
	}

	public boolean isExternal(Position<E> p) throws IllegalArgumentException {
		return numChildren(p) == 0;
	}

	public boolean isRoot(Position<E> p) throws IllegalArgumentException {
		return p == root();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

}
