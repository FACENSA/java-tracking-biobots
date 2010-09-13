package edu.facensa.icpc2010.biobots;


public class Field {

    public static final int MAX_NUMBER_OF_COLUMNS = 1000000;
    private int rows;
    private int columns;

    public Field(int rows, int columns) throws InvalidRowsException, InvalidColumnsException {
        if (rows == 0) {
            throw new InvalidRowsException("Zero is not allowed for Rows");
        }

        if (columns == 0) {
            throw new InvalidColumnsException("Zero is not allowed for Columns");
        }

        if (columns > MAX_NUMBER_OF_COLUMNS) {
            throw new InvalidColumnsException("The number of columns should be less than a million");
        }


        this.columns = columns;
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
