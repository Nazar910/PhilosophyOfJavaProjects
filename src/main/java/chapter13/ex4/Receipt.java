package chapter13.ex4;

import java.util.Formatter;

/**
 * Created by pyvov on 15.01.2017.
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private String itemWidth;
    private String qtyWidth;
    private String priceWidth;

    private String getFormat() {
        return "%"+itemWidth+" %"+qtyWidth+" %"+priceWidth+"\n";
    }

    public void printTitle() {
        f.format(getFormat(), "Item", "Qty", "Price");
        f.format(getFormat(), "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(getFormat() , name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(getFormat(), "Tax", "", total * 0.06);
        setWidths(this.itemWidth, this.qtyWidth, this.priceWidth.substring(0, this.priceWidth.length() - 3) + "s");
        f.format(getFormat(), "", "", "-----");
        setWidths(this.itemWidth, this.qtyWidth, this.priceWidth.substring(0, priceWidth.length() - 1) + ".2f");
        f.format(getFormat(), "Total", "", total * 1.06);
    }

    public void setWidths(String itemWidth, String qtyWidth, String priceWidth) {
        this.itemWidth = itemWidth;
        this.qtyWidth = qtyWidth;
        this.priceWidth = priceWidth;
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.setWidths("-15s","5s","10s");
        receipt.printTitle();
        receipt.setWidths("-15.15s","5d","10.2f");
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Poridge", 1, 14.29);
        receipt.setWidths("-15s", "5s", "10.2f");
        receipt.printTotal();
    }
}
