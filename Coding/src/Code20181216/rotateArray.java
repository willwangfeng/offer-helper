package Code20181216;

/**
 * 
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 * 解法还有问题！
 * @author wangfeng
 *
 */
public class rotateArray {
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0 || array == null) {
			return 0;
		}
		if (array.length == 1) {
			return array[0];
		}

		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while (low < high) {

			mid = low + (high - low) / 2;
			if (high - low == 1) {
				mid = high;
				break;
			}
			if (array[low] > array[mid]) {
				high = mid;
			} else if (array[low] < array[mid]) {
				low = mid;
			} else {
				high = high - 1;
			}
		}
		return array[mid];
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 2, 3,4 };
		System.out.println(minNumberInRotateArray(a));
	}
}
