
public class Piramida {
    private String n;

   
    public Piramida(String n) {
        this.n = n;
    }

    
    public void tiparestePiramida() {
        int size = Integer.parseInt(n); 

        for (int i = 1; i <= size; i++) {
            // Tipărim fiecare linie a piramidei
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" "); 
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i);  //
            }

            System.out.println();  //
        }
    }

    public String toString() {
        return "Piramida cu dimensiunea n = " + n;
}
