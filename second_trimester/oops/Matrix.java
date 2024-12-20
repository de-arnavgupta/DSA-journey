package DSA.second_trimester.oops;

import java.util.Scanner;
public class Matrix {
    int row;
    int column;
    int[][] arr;


    // Define constructor here
    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
    }


    void input(Scanner sc){
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function
        arr = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }

    Matrix add(Matrix x){
        // Complete the function
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] += x.arr[i][j];
            }
        }
        return this;

    }

    Matrix subtract(Matrix x){
        // Complete the function
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] -= x.arr[i][j];
            }
        }
        return this;

    }

    Matrix transpose(){
        // Complete the function
        int[][] temp = new int[column][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                temp[j][i] = arr[i][j];
            }
        }
        arr = temp;
        return this;

    }

    void print(){
        // Complete the function
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix a = new Matrix(2, 2) ; // 10 rows, 5 columns
        a.input(sc);
        Matrix b = new Matrix(2, 2) ; // 10 rows, 5 columns
//        b.input(sc);
//        Matrix c1 = a.add(b);
//        Matrix c2 = a.subtract(b);
        Matrix c3 = a.transpose();
        a.print();
    }
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/