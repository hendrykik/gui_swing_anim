package figury;

import java.awt.*;
import java.awt.geom.*;

public class Prostokont extends Figura {
    public Prostokont(Graphics2D buf, int del, int w, int h) {
        super(buf, del , w, h);
        aft = new AffineTransform();
        shape = new Rectangle2D.Float(0,0,20,10);
        area = new Area(shape);
    }}
