import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height;
        do {
            System.out.println("Podaj rozmiar choinki od 1 do 20");
            height = sc.nextInt();
        } while(height<1 || height>20);

        int width = 2*height-1;
        int halfWidth = (width-1)/2;
        String[][]tablica = new String[height][width];

        for(int i=0; i<height; i++){
            int j=0;
            for(; j<halfWidth-i; j++){
                tablica[i][j] = " ";
            }

            for(; j<(halfWidth-i)+(2*i+1); j++){
                tablica[i][j] = "0";
            }

            for(; j<width; j++){
                tablica[i][j] = " ";
            }
        }

        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
