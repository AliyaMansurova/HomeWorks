package Task2;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;
/**
 * Created by User on 31.01.2017.
 */
public class Questions extends JFrame implements ItemListener{
    Locale locale;
    JPanel pnl=new JPanel();
    JLabel label=new JLabel();
    JComboBox<String>questions=new JComboBox<String>();
    ButtonGroup language=new ButtonGroup();
    JRadioButton english=new JRadioButton("EN");
    JRadioButton rus=new JRadioButton("RUS",true);
    JTextArea txtArea=new JTextArea(5,38);
    ResourceBundle bundle1;
    ArrayList<String>answers=new ArrayList<String>();
    public Questions(){
        super("Questions");
        setSize(1000,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        locale=new Locale("ru");
        english.addItemListener(this);
        rus.addItemListener(this);
        questions.addItemListener(this);
        init();
        add(pnl);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent event){
        if(event.getItemSelectable()==english){
            locale=new Locale("en");
            init();

        }
        if(event.getItemSelectable()==rus){
            locale=new Locale("ru");
            init();
        }
        if((event.getItemSelectable()==questions)&&(event.getStateChange()==ItemEvent.SELECTED)){

            Integer index=questions.getSelectedIndex();
            int id=index;
            if (questions.getSelectedIndex()==0)
            {
                txtArea.removeAll();
                txtArea.setText(answers.get(0));
            }
            if (questions.getSelectedIndex()==1)
            {
                txtArea.removeAll();
                txtArea.setText(answers.get(1));
            }
            if (questions.getSelectedIndex()==2)
            {
                txtArea.removeAll();
                txtArea.setText(answers.get(2));
            }
            if (questions.getSelectedIndex()==3)
            {
                txtArea.removeAll();
                txtArea.setText(answers.get(3));
            }

        }

    }
    public void init(){
        questions.removeAllItems();
        bundle1=ResourceBundle.getBundle("prop",locale);
        String question1 = bundle1.getString("Question1");
        String question2 = bundle1.getString("Question2");
        String question3 = bundle1.getString("Question3");
        String question4 = bundle1.getString("Question4");
        String answer1=bundle1.getString("Answer1").toString();
        String answer2=bundle1.getString("Answer2").toString();
        String answer3=bundle1.getString("Answer3").toString();
        String answer4=bundle1.getString("Answer4").toString();
        answers.clear();
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        answers.add(answer4);
        questions.addItem(question1);
        questions.addItem(question2);
        questions.addItem(question3);
        questions.addItem(question4);
        language.add(english);
        language.add(rus);
        pnl.add(questions);
        pnl.add(english);
        pnl.add(rus);
        pnl.add(txtArea);
    }
    public static void main(String[] args) {
        Questions questionsWindow=new Questions();
    }
}
