package media;
import interfaceMedia.FrameInterface;

public class Media {
    public static void main(String[] args) {
        FrameInterface frame = new FrameInterface();
        frame.setVisible(true);
        frame.setTitle("Calcular Média");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}