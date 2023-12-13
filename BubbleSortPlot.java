import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class BubbleSortPlot extends Sort {
    private long counter;
    private int[] vector; // Data to be sorted

    public BubbleSortPlot() {
        counter = 0;
    }

    @Override
    public void sort(int[] vector) {
        this.vector = vector;
        counter = 0;

        counter+=1;  // i=0

        for (int i=0; i<vector.length-1; i++) {
            counter+=1;  // i<this.vector.length - 1            
            counter+=1;  // j=0
            
            for (int j=0; j<vector.length-i-1; j++) {  
                counter+=1;  // j<this.vector.length - i - 1
                counter+=1;  // this.vector[j] > this.vector[j+1]

                if (vector[j] > vector[j+1]) {
                    Sort.swap(vector, j+1, j);
                    
                    counter+=3;  // 3 assignments to swap values
                }
                
                counter+=1;  // j++
            }
            
            counter+=1;  // j<this.vector.length
            counter+=1;  // i++
        }
        
        counter+=1; // i<this.vector.length
    }

    @Override
    public long getCounter() {
        return counter;
    }

    public void plotSort() {
        JFrame frame = new JFrame("Bubble Sort");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PlotPanel());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private class PlotPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            int width = getWidth();
            int height = getHeight();

            int maxValue = getMaxValue(vector);
            int minValue = getMinValue(vector);

            int x1, x2, y1, y2;

            for (int i = 0; i < vector.length - 1; i++) {
                x1 = i * (width - 20) / (vector.length - 1) + 10;
                x2 = (i + 1) * (width - 20) / (vector.length - 1) + 10;
                y1 = height - ((vector[i] - minValue) * (height - 20) / (maxValue - minValue)) - 10;
                y2 = height - ((vector[i + 1] - minValue) * (height - 20) / (maxValue - minValue)) - 10;

                g2d.draw(new Line2D.Double(x1, y1, x2, y2));
            }
        }
    }

    private int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
