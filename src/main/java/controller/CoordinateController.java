package controller;

import model.Figure;
import view.InputView;
import view.OutputView;

public class CoordinateController {
    InputView inputView;
    OutputView outputView;

    public CoordinateController(){
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run(){
        Figure figure = inputView.inputCoordinate();
        outputView.showCoordinate(figure);
        outputView.showResult(figure);
    }
}
