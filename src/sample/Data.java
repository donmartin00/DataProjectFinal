package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Data
{
    ArrayList<String[]> red = new ArrayList<>();
    ArrayList<String[]> orange = new ArrayList<>();
    ArrayList<String[]> yellow = new ArrayList<>();
    ArrayList<String[]> green = new ArrayList<>();
    ArrayList<String[]> blue = new ArrayList<>();
    ArrayList<String[]> indigo = new ArrayList<>();
    ArrayList<String[]> violet = new ArrayList<>();






    //first method is to read the .txt file
    //sort the information blocks into lists
    void sortText()
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

                String[] details = {date, name, company, color};


                //color.toLowerCase();
                switch (color) {
                    case "red":
                        red.add(details);
                        break;
                    case "orange":
                        orange.add(details);
                        break;
                    case "yellow":
                        yellow.add(details);
                        break;
                    case "green":
                        green.add(details);
                        break;
                    case "blue":
                        blue.add(details);
                        break;
                    case "indigo":
                        indigo.add(details);
                        break;
                    case "violet":
                        violet.add(details);
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

