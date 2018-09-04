package vecka36;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class uppg9 extends Application {

	public static final double WINDOW_WIDTH = 1000;
	public static final double WINDOW_HEIGHT = 750;

	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		primaryStage.setScene(scene);
		primaryStage.show();

		for (int i = 0; i < 10; i++) {

			Circle cir = (new Circle(50));
			root.getChildren().add(cir);

			cir.setTranslateX((WINDOW_WIDTH - 100) * Math.random() + 50);
			cir.setTranslateY((WINDOW_HEIGHT - 100) * Math.random() + 50);

		}
	}

	public static void main(String[] args) {
		launch();
	}
	
}
