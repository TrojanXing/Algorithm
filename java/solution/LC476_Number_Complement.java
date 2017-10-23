package java.solution;

public class LC476_Number_Complement {
	public int findComplement(int num) {
        int t = 1;
        while(t < num) {
            t <<= 1;
            t |= 1;
        }
        return t ^ num;
    }
}
