package hamburger;

import javax.swing.*;
import java.awt.*;

public class ShrimpPatty extends HamburgerIngredient{
    // set its image
    public ShrimpPatty(Hamburger hamburger){
        super(hamburger);
    }

    @Override // 데코레이터 패턴으로 super의 getDescription 메소드를 호출하고 현재 객체의 이름을 덧붙인다.
    public String getDescription() {
        return super.getDescription()+" ShrimpPatty";
    }

    @Override // 해당 객체의 이미지를 불러와 그려주는 메소드
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        ImageIcon image = new ImageIcon(System.getProperty("user.dir")+"/src/images/ShrimpPatty.png");
        Image img = image.getImage();
        g2.drawImage(img,240,500-50*(MainFrame.hamList.size()-1),220,200,this);
    }
    @Override // 데코레이터 패턴으로 super의 cost 메소드를 호출하고 현재 객체의 가격을 더한다.
    public double cost(){
        return super.cost() + 900;
    }
}
