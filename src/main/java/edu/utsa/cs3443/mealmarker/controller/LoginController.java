package edu.utsa.cs3443.mealmarker.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private void login() {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        // Check for empty fields
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Missing Information",
                    "Please enter both your username and password.");
            return;
        }

        String correctUsername = "student";
        String correctPassword = "meal123";

        if (username.equals(correctUsername)
                && password.equals(correctPassword)) {

            showAlert("Login Successful",
                    "Welcome to Meal Marker," + username + "!");

        } else {
            showAlert("Login Failed",
                    "Incorrect username or password.");
        }
    }


    @FXML
    private void createAccount() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    LoginController.class.getResource(
                            "/edu/utsa/cs3443/mealmarker/create-account-view.fxml"
                    )
            );

            Stage stage = (Stage) usernameTextField.getScene().getWindow();

            Scene scene = new Scene(loader.load(), 900, 600);

            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Navigation Error",
                    "Could not open the Create Account Screen.");
        }
    }

    @FXML
    private void forgotPassword() {
        System.out.println("Forgot Password clicked!");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
