package game.desktopmodule;

import game.game.Game;
import com.jme3.system.AppSettings;

/**
 * Used to launch a jme application in desktop environment
 *
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        final Game game = new Game();

        final AppSettings appSettings = new AppSettings(true);

        game.setSettings(appSettings);
        game.start();
    }
}
