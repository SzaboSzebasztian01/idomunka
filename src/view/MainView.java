/*
 * File: MainView.java
 * Author: Szabó Szebasztián
 * Copyright: 2023, Szebi:)
 * Group: SZOFT-I-1-N
 * Date: 2023-04-27
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package view;

import com.github.SzaboSzebasztian1.inputlib.ButtonPanel;
import com.github.SzaboSzebasztian1.inputlib.InputPanel;
import com.github.SzaboSzebasztian1.inputlib.TitlePanel;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainView extends VBox{
    TitlePanel titlePanel;
    InputPanel lengthPanel;
    InputPanel pushPanel;
    InputPanel turnPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;
    Label aboutLabel;

    public MainView() {
        this.initComponent();
        this.addComponent();
        this.setMainPanel();
        this.setComponent();

    }

    private void initComponent(){
        this.titlePanel = new TitlePanel();
        this.lengthPanel = new InputPanel();
        this.pushPanel = new InputPanel();
        this.turnPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();
        this.aboutLabel = new Label();

    }

    private void setComponent(){
        this.titlePanel.setText("Eszterga megmunkálási idő");
        this.lengthPanel.setText("Megmunkált hossz: ");
        this.pushPanel.setText("Fordulatonkénti előtolás: ");
        this.turnPanel.setText("Főorsó fordulatszám (fordulatszám percenként): ");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Megmunkálási idő (perc): ");
        this.aboutLabel.setText("Szabó Szebasztián, Szoft I-1-N, 2023-04-27");

    }
    
    private void addComponent(){
        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.lengthPanel);
        this.getChildren().add(this.pushPanel);
        this.getChildren().add(this.turnPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
        this.getChildren().add(this.aboutLabel);

    }

    private void setMainPanel(){
        this.setAlignment(Pos.CENTER);

    }
    
    public InputPanel getLengthPanel() {
        return lengthPanel;

    }

    public InputPanel getPushPanel() {
        return pushPanel;

    }

    public InputPanel getTurnPanel() {
        return turnPanel;

    }
    
    public ButtonPanel getButtonPanel() {
        return buttonPanel;

    }

    public InputPanel getVolumePanel() {
        return volumePanel;

    }
    
}
