package ui;

import presenter.Presenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//сделала Валерия Григорьева
public class DesktopUI extends JFrame implements View {

    private JLabel lCity;
    private JTextArea answer;
    private JTextField city;
    private JButton findInfo;
    private Presenter presenter;

    @Override
    public void start() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lCity = new JLabel("Город: ");
        answer = new JTextArea();
        findInfo = new JButton("Узнать погоду");
        city = new JTextField();
        setLayout(null);
        add(lCity);
        add(city);
        add(findInfo);
        add(answer);
        lCity.setBounds(20, 40, 50, 25);
        city.setBounds(70, 45, 290, 20);
        findInfo.setBounds(95, 80, 200, 50);
        answer.setBounds(20, 140, 340, 160);


        findInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.getInfo(city.getText());
            }
        });

        setVisible(true);

        presenter = new Presenter(this);
    }

    @Override
    public void print(String text) {
        answer.setText(text);
    }
}
