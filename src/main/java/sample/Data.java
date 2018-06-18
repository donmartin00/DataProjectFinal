package sample;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * My model class that will return a new model - "Data" - which will have 7 different array lists differentiated by color
 */
class Data
{

    ArrayList<Person> red = new ArrayList<>();
    ArrayList<Person> orange = new ArrayList<>();
    ArrayList<Person> yellow = new ArrayList<>();
    ArrayList<Person> green = new ArrayList<>();
    ArrayList<Person> blue = new ArrayList<>();
    ArrayList<Person> indigo = new ArrayList<>();
    ArrayList<Person> violet = new ArrayList<>();


/**
 * Read in the text file called "pleaseWork.txt"
 */
    public static Data importData()
    {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("pleaseWork.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return parseData(scan);

    }


    /**
     * This parses the data that was imported and puts all of the information into the correct arraylist s
     * @param file
     * @return
     * @throws FileNotFoundException
     */
    public static Data importData(File file) throws FileNotFoundException
    {
        Scanner scan = new Scanner(file);
        return parseData(scan);

    }

    static Data parseData(Scanner scan) {
        Data  result = new Data();
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();

            if(line.isEmpty())
            {
                line = scan.nextLine();
            }


            LocalDate dt = getLocalDate(line);

            line = scan.nextLine();
            String name = line.substring(5, line.length());
            line = scan.nextLine();
            String company = line.substring(8, line.length());
            line = scan.nextLine();
            String color = line.substring(6, line.length());

            Person newPerson =  sample.ImmutablePerson.builder()
                    .date(dt)
                    .company(company)
                    .name(name)
                    .color(color)
                    .build();


            switch (color) {
                case "red":
                    result.red.add(newPerson);
                    break;
                case "orange":
                    result.orange.add(newPerson);
                    break;
                case "yellow":
                    result.yellow.add(newPerson);
                    break;
                case "green":
                    result.green.add(newPerson);
                    break;
                case "blue":
                    result.blue.add(newPerson);
                    break;
                case "indigo":
                    result.indigo.add(newPerson);
                    break;
                case "violet":
                    result.violet.add(newPerson);
                    break;
            }
        }
        return result;
    }

    static LocalDate getLocalDate(String line) {
        String startDate =line.split(":")[1];

        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM.dd.yy");
        return formatter.parseLocalDate(startDate);
    }


}

