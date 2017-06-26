package HomeWork_170624.Task_1;


public class Task1Solution {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(Logic.sign(-1),-1));
        System.out.println(SimpleUnit.assertEquals(Logic.sign(-Integer.MIN_VALUE),-1));
        System.out.println(SimpleUnit.assertEquals(Logic.sign(1),1));
        System.out.println(SimpleUnit.assertEquals(Logic.sign(Integer.MAX_VALUE),1));
        System.out.println(SimpleUnit.assertEquals(Logic.sign(0),0));

        System.out.println(SimpleUnit.assertNotEquals(Logic.sign(-5),1));
        System.out.println(SimpleUnit.assertNotEquals(Logic.sign(-Integer.MIN_VALUE),1));
        System.out.println(SimpleUnit.assertNotEquals(Logic.sign(7),-1));
        System.out.println(SimpleUnit.assertNotEquals(Logic.sign(Integer.MAX_VALUE),-1));



    }
}
