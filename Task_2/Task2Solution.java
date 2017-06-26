package HomeWork_170624.Task_2;


public class Task2Solution {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(Division.modulu(9,2),1));
        System.out.println(SimpleUnit.assertEquals(Division.modulu(8,2),0));
        System.out.println(SimpleUnit.assertEquals(Division.modulu(5,10),0));
        System.out.println(SimpleUnit.assertEquals(Division.modulu(0,10),0));

        System.out.println(SimpleUnit.assertNotEquals(Division.modulu(10,5),1));
        System.out.println(SimpleUnit.assertNotEquals(Division.modulu(9,5),0));







    }
}
