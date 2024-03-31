import java.util.*;

public class HelloWorld {

    private static void swap(Integer[] nums, int j, int k) {
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }

    private static void swapObject(ArrayList<Student> students, int j, int k) {
        Student temp = students.get(j);
        students.set(j, students.get(k));
        students.set(k, temp);
    }

    public static void insertionSort(Integer[] numbers) {
        int i;
        int j;

        for (i = 1; i < numbers.length; ++i) {
            j = i;
            // Insert numbers[i] into sorted part,
            // stopping once numbers[i] is in correct position

            while (j > 0 && numbers[j] < numbers[j - 1]) {
                // Swap numbers[j] and numbers[j - 1]
                swap(numbers, j, j  - 1);
//                swap++;
//                compare++;
                --j;
            }
//            if (j - 1 >= 0 && numbers[j] > numbers[i]) {
//                compare++;
//            }

        }
//        System.out.println("swap " + swap);
//        System.out.println("compare " + compare);
//        System.out.println(Arrays.toString(numbers));
    }

    public static void insertionSortObj(ArrayList<Student> numbers) {
        int i;
        int j;

        for (i = 1; i < numbers.size(); ++i) {
            j = i;
            // Insert numbers[i] into sorted part,
            // stopping once numbers[i] is in correct position

            while (j > 0 && numbers.get(j).getName().compareTo( numbers.get(j - 1).getName()) < 0) {
                // Swap numbers[j] and numbers[j - 1]
                swapObject(numbers, j, j  - 1);
//                swap++;
//                compare++;
                --j;
            }
//            if (j - 1 >= 0 && numbers[j] > numbers[i]) {
//                compare++;
//            }

        }
//        System.out.println("swap " + swap);
//        System.out.println("compare " + compare);
//        System.out.println(Arrays.toString(numbers));
    }

    public static void merge(Integer[] numbers, int i, int j, int k) {
        int mergedSize = k - i + 1;       // Size of merged partition
        int mergedNumbers[] = new int[mergedSize]; // Temporary array for merged numbers
        int mergePos;                     // Position to insert merged number
        int leftPos;                      // Position of elements in left partition
        int rightPos;                     // Position of elements in right partition

        mergePos = 0;
        leftPos = i;                      // Initialize left partition position
        rightPos = j + 1;                 // Initialize right partition position

        // Add smallest element from left or right partition to merged numbers
          while (leftPos <= j && rightPos <= k) {
            if (numbers[leftPos] < numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                ++leftPos;
            }
            else {
                mergedNumbers[mergePos] = numbers[rightPos];
                ++rightPos;
            }
            ++mergePos;
        }

        // If left partition is not empty, add remaining elements to merged numbers
          while (leftPos <= j) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
            ++mergePos;
        }

        // If right partition is not empty, add remaining elements to merged numbers
          while (rightPos <= k) {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
            ++mergePos;
        }

        // Copy merge number back to numbers
          for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
            numbers[i + mergePos] = mergedNumbers[mergePos];
        }
    }

    public static void mergeSort(Integer[] numbers, int i, int k) {
        int j;

        if (i < k) {
            j = (i + k) / 2;  // Find the midpoint in the partition

            // Recursively sort left and right partitions
            mergeSort(numbers, i, j);
            mergeSort(numbers, j + 1, k);

            // Merge left and right partition in sorted order
            merge(numbers, i, j, k);
        }
    }

    public static void sortDemo() {
        Integer[] numbers = new Integer[10_000_000];

        for (int i = 9_999_999; i >= 0; i--) {
            numbers[i] = i;
        }

        ArrayList<Integer> numArray = new ArrayList<Integer>(List.of(numbers));

        long currentTime = System.currentTimeMillis();
        insertionSort(numbers);
//        mergeSort(numbers, 0, numbers.length - 1);
//        Collections.sort(numArray);
        currentTime = System.currentTimeMillis() - currentTime;

        System.out.println("Sorting Time " + currentTime + " ms");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        for (int i = numbers.length - 11; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static ArrayList<Student> generateStudentList() {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(
                new Student("Hoa", "F", 20)
        );
        studentList.add(new Student("Minh", "M", 19) );
        studentList.add(new Student("Mai",  "F", 18) );
        studentList.add(new Student("Cung", "M", 21) );
        studentList.add(new Student("Minamoto", "M", 22) );

        return studentList;
    }

    public static int compareStudent(Student student1, Student student2) {
        return -student1.getName().compareTo(student2.getName());
    }

    public static ArrayList<Student> searchStudent(ArrayList<Student> students, int minAge) {

        ArrayList<Student> foundStudent = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getAge() > 19) {
                foundStudent.add(student);
            }
        }
        return foundStudent;

    }

    public static void sortObjDemo() {
        ArrayList<Student> students = new ArrayList<Student>();

        students = generateStudentList();

        // Sort objects by String
        long timeNow = System.nanoTime();
        insertionSortObj(students);
//        students.sort(
//                (student1, student2) -> compareStudent(student1, student2)
//        );
        System.out.println("Sorting time " + (System.nanoTime() - timeNow) + " ns");

        for (Student student : students) {
            System.out.printf("%s %d\n", student.getName(), student.getAge());
        }
    }
    public static void main(String[] args) {
        Pet myDog = new Dog("Pin", 1, 4);
        Dog dog = new Dog("Poll", 12, 4);
        Fish yellowFish = new Fish("Bin", 2, 2);

        dog.move();
        yellowFish.move();
    }

}
