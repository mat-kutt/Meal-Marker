package edu.utsa.cs3443.mealmarker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class UserGuideController {
    private Window[] windows;

    @FXML
    private void initialize(){
        windows = new Window[5];

        String gettingStartedInfo = """
                Welcome to Meal Marker!
                
                This user guide will help get new and returning users oriented with the app.  Given navigating to the user guide, you already understand how to get to the home, the budget & nutrition tab, and the profile & preferences tab!
                
                On this page you can learn how to change your preferences and finding and understanding the nutrition info regarding meals available only, for now, on campus! In addition, you can also learn about how to determine your budget for the meals you will have on campus. Also included on this page is a complete set of the features we have available on the app, so that you can find meal planning more convenient on campus!
                
                If you have any more questions, feel free to contact support by...
                Phone: (###) ###-####
                Email: support@example.com
                """;

        String editingPreferencesInfo = """
                Switching to the Profile & Preferences tab, you are greeted with a page to change your account and login information as well as setting your diet preference by preset and allergy information.
                
                After making your selection or removing your selection, all you need to do is to click on ‘Confirm Changes” to confirm the diet that most closely follows your health goals, allergy information, or being open to everything.
                """;
        String understandingBudgetInfo = """
                The budgeting tool will, at first, automatically give you a suggested meal plan that will fit within the boundaries of your preferences and budget.
                
                The budget will tell you how much money there’s left to spend. It will let you go over, but will change the text color to red to indicate overspending.
                """;

        String locatingNutritionInfo = """
                In the Budgeting & Nutrition page, the top right chart will tell you the overall nutrition of all the currently selected meals to give you a good estimate of the totals if needed for dietary reasons. If a category goes over the specified limit, the text will become red.
                
                The bottom left drop-down will list all selected foods with the two highest prioritized Nutrition  that you’ve specified.
                
                The bottom right drop-down will list foods that align with your current preferences but aren’t selected, and can be selected and added to the current food chart.
                """;

        String featuresInfo = """
                + Setting diet preferences and allergy information - Used to filter out meals that do not align with your goals or that may include an ingredient you could be allergic to
                + Setting budget - Used to cap the amount of money you may spend on meals over the week
                + Viewing nutrition info - Used to help you know how much nutrition you will get out of a meal
                + Editing profile info - Used to update your identity and/or password to maintain access to your saved information
                """;

        windows[0] = new Window("Getting Started", gettingStartedInfo);
        windows[1] = new Window("Editing Preferences", editingPreferencesInfo);
        windows[2] = new Window("Understanding Budget", understandingBudgetInfo);
        windows[3] = new Window("Locating Nutrition Info", locatingNutritionInfo);
        windows[4] = new Window("Features", featuresInfo);
    }

    @FXML
    private VBox windowVBox;

    @FXML
    private Label titleLabel;

    @FXML
    private Text infoText;

    @FXML
    private Button gettingStartedButton;

    @FXML
    private Button editingPreferencesButton;

    @FXML
    private Button understandingBudgetButton;

    @FXML
    private Button locatingNutritionInfoButton;

    @FXML
    private Button featuresButton;

    @FXML
    public void onGettingStartedButtonClicked(ActionEvent event){
        displayWindow(windows[0]);
    }

    @FXML
    public void onEditingPreferencesButtonClicked(ActionEvent event){
        displayWindow(windows[1]);
    }

    @FXML
    public void onUnderstandingBudgetButtonClicked(ActionEvent event){
        displayWindow(windows[2]);
    }

    @FXML
    public void onLocatingNutritionInfoButtonClicked(ActionEvent event){
        displayWindow(windows[3]);
    }

    @FXML
    public void onFeaturesButtonClicked(ActionEvent event){
        displayWindow(windows[4]);
    }

    @FXML
    public void onCloseWindowButtonClicked(ActionEvent event){
        closeWindow();
    }

    @FXML
    public void onGettingStartedButtonHover(MouseEvent event){
        gettingStartedButton.setStyle(
                "-fx-background-color: #032044; " +
                        "-fx-background-radius: 27; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 23; " +
                        "-fx-border-color: #F15A22; " +
                        "-fx-border-width: 3;"
        );
    }

    @FXML
    public void onEditingPreferencesButtonHover(MouseEvent event){
        editingPreferencesButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 3;"
        );
    }

    @FXML
    public void onUnderstandingBudgetButtonHover(MouseEvent event){
        understandingBudgetButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 3;"
        );
    }

    @FXML
    public void onLocatingNutritionInfoButtonHover(MouseEvent event){
        locatingNutritionInfoButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 3;"
        );
    }

    @FXML
    public void onFeaturesButtonHover(MouseEvent event){
        featuresButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 3;"
        );
    }

    @FXML
    public void onGettingStartedButtonExit(MouseEvent event){
        gettingStartedButton.setStyle(
                "-fx-background-color: #032044; " +
                        "-fx-background-radius: 27; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 23; " +
                        "-fx-border-color: #F15A22; " +
                        "-fx-border-width: 0;"
        );
    }

    @FXML
    public void onEditingPreferencesButtonExit(MouseEvent event){
        editingPreferencesButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 0;"
        );
    }

    @FXML
    public void onUnderstandingBudgetButtonExit(MouseEvent event){
        understandingBudgetButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 0;"
        );
    }

    @FXML
    public void onLocatingNutritionInfoButtonExit(MouseEvent event){
        locatingNutritionInfoButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 0;"
        );
    }

    @FXML
    public void onFeaturesButtonExit(MouseEvent event){
        featuresButton.setStyle(
                "-fx-background-color: #F15A22; " +
                        "-fx-background-radius: 8; " +
                        "-fx-border-style: solid; " +
                        "-fx-border-radius: 8; " +
                        "-fx-border-color: #032044; " +
                        "-fx-border-width: 0;"
        );
    }

    // TODO: Ensure window is scaled to fit text
    @FXML
    public void displayWindow(Window window){
        titleLabel.setText(window.getTitle() + ":");
        infoText.setText(window.getInfo());
        windowVBox.setVisible(true);
    }

    @FXML
    public void closeWindow() {
        windowVBox.setVisible(false);
        titleLabel.setText("");
        infoText.setText("");
    }
}
