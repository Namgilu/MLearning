package day5;

/*
 * 에러가 발생할 부분에는 try-catch 문을 사용한다.
 * catch 는 여러개 사용 가능하다.
 * 예상되는 예외상황은 예외클래스를 명시하고, 명확하지 않은 예외발생은 catch(Exception e)를 사용한다. Exception e-> 동적 바인딩
 *  catch(Exception e)는 catch 중에사 가장 아래쪽에 있어야 함 ( 위에있으면 에러 남 )
 *  try catch를 많이 사용하면 가독성이 떨어짐
 *  finally : 정상적 종료든 / 비정상적 종료든 무조건 실행되어야 하는것/ 특수한 경우가 아닌경우 무조건 동작을 함
 * 
 */
public class Exception1 {

   public static void main(String[] args) /* throws InterruptedException */ // 알아서 처리하게
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
         System.out.println("배열이 넘어버렸어");
         e.printStackTrace();
      }catch(ArithmeticException e1) {
         System.out.println("0으로 나누면 안된다.");
         e1.printStackTrace();

      }catch(Exception e2){
         e2.printStackTrace();
      }
   }
}