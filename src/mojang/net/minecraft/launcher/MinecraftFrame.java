
package mojang.net.minecraft.launcher;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

@SuppressWarnings("serial")
public class MinecraftFrame extends JFrame {
    private Launcher appletWrap = null;
    public MinecraftFrame(String title) {
        super(title);

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e1) {
            }
        }

        super.setVisible(true);
        setResizable(true);
        setSize(new Dimension(856, 482));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e) {
                new Thread(() -> {
                    try {
                        Thread.sleep(30000L);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    System.out.println("FORCING EXIT!");
                    System.exit(0);
                }).start();
                if (appletWrap != null) {
                    appletWrap.stop();
                    appletWrap.destroy();
                }
                System.exit(0);
            }
        });
    }

    public void start (Applet mcApplet, String user, String session) {
        try {
            appletWrap = new Launcher(mcApplet, new URL("https://www.minecraft.net/game"));
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
        appletWrap.setParameter("username", user);
        appletWrap.setParameter("sessionid", session);
        appletWrap.setParameter("stand-alone", "true");
        mcApplet.setStub(appletWrap);
        add(appletWrap);

        appletWrap.setPreferredSize(new Dimension(856, 482));
        pack();
        validate();
        appletWrap.init();
        appletWrap.start();
        setVisible(true);
    }

}
