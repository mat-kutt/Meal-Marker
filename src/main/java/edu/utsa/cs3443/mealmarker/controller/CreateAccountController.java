package edu.utsa.cs3443.mealmarker.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CreateAccountController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField studentIDTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private PasswordField confirmPasswordTextField;

    @FXML
    private void createAccount() {
        String username = usernameTextField.getText().trim();
        String studentID = studentIDTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String password = passwordTextField.getText();
        String confirmPassword = confirmPasswordTextField.getText();

        // Check for empty fields
        if (username.isEmpty() || studentID.isEmpty()
        || email.isEmpty() || password.isEmpty()
        || confirmPassword.isEmpty()) {

            showAlert("Missing information",
                    "Please complete all fields.");
            return;
        }

        // Check email format
        if (!email.contains("@") || !email.contains(".")) {
            showAlert("Invalid Email",
                    "Please enter a valid email address.");
            return;
        }

        // Check password confirmation
        if (!password.equals(confirmPassword)) {
            showAlert("Password Mismatch",
                    "Your passwords do not match.");
            return;
        }

        showAlert("Account Created",
                "Welcome to Meal Marker, " + username + "!");

        System.out.println("New account:");
        System.out.println("Username: " + username);
        System.out.println("Student ID: " + studentID);
        System.out.println("Email: " + email);

    }

    @FXML
    private void backToLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    CreateAccountController.class.getResource(
                            "/edu/utsa/cs3443/mealmarker/login-view.fxml"
                    )
            );

            Stage stage = (Stage) usernameTextField.getScene().getWindow();

            Scene scene = new Scene(loader.load(), 900, 600);

            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Navigation Error",
                    "Could not return to the Login Screen.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
