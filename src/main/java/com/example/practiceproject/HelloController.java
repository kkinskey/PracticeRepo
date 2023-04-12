package com.example.practiceproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void MCQHandle(ActionEvent event) throws Exception {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("MultipleChoiceQuestion.fxml"));
            Parent homePageParent = loader.load();
            Scene homePageScene = new Scene(homePageParent); //Make scene with that path
            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); //Assign nodes to the window
            window.setScene(homePageScene); //Set the scene
            window.show(); //Make it visible
        MultipleChoiceQuestionController multipleChoiceQuestionController = loader.getController();
            multipleChoiceQuestionController.updateLabelText("What is 1+1?");
            multipleChoiceQuestionController.setQuestion("20", "30", "40", "2", "2");
//            multipleChoiceQuestionController.isAnswerCorrect();

    }

}

