package pl.sda.javastart.homeWork2;

public class taskNumFourteen {
    public static void main(String[] args) {
numsFromLeftToRight(10);
    }

    public static void numsFromLeftToRight(int rows){
        for(int i=0;i<rows-1;i++){
            for(int j =0;j<rows-i-2;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println(" ");
        }

    }
}
