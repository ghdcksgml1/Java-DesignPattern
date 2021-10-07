package hamburger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener {
    public static ArrayList<Hamburger> hamList = new ArrayList<>(); // [추가코드] Hamburger 객체를 저장하는 ArrayList
    JButton[] buttons = new JButton[10]; // JButton
    Hamburger hamburger = new EmptyHamburger(); // default
    JPanel displayPanel;

    public MainFrame(){
        // JFrame 기본설정
        setSize(700,800);
        setTitle("Hamburger");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 생성 후 패널의 사이즈를 w:700, h:650 으로 설정
        displayPanel = new JPanel();
        displayPanel.setPreferredSize(new Dimension(700,650));

        // 버튼생성후 addActionListener 등록
        buttons[0] = new JButton("BeefPatty");
        buttons[0].addActionListener(this);
        buttons[1] = new JButton("ChickenPatty");
        buttons[1].addActionListener(this);
        buttons[2] = new JButton("ShrimpPatty");
        buttons[2].addActionListener(this);
        buttons[3] = new JButton("Cheese");
        buttons[3].addActionListener(this);
        buttons[4] = new JButton("Lettuce");
        buttons[4].addActionListener(this);
        buttons[5] = new JButton("Tomato");
        buttons[5].addActionListener(this);
        buttons[6] = new JButton("Onion");
        buttons[6].addActionListener(this);
        buttons[7] = new JButton("Start Stack Burger");
        buttons[7].addActionListener(this);
        buttons[8] = new JButton("Finish");
        buttons[8].addActionListener(this);
        buttons[9] = new JButton("ReStart"); // [추가코드]
        buttons[9].addActionListener(this); // [추가코드]

        // Start Stack Burger 버튼과 ReStart 버튼을 제외한 모든 버튼을 비활성시킨다.
        for(int i=0;i<9;i++){
            if(i==7) continue;
            buttons[i].setEnabled(false);
        }

        // 버튼들이 들어갈 패널을 생성
        JPanel buttonPanel = new JPanel(new GridLayout(3,1));
        JPanel buttonPanel1 = new JPanel(new GridLayout(1,3));
        JPanel buttonPanel2 = new JPanel(new GridLayout(1,4));
        JPanel buttonPanel3 = new JPanel(new GridLayout(1,3));

        // 각각의 버튼패널 1,2,3에 버튼을 넣어준다.
        buttonPanel1.add(buttons[0]);buttonPanel1.add(buttons[1]);buttonPanel1.add(buttons[2]);
        buttonPanel2.add(buttons[3]);buttonPanel2.add(buttons[4]);buttonPanel2.add(buttons[5]);buttonPanel2.add(buttons[6]);
        buttonPanel3.add(buttons[7]);buttonPanel3.add(buttons[9]);buttonPanel3.add(buttons[8]);

        // 버튼패널 1,2,3을 하나의 패널로 묶어준다.
        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
        buttonPanel.add(buttonPanel3);

        // JFrame에 BorderLayout을 이용해 정렬
        this.add(displayPanel,BorderLayout.NORTH);
        this.add(buttonPanel,BorderLayout.CENTER);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 햄버거의 토핑이 9개가 초과되면 토핑이 초과되었다는 출력을 한다.
        if(hamList.size() == 10 && !(e.getSource() == buttons[8] || e.getSource() == buttons[9])){
            System.out.println("Topping is limited 10");
            return;
        }

        // 각각의 버튼에 대한 구현
        if(e.getSource() == buttons[0]){ // BeefPatty
            // 토핑을 더해준다. ex) BottomBun with BeefPatty를 만든다.
            this.hamburger = new BeefPatty(this.hamburger); // 데코레이터 패턴 구현을 위해 현재 this.hamburger 객체를 인자값으로 삽입
            hamList.add(this.hamburger); // ArrayList에 추가해준다.
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost()); // 햄버거의 토핑과 가격을 출력
        }else if(e.getSource() == buttons[1]){ // ChickenPatty
            this.hamburger = new ChickenPatty(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[2]){ // ShrimpPatty
            this.hamburger = new ShrimpPatty(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[3]){ // CheeseTopping
            this.hamburger = new CheeseTopping(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[4]){ // LettuceTopping
            this.hamburger = new LettuceTopping(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[5]){ // TomatoTopping
            this.hamburger = new TomatoTopping(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[6]){ // OnionTopping
            this.hamburger = new OnionTopping(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
        }else if(e.getSource() == buttons[7]){ // BottomBun
            System.out.println("Start!!");
            hamList.clear(); // ArrayList를 비워준다.
            this.hamburger = new BottomBun(); // EmptyBurger를 BottomBun으로 바꿔줌
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
            // Start Stack Burger 버튼을 비활성화 시키고, 나머지 버튼들은 활성화시킨다.
            for(int i=0;i<9;i++){
                buttons[i].setEnabled(true);
            }
            buttons[7].setEnabled(false);
        }else if(e.getSource() == buttons[8]){ // TopBun
            this.hamburger = new TopBun(this.hamburger);
            hamList.add(this.hamburger);
            System.out.println(this.hamburger.getDescription()+" ,"+this.hamburger.cost());
            for(int i=0;i<9;i++){
                buttons[i].setEnabled(false);
            }
            System.out.println("Finish!!");
        }else if(e.getSource() == buttons[9]){ // [추가코드]
            this.displayPanel.repaint(); // displayPanel을 깨끗하게 지운다.
            // Start Stack Burger 버튼을 활성화시키고, 나머지 버튼들은 비활성화
            for(int i=0;i<9;i++){
                buttons[i].setEnabled(false);
            }
            buttons[7].setEnabled(true);
            System.out.println("Restart!!");
        }
        this.hamburger.paintComponent(getGraphics()); // 그림을 삽입한다.
        this.hamburger.revalidate(); // 새로고침
        this.hamburger.repaint();
    }

    public static void main(String[] args){
        new MainFrame();
    }
}
