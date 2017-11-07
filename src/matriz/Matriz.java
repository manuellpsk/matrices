package matriz;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
    
        int mat1[][]=generar(4);
        int mat2[][]=generar(4);
        getmatriz(mat1);
        sumarows(mat1);
        getmatriz(mat2);
        sumacolumn(mat2);
        multiplicar(mat1,mat2);
        

    }//main

static int[][] generar(int n){
        
    Random rd=new Random();
    int mat[][]=new int [n][n];
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
            mat[i][j]=(int)(rd.nextFloat()*9+1);
        }
    }
    return mat;
}//generar

static void sumarows(int mat[][]){

    int suma=0;
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
        suma=suma+mat[i][j];
        }
        System.out.println("La suma de la FILA "+(i+1)+" es : "+suma);
        suma=0;
    }
    

}//sumarows

static void sumacolumn(int mat[][]){

    int suma=0;
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
        suma=suma+mat[j][i];
        }
        System.out.println("La suma de la COLUMNA "+(i+1)+" es : "+suma);
        suma=0;
    }
}//sumacolumn

static void getmatriz(int mat[][]){

    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println("");
    }
}//getmatriz

static void multiplicar(int mat1[][],int mat2[][]){

    if(mat1[0].length==mat2.length){
    int n=mat1.length;
    int m=mat2[0].length;
    int matres[][]=new int[n][n];
    int suma=0;int x=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            for(int k=0;k<n;k++){
            
            suma=suma+(mat1[i][k]*mat2[k][j]);
            }
        matres[i][j]=suma;
        suma=0;
        }
        
    }
    getmatriz(matres);
    }
    else System.out.println("No se puede multiplicar");

}//multiplicar matrices
    
}//class main
