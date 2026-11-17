package Supervision1;

public class Question5 {
    public static void vectorAdd(int vector[],int dx, int dy) {
        vector[0]+=dx;
        vector[1] +=dy;
    }
    public static void main(String[] args) {
        int vector[] = {0,2};
        vectorAdd(vector,1,1);
        System.out.println(vector[0]+" "+vector[1]); // (a,b) is still (0,2)
    }
}
