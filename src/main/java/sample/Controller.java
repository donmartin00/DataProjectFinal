package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.fxml.FXML;
import java.util.Comparator;
import java.util.List;



public class Controller {
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


    private Data data;


    @FXML
    public void initialize() {
        data = Data.importData();
        textArea.setWrapText(true);
        textArea2.setWrapText(true);
        textArea3.setWrapText(true);
        textArea4.setWrapText(true);
        textArea5.setWrapText(true);
        textArea6.setWrapText(true);
        textArea7.setWrapText(true);


    }


    @FXML
    private void clearAll() {
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
        count5.clear();
        count6.clear();
        count7.clear();
    }


    @FXML
    public void printWhole()
    {
        clearAll();
        printAllColors();
    }

    private void sortName()
    {
        data.red.sort(Comparator.comparing(Person::name));
        data.orange.sort(Comparator.comparing(Person::name));
        data.yellow.sort(Comparator.comparing(Person::name));
        data.green.sort(Comparator.comparing(Person::name));
        data.blue.sort(Comparator.comparing(Person::name));
        data.indigo.sort(Comparator.comparing(Person::name));
        data.violet.sort(Comparator.comparing(Person::name));
    }

    private void sortCompany()
    {
        data.red.sort(Comparator.comparing(Person::company));
        data.orange.sort(Comparator.comparing(Person::company));
        data.yellow.sort(Comparator.comparing(Person::company));
        data.green.sort(Comparator.comparing(Person::company));
        data.blue.sort(Comparator.comparing(Person::company));
        data.indigo.sort(Comparator.comparing(Person::company));
        data.violet.sort(Comparator.comparing(Person::company));
    }


    private void sortDate()
    {

        data.red.sort(Comparator.comparing(Person::date));
        data.orange.sort(Comparator.comparing(Person::date));
        data.yellow.sort(Comparator.comparing(Person::date));
        data.green.sort(Comparator.comparing(Person::date));
        data.blue.sort(Comparator.comparing(Person::date));
        data.indigo.sort(Comparator.comparing(Person::date));
        data.violet.sort(Comparator.comparing(Person::date));
    }

    private void populate(List<Person> color, StringBuilder temp)
    {
        for (Person person : color)
        {
            temp.append("Date: ").append(person.date()).append("\n");
            temp.append("Name: ").append(person.name()).append("\n");
            temp.append("Company: ").append(person.company()).append("\n");
            temp.append("Color: ").append(person.color()).append("\n");
            temp.append("\n");
        }
    }


    private void toggle(TextArea text, TextArea count, String color, List<Person> people) {

        if(text.getText().isEmpty())
        {
            print(text, count, color, people);
        }
        else {
            text.clear();
            count.setText("Count: 0");
        }



    }

    private void print(TextArea text, TextArea count, String color, List<Person> people)
    {
        StringBuilder temp = new StringBuilder();
        text.setStyle("-fx-text-inner-color: " + color + ";");
        count.setText("Count: " + people.size());
        populate(people, temp);
        text.setText(temp.toString());
    }


    @FXML
    public void toggleRed()
    {
        toggle(textArea, count, "red", data.red);
    }

    private void printRed()
    {
        print(textArea, count, "red", data.red);
    }

    @FXML
    private void toggleOrange()
    {
        toggle(textArea2, count2, "orange", data.orange);
    }

    private void printOrange()
    {
        print(textArea2, count2, "orange", data.orange);
    }

    @FXML
    private void toggleYellow()
    {
        toggle(textArea3, count3, "yellow", data.yellow);
    }

    private void printYellow()
    {
        print(textArea3, count3, "yellow", data.yellow);
    }

    @FXML
    private void toggleGreen()
    {
        toggle(textArea4, count4, "green", data.green);
    }

    private void printGreen()
    {
        print(textArea4, count4, "green", data.green);
    }

    @FXML
    private void toggleBlue()
    {
        toggle(textArea5, count5, "blue", data.blue);
    }

    private void printBlue()
    {
        print(textArea5, count5, "blue", data.blue);
    }

    @FXML
    private void toggleIndigo()
    {
        toggle(textArea6, count6, "indigo", data.indigo);
    }

    private void printIndigo()
    {
        print(textArea6, count6, "indigo", data.indigo);
    }

    @FXML
    private void toggleViolet()
    {
        toggle(textArea7, count7, "violet", data.violet);
    }

    private void printViolet()
    {
        print(textArea7, count7, "violet", data.violet);
    }


    @FXML
    private void orderName()
    {
        sortName();
        checkToggle();
    }



    @FXML
    private void orderCompany()
    {
        sortCompany();
        checkToggle();
    }

    @FXML
    private void orderDate()
    {
        sortDate();
        checkToggle();
    }

    private void printAllColors() {

            printRed();
            printOrange();
            printYellow();
            printGreen();
            printBlue();
            printIndigo();
            printViolet();

    }

    private void checkToggle()
    {
        if(!textArea.getText().isEmpty())
        {
            printRed();
        }
        if(!textArea2.getText().isEmpty())
        {
            printOrange();
        }
        if(!textArea3.getText().isEmpty())
        {
            printYellow();
        }
        if(!textArea4.getText().isEmpty())
        {
            printGreen();
        }
        if(!textArea5.getText().isEmpty())
        {
            printBlue();
        }
        if(!textArea6.getText().isEmpty())
        {
            printIndigo();
        }
        if(!textArea7.getText().isEmpty())
        {
            printViolet();
        }
    }
}




