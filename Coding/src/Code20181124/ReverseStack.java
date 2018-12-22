package Code20181124;
/**
 * 
一个栈依次压入1,2,3,4,5那么从栈顶到栈底分别为5,4,3,2,1。将这个栈转置后，从栈顶到栈底为1,2,3,4,5，也就是实现了栈中元素的逆序，请设计一个算法实现逆序栈的操作，但是只能用递归函数来实现，而不能用另外的数据结构。

给定一个栈Stack以及栈的大小top，请返回逆序后的栈。

测试样例：
[1,2,3,4,5],5
返回：[5,4,3,2,1]
 * @author wangfeng
 *
 */
public class ReverseStack {
    public static int[] reverseStackRecursively(int[] stack, int top) {
    	if(top <= stack.length/2){
    		return stack;
    	}
    	reverseStackRecursively(stack, top-1);
    	int tmp = stack[top-1];
    	stack[top-1] = stack[stack.length - top + 2];
    	stack[stack.length - top + 2] = tmp;
    	return stack;
    }
    public static void main(String[] args) {
		int[] stack ={1, 2, 3, 4, 5};
		int[] result = new int[5];
		
		result = reverseStackRecursively(stack, 5);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
			
		}
	}
}
