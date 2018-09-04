package vecka36;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class uppg10 extends Application{

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;

	public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);
		
		primaryStage.setScene(scene);
		primaryStage.show();

		Rectangle rec = new Rectangle(100,50);
		
		rec.setFill(Color.BLACK);

		root.getChildren().add(rec);

		scene.setOnKeyPressed(event -> {

			if (!keys.contains(event.getCode())) {
				keys.add(event.getCode());
			}

		});

		scene.setOnKeyReleased(event -> {

			if (keys.contains(event.getCode())) {

				keys.remove(event.getCode());
			}

		});

		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				for (int i = 0; i < keys.size(); i++) {

					KeyCode key = keys.get(i);

					switch (key) {

					case W:
						rec.setTranslateY(rec.getTranslateY()-10);
						break;
					case S:
						rec.setTranslateY(rec.getTranslateY()+10);
						break;
					case D: 
						rec.setTranslateX(rec.getTranslateX()+10);
						break;
					case A:
						rec.setTranslateX(rec.getTranslateX()-10);
						break;
					}

				}

				if (rec.getTranslateY() > WINDOW_HEIGHT-50) {
					rec.setTranslateY(WINDOW_HEIGHT-50);
				}
				if (rec.getTranslateY() < 0) {
					rec.setTranslateY(0);
				}

				if (rec.getTranslateX() > WINDOW_WIDTH-100) {
					rec.setTranslateX(WINDOW_WIDTH-100);
				}

				if (rec.getTranslateX() < 0) {
					rec.setTranslateX(0);
				}
				
			}

		};

		at.start();

	}

	
	
}
