package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
                line = scan.nextLine();
                String name = line.substring(5, line.length());
                line = scan.nextLine();
                String company = line.substring(8, line.length());
                line = scan.nextLine();
                String color = line.substring(6, line.length());

                Person newPerson =  sample.ImmutablePerson.builder()
                        .date(date)
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





    //Next we need to print the ArrayLists

    /*
      public void printRed()
    {
        for(int i = 0; i < red.size(); i++)
        {
            System.out.println("Date: " + red.get(i)[0]);
            System.out.println("Name: " + red.get(i)[1]);
            System.out.println("Company: " + red.get(i)[2]);
            System.out.println("Color: " + red.get(i)[3]);
        }
    }
     */

    /*public void printOrange()
    {
        for(int i = 0; i < orange.size(); i++)
        {
            System.out.println("Date: " + orange.get(i)[0]);
            System.out.println("Name: " + orange.get(i)[1]);
            System.out.println("Company: " + orange.get(i)[2]);
            System.out.println("Color: " + orange.get(i)[3]);
        }
    }**/

    /*public void printYellow()
    {
        for(int i = 0; i < yellow.size(); i++)
        {
            System.out.println("Date: " + orange.get(i)[0]);
            System.out.println("Name: " + orange.get(i)[1]);
            System.out.println("Company: " + orange.get(i)[2]);
            System.out.println("Color: " + orange.get(i)[3]);
        }
    }**/

    /*public void printGreen()
    {
        for(int i = 0; i < green.size(); i++)
        {
            System.out.println("Date: " + orange.get(i)[0]);
            System.out.println("Name: " + orange.get(i)[1]);
            System.out.println("Company: " + orange.get(i)[2]);
            System.out.println("Color: " + orange.get(i)[3]);
        }
    }**/

    /*public void printBlue()
    {
        for(int i = 0; i < blue.size(); i++)
        {
            System.out.println("Date: " + blue.get(i)[0]);
            System.out.println("Name: " + blue.get(i)[1]);
            System.out.println("Company: " + blue.get(i)[2]);
            System.out.println("Color: " + blue.get(i)[3]);
        }
    }**/

    /*public void printIndigo()
    {
        for(int i = 0; i < indigo.size(); i++)
        {
            System.out.println("Date: " + indigo.get(i)[0]);
            System.out.println("Name: " + indigo.get(i)[1]);
            System.out.println("Company: " + indigo.get(i)[2]);
            System.out.println("Color: " + indigo.get(i)[3]);
        }
    }**/

    /*public void printVoilet()
    {
        for(int i = 0; i < violet.size(); i++)
        {
            System.out.println("Date: " + violet.get(i)[0]);
            System.out.println("Name: " + violet.get(i)[1]);
            System.out.println("Company: " + violet.get(i)[2]);
            System.out.println("Color: " + violet.get(i)[3]);
        }
    }**/







}

