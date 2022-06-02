import java.lang.Math;
import java.util.Scanner;

public class PolyCompute {

    static float[] computeString(String fnString, float realNum, float imagNum){



        float[] values = new float[2];
        values[0] = realNum;
        values[1] = imagNum;



        return values;
    }

    public static void PolyCompute(){

        Scanner input = new Scanner(System.in);
        System.out.println("Input function(max pow 5, use one var x): ");
        String fnString = input.nextLine();
        
        


    }

    
    
}

/*  0         1
 *  1        1 1
 *  2       1 2 1
 *  3      1 3 3 1
 *  4     1 4 6 4 1
 *  5   1 5 10 10 5 1
 *
 *      i^0 = 1
 *      i^1 = i
 *      i^2 = -1
 *      i^3 = -i
 *      i^4 = 1
 *      i^5 = i
 * 
 *      d/dx = pow(x)^pow-1
 * 
 *      check for + and -, propogate powers and how to calculate, if no ^ then pow = 1
 *  
*/
