package sample;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class DataTest  {

    @Test
    public void parseData() {
        Data data = Data.parseData(new Scanner(new ByteArrayInputStream(("Date:12.21.16\n" +
                "Name:Ronan Dalton\n" +
                "Company:At Limited\n" +
                "Color:green").getBytes())));

        assertEquals(1, data.green.size());
        assertEquals("Ronan Dalton", data.green.get(0).name());
    }

    @Test
    public void getLocalDate() {
        LocalDate ld = Data.getLocalDate("Date:12.21.16");
        assertEquals("12.21.16", ld.toString("MM.dd.YY"));
    }

}