package view;

import model.Figure;

public class OutputView {
    public void showCoordinate(Figure figure){
        drawVertical(figure);
        drawHorizon();
        drawHorizonNumber();
    }

    private void drawVertical(Figure figure) {
        for(int i=24;i>0;i--){
            checkEvenNumber(i);
            System.out.print("|");
            checkPoints(figure, i);
            System.out.println();
        }
    }

    private void checkPoints(Figure figure, int y) {
        for(int x=1;x<25;x++){
            checkXY(figure, x, y);
        }
    }

    private void checkXY(Figure figure, int x, int y) {
        if(figure.hasPoint(x, y)){
            System.out.printf("%4s", "*");
        }
        if(!figure.hasPoint(x, y)){
            System.out.printf("%4s", "");
        }
    }

    private void drawHorizon() {
        System.out.printf("%5s", "+");
        for(int i=1;i<25;i++){
            System.out.print("————");
        }
        System.out.println();
    }

    private void drawHorizonNumber() {
        System.out.print("  ");
        for(int i=0;i<25;i++){
            checkEvenNumber(i);
        }
        System.out.println();
    }

    private void checkEvenNumber(int index) {
        if(index % 2 == 0){
            System.out.printf("%4d", index);
        }
        if(index % 2 != 0){
            System.out.printf("%4s", "");
        }
    }

    public void showResult(Figure figure){
        System.out.println(figure.getDistance());
    }
}
