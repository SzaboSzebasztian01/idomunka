/*
 * File: MainController.java
 * Author: Szabó Szebasztián
 * Copyright: 2023, Szebi:)
 * Group: SZOFT-I-1-N
 * Date: 2023-04-27
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package controller;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainView;

public class MainController {
    MainView mainPanel;
    MainModel mainModel;

    public MainController() {
        this.mainPanel = new MainView();
        this.mainModel = new MainModel();
        this.handleEvent();
    }

    public MainView getMainPanel() {
        return mainPanel;
    }

    private void handleEvent(){
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();

        calcButton.setOnAction( e -> onClickCalcButton() );
    }

    private void onClickCalcButton(){
        String lengthStr = this.mainPanel.getLengthPanel().getValue();
        String pushStr = this.mainPanel.getPushPanel().getValue();
        String turnStr = this.mainPanel.getTurnPanel().getValue();
        String timeStr = this.mainPanel.getTimePanel().getValue();
        double length = Double.parseDouble(lengthStr);
        double push = Double.parseDouble(pushStr);
        double turn = Double.parseDouble(turnStr);
        double time = Double.parseDouble(timeStr);
        Double volume = mainModel.calcVolume(length, push, turn, time);
        String volumeStr = volume.toString();
        
        this.mainPanel.getVolumePanel().setValue(volumeStr);
    }
    
}
