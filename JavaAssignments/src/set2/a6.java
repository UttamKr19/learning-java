package set2;

public class a6 {
	static void isCube(int N)
    {
        int cube;
     
        for (int i = 0; i <= N; i++) {
     
            cube = i * i * i;
            if (cube == N) {
                System.out.println("Yes");
                return;
            }
            else if (cube > N) {
                System.out.println("NO");
                return;
            }
        }
    }
	public static void main(String[] args) {

		isCube(27);
	}
}
