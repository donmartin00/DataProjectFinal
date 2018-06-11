package sample;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Data
{

    ArrayList<Person> red = new ArrayList<>();
    ArrayList<Person> orange = new ArrayList<>();
    ArrayList<Person> yellow = new ArrayList<>();
    ArrayList<Person> green = new ArrayList<>();
    ArrayList<Person> blue = new ArrayList<>();
    ArrayList<Person> indigo = new ArrayList<>();
    ArrayList<Person> violet = new ArrayList<>();






    //first method is to read the .txt file
    //sort the information blocks into lists
    void importData()
    {
        try{

            File file = new File("pleaseWork.txt");

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                String line = scan.nextLine();

                if(line.isEmpty())
                {
                    line = scan.nextLine();
                }

                String date = line.substring(5, line.length());
                String startDate = (line.substring(5,7) + "-" + line.substring(8,10) + "-" + line.substring(11,13));

                DateTimeFormatter formatter = DateTimeFormat.forPattern("MM-dd-yy");
                LocalDate dt = formatter.parseLocalDate(startDate);
                //DateTimeComparator comparator =  new DateTimeComparator;

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



                //color.toLowerCase();
                switch (color) {
                    case "red":
                        red.add(newPerson);
                        break;
                    case "orange":
                        orange.add(newPerson);
                        break;
                    case "yellow":
                        yellow.add(newPerson);
                        break;
                    case "green":
                        green.add(newPerson);
                        break;
                    case "blue":
                        blue.add(newPerson);
                        break;
                    case "indigo":
                        indigo.add(newPerson);
                        break;
                    case "violet":
                        violet.add(newPerson);
                        break;
                }



            }



        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }










}

