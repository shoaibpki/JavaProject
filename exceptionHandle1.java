package dataTypes;

public class exceptionHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[3];//
        try //used to keep statements which can cause the exception
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) //it is to take care of the exception that is noticed in the try block
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }

	}

}
