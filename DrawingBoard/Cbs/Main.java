package DrawingBoard.Cbs;

public class Main {
    public static void main(String[] args){
        Draw canvas = new Draw();
        DrawListener listener = new DrawListener(canvas);
        canvas.showUI();

    }
}