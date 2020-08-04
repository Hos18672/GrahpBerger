package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Neo on 25.12.2016.
 */
public class SquareMatrix
{
    int  size = 5;
       private int[][] data1,data = new int[size][size];;

    //constructor__________________________

    //only zum testen
//    public SquareMatrix(int[][]data)


//    {
//        // TODO: should check if data is a squared matrix!
//        this.data = data;
//        this. size = data.length;
//    }

    public void Read_input_graph_csv_file()  {
        String filelocation;
        String[] line = new String[0];
        filelocation = "C:\\Users\\rezah\\OneDrive\\Desktop\\input_graph1.txt";

        try {
            Scanner sc = new Scanner(new BufferedReader( new FileReader(filelocation)));
            while (sc.hasNextLine()) {
                for (int i = 0; i <  size; i++) {
                    line = sc.nextLine().trim().split(" ");
                    for (int j = 0; j < line.length; j++) {
                        data[i][j] = Integer.parseInt(line[j]);
                    }
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch(Exception e)

        {
            System.out.println(e.getMessage());
        }
    }


    public int[] getRow(int row){
        return data[row];
    }


    public int getValue(int row, int col)
    {
        return data[row][col];
    }
    public void Print()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(data[i][j]+ " ");
            }
        }
    }

    //setter
    //gespiegelt
    public void setValue(int row, int col, int value)
    {
        //alle Werte spiegeln, da ungerichtet
        data[row][col] = value;
        data[col][row] = value;
    }
    public int getSize() {
        return size;
    }


    public int[][] getData() {
        return data;
    }

    //methods
    public void multiply(SquareMatrix other, SquareMatrix result)
    {
        //für alle Zeilen in this matrix
        for (int row = 0; row < size ; row++)
        {
            //für alle Spalten in other matrix
            for (int col = 0; col < size ; col++)
            {
                int sum = 0;

                //this matrix -> für alle Zellen in der Zeile
                //other matrix -> für alle Zellen in der Spalte
                for (int index = 0; index <  size; index++)
                {
                    sum += this.data[row][index] * other.data[index][col];
                }

                result.data[row][col] = sum;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(result.data[i][j]);

            }

            System.out.println();
        }


    }


//    @Override
//    public String toString()
//    {
//        StringBuilder sb = new StringBuilder();
//
//        for (int row = 0; row <   size; row++)
//        {
//            for (int col = 0; col <  size; col++)
//            {
//                sb.append(String.format("%3d",data[row][col]));
//            }
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
}
