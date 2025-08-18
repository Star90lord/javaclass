class ArrayExample {
    int[] arr;
    
    public ArrayExample(int[] inputArray){
        arr = inputArray;   
    }
    
    public void displayArray(){
        System.out.println("Array elements: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");  
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        
        ArrayExample obj = new ArrayExample(numbers);
        obj.displayArray();
    }
}
