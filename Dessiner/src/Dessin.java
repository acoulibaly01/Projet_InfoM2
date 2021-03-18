import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Dessin Atelier") ;
    setSize (600, 400) ;
    setLocation(200,50);
    zoneGraphique = new Paneau() ;
    getContentPane().add(zoneGraphique) ;
  }
  private Paneau zoneGraphique ;
}

class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    g.drawRect  (0,  0,  60, 40) ;
    g.drawRect  (200, 10, 60, 40) ;
    g.drawOval (200,  60, 110, 110) ;
    g.drawOval (0,  50, 200, 100) ;
    g.drawString("M5", 100,100);
  }
}

public class Dessin
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



