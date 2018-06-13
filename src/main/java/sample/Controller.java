package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.fxml.FXML;


import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Controller
{
    @FXML
    Button royB;

    @FXML
    Button redB;

    @FXML
    Button orangeB;

    @FXML
    Button yellowB;

    @FXML
    Button greenB;

    @FXML
    Button blueB;

    @FXML
    Button indigoB;

    @FXML
    Button voiletB;

    @FXML
    TextArea textArea;

    @FXML
    TextArea textArea2;

    @FXML
    TextArea textArea3;

    @FXML
    TextArea textArea4;

    @FXML
    TextArea textArea5;

    @FXML
    TextArea textArea6;

    @FXML
    TextArea textArea7;

    @FXML
    TextArea count;

    @FXML
    TextArea count2;

    @FXML
    TextArea count3;

    @FXML
    TextArea count4;

    @FXML
    TextArea count5;

    @FXML
    TextArea count6;

    @FXML
    TextArea count7;




    @FXML
    public void initialize()
    {
        textArea.setWrapText(true);
        textArea2.setWrapText(true);
        textArea3.setWrapText(true);
        textArea4.setWrapText(true);
        textArea5.setWrapText(true);
        textArea6.setWrapText(true);
        textArea7.setWrapText(true);


    }




    @FXML
    private void clearAll()
    {
        textArea.clear();
        textArea2.clear();
        textArea3.clear();
        textArea4.clear();
        textArea5.clear();
        textArea6.clear();
        textArea7.clear();
        count.clear();
        count2.clear();
        count3.clear();
        count4.clear();
        count5 .clear();
        count6.clear();
        count7.clear();
    }




    private boolean nameBool ;
    private boolean companyBool;
    private boolean dateBool;
    private boolean redBool = false;
    private boolean orangeBool = false;
    private boolean yellowBool = false;
    private boolean greenBool = false;
    private boolean blueBool = false;
    private boolean indigoBool = false;
    private boolean violetBool = false;



    @FXML
    public void printWhole()
    {
        clearAll();
        Data newData = new Data();
        newData.importData();

        StringBuilder temp = new StringBuilder();

        textArea.setStyle("-fx-text-inner-color: red;");
        count.setText("Count: " + newData.red.size());

            populate(newData.red, temp);

            textArea.setText(temp.toString());
            temp.setLength(0);


        textArea2.setStyle("-fx-text-inner-color: orange;");
        count2.setText("Count: " + newData.orange.size());

            populate(newData.orange, temp);

            textArea2.setText(temp.toString());
            temp.setLength(0);



        textArea3.setStyle("-fx-text-inner-color: yellow;");
        count3.setText("Count: " + newData.yellow.size());

            populate(newData.yellow, temp);
            textArea3.setText(temp.toString());
            temp.setLength(0);



        textArea4.setStyle("-fx-text-inner-color: green;");
        count4.setText("Count: " + newData.green.size());

            populate(newData.green, temp);

            textArea4.setText(temp.toString());
            temp.setLength(0);



        textArea5.setStyle("-fx-text-inner-color: blue");
        count5.setText("Count: " + newData.blue.size());

            populate(newData.blue, temp);

            textArea5.setText(temp.toString());
            temp.setLength(0);



        textArea6.setStyle("-fx-text-inner-color: indigo;");
        count6.setText("Count: " + newData.indigo.size());

            populate(newData.indigo, temp);

            textArea6.setText(temp.toString());
            temp.setLength(0);



        textArea7.setStyle("-fx-text-inner-color: violet;");
        count7.setText("Count: " + newData.violet.size());

            populate(newData.violet, temp);
            textArea7.setText(temp.toString());



        redBool = true;
        orangeBool = true;
        yellowBool = true;
        greenBool = true;
        blueBool = true;
        indigoBool = true;
        violetBool = true;


    }

    private void sortName(List<Person> color) {
        for (int i = 0; i < color.size(); i++) {
            Collections.sort(color, Comparator.comparing(Person::name));
        }
    }

    private void sortCompany(List<Person> color) {
        for (int i = 0; i < color.size(); i++) {
            Collections.sort(color, Comparator.comparing(Person::company));
        }
    }


    private void sortDate(List<Person> color)
    {
        for (int i = 0; i < color.size(); i++)
        {
            Collections.sort(color, Comparator.comparing(Person::date));
        }
    }

    private void populate(List<Person> color, StringBuilder temp) {
        for(Person person: color) {

            temp.append("Date: ").append(person.date()).append("\n");
            temp.append("Name: ").append(person.name()).append("\n");
            temp.append("Company: ").append(person.company()).append("\n");
            temp.append("Color: ").append(person.color()).append("\n");
            temp.append("\n");


        }

    }


    @FXML
    public void printRed()
    {
        textArea.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();

        if(!redBool) {
            textArea.setStyle("-fx-text-inner-color: red;");
            count.setText("Count: " + newData.red.size());
            populate(newData.red, temp);
            textArea.setText(temp.toString());
            redBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            redBool = false;
        }
    }

    @FXML
    public void toggleOrange()
    {
        textArea2.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp2 = new StringBuilder();

        if(!orangeBool) {
            textArea2.setStyle("-fx-text-inner-color: orange;");
            count2.setText("Count: " + newData.orange.size());
            populate(newData.orange, temp2);
            textArea2.setText(temp2.toString());
            orangeBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            orangeBool = false;
        }
    }

    @FXML
    public void printYellow() {
        textArea3.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp3 = new StringBuilder();

        if(!yellowBool) {
            textArea3.setStyle("-fx-text-inner-color: yellow;");
            count3.setText("Count: " + newData.yellow.size());
            populate(newData.yellow, temp3);
            textArea3.setText(temp3.toString());
            yellowBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            yellowBool = false;
        }
    }

    @FXML
    public void printGreen ()
    {
        textArea4.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp4 = new StringBuilder();

        if(!greenBool) {
            textArea4.setStyle("-fx-text-inner-color: green;");
            count4.setText("Count: " + newData.green.size());
            populate(newData.green, temp4);
            textArea4.setText(temp4.toString());
            greenBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            greenBool = false;
        }

    }

    @FXML
    public void printBlue ()
    {
        textArea5.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp5 = new StringBuilder();

        if(!blueBool) {
            textArea5.setStyle("-fx-text-inner-color: blue");
            count5.setText("Count: " + newData.blue.size());
            populate(newData.blue, temp5);
            textArea5.setText(temp5.toString());
            blueBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            blueBool = false;
        }

    }

    @FXML
    public void printIndigo ()
    {
        textArea6.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp6 = new StringBuilder();

        if(!indigoBool) {
            textArea6.setStyle("-fx-text-inner-color: indigo;");
            count6.setText("Count: " + newData.indigo.size());
            populate(newData.indigo, temp6);
            textArea6.setText(temp6.toString());
            indigoBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
            {
                indigoBool = false;
            }
    }

    @FXML
    public void printVoilet ()
    {
        textArea7.clear();
        Data newData = new Data();
        newData.importData();
        StringBuilder temp7 = new StringBuilder();

        if(!violetBool) {
            textArea7.setStyle("-fx-text-inner-color: violet;");
            count7.setText("Count: " + newData.violet.size());
            populate(newData.violet, temp7);
            textArea7.setText(temp7.toString());
            violetBool = true;
            nameBool = false;
            companyBool = false;
            dateBool = false;
        }
        else
        {
            violetBool = false;
        }
    }







    @FXML
    public void orderName()
    {

        if(!nameBool) {
            printOrderedColors();
            nameBool = true;
            companyBool = false;
            dateBool = false;
        }
        else if(nameBool)
        {
            printColors();
            nameBool = false;
            //companyBool = false;
            //dateBool = false;
        }


    }

    @FXML
    public void orderCompany()
    {
        if(!companyBool){
            printOrderedColors();
        nameBool = false;
        companyBool = true;
        dateBool = false;
        }
        else if(companyBool)
        {
            printColors();
        //nameBool = false;
        companyBool = false;
        //dateBool = false;
        }


    }

    private void printColors() {
        if (redBool) {
            redBool = false;
            printRed();
        }
        if (orangeBool) {
            orangeBool = false;
            toggleOrange();
        }
        if (yellowBool) {
            yellowBool = false;
            printYellow();
        }
        if (greenBool) {
            greenBool = false;
            printGreen();
        }
        if (blueBool) {
            blueBool = false;
            printBlue();
        }
        if (indigoBool) {
            indigoBool = false;
            printIndigo();
        }
        if (violetBool) {
            violetBool = false;
            printVoilet();
        }
    }


    @FXML
    public void orderDate()
    {
        if(!dateBool) {
            printOrderedColors();

            nameBool = false;
            companyBool = false;
            dateBool = true;

        }
        else if(dateBool)
        {
            printColors();
            //nameBool = false;
            //companyBool = false;
            dateBool = false;
        }

    }

    private void printOrderedColors() {
        if (redBool) {
            printOrderedRed();
        }
        if (orangeBool) {
            printOrderedOrange();
        }
        if (yellowBool) {
            printOrderedYellow();
        }
        if (greenBool) {
            printOrderedGreen();
        }
        if (blueBool) {
            printOrderedBlue();
        }
        if (indigoBool) {
            printOrderedIndigo();
        }
        if (violetBool) {
            printOrderedViolet();
        }
    }


    private void printOrderedRed()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.red);
        textArea.setStyle("-fx-text-inner-color: red;");
        count.setText("Count: " + newData.red.size());


        populate(newData.red, temp);
        textArea.setText(temp.toString());
        redBool = true;

    }

    private void checkSortBools(List<Person> color) {

        if(!nameBool )
        {
            sortName(color);

        }
        else if(!companyBool)
        {
            sortCompany(color);

        }
        else if(!dateBool)
        {
            sortDate(color);

        }
    }

    private void printOrderedOrange()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.orange);

        textArea2.setStyle("-fx-text-inner-color: orange;");
        count.setText("Count: " + newData.orange.size());


        populate(newData.orange, temp);
        textArea2.setText(temp.toString());
        orangeBool = true;

    }


    private void printOrderedYellow()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.yellow);

        textArea3.setStyle("-fx-text-inner-color: yellow;");
        count.setText("Count: " + newData.yellow.size());


        populate(newData.yellow, temp);
        textArea3.setText(temp.toString());
        yellowBool = true;

    }



    private void printOrderedGreen()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.green);

        textArea4.setStyle("-fx-text-inner-color: green;");
        count.setText("Count: " + newData.green.size());


        populate(newData.green, temp);
        textArea4.setText(temp.toString());
        greenBool = true;

    }




    private void printOrderedBlue()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.blue);

        textArea5.setStyle("-fx-text-inner-color: blue;");
        count.setText("Count: " + newData.blue.size());


        populate(newData.blue, temp);
        textArea5.setText(temp.toString());
        blueBool = true;

    }




    private void printOrderedIndigo()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.indigo);

        textArea6.setStyle("-fx-text-inner-color: indigo;");
        count.setText("Count: " + newData.indigo.size());


        populate(newData.indigo, temp);
        textArea6.setText(temp.toString());
        indigoBool = true;

    }



    private void printOrderedViolet()
    {
        Data newData = new Data();
        newData.importData();
        StringBuilder temp = new StringBuilder();
        checkSortBools(newData.violet);

        textArea7.setStyle("-fx-text-inner-color: violet;");
        count7.setText("Count: " + newData.violet.size());


        populate(newData.violet, temp);
        textArea7.setText(temp.toString());
        violetBool = true;

    }
}


