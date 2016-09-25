
/**
 * @ Laurel Woods 
 * @ lab 8
 */
public class LabEight
{
  
    
    public static void main(String[] args) {
       int[] pumpkin = new int[7];
       LabEight le = new LabEight();
       le.printArray(le.loadArray(pumpkin));
       le.printArray(le.reverseArray(pumpkin));
    }
    
    public int[] loadArray(int[] pumpkin) {
        for (int i = 0; i < pumpkin.length; i++) {
            pumpkin[i] = (int)(Math.random() * 10) + 1;
        }
        return pumpkin;
    }
    
    public int[] reverseArray(int[] pumpkin) {
        int[] ghost = new int[pumpkin.length];
        for (int i = 0; i < pumpkin.length; i++) {
            ghost[i] = pumpkin[pumpkin.length - (i + 1)];
        }
        return ghost;
    }
    
    public void printArray(int[] halloween){
        String print = "";
        for (int i = 0; i < halloween.length; i++) {
            print = print + halloween[i] + " ";
        }
        System.out.println(print);
    }
}
