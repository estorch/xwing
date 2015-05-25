import com.codedoge.*;

public class Main {
    public static void main(String[] args) {
      Ship xwing = new Xwing(new Lasers(new Missiles(new Shields(new SimpleShip()))));

      xwing.outputAttachments();

    }
}
