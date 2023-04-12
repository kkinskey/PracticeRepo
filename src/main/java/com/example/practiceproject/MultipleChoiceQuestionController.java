package com.example.practiceproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

    public class MultipleChoiceQuestionController {

        private int change;

        @FXML
        private Label questionLabel;

        @FXML
        private RadioButton option1;

        @FXML
        private RadioButton option2;

        @FXML
        private RadioButton option3;

        @FXML
        private RadioButton option4;

        private ToggleGroup toggleGroup;

        private String correctAnswer;

        public void updateLabelText(String text) {
            questionLabel.setText(text);
        }

        public void setQuestion(String option1Text, String option2Text, String option3Text, String option4Text, String correctAnswer) {
            option1.setText(option1Text);
            option2.setText(option2Text);
            option3.setText(option3Text);
            option4.setText(option4Text);

            this.correctAnswer = correctAnswer;

            toggleGroup = new ToggleGroup();
            option1.setToggleGroup(toggleGroup);
            option2.setToggleGroup(toggleGroup);
            option3.setToggleGroup(toggleGroup);
            option4.setToggleGroup(toggleGroup);
            isAnswerCorrect();
        }

        public boolean isAnswerCorrect() {
            RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
            String selectedAnswer = selectedRadioButton.getText();

            return selectedAnswer.equals(correctAnswer);
        }
    }
