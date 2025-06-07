class Task029 {
    public static void main(String[] args) {
  
        int[] primitiveArray = {10, 20, 30, 40, 50};
        Integer[] wrappedArray = new Integer[primitiveArray.length];   //object  -- original array
        for (int i = 0; i < primitiveArray.length; i++) {
            wrappedArray[i] = primitiveArray[i]; // rapping primitive int to Integer
        }

  
       // Integer[] clonedArray = wrappedArray.clone(); // Shallow copy
        wrappedArray[1] = 200; // Modify original array
        clonedArray[2] = 300; // Modify cloned array

       Integer[] clonedArray = wrappedArray.clone();

        System.out.println("\n" + "Original Array after modif:");
        for (Integer num : wrappedArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nCloned Array:");
        for (Integer num : clonedArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nCloned Array:");
        for (Integer num : clonedArray) {
            System.out.print(num + " ");
        }
    }
}
