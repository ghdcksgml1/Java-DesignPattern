package hamburger;

import javax.swing.*;
import java.awt.*;

public abstract class Hamburger extends JPanel {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void paintComponent(Graphics g){

    }

    public abstract double cost();
}