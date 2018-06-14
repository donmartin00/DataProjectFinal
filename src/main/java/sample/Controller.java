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


    private boolean redBool = false;
    private boolean orangeBool = false;
    private boolean yellowBool = false;
    private boolean greenBool = false;
    private boolean blueBool = false;
    private boolean indigoBool = false;
    private boolean violetBool = false;


    @FXML
    public void printWhole() {
        clearAll();

        StringBuilder temp = new StringBuilder();

        textArea.setStyle("-fx-text-inner-color: red;");
        count.setText("Count: " + data.red.size());

        populate(data.red, temp);

        textArea.setText(temp.toString());
        temp.setLength(0);


        textArea2.setStyle("-fx-text-inner-color: orange;");
        count2.setText("Count: " + data.orange.size());

        populate(data.orange, temp);

        textArea2.setText(temp.toString());
        temp.setLength(0);


        textArea3.setStyle("-fx-text-inner-color: yellow;");
        count3.setText("Count: " + data.yellow.size());

        populate(data.yellow, temp);
        textArea3.setText(temp.toString());
        temp.setLength(0);


        textArea4.setStyle("-fx-text-inner-color: green;");
        count4.setText("Count: " + data.green.size());

        populate(data.green, temp);

        textArea4.setText(temp.toString());
        temp.setLength(0);


        textArea5.setStyle("-fx-text-inner-color: blue");
        count5.setText("Count: " + data.blue.size());

        populate(data.blue, temp);

        textArea5.setText(temp.toString());
        temp.setLength(0);


        textArea6.setStyle("-fx-text-inner-color: indigo;");
        count6.setText("Count: " + data.indigo.size());

        populate(data.indigo, temp);

        textArea6.setText(temp.toString());
        temp.setLength(0);


        textArea7.setStyle("-fx-text-inner-color: violet;");
        count7.setText("Count: " + data.violet.size());

        populate(data.violet, temp);
        textArea7.setText(temp.toString());


        redBool = true;
        orangeBool = true;
        yellowBool = true;
        greenBool = true;
        blueBool = true;
        indigoBool = true;
        violetBool = true;


    }

    private void sortName() {
        data.red.sort(Comparator.comparing(Person::name));

        data.orange.sort(Comparator.comparing(Person::name));

        data.yellow.sort(Comparator.comparing(Person::name));

        data.green.sort(Comparator.comparing(Person::name));

        data.blue.sort(Comparator.comparing(Person::name));

        data.indigo.sort(Comparator.comparing(Person::name));

        data.violet.sort(Comparator.comparing(Person::name));

    }

    private void sortCompany() {
        data.red.sort(Comparator.comparing(Person::company));

        data.orange.sort(Comparator.comparing(Person::company));

        data.yellow.sort(Comparator.comparing(Person::company));

        data.green.sort(Comparator.comparing(Person::company));

        data.blue.sort(Comparator.comparing(Person::company));

        data.indigo.sort(Comparator.comparing(Person::company));

        data.violet.sort(Comparator.comparing(Person::company));

    }


    private void sortDate() {

        data.red.sort(Comparator.comparing(Person::date));

        data.orange.sort(Comparator.comparing(Person::date));

        data.yellow.sort(Comparator.comparing(Person::date));

        data.green.sort(Comparator.comparing(Person::date));

        data.blue.sort(Comparator.comparing(Person::date));

        data.indigo.sort(Comparator.comparing(Person::date));

        data.violet.sort(Comparator.comparing(Person::date));

    }

    private void populate(List<Person> color, StringBuilder temp) {
        for (Person person : color) {

            temp.append("Date: ").append(person.date()).append("\n");
            temp.append("Name: ").append(person.name()).append("\n");
            temp.append("Company: ").append(person.company()).append("\n");
            temp.append("Color: ").append(person.color()).append("\n");
            temp.append("\n");


        }

    }


    private boolean toggle(TextArea text, TextArea count, String color, List<Person> people, boolean colorBool) {
        if (data == null) {
            return false;
        }

        text.clear();
        count.setText("Count: 0");

        if (!colorBool) {
            print(text, count, color, people);
        }
        return !colorBool;

    }

    private void print(TextArea text, TextArea count, String color, List<Person> people) {
        StringBuilder temp = new StringBuilder();

        text.setStyle("-fx-text-inner-color: " + color + ";");
        count.setText("Count: " + people.size());
        populate(people, temp);
        text.setText(temp.toString());
    }


    @FXML
    public void toggleRed() {
        redBool = toggle(textArea, count, "red", data.red, redBool);

    }

    private void printRed() {
        print(textArea, count, "red", data.red);

    }


    @FXML
    private void toggleOrange() {
        orangeBool = toggle(textArea2, count2, "orange", data.orange, orangeBool);
    }

    private void printOrange() {
        print(textArea2, count2, "orange", data.orange);
    }

    @FXML
    private void toggleYellow() {
        yellowBool = toggle(textArea3, count3, "yellow", data.yellow, yellowBool);
    }

    private void printYellow() {
        print(textArea3, count3, "yellow", data.yellow);
    }

    @FXML
    private void toggleGreen() {
        greenBool = toggle(textArea4, count4, "green", data.green, greenBool);

    }

    private void printGreen() {
        print(textArea4, count4, "green", data.green);

    }

    @FXML
    private void toggleBlue() {
        blueBool = toggle(textArea5, count5, "blue", data.blue, blueBool);

    }

    private void printBlue() {
        print(textArea5, count5, "blue", data.blue);
    }

    @FXML
    private void toggleIndigo() {
        indigoBool = toggle(textArea6, count6, "indigo", data.indigo, indigoBool);
    }

    private void printIndigo() {
        print(textArea6, count6, "indigo", data.indigo);

    }

    @FXML
    private void toggleViolet() {
        violetBool = toggle(textArea7, count7, "violet", data.violet, violetBool);

    }

    private void printViolet() {
        print(textArea7, count7, "violet", data.violet);

    }


    @FXML
    private void orderName() {

        sortName();
        toggleAllColors();


    }

    @FXML
    private void orderCompany() {

        sortCompany();
        toggleAllColors();

    }

    @FXML
    private void orderDate() {

        sortDate();
        toggleAllColors();

    }

    private void toggleAllColors() {
        if (redBool) {
            printRed();
        }
        if (orangeBool) {
            printOrange();
        }
        if (yellowBool) {
            printYellow();
        }
        if (greenBool) {
            printGreen();
        }
        if (blueBool) {
            printBlue();
        }
        if (indigoBool) {
            printIndigo();
        }
        if (violetBool) {
            printViolet();
        }
    }
}




