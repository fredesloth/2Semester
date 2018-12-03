package opgave1;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T>{

	private final static int DEFAULT_CAPACITY = 100; 
	private T[] stack;
	private int top;
	
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int initialCapacity) {
		top = 0;
		stack = (T[])(new Object[initialCapacity]);
	}

	@Override
	public void push(T element) {
		if(top == stack.length) {
			expandCapacity();
		}
		stack[top] = element;
		top++;
	}
	
	private void expandCapacity() {
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T retVal = stack[top -1];
		stack[top] = null;
		top--;
		return retVal;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top -1];
	}

	@Override
	public boolean isEmpty() {
		return (top == 0);
	}

	@Override
	public int size() {
		return top; 
	}

}