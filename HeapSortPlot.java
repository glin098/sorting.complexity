import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class HeapSortPlot extends Sort {
    private long counter;
    private int[] vector; // Data to be sorted

    public HeapSortPlot() {
        counter = 0;
    }

    @Override
    public void sort(int[] vector) {
        this.vector = vector;
        counter = 0;

        int n = vector.length - 1;

        for (int i = vector.length / 2 - 1; i >= 0; i--) {
            counter += 2;
            heapify(vector, i);
        }

        while (n > 0) {
            swap(vector, 0, n--);
            shiftDown(vector, 0, n);
            counter += 2;
        }
    }

    private void heapify(int[] vector, int parent) {
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        int maximum = parent;

        if (left < vector.length && vector[left] > vector[maximum]) {
            maximum = left;
        }
        if (right < vector.length && vector[right] > vector[maximum]) {
            maximum = right;
        }
        if (maximum != parent) {
            swap(vector, maximum, parent);
            heapify(vector, maximum);
            counter += 3;
        }
    }

    private void shiftDown(int[] vector, int parent, int last) {
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        if (left <= last) {
            if (right <= last) {
                if (vector[left] > vector[right]) {
                    if (vector[parent] < vector[left]) {
                        swap(vector, parent, left);
                        shiftDown(vector, left, last);
                        counter += 3;
                    }
                } else if (vector[parent] < vector[right]) {
                    swap(vector, parent, right);
                    shiftDown(vector, right, last);
                    counter += 3;
                }
            } else if (vector[parent] < vector[left]) {
                swap(vector, parent, left);
                counter += 3;
            }
        }
    }

    @Override
    public long getCounter() {
        return counter;
    }

    public void plotSort() {
        JFrame frame = new JFrame("Heap Sort Operation Count");
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
