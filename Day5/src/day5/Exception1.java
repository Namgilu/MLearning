package day5;

/*
 * ������ �߻��� �κп��� try-catch ���� ����Ѵ�.
 * catch �� ������ ��� �����ϴ�.
 * ����Ǵ� ���ܻ�Ȳ�� ����Ŭ������ ����ϰ�, ��Ȯ���� ���� ���ܹ߻��� catch(Exception e)�� ����Ѵ�. Exception e-> ���� ���ε�
 *  catch(Exception e)�� catch �߿��� ���� �Ʒ��ʿ� �־�� �� ( ���������� ���� �� )
 *  try catch�� ���� ����ϸ� �������� ������
 *  finally : ������ ����� / �������� ����� ������ ����Ǿ�� �ϴ°�/ Ư���� ��찡 �ƴѰ�� ������ ������ ��
 * 
 */
public class Exception1 {

   public static void main(String[] args) /* throws InterruptedException */ // �˾Ƽ� ó���ϰ�
   {
      int [] arr = new int [3];
      try {
         //   int a=3/0;
         for(int i=0;i<3;i++)
         {
            Thread.sleep(5);
            System.out.println(arr[i]);
         }
         System.out.println("bye");
      }catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("�迭�� �Ѿ���Ⱦ�");
         e.printStackTrace();
      }catch(ArithmeticException e1) {
         System.out.println("0���� ������ �ȵȴ�.");
         e1.printStackTrace();

      }catch(Exception e2){
         e2.printStackTrace();
      }
   }
}