package sample;


import javafx.scene.control.Button;

import javafx.scene.control.TextArea;
import javafx.fxml.FXML;


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
    }






    /**FXML
    public void superCool() {

    StringBuilder temp = new StringBuilder();
    temp.append(textArea.getText());



    List<String> data = new ArrayList<>();
    data.add("stuff\n");
    data.add("stufssf");
    data.add("stuff");
    data.add("studfdff");
    data.add("stuf222f");
    data.add("stuff\n");
    data.add("stuff\n");

    for(int i=0;i<data.size();i++) {
    temp.append(data.get(i));
    }

    for(String stuff:data) {
    temp.append(stuff);
    }

    data.stream().map(Controller::supercomplexmethod).forEach(stuff -> temp.append(stuff));

    // IntStream.range(0, 100).forEach(i -> temp.append("whaateveer i wannt \n"));
    textArea.setText(temp.toString());
    }

    public static String supercomplexmethod(String maString) {
    return maString.concat(" super").concat("\n");
    }**/

    @FXML
    private void clear()
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








    @FXML
    public void printWhole()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        StringBuilder temp3 = new StringBuilder();
        StringBuilder temp4 = new StringBuilder();
        StringBuilder temp5 = new StringBuilder();
        StringBuilder temp6 = new StringBuilder();
        StringBuilder temp7 = new StringBuilder();





        textArea.setStyle("-fx-text-inner-color: red;");
        count.setText("Count: " + newData.red.size());
        for(int i = 0; i < newData.red.size(); i++)
        {
            temp.append("Date: ").append(newData.red.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.red.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.red.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.red.get(i)[3]).append("\n");
            temp.append("\n");
        }

        textArea2.setStyle("-fx-text-inner-color: orange;");
        count2.setText("Count: " + newData.orange.size());
        for(int i = 0; i < newData.orange.size(); i++)
        {
            temp2.append("Date: ").append(newData.orange.get(i)[0]).append("\n");
            temp2.append("Name: ").append(newData.orange.get(i)[1]).append("\n");
            temp2.append("Company: ").append(newData.orange.get(i)[2]).append("\n");
            temp2.append("Color: ").append(newData.orange.get(i)[3]).append("\n");
            temp2.append("\n");
        }

        textArea3.setStyle("-fx-text-inner-color: yellow;");
        count3.setText("Count: " + newData.yellow.size());
        for(int i = 0; i < newData.yellow.size(); i++)
        {
            temp3.append("Date: ").append(newData.orange.get(i)[0]).append("\n");
            temp3.append("Name: ").append(newData.orange.get(i)[1]).append("\n");
            temp3.append("Company: ").append(newData.orange.get(i)[2]).append("\n");
            temp3.append("Color: ").append(newData.orange.get(i)[3]).append("\n");
            temp3.append("\n");
        }

        textArea4.setStyle("-fx-text-inner-color: green;");
        count4.setText("Count: " + newData.green.size());
        for(int i = 0; i < newData.green.size(); i++)
        {
            temp4.append("Date: ").append(newData.orange.get(i)[0]).append("\n");
            temp4.append("Name: ").append(newData.orange.get(i)[1]).append("\n");
            temp4.append("Company: ").append(newData.orange.get(i)[2]).append("\n");
            temp4.append("Color: ").append(newData.orange.get(i)[3]).append("\n");
            temp4.append("\n");
        }

        textArea5.setStyle("-fx-text-inner-color: blue");
        count5.setText("Count: " + newData.blue.size());
        for(int i = 0; i < newData.blue.size(); i++)
        {
            temp5.append("Date: ").append(newData.blue.get(i)[0]).append("\n");
            temp5.append("Name: ").append(newData.blue.get(i)[1]).append("\n");
            temp5.append("Company: ").append(newData.blue.get(i)[2]).append("\n");
            temp5.append("Color: ").append(newData.blue.get(i)[3]).append("\n");
            temp5.append("\n");
        }

        textArea6.setStyle("-fx-text-inner-color: indigo;");
        count6.setText("Count: " + newData.indigo.size());
        for(int i = 0; i < newData.indigo.size(); i++)
        {
            temp6.append("Date: ").append(newData.indigo.get(i)[0]).append("\n");
            temp6.append("Name: ").append(newData.indigo.get(i)[1]).append("\n");
            temp6.append("Company: ").append(newData.indigo.get(i)[2]).append("\n");
            temp6.append("Color: ").append(newData.indigo.get(i)[3]).append("\n");
            temp6.append("\n");
        }

        textArea7.setStyle("-fx-text-inner-color: violet;");
        count7.setText("Count: " + newData.violet.size());
        for(int i = 0; i < newData.violet.size(); i++)
        {
            temp7.append("Date: ").append(newData.violet.get(i)[0]).append("\n");
            temp7.append("Name: ").append(newData.violet.get(i)[1]).append("\n");
            temp7.append("Company: ").append(newData.violet.get(i)[2]).append("\n");
            temp7.append("Color: ").append(newData.violet.get(i)[3]).append("\n");
            temp7.append("\n");
        }

        textArea.setText(temp.toString());
        textArea2.setText(temp2.toString());
        textArea3.setText(temp3.toString());
        textArea4.setText(temp4.toString());
        textArea5.setText(temp5.toString());
        textArea6.setText(temp6.toString());
        textArea7.setText(temp7.toString());





    }


    @FXML
    public void printRed()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();

        textArea.setStyle("-fx-text-inner-color: red;");
        for(int i = 0; i < newData.red.size(); i++)
        {
            temp.append("Date: ").append(newData.red.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.red.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.red.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.red.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count.setText("Count: " + newData.red.size());
        textArea.setText(temp.toString());
    }

    @FXML
    public void printOrange()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();
        textArea2.setStyle("-fx-text-inner-color: orange;");
        for(int i = 0; i < newData.orange.size(); i++)
        {
            temp.append("Date: ").append(newData.orange.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.orange.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.orange.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.orange.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count2.setText("Count: " + newData.orange.size());
        textArea2.setText(temp.toString());
    }

    @FXML
    public void printYellow() {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();

        textArea3.setStyle("-fx-text-inner-color: yellow;");
        for (int i = 0; i < newData.yellow.size(); i++) {
            temp.append("Date: ").append(newData.yellow.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.yellow.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.yellow.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.yellow.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count3.setText("Count: " + newData.yellow.size());
        textArea3.setText(temp.toString());
    }

    @FXML
    public void printGreen ()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();

        textArea4.setStyle("-fx-text-inner-color: green;");
        for (int i = 0; i < newData.green.size(); i++) {
            temp.append("Date: ").append(newData.green.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.green.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.green.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.green.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count4.setText("Count: " + newData.green.size());
        textArea4.setText(temp.toString());

    }

    @FXML
    public void printBlue ()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();

        textArea5.setStyle("-fx-text-inner-color: blue;");
        for (int i = 0; i < newData.blue.size(); i++) {
            temp.append("Date: ").append(newData.blue.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.blue.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.blue.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.blue.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count5.setText("Count: " + newData.blue.size());
        textArea5.setText(temp.toString());

    }

    @FXML
    public void printIndigo ()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();


        textArea6.setStyle("-fx-text-inner-color: indigo;");
        for (int i = 0; i < newData.indigo.size(); i++) {
            temp.append("Date: ").append(newData.indigo.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.indigo.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.indigo.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.indigo.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count6.setText("Count: " + newData.indigo.size());
        textArea6.setText(temp.toString());
    }

    @FXML
    public void printVoilet ()
    {
        clear();
        Data newData = new Data();
        newData.sortText();
        StringBuilder temp = new StringBuilder();

        textArea7.setStyle("-fx-text-inner-color: violet;");
        for (int i = 0; i < newData.violet.size(); i++) {
            temp.append("Date: ").append(newData.violet.get(i)[0]).append("\n");
            temp.append("Name: ").append(newData.violet.get(i)[1]).append("\n");
            temp.append("Company: ").append(newData.violet.get(i)[2]).append("\n");
            temp.append("Color: ").append(newData.violet.get(i)[3]).append("\n");
            temp.append("\n");
        }
        count7.setText("Count: " + newData.violet.size());
        textArea7.setText(temp.toString());
    }

}
