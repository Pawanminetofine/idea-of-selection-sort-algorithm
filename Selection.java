import java.util.*;
public class Selection {
    public static void selectionArray(int selection[]){
        for(int i=0;i<selection.length;i++){
        System.out.print(selection[i]+" ");
    }
    }
    public static void main(String[] args) {
        int selection[] = {25, 6, 8, 59, 1, 9, 44, 11, 4, 54};
        for (int i = 0; i<selection.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < selection.length; j++) {
                if (selection[smallest] > selection[j]) {
                    smallest = j;
                }
            }
                int temp = selection[smallest];
                selection[smallest] = selection[i];
                selection[i] = temp;
            }
        selectionArray(selection);
    }
    }

