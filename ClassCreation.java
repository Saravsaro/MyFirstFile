package com.test;
// Java program to create circle by passing the
//coordinates of the center and radius
//as arguments in constructor
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javafx.scene.Group;
public class circle_0 extends Application {

	// launch the application
	public void start(Stage stage)
	{
		// set title for the stage
		stage.setTitle("creating circle");

		// create a circle
		Circle circle = new Circle(150.0f, 150.0f, 80.f);

		// create a Group
		Group group = new Group(circle);

		// create a scene
		Scene scene = new Scene(group, 500, 300);

		// set the scene
		stage.setScene(scene);

		stage.show();
	}

	public static void main(String args[])
	{
		// launch the application
		launch(args);
	}
}

