package hamburger;

import javax.swing.*;
import java.awt.*;

public class BottomBun extends Hamburger{
    @Override
    public String getDescription(){
        return "BottomBun";
    }

    @Override
    public double cost() {
        return 1000;
    }

    @Override // 해당 객체의 이미지를 불러와 그려주는 메소드
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        ImageIcon image = new ImageIcon(System.getProperty("user.dir")+"/src/images/Bottombun.png");
        Image img = image.getImage();
        g2.drawImage(img,240,500,220,200,this);
    }
}
