public class MountainArray {

    public static void main(String[] args) {
        int mountainArr[] = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        MountainArray mountainArray = new MountainArray();
        System.out.println(mountainArray.Search(mountainArr, target));
    }

    // Make Search method static or move to a non-static method as needed
    public int Search(int[] mountainArr, int target) {
        int peak = peakIndexMountainArray(mountainArr);
        int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    public int peakIndexMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(int[] mountainArr, int target, int start, int end) {
        // Find whether it's sorted in ascending or descending order
        boolean isAsc = mountainArr[start] < mountainArr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the target is found, return the index
            if (mountainArr[mid] == target) {
                return mid;
            }

            // If the array is sorted in ascending order
            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is sorted in descending order
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
