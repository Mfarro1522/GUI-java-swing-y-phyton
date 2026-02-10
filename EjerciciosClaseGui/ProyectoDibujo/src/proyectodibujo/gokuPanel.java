package proyectodibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author mauricio
 * Panel de dibujo de Goku con animaciones, aura de energía,
 * fondo dinámico, partículas y efectos de transformación.
 * 
 * Controles:
 *   ESPACIO  = Cambiar transformación
 */

public class gokuPanel extends JPanel implements ActionListener {
    
    // --- Transformación actual ---
    private int transformacionActual = 0;
    private final String[] nombresTransformacion = {
        "Goku Base", "Super Saiyajin", "Super Saiyajin Blue",
        "Ultra Instinto", "Super Saiyajin rosa"
    };
    private final Color[] coloresTransformacion = {
        Color.BLACK,
        new Color(255, 215, 0),
        new Color(0, 150, 255),
        new Color(200, 200, 210),
        new Color(255, 100, 150)
    };
    // Colores del aura por transformación
    private final Color[][] coloresAura = {
        {new Color(255, 255, 255, 0), new Color(255, 255, 255, 0)},           // Base: sin aura
        {new Color(255, 255, 100, 120), new Color(255, 180, 0, 0)},           // SSJ: dorado
        {new Color(80, 180, 255, 130), new Color(0, 80, 255, 0)},             // Blue: azul
        {new Color(220, 220, 240, 140), new Color(180, 180, 220, 0)},         // UI: plateado
        {new Color(255, 120, 180, 120), new Color(200, 50, 100, 0)}            // Rosé: rosa
    };
    
    // --- Animación ---
    private Timer timer;
    private int tick = 0;
    private Random rand = new Random();
    
    // --- Estrellas ---
    private double[] estrellaX, estrellaY, estrellaBrillo, estrellaVel;
    private int numEstrellas = 120;
    
    // --- Partículas de energía ---
    private ArrayList<double[]> particulas = new ArrayList<>(); // x, y, vx, vy, vida, tamaño
    
    // --- Efecto flash al cambiar transformación ---
    private int flashAlpha = 0;
    
    public gokuPanel() {
        setFocusable(true);
        
        // Inicializar estrellas
        estrellaX = new double[numEstrellas];
        estrellaY = new double[numEstrellas];
        estrellaBrillo = new double[numEstrellas];
        estrellaVel = new double[numEstrellas];
        for (int i = 0; i < numEstrellas; i++) {
            estrellaX[i] = rand.nextDouble();
            estrellaY[i] = rand.nextDouble() * 0.6; // solo en la parte superior
            estrellaBrillo[i] = rand.nextDouble();
            estrellaVel[i] = 0.005 + rand.nextDouble() * 0.02;
        }
        
        // Generar partículas iniciales
        for (int i = 0; i < 30; i++) {
            agregarParticula();
        }
        
        // Timer para animación (30 FPS)
        timer = new Timer(33, this);
        timer.start();
        
        // Listener de teclado
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    transformacionActual = (transformacionActual + 1) % nombresTransformacion.length;
                    flashAlpha = 255; // Flash blanco al transformarse
                }
            }
        });
    }
    
    /** Agrega una partícula de energía en posición aleatoria alrededor de Goku */
    private void agregarParticula() {
        double px = 400 + rand.nextDouble() * 300;
        double py = 100 + rand.nextDouble() * 400;
        double vx = (rand.nextDouble() - 0.5) * 2;
        double vy = -0.5 - rand.nextDouble() * 2;
        double vida = 40 + rand.nextInt(60);
        double tam = 2 + rand.nextDouble() * 5;
        particulas.add(new double[]{px, py, vx, vy, vida, tam, vida});
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tick++;
        
        // brillo de estrellas para que paresca que parpadea
        for (int i = 0; i < numEstrellas; i++) {
            estrellaBrillo[i] += Math.sin(tick * estrellaVel[i]) * 0.05;
            
            if (estrellaBrillo[i] < 0) estrellaBrillo[i] = 0;
            if (estrellaBrillo[i] > 1) estrellaBrillo[i] = 1;
            
        }
        
        // particulas efecto nieve
        for (int i = particulas.size() - 1; i >= 0; i--) {
            double[] p = particulas.get(i);
            p[0] += p[2]; // mover x
            p[1] += p[3]; // mover y
            p[4] -= 1;    // reducir vida
            if (p[4] <= 0) {
                particulas.remove(i);
                agregarParticula(); // reemplazar
            }
        }
        
        // Reducir flash
        if (flashAlpha > 0) {
            flashAlpha = Math.max(0, flashAlpha - 12);
        }
        
        repaint();
    }
    
    /** Color del pelo según la transformación actual */
    private Color getColorPelo() {
        return coloresTransformacion[transformacionActual];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

        // Activar antialiasing para bordes suaves
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        // cielo
        GradientPaint cieloGrad = new GradientPaint(0, 0, new Color(5, 5, 30),
                                                     0, h, new Color(25, 15, 60));
        g2d.setPaint(cieloGrad);
        g2d.fillRect(0, 0, w, h);
        
        // estrellas
        for (int i = 0; i < numEstrellas; i++) {
            int sx = (int)(estrellaX[i] * w);
            int sy = (int)(estrellaY[i] * h);
            float brillo = (float)Math.max(0, Math.min(1, estrellaBrillo[i]));
            g2d.setColor(new Color(1f, 1f, 1f, brillo * 0.8f));
            int tam = (brillo > 0.7) ? 3 : 2;
            g2d.fillOval(sx, sy, tam, tam);
            // Resplandor para estrellas brillantes
            if (brillo > 0.6) {
                g2d.setColor(new Color(1f, 1f, 1f, brillo * 0.2f));
                g2d.fillOval(sx - 2, sy - 2, tam + 4, tam + 4);
            }
        }
        
        // montañas
        dibujarMontanas(g2d, w, h);
        
        // piso
        GradientPaint pisoGrad = new GradientPaint(0, (int)(h * 0.82), new Color(20, 60, 20),
                                                    0, h, new Color(10, 35, 10));
        g2d.setPaint(pisoGrad);
        g2d.fillRect(0, (int)(h * 0.82), w, (int)(h * 0.2));
        
        // aura
        if (transformacionActual != 0) { // Sin aura en forma base
            dibujarAura(g2d, w, h);
        }
        
        // Grosor de los bordes
        g2d.setStroke(new BasicStroke(3));
        
        // goku
        dibujarCabeza(g2d, 0, 0, 1, getColorPelo());
        
        // energia
        if (transformacionActual != 0) {
            dibujarParticulas(g2d);
        }
        
        // texto
        dibujarTextoTransformacion(g2d, w, h);
        
        // instrucciones
        g2d.setFont(new Font("Consolas", Font.PLAIN, 13));
        g2d.setColor(new Color(255, 255, 255, 150));
        g2d.drawString("[ ESPACIO ] Transformar", 20, h - 20);
        
        // flash de la transformacion
        if (flashAlpha > 0) {
            g2d.setColor(new Color(255, 255, 255, flashAlpha));
            g2d.fillRect(0, 0, w, h);
        }
    }
    

    private void dibujarMontanas(Graphics2D g2d, int w, int h) {
        int baseY = (int)(h * 0.82);

        g2d.setColor(new Color(15, 20, 50));
        int[] mx1 = {0, (int)(w*0.1), (int)(w*0.2), (int)(w*0.3), (int)(w*0.38),
                     (int)(w*0.5), (int)(w*0.6), (int)(w*0.72), (int)(w*0.85), w, w, 0};
        int[] my1 = {baseY, baseY-80, baseY-140, baseY-90, baseY-180,
                     baseY-120, baseY-160, baseY-100, baseY-130, baseY-60, baseY, baseY};
        g2d.fillPolygon(mx1, my1, mx1.length);

        g2d.setColor(new Color(10, 30, 15));
        int[] mx2 = {0, (int)(w*0.15), (int)(w*0.25), (int)(w*0.4), (int)(w*0.55),
                     (int)(w*0.65), (int)(w*0.78), (int)(w*0.9), w, w, 0};
        int[] my2 = {baseY, baseY-60, baseY-100, baseY-50, baseY-80,
                     baseY-110, baseY-70, baseY-90, baseY-40, baseY, baseY};
        g2d.fillPolygon(mx2, my2, mx2.length);
    }
    

    private void dibujarAura(Graphics2D g2d, int w, int h) {
        Color[] aura = coloresAura[transformacionActual];
        float pulso = (float)(0.8 + 0.2 * Math.sin(tick * 0.1));
        int cx = 500;
        int cy = 350;
        int radio = (int)(280 * pulso);
        
        Point2D center = new Point2D.Float(cx, cy);
        float[] dist = {0.0f, 1.0f};
        Color[] colors = {aura[0], aura[1]};
        
        RadialGradientPaint auraPaint = new RadialGradientPaint(center, radio, dist, colors);
        g2d.setPaint(auraPaint);
        g2d.fillOval(cx - radio, cy - radio, radio * 2, radio * 2);
        

        float pulso2 = (float)(0.9 + 0.1 * Math.sin(tick * 0.15 + 1));
        int radio2 = (int)(320 * pulso2);
        Color auraExterna1 = new Color(aura[0].getRed(), aura[0].getGreen(), aura[0].getBlue(), 40);
        Color auraExterna2 = new Color(aura[1].getRed(), aura[1].getGreen(), aura[1].getBlue(), 0);
        RadialGradientPaint aura2 = new RadialGradientPaint(center, radio2, dist,
                new Color[]{auraExterna1, auraExterna2});
        g2d.setPaint(aura2);
        g2d.fillOval(cx - radio2, cy - radio2, radio2 * 2, radio2 * 2);
    }
    
    
    private void dibujarParticulas(Graphics2D g2d) {
        Color colorBase = coloresTransformacion[transformacionActual];
        for (double[] p : particulas) {
            float alpha = (float)(p[4] / p[6]); // vida restante / vida total
            alpha = Math.max(0, Math.min(1, alpha));
            int r = Math.min(255, colorBase.getRed() + 50);
            int gVal = Math.min(255, colorBase.getGreen() + 50);
            int b = Math.min(255, colorBase.getBlue() + 50);
            g2d.setColor(new Color(r, gVal, b, (int)(alpha * 180)));
            int tam = (int)(p[5] * alpha);
            g2d.fillOval((int)p[0], (int)p[1], tam, tam);
            // Brillo interno
            g2d.setColor(new Color(255, 255, 255, (int)(alpha * 100)));
            g2d.fillOval((int)p[0] + 1, (int)p[1] + 1, Math.max(1, tam - 2), Math.max(1, tam - 2));
        }
    }

    
    private void dibujarTextoTransformacion(Graphics2D g2d, int w, int h) {
        String nombre = nombresTransformacion[transformacionActual];
        Color color = coloresTransformacion[transformacionActual];
        g2d.setFont(new Font("Impact", Font.BOLD, 36));
        int textW = g2d.getFontMetrics().stringWidth(nombre);
        int textX = (w - textW) / 2;
        int textY = 50;
        
        // sombra del texto
        g2d.setColor(new Color(0, 0, 0, 180));
        g2d.drawString(nombre, textX + 3, textY + 3);
        
        float glowAlpha = (float)(0.5 + 0.3 * Math.sin(tick * 0.08));
        if (transformacionActual != 0) {
            g2d.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(),
                                   (int)(glowAlpha * 120)));
            for (int dx = -2; dx <= 2; dx++) {
                for (int dy = -2; dy <= 2; dy++) {
                    g2d.drawString(nombre, textX + dx, textY + dy);
                }
            }
        }
        
        if (transformacionActual == 0) {
            g2d.setColor(Color.WHITE);
        } else {
            g2d.setColor(new Color(
                Math.min(255, color.getRed() + 80),
                Math.min(255, color.getGreen() + 80),
                Math.min(255, color.getBlue() + 80)
            ));
        }
        g2d.drawString(nombre, textX, textY);
    }
    

    public void dibujarCabeza(Graphics2D g2d, double x, double y, double escala, Color colorPelo) {
        

        Color pelo = colorPelo;
        
        // cabello negro de goku
        int cabX[] = {524,277,334,211,311,132,216,345,261,311,392,443,461,522,558,594,623,646,721,783,821,726,785,819,695,771,666,714};
        int cabY[] = {505,459,443,352,352,200,167,194,18,19,32,52,75,162,160,170,190,232,221,222,228,300,320,340,412,431,462,488};
    
        // Aplicar escala y desplazamiento a las coordenadas
        int[] cabXEsc = escalarCoords(cabX, x, escala);
        int[] cabYEsc = escalarCoords(cabY, y, escala);
        
        // dibujar como poligono
        g2d.drawPolygon(cabXEsc, cabYEsc, cabXEsc.length);
        //dar relleno con color
        g2d.setColor(pelo);
        g2d.fillPolygon(cabXEsc, cabYEsc, cabXEsc.length);

        //cara
        //primero un circulo
        g2d.setColor(new Color(255, 221, 187));
        g2d.fillOval((int)(371*escala + x), (int)(240*escala + y), (int)(261*escala), (int)(230*escala));
        //completar cara
        int[] mentX = {375,394,398,406,420,468,486,496,510,529,568,596,605,610,617,627};
        int[] mentY = {374,462,473,484,494,518,526,528,528,523,501,479,468,450,421,386};
        int[] mentXEsc = escalarCoords(mentX, x, escala);
        int[] mentYEsc = escalarCoords(mentY, y, escala);
        //dibujar
        g2d.drawPolygon(mentXEsc, mentYEsc, mentXEsc.length);
        g2d.fillPolygon(mentXEsc, mentYEsc, mentXEsc.length);
        // Primero dibujar todos los contornos negros
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(mentXEsc, mentYEsc, mentXEsc.length);
        g2d.drawOval((int)(371*escala + x), (int)(240*escala + y), (int)(261*escala), (int)(230*escala));
        
        // Luego rellenar con los colores correspondientes
        g2d.setColor(new Color(255, 221, 187));
        g2d.fillOval((int)(371*escala + x), (int)(240*escala + y), (int)(261*escala), (int)(230*escala));
        g2d.fillPolygon(mentXEsc, mentYEsc, mentXEsc.length);
        //sombra cara
        int[] somCaraX = {466,420,412,407,402,399,380,376,382,397,414,419,501,483,472,468,468,471,473,474,472,434,429,424,422,423,428,444,463,466};
        int[] somCaraY = {518,494,489,484,477,471,401,381,350,300,272,267,251,274,291,304,316,330,340,355,374,437,442,448,461,475,482,499,511,518};
        int[] somCaraXEsc = escalarCoords(somCaraX, x, escala);
        int[] somCaraYEsc = escalarCoords(somCaraY, y, escala);
        g2d.setColor(new Color(221, 153, 136));
        g2d.fillPolygon(somCaraXEsc, somCaraYEsc, somCaraXEsc.length);
        //oreja izquierda
        int[] orejIzX = {347,345,345,346,346,349,354,362,371,375,395,390,377,371,362};
        int[] orejIzY = {434,404,391,384,379,376,373,375,383,386,466,471,467,463,454};
        int[] orejIzXEsc = escalarCoords(orejIzX, x, escala);
        int[] orejIzYEsc = escalarCoords(orejIzY, y, escala);
        //primero su filo negro
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(orejIzXEsc, orejIzYEsc, orejIzXEsc.length);
        //rellenar con los colores
        g2d.setColor(new Color(221, 153, 136));
        g2d.fillPolygon(orejIzXEsc, orejIzYEsc, orejIzXEsc.length);
        
        //linea oreja iz
        int[] filOrejIz1X = {390,383,380,378,375,371,367,365,369,374,379,382,386,387};
        int[] filOrejIz1Y = {450,449,450,451,445,442,440,436,436,436,439,440,438,436};
        int[] filOrejIz1XEsc = escalarCoords(filOrejIz1X, x, escala);
        int[] filOrejIz1YEsc = escalarCoords(filOrejIz1Y, y, escala);
        //dibujar linea
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOrejIz1XEsc, filOrejIz1YEsc, filOrejIz1XEsc.length);

        int[] filOrejIz2X = {364,366,371,376,377,373,370,368,364,363,361,361,363,364,368,365,361,357,353,350,350};
        int[] filOrejIz2Y = {436,428,421,413,408,403,399,396,399,406,413,412,406,401,396,393,390,388,389,395,400};
        int[] filOrejIz2XEsc = escalarCoords(filOrejIz2X, x, escala);
        int[] filOrejIz2YEsc = escalarCoords(filOrejIz2Y, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOrejIz2XEsc, filOrejIz2YEsc, filOrejIz2XEsc.length);
        
        //oreja derecha
        int[] orejDeX = {625,632,642,646,652,659,661,661,660,656,652,641,627,620,606,614,616};
        int[] orejDeY = {388,383,376,373,372,377,387,408,420,437,442,454,464,469,468,438,435};
        int[] orejDeXEsc = escalarCoords(orejDeX, x, escala);
        int[] orejDeYEsc = escalarCoords(orejDeY, y, escala);

        
        g2d.setColor(new Color(255, 221, 187));
        g2d.fillPolygon(orejDeXEsc, orejDeYEsc, orejDeXEsc.length);

        //linea oreja derecha
        int[] filOrejDe1X = {610,619,622,624,627,631,635,637,633,628,623,620,616,615};
        int[] filOrejDe1Y = {450,449,450,451,445,442,440,436,436,436,439,440,438,436};
        int[] filOrejDe1XEsc = escalarCoords(filOrejDe1X, x, escala);
        int[] filOrejDe1YEsc = escalarCoords(filOrejDe1Y, y, escala);
        //dibujar linea
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOrejDe1XEsc, filOrejDe1YEsc, filOrejDe1XEsc.length);

        int[] filOrejDe2X = {636,634,629,624,623,627,630,632,636,637,639,639,637,636,632,635,639,643,647,650,650};
        int[] filOrejDe2Y = {436,428,421,413,408,403,399,396,399,406,413,412,406,401,396,393,390,388,389,395,400};
        int[] filOrejDe2XEsc = escalarCoords(filOrejDe2X, x, escala);
        int[] filOrejDe2YEsc = escalarCoords(filOrejDe2Y, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOrejDe2XEsc, filOrejDe2YEsc, filOrejDe2XEsc.length);
        
        int[] fleqX = {352,388,383,407,405,400,398,418,419,425,438,440,
            452,455,459,484,516,518,518,519,516,513,510,501,496,505,512,516,519,
            520,521,522,528,533,542,544,534,527,526,529,542,545,546,581,586,599,
            600,592,596,599,602,603,608,608,607,605,600,599,601,620,613,615,625,660,674,629,566,457,373};
        int[] fleqY = {370,391,354,368,351,320,300,270,287,324,364,356,
            313,301,293,267,241,240,254,271,289,307,321,342,350,336,319,304,291,
            275,253,243,255,265,288,299,309,319,324,322,312,311,352,320,328,318,
            315,307,300,292,281,282,298,318,331,348,371,376,376,359,396,395,388,362,349,270,222,218,241};
        int[] fleqXEsc = escalarCoords(fleqX, x, escala);
        int[] fleqYEsc = escalarCoords(fleqY, y, escala);
        g2d.setColor(pelo);
        g2d.fillPolygon(fleqXEsc, fleqYEsc, fleqXEsc.length);
            
        int[] cejaX = {405,417,423,453,457,471,473,466,460,456,421,411};
        int[] cejaY = {314,325,318,307,309,325,324,308,300,297,296,306};
        int[] cejaXEsc = escalarCoords(cejaX, x, escala);
        int[] cejaYEsc = escalarCoords(cejaY, y, escala);
        
        g2d.setColor(pelo);
        g2d.fillPolygon(cejaXEsc, cejaYEsc, cejaXEsc.length);


        //ojo izquierdo
        g2d.setColor(Color.WHITE);
        g2d.fillOval((int)(408*escala + x), (int)(348*escala + y), (int)(64*escala), (int)(85*escala));
        
        //filo ojo izquierdo desde 0 a 270 grados
        g2d.setColor(Color.BLACK);
        g2d.drawArc((int)(408*escala + x), (int)(348*escala + y), (int)(64*escala), (int)(85*escala), 0, 220);
        
        //resto del ojo izquierdo
        int[] ojoIzX = {472,473,468,462,449,418,414,410,408};
        int[] ojoIzY = {389,428,432,433,434,434,427,415,398};
        int[] ojoIzXEsc = escalarCoords(ojoIzX, x, escala);
        int[] ojoIzYEsc = escalarCoords(ojoIzY, y, escala);
        g2d.setColor(Color.WHITE);
        g2d.fillPolygon(ojoIzXEsc, ojoIzYEsc, ojoIzXEsc.length);
        int[] filOjoIzX = {449,418,414,410,408};
        int[] filOjoIzY = {434,434,427,415,398};
        int[] filOjoIzXEsc = escalarCoords(filOjoIzX, x, escala);
        int[] filOjoIzYEsc = escalarCoords(filOjoIzY, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOjoIzXEsc, filOjoIzYEsc, filOjoIzXEsc.length);

        //pupila ojo izquierdo
        g2d.setColor(colorPelo);
        g2d.fillOval((int)(463*escala + x), (int)(390*escala + y), (int)(14*escala), (int)(22*escala));

        // línea negra
        int[] linIzX = {411, 434, 452};
        int[] linIzY = {447, 442, 441};
        int[] linIzXEsc = escalarCoords(linIzX, x, escala);
        int[] linIzYEsc = escalarCoords(linIzY, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(linIzXEsc, linIzYEsc, linIzXEsc.length);

        //ojo derecho
        g2d.setColor(Color.WHITE);
        g2d.fillOval((int)(517*escala + x), (int)(348*escala + y), (int)(64*escala), (int)(85*escala));

        //filo ojo derecho desde 320 a 220 grados (espejado)
        g2d.setColor(Color.BLACK);
        g2d.drawArc((int)(517*escala + x), (int)(348*escala + y), (int)(64*escala), (int)(85*escala), 320, 220);

        //resto del ojo derecho
        int[] ojoDeX = {517, 516, 521, 527, 540, 571, 575, 579, 581};
        int[] ojoDeY = {389, 428, 432, 433, 434, 434, 427, 415, 398};
        int[] ojoDeXEsc = escalarCoords(ojoDeX, x, escala);
        int[] ojoDeYEsc = escalarCoords(ojoDeY, y, escala);
        g2d.setColor(Color.WHITE);
        g2d.fillPolygon(ojoDeXEsc, ojoDeYEsc, ojoDeXEsc.length);
        int[] filOjoDeX = {540, 571, 575, 579, 581};
        int[] filOjoDeY = {434, 434, 427, 415, 398};
        int[] filOjoDeXEsc = escalarCoords(filOjoDeX, x, escala);
        int[] filOjoDeYEsc = escalarCoords(filOjoDeY, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(filOjoDeXEsc, filOjoDeYEsc, filOjoDeXEsc.length);

        //pupila ojo derecho
        g2d.setColor(colorPelo);
        g2d.fillOval((int)(512*escala + x), (int)(390*escala + y), (int)(14*escala), (int)(22*escala));

        // línea negra ojo derecho
        int[] linDeX = {578, 555, 537};
        int[] linDeY = {447, 442, 441};
        int[] linDeXEsc = escalarCoords(linDeX, x, escala);
        int[] linDeYEsc = escalarCoords(linDeY, y, escala);
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(linDeXEsc, linDeYEsc, linDeXEsc.length);
        
        //nariz
        int[] narizX = {495, 496, 498, 494, 489, 488};
        int[] narizY = {437, 448, 451, 454, 450, 447};
        int[] narizXEsc = escalarCoords(narizX, x, escala);
        int[] narizYEsc = escalarCoords(narizY, y, escala);
        
        // Primero dibujar el filo negro
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(narizXEsc, narizYEsc, narizXEsc.length);
        
        // Luego rellenar con color 
        g2d.setColor(new Color(187, 102, 85));
        g2d.fillPolygon(narizXEsc, narizYEsc, narizXEsc.length);

        //boca
        int[] bocaX = {472, 487, 496, 505, 518, 535};
        int[] bocaY = {465, 468, 469, 468, 464, 454};
        int[] bocaXEsc = escalarCoords(bocaX, x, escala);
        int[] bocaYEsc = escalarCoords(bocaY, y, escala);
        
        // Dibujar línea negra de la boca
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(bocaXEsc, bocaYEsc, bocaXEsc.length);
        
        //sombra del labio
        int[] somLabX = {488, 497, 503};
        int[] somLabY = {484, 482, 483};
        int[] somLabXEsc = escalarCoords(somLabX, x, escala);
        int[] somLabYEsc = escalarCoords(somLabY, y, escala);
        
        // Dibujar línea de sombra del labio
        g2d.setColor(Color.BLACK);
        g2d.drawPolyline(somLabXEsc, somLabYEsc, somLabXEsc.length);
    }

    
    private int[] escalarCoords(int[] coords, double offset, double escala) {
        int[] result = new int[coords.length];
        for (int i = 0; i < coords.length; i++) {
            result[i] = (int)(coords[i] * escala + offset);
        }
        return result;
    }

}
