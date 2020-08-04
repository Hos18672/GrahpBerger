package model;

/**
 * Created by Neo on 28.12.2016.
 */
public class Matrices extends SquareMatrix
{


    public void addEdge( int row, int col)
    {
        super.setValue( row, col, 1);
    }

    public void deleteEdge( int row, int col)
    {
        super.setValue( row, col, 0);
    }


    public Matrices thePath()
    {
        Matrices path = new Matrices();

        for (int row = 0; row <  size; row++)
        {
            for (int col = row; col <  size; col++)
            {
                if (row == col)
                {
                    path.setValue(row, col, 1);
                }
                else
                {
                    path.setValue(row, col, getValue(row, col));
                }
            }
        }
        return path;
    }

    public Matrices theDistance()
    {
        Matrices distance = new Matrices();

        for (int row = 0; row <  size; row++)
        {
            for (int col = 0; col <  size; col++)
            {
                int value = getValue(row, col);

                if(row != col && value == 0)
                {
                    distance.setValue(row, col, -1);
                }
                else
                {
                    distance.setValue(row, col, value);
                }
            }
        }
        return distance;
    }
}
