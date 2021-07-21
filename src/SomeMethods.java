import java.util.*;
public class SomeMethods {
	
	    static float weight_index(float w, float h) {
	        float index_val;
	        index_val = h*h;
	        index_val = w / index_val;
	        return index_val;
	    }
	    
	    static float get_weight() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter your weight: ");
	        return in.nextFloat();
	    }

	    static float get_height() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter your height: ");
	        return in.nextFloat();
	    }

	    public static void main(final String[] args) {
	        float weight = get_weight();
	        float height = get_height();
	        float index = weight_index(weight, height);

	        System.out.println(String.format("Given weight: %f and height: %f, your weight index is: %f\n", weight, height, index));
	    }
}
