public class Solution {
	int[] arr;
	static int counter;
	int top;

	/** initialize your data structure here. */
	public Solution() {
		arr = new int[9999];
		counter = 0;
		top = arr.length - 1;
	}

//	push(x) -- Push element x onto stack.
	public void push(int x) {
		arr[counter] = x;
		counter++;
	}

//	pop() -- Removes the element on top of the stack.
	public void pop() {
		counter--;
	}

//	top() -- Get the top element.
	public int top() {
		return arr[counter - 1];
	}

//	getMin() -- Retrieve the minimum element in the stack.
	public int getMin() {
		int min = arr[counter - 1];
		int i = counter - 1;

		while (i >= 0) {
			if (arr[i] < min) {
				min = arr[i];
			}
			i--;
		}
		return min;
	}

	public void loopThrough() {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Your MinStack object will be instantiated and called as such: MinStack obj =
		 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
		 * = obj.getMin();
		 */

		Solution minStack = new Solution();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.loopThrough();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());

	}

}
