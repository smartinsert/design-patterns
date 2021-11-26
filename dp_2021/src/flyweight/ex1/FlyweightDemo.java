package flyweight.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class Test extends JFrame {
    private static final Color colors[] = {Color.red, Color.blue,
            Color.yellow, Color.orange,
            Color.black, Color.white};
    private static final int WIDTH = 400,
            HEIGHT = 400,
            NUMBER_OF_CIRCLES = 1000;

    public Test() {
        Container contentPane = getContentPane();

        JButton button = new JButton("Draw Circle");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
                    Circle circle = CircleFactory.getCircle(getRandomColor());
                    circle.draw(g, getRandomX(), getRandomY(), getRandomR());
                    //Since we have 6 different colors, we have 6 objects created.
                }
            }
        });
    }

    public static void main(String[] args) {
        Test test = new Test();
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomR() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}

class CircleFactory {
    private static final HashMap circleByColor = new HashMap();

    public static Circle getCircle(Color color) {
        Circle circle = (Circle) circleByColor.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleByColor.put(color, circle);
            System.out.println("Creating " + color + " circle");
        }
        return circle;
    }
}

class Circle {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int r) {
        g.setColor(color);
        g.drawOval(x, y, r, r);
    }
}
