import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorChangeCircle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new Pane();

        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100); // Set circle's X position
        circle.setCenterY(100); // Set circle's Y position
        circle.setRadius(50); // Set circle's radius
        circle.setFill(Color.WHITE); // Set initial color

        // Add the circle to the pane
        pane.getChildren().add(circle);

        // Handle mouse button press events (change circle color to black)
        pane.setOnMousePressed(e -> circle.setFill(Color.BLACK));

        // Handle mouse button release events (change circle color to white)
        pane.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Color Change Circle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
