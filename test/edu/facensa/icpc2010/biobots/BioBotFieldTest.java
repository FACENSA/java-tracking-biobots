package edu.facensa.icpc2010.biobots;

import edu.facensa.icpc2010.biobots.InvalidColumnsException;
import edu.facensa.icpc2010.biobots.InvalidRowsException;
import edu.facensa.icpc2010.biobots.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BioBotFieldTest {


    public BioBotFieldTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test(expected=InvalidRowsException.class)
    public void shouldNotAllowFieldWithNoColumnsAndLines() throws InvalidRowsException, InvalidColumnsException
    {
        new Field(0, 0);
    }


    @Test
    public void shouldAllowFieldsWith8RowsAndColumns()
    {
        try {
            Field f = new Field(8, 8);
        } catch (InvalidRowsException ex) {
            fail("The field should be valid");
        } catch (InvalidColumnsException ex) {
            fail("The field should be valid");
        }
    }

    @Test(expected=InvalidColumnsException.class)
    public void shouldNotAllowFieldsWithZeroColumns() throws InvalidColumnsException, InvalidRowsException {
        new Field(5, 0);
    }


    @Test(expected=InvalidRowsException.class)
    public void shouldNotAllowFieldsWithZeroRows() throws InvalidRowsException, InvalidColumnsException {
        new Field(0, 5);
    }

    @Test
    public void shouldHaveValidFieldSizeWith5RowsAnd7Columns() throws InvalidRowsException, InvalidColumnsException
    {
        Field f = new Field(5,7);
        assertEquals("Should have 5 rows", 5, f.getRows());
        assertEquals("Should have 7 rows", 7, f.getColumns());

    }

    @Test(expected=InvalidColumnsException.class)
    public void shouldNotAllowANumberOfColumnsGreaterThen1000000() throws InvalidRowsException, InvalidColumnsException
    {
        Field f = new Field(1,1000001);

    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}