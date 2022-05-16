package Tarea6;
import javax.swing.*;
public class ProductoMatriz {
    private int A[][];
    private int B[][];
    private int P[][];
    private int f1;
    private int c1;
    private int f2;
    private int c2;
    private int val1;
    private int val2;

    public ProductoMatriz()
    {
        f1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz A"));

        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz A"));

        this.A = new int[f1][c1];

        do {
            f2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz B"));
            c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz B"));
                if (c1!=f2){
                    JOptionPane.showMessageDialog(null,"Las Columnas de la Primera Matriz deben conincidir con las Filas de la Segunda Matriz","ERROR Datos Invalidos",JOptionPane.INFORMATION_MESSAGE);
                }
        }
        while (c1!=f2);

        this.B = new int[f2][c2];
        this.P = new int[f1][c2];
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

    public void multiplicarMatriz(int X[][],int Y[][])
    {
        int suma;
        for (int cb=0; cb< Y.length; cb++)
        {
            for (int fa=0; fa< X.length; fa++)
            {
                suma=0;
                for (int ca=0; ca < X[fa].length; ca++)
                {
                    suma += X[fa][ca]*Y[ca][cb];
                    this.P[fa][cb] = suma;
                }
            }
        }
    }


    public void mostrarMatrizProducto()
    {   
        this.multiplicarMatriz(A,B);

        for(int f=0; f < this.P.length; f++)
        {    
        //PRODUCTO MATRICES
            for(int c=0; c < this.P[f].length; c++)
            {   
                System.out.printf("%5d ", this.P[f][c]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[])
    {
        ProductoMatriz productomatriz = new ProductoMatriz();
        productomatriz.agregarMatrizA();
        productomatriz.agregarMatrizB();
        System.out.println("\t\tProducto");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        productomatriz.mostrarMatrizProducto();
    }
}
