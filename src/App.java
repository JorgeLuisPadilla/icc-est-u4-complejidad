public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] array = new int[]{1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array);
        //For normal
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        //For each
        for(int i : array){
            System.out.println(i);
        }
    }
}
