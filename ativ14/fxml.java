<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.VBox?>

<VBox xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="com.ativn.ativn.TimerController" spacing="10" alignment="CENTER" style="-fx-padding: 20;">
    <TextField fx:id="timeInput" promptText="Digite o tempo em segundos" />
    <Button text="Iniciar" onAction="#handleStartButtonClick"/>
    <Label fx:id="countdownLabel" text="Contagem regressiva " />
</VBox>
