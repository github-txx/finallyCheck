package threadDemo;

public class finillyCheck {

    public static void main(String args[]){
        finillyCheck fc = new finillyCheck();
        int i = fc.getValue();
        int j = fc.getValue1();
        System.out.println("i=" +i +",j=" +j);
    }
    public int getValue(){
        int a = 2;
        try{
            return a;
        }catch (Exception e){
            return a+2;
        }
        finally {
            return a+1;
        }
    }

    public int getValue1(){
        int a = 2;
        try{
            return a;
        }catch (Exception e){
            return a+2;
        }
        finally {
            a=a-1;
        }
    }
}
