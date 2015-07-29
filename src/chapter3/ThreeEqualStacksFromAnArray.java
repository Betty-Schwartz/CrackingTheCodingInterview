package chapter3;

// Describe how you could use a single array to implement three stacks.

public class ThreeEqualStacksFromAnArray {
	
	int stackSize = 100;
	int[] buffer = new int [stackSize * 3];
	int[] stackPointer = {-1, -1, -1}; // pointers to track top element
	
	void push ( int stackNum, int value) throws Exception {
		/* First check for space to add the value */
		if (stackPointer[stackNum]>= stackSize) {
			throw new Exception ("Out of space");
		}
		/* Increment stackPointer and then update top value */
			stackPointer[stackNum]++;
			buffer[absTopOfStack(stackNum)] = value;			
	}
			
	int pop (int stackNum) throws Exception {
		if (stackPointer[stackNum] == -1){
			throw new Exception("Trying to pop an empy stack.");
		}
		int value = buffer[absTopOfStack(stackNum)];
		buffer[absTopOfStack(stackNum)] = 0; //clear index
		stackPointer[stackNum]--;
		return value;
	}
	
	int peek (int stackNum){
		int index = absTopOfStack(stackNum);
		return buffer[index];
	}
	
	boolean isEmpty (int stackNum) {
		return false;
	}
	
	/* returns index of top of stack "stackNum", in absolute terms */
	int absTopOfStack(int stackNum) {
		return stackNum * stackSize + stackPointer[stackNum];		
	}

	/**
	 * @param args
	 */
	public static void main(String [] args){
		ThreeEqualStacksFromAnArray fixedStackSizes = new ThreeEqualStacksFromAnArray();
		try{
			fixedStackSizes.push(2, 4);
			fixedStackSizes.push(0, 3);
			fixedStackSizes.push(0, 7);
			fixedStackSizes.push(0, 5);
			System.out.println(fixedStackSizes.peek(0));
			fixedStackSizes.pop(0);
			System.out.println(fixedStackSizes.peek(0));
			fixedStackSizes.pop(0);
			System.out.println(fixedStackSizes.peek(0));		
		} catch(Exception e ){
			System.out.println("Exception thrown" + e.getMessage());
		}
	}

}
