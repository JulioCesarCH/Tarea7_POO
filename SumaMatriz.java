package Tarea6;
import javax.swing.*;
public class SumaMatriz {
    private int A[][];
    private int B[][];
    private int S[][];
    private int f1;
    private int c1;
    private int f2;
    private int c2;
    private int val1;
    private int val2;

    public SumaMatriz()
    {
        f1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz A"));

        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz A"));

        this.A = new int[f1][c1];

        do {
            f2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz B"));
            c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz B"));
                if (f1!=f2 || c1!=c2){
                    JOptionPane.showMessageDialog(null,"Debe Ingresar la Misma Cantidad de Filas y Columnas de la Primera Matriz","ERROR Datos Invalidos",JOptionPane.INFORMATION_MESSAGE);
                }
        }
        while (f1!=f2 || c1!=c2);

        this.B = new int[f2][c2];
        this.S = new int[f1][c1];
    }

    public void agregarMatrizA()
    {
        for (int f1=0; f1< this.A.length; f1++)
        {
            for (int c1=0; c1 < this.A[f1].length; c1++)
            {
                this.val1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para A["+f1+","+c1+"]"));

                this.A[f1][c1] = this.val1;
            }
        }
    }

    public void agregarMatrizB()
    {
        for (int f2=0; f2< this.B.length; f2++)
        {
            for (int c2=0; c2 < this.B[f2].length; c2++)
            {
                this.val2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para B["+f2+","+c2+"]"));

                this.B[f2][c2] = this.val2;
            }
        }
    }

    public void sumarMatriz(int X[][],int Y[][])
    {
        int sum1,sum2,suma;
        for (int f=0; f< X.length; f++)
        {
            for (int c=0; c < X[f].length; c++)
            {
                sum1 = X[f][c];
                sum2 = Y[f][c];
                suma = sum1 + sum2;
                this.S[f][c] = suma;
            }
        }
    }


    public void mostrarMatrizSuma()
    {   
        this.sumarMatriz(A,B);

        for(int f=0; f < this.S.length; f++)
        {    
            // MATRIZ A
            for(int c=0; c < this.A[f].length; c++)
            {   
                System.out.printf("%5d ", this.A[f][c]);
            }
          System.out.print(" | ");
            //MATRIZ B
            for(int c=0; c < this.B[f].length; c++)
            {   
                System.out.printf("%5d ", this.B[f][c]);
            }
          System.out.print(" | ");
        //SUMA MATRICES
            for(int c=0; c < this.S[f].length; c++)
            {   
                System.out.printf("%5d ", this.S[f][c]);
            }
          System.out.print(" | ");
          System.out.println();
        }
    }

    public static void main(String args[])
    {
        SumaMatriz sumamatriz = new SumaMatriz();
        sumamatriz.agregarMatrizA();
        sumamatriz.agregarMatrizB();
        System.out.println("\t\tA\t\tB\t\tSuma");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        sumamatriz.mostrarMatrizSuma();
    }
}