 
public class RunGenerator {
    public static void main(String[] args) {
        int[] values = {1,2,2,2,3,4,4,5,5,5,6,6,7,7,7,7,7,8,9,0};
        
        boolean inRun = false;
        
        for(int i = 0; i < values.length; i++) {
            if(inRun) {
                if(values[i] != values[i-1]) {
                    System.out.print(")");
                    inRun = false;
                    if(i < values.length - 1 && values[i] == values[i+1]) {
                        System.out.print("(");
                        inRun = true;
                    }
                }
            } else {
                if(i < values.length - 1 && values[i] == values[i+1]) {
                    System.out.print("(");
                    inRun = true;
                }
            }
            
            System.out.print(values[i]);
        }
        if(inRun) System.out.print(")");
    }
}
