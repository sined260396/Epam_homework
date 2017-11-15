package firstTask;

public class FirstTask {
    public static void main(String args[]){
        int[] array = {1, 2, 3, 4 ,5 ,6 ,7 , 8, 9, 10};
        findMin(array);
        double[] arrayDouble = {1.11, 5.44, 5.123, 97.323, 43.33};
        findMax(arrayDouble);
        findMiddleInt(array);
        findMiddleDouble(arrayDouble);
    }

    public static void findMin(int array[]){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min ){
                min = array[i];
            }
        }
        System.out.println("MIN: " + min);
    }

    public static void findMax(double array[]){
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("MAX: " + max);
    }

    public static void findMiddleDouble(double array[]){
        double middle = array[0];
        for(int i = 0; i < array.length; i++){
            middle = middle + array[i];
        }
        middle = middle / array.length;
        System.out.println("Middle double: " + middle);
    }

    public static void findMiddleInt(int array[]){
        int middle = array[0];
        for(int i = 0; i < array.length; i++){
            middle = middle + array[i];
        }
        middle = middle / array.length;
        System.out.println("Middle int: " + middle);
    }
}
