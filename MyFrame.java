import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class MyFrame extends JFrame implements ActionListener {

    double num1;
    double num2;
    double result;
    boolean check;
    boolean check2;
    boolean check3;

    int arthkey;
    int solokey;
    int numbersystemkey = 1;
    int datatypekey = 1;
    int resultkey = 1;

    // results
    int result1;
    short result2;
    long result3;
    double result4;
    float result5;

    final double pi = 3.14;
    String text = "";

    // all the buttons
    JButton testbutton, onebutton, twobutton, threebutton, fourbutton, fivebutton, sixbutton, sevenbutton,
            eightbutton, ninebutton, zerobutton, cancelbutton, divbutton, multibutton,
            backbutton, minusbutton, plusbutton, equalbutton, cosbutton, tanbutton, sinbutton,
            cosecantbutton, secantbutton, cotbutton, dotbutton, remainderbutton, abutton, bbutton,
            cbutton, dbutton, ebutton, fbutton, logbutton, expobutton, radbutton, degreebutton, percentagebutton,
            in_sinbutton, in_cosbutton, in_tanbutton, in_secantbutton, in_cosecantbutton, in_cotbutton, sinhbutton,
            coshbutton, tanhbutton, in_sinhbutton, in_coshbutton, in_tanhbutton, negbutton;

    // textfield
    JTextField textField;

    // panels
    JPanel lowerpanel;

    // labels
    JLabel mode;
    JLabel numbersystem;
    JLabel type;

    // fonts
    Font myFont = new Font("Comic Sans", Font.BOLD, 25);
    Font myFont2 = new Font("Tahoma", Font.PLAIN, 25);
    Font myFont3 = new Font("Tahoma", Font.PLAIN, 10);
    Font myFont1 = new Font("Comic Sans", Font.BOLD, 50);

    int key = 1;

    // radio button
    JRadioButton Trignometricradiobutton;
    JRadioButton Inversetrignometricbutton;
    JRadioButton Hyperbolicbutton;
    JRadioButton binary;
    JRadioButton decimal;
    JRadioButton octal;
    JRadioButton hexadecimal;

    JRadioButton integer;
    JRadioButton short_;
    JRadioButton long_;
    JRadioButton float_;
    JRadioButton double_;

    // operator
    char operator;

    public JButton template(String a) {
        String name = a;
        JButton button = new JButton();
        button.setText(name);
        button.setBackground(Color.BLACK);
        button.setFocusable(false);
        button.setForeground(Color.ORANGE);
        button.setFont(myFont);
        button.addActionListener(this);
        return button;
    }

    public JRadioButton temp(String x) {
        String name = x;
        JRadioButton radbutton = new JRadioButton();
        radbutton.setText(name);
        radbutton.setBackground(Color.decode("#15191c"));
        radbutton.setForeground(Color.ORANGE);
        radbutton.setFont(myFont3);
        radbutton.setSize(90, 15);
        radbutton.setFocusable(false);
        radbutton.addActionListener(this);
        return radbutton;
    }

    MyFrame() {
        System.out.println("");
        // radio buttons
        // group1
        Trignometricradiobutton = temp("Trigonometric");
        Inversetrignometricbutton = temp("Inverse Trig");
        Hyperbolicbutton = temp("Hyperbolic");
        Trignometricradiobutton.setBounds(10, 80, 90, 15);
        Inversetrignometricbutton.setBounds(10, 100, 90, 15);
        Hyperbolicbutton.setBounds(10, 120, 90, 15);

        // group2
        decimal = temp("Decimal");
        octal = temp("Octal");
        hexadecimal = temp("HexaDecimal");
        binary = temp("Binary");
        decimal.setBounds(10, 225, 90, 15);
        binary.setBounds(10, 245, 90, 15);
        octal.setBounds(10, 265, 90, 15);
        hexadecimal.setBounds(10, 285, 90, 15);

        // group 3
        integer = temp("Integer");
        short_ = temp("Short");
        long_ = temp("Long");
        double_ = temp("Double");
        float_ = temp("Float");
        integer.setBounds(10, 384, 90, 15);
        short_.setBounds(10, 404, 90, 15);
        long_.setBounds(10, 424, 90, 15);
        double_.setBounds(10, 444, 90, 15);
        float_.setBounds(10, 464, 90, 15);

        // radbutton groups
        ButtonGroup group = new ButtonGroup();
        group.add(Trignometricradiobutton);
        group.add(Inversetrignometricbutton);
        group.add(Hyperbolicbutton);
        Trignometricradiobutton.setSelected(true);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(decimal);
        group2.add(binary);
        group2.add(octal);
        group2.add(hexadecimal);
        group2.add(integer);
        group2.add(short_);
        group2.add(long_);
        group2.add(float_);
        group2.add(double_);

        // already selected radio buttons
        integer.setSelected(true);
        Trignometricradiobutton.setSelected(true);

        // buttons
        // initialization
        onebutton = template("1");
        twobutton = template("2");
        threebutton = template("3");
        fourbutton = template("4");
        fivebutton = template("5");
        sixbutton = template("6");
        sevenbutton = template("7");
        eightbutton = template("8");
        ninebutton = template("9");
        zerobutton = template("0");
        cosbutton = template("cos");
        sinbutton = template("sin");
        tanbutton = template("tan");
        cosecantbutton = template("csc");
        secantbutton = template("sec");
        cotbutton = template("cot");
        plusbutton = template("+");
        minusbutton = template("-");
        multibutton = template("x");
        divbutton = template("/");
        cancelbutton = template("c");
        backbutton = template("<");
        equalbutton = template("=");
        dotbutton = template(".");
        remainderbutton = template("Rem");
        abutton = template("A");
        bbutton = template("B");
        cbutton = template("C");
        dbutton = template("D");
        ebutton = template("E");
        fbutton = template("F");
        logbutton = template("ln");
        expobutton = template("^");
        percentagebutton = template("%");
        radbutton = template("Rad");
        degreebutton = template("Deg");
        in_sinbutton = template("sin^-1");
        in_cosbutton = template("cos^-1");
        in_tanbutton = template("tan^-1");
        in_cosecantbutton = template("csc^-1");
        in_secantbutton = template("sec^-1");
        in_cotbutton = template("cot^-1");
        sinhbutton = template("sinh");
        coshbutton = template("cosh");
        tanhbutton = template("tanh");
        in_sinhbutton = template("sinh^-1");
        in_coshbutton = template("cosh^-1");
        in_tanhbutton = template("tanh^-1");
        negbutton = template("(-)");
        negbutton.setBounds(13, 520, 90, 20);
        negbutton.setFont(myFont3);

        // textfield

        textField = new JTextField();
        textField.setBackground(Color.decode("#585d60"));
        textField.setBounds(122, 0, 800, 188);
        textField.setForeground(Color.ORANGE);
        textField.setFont(myFont1);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);

        // labels
        mode = new JLabel();

        mode.setText("Modes");
        mode.setFont(myFont2);
        mode.setForeground(Color.ORANGE);
        mode.setBounds(22, 10, 120, 50);

        numbersystem = new JLabel("System");
        numbersystem.setFont(myFont2);
        numbersystem.setForeground(Color.ORANGE);
        numbersystem.setBounds(22, 155, 120, 50);

        type = new JLabel("Type");
        type.setFont(myFont2);
        type.setForeground(Color.ORANGE);
        type.setBounds(22, 318, 120, 50);

        // panels

        // sidepanel
        JPanel sidepanel = new JPanel();
        sidepanel.setBackground(Color.decode("#15191c"));
        sidepanel.setBounds(0, 0, 120, 618);
        sidepanel.setLayout(null);

        // adding components
        sidepanel.add(mode);
        sidepanel.add(numbersystem);
        sidepanel.add(Trignometricradiobutton);
        sidepanel.add(Inversetrignometricbutton);
        sidepanel.add(Hyperbolicbutton);
        sidepanel.add(decimal);
        sidepanel.add(binary);
        sidepanel.add(octal);
        sidepanel.add(hexadecimal);
        sidepanel.add(negbutton);
        sidepanel.add(type);
        sidepanel.add(integer);
        sidepanel.add(short_);
        sidepanel.add(long_);
        sidepanel.add(double_);
        sidepanel.add(float_);

        // upperpanel
        JPanel upperpanel = new JPanel();
        upperpanel.setBackground(Color.decode("#585d60"));
        upperpanel.setBounds(122, 0, 615, 188);
        upperpanel.setLayout(new BorderLayout());
        upperpanel.add(textField);

        // lowerpanel
        lowerpanel = new JPanel();
        lowerpanel.setBackground(Color.decode("#23282c"));
        lowerpanel.setBounds(120, 188, 800, 390);
        lowerpanel.setLayout(new GridLayout(5, 6));
        normal_keys();
        dotbutton.setEnabled(false);

        // jframe
        this.setSize(935, 618);
        this.getContentPane().setBackground(Color.decode("#23282c"));
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setLayout(null);
        ImageIcon iconn = new ImageIcon("title.png");
        this.setIconImage(iconn.getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(sidepanel);
        this.add(upperpanel);
        this.add(lowerpanel);
        this.add(textField);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        button_placements(e);
        datatype(e);
        trig_operations(e);
        arth_operations(e);

        // switch (numbersystemkey){
        // case 1:
        // trig_operations(e);
        //
        // arth_operations_int(e);
        // break;
        // case 2:
        //
        // trig_operations(e);
        // arth_operations_double(e);
        // break;
        // case 3:
        //
        // //arth_operations_short(e);
        // break;
        // case 4:
        //
        // //arth_operations_long(e);
        // break;
        // case 5:
        //
        // //arth_operations_float(e);
        // break;
        // }
        // backend
    }

    public void datatype(ActionEvent e) {
        if (e.getSource() == integer) {
            datatypekey = 1;
            resultkey = 1;
        }
        if (e.getSource() == short_) {
            datatypekey = 1;
            resultkey = 2;
        }
        if (e.getSource() == long_) {
            datatypekey = 1;
            resultkey = 3;

        }
        if (e.getSource() == double_) {
            datatypekey = 2;
            resultkey = 4;

        }
        if (e.getSource() == float_) {
            datatypekey = 2;
            resultkey = 5;

        }

    }

    public void trig_operations(ActionEvent e) {
        if (e.getSource() == sinbutton) {
            textField.setText(textField.getText().concat("sin"));
            arthkey = 1;
        }
        if (e.getSource() == cosbutton) {
            textField.setText(textField.getText().concat("cos"));
            arthkey = 2;
        }
        if (e.getSource() == tanbutton) {
            textField.setText(textField.getText().concat("tan"));
            arthkey = 3;
        }
        if (e.getSource() == cosecantbutton) {
            textField.setText(textField.getText().concat("csc"));
            arthkey = 4;
        }
        if (e.getSource() == secantbutton) {
            textField.setText(textField.getText().concat("sec"));
            arthkey = 5;
        }
        if (e.getSource() == cotbutton) {
            textField.setText(textField.getText().concat("cot"));
            arthkey = 6;
        }

        if (e.getSource() == logbutton) {
            textField.setText(textField.getText().concat("log"));
            arthkey = 7;
        }

        if (e.getSource() == in_sinbutton) {
            textField.setText(textField.getText().concat("in_sin"));
            arthkey = 8;
        }
        if (e.getSource() == in_cosbutton) {
            textField.setText(textField.getText().concat("in_cos"));
            arthkey = 9;
        }
        if (e.getSource() == in_tanbutton) {
            textField.setText(textField.getText().concat("in_tan"));
            arthkey = 10;
        }
        if (e.getSource() == in_cosecantbutton) {
            textField.setText(textField.getText().concat("in_cosecant"));
            arthkey = 11;
        }
        if (e.getSource() == in_secantbutton) {
            textField.setText(textField.getText().concat("in_secant"));
            arthkey = 12;
        }
        if (e.getSource() == in_cotbutton) {
            textField.setText(textField.getText().concat("in_cot"));
            arthkey = 13;
        }

        // -----------------------------------------------------------Hyperbolic
        // function-------------------------------------------

        if (e.getSource() == sinhbutton) {
            textField.setText(textField.getText().concat("sinh"));
            arthkey = 14;
        }
        if (e.getSource() == coshbutton) {
            textField.setText(textField.getText().concat("cosh"));
            arthkey = 15;
        }
        if (e.getSource() == tanhbutton) {
            textField.setText(textField.getText().concat("tanh"));
            arthkey = 16;
        }
        if (e.getSource() == in_sinhbutton) {
            textField.setText(textField.getText().concat("in_sinh"));
            arthkey = 17;
        }
        if (e.getSource() == in_coshbutton) {
            textField.setText(textField.getText().concat("in_cosh"));
            arthkey = 18;
        }
        if (e.getSource() == in_tanhbutton) {
            textField.setText(textField.getText().concat("in_coth"));
            arthkey = 19;
        }
    }

    public void arth_operations(ActionEvent e) {

        if (e.getSource() == onebutton) {
            textField.setText(textField.getText().concat("1"));
        }
        if (e.getSource() == twobutton) {
            textField.setText(textField.getText().concat("2"));
        }

        if (e.getSource() == threebutton) {
            textField.setText(textField.getText().concat("3"));
        }

        if (e.getSource() == fourbutton) {
            textField.setText(textField.getText().concat("4"));
        }

        if (e.getSource() == fivebutton) {
            textField.setText(textField.getText().concat("5"));
        }

        if (e.getSource() == sixbutton) {
            textField.setText(textField.getText().concat("6"));
        }

        if (e.getSource() == sevenbutton) {
            textField.setText(textField.getText().concat("7"));
        }

        if (e.getSource() == eightbutton) {
            textField.setText(textField.getText().concat("8"));
        }

        if (e.getSource() == ninebutton) {
            textField.setText(textField.getText().concat("9"));
        }

        if (e.getSource() == zerobutton) {
            textField.setText(textField.getText().concat("0"));
        }

        if (e.getSource() == plusbutton) {
            logic(e);
        }

        if (e.getSource() == minusbutton) {
            logic1(e);
        }
        if (e.getSource() == multibutton) {
            logic2(e);
        }
        if (e.getSource() == divbutton) {
            logic3(e);
        }
        if (e.getSource() == percentagebutton) {
            logic4(e);
        }
        if (e.getSource() == remainderbutton) {
            logic5(e);
        }
        if (e.getSource() == dotbutton) {
            textField.setText(textField.getText().concat("."));

        }
        if (e.getSource() == negbutton) {
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            textField.setText(String.valueOf(temp));
        }
        if (e.getSource() == expobutton) {
            textField.setText(textField.getText().concat("^"));
            operator = '^';
        }
        if (e.getSource() == cancelbutton) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            arthkey = 0;
            solokey = 0;
        }
        if (e.getSource() == backbutton) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == radbutton) {
            num1 = Double.parseDouble(textField.getText());
            num1 = (int) (num1 * (pi / 180));
            result = num1;
            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == degreebutton) {

            num1 = Double.parseDouble(textField.getText());
            num1 = (int) (num1 * (180 / pi));
            result = num1;
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == equalbutton) {
            if (solokey == 1) {
                text = textField.getText();
                check = text.matches("[0-9]+");
                System.out.println(check);
                if (false == check) {
                    switch (arthkey) {
                        case 1:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.sin(num2);
                            break;
                        case 2:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.cos(num2);
                            break;

                        case 3:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.tan(num2);
                            break;

                        case 4:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.sin(num2));
                            break;
                        case 5:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.cos(num2));
                            break;

                        case 6:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.tan(num2));
                            break;

                        case 7:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.log(num2);
                            break;
                        case 8:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.asin(num2);
                            break;

                        case 9:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.acos(num2);
                            break;
                        case 10:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.atan(num2);
                            break;
                        case 11:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.asin(num2));
                            break;
                        case 12:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.acos(num2));
                            break;
                        case 13:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = 1 / (Math.atan(num2));
                            break;
                        case 14:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.sinh(num2);
                            break;
                        case 15:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.cosh(num2);
                            break;
                        case 16:
                            text = textField.getText();
                            text = text.replaceAll("[^0-9]", "");
                            num2 = Double.parseDouble(text);
                            num2 = Math.tanh(num2);
                            break;
                        case 17:
                            break;
                        case 18:
                            break;
                        case 19:
                            break;
                    }

                } else {
                    num2 = Double.parseDouble(textField.getText());

                }
                switch (operator) {

                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case 'x':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '%':
                        result = (num1 / 100) * num2;
                        break;
                    case 'r':
                        result = num1 % num2;
                        break;
                    case '^':
                        result = Math.pow(num1, num2);
                        break;

                }

            } else {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(Double.parseDouble(text));
                        result = num1;
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(Double.parseDouble(text));
                        result = num1;
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(Double.parseDouble(text)));
                        result = num1;
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(Double.parseDouble(text)));
                        result = num1;
                        break;

                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        System.out.println(num1);
                        System.out.println(Math.tan(num1));
                        num1 = 1 / (Math.tan(Double.parseDouble(text)));
                        result = num1;
                        break;

                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);
                        result = num1;
                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(Double.parseDouble(text)));
                        result = num1;

                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(Double.parseDouble(text)));
                        result = num1;
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(Double.parseDouble(text)));
                        result = num1;
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(Double.parseDouble(text));
                        result = num1;
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                    default:
                        num1 = Double.parseDouble(textField.getText());
                        result = num1;
                        break;
                }

            }

            switch (resultkey) {

                case 1:
                    if (result < -2147483648 || result > 2147483647) {
                        System.out.println("error");

                    } else {
                        result1 = (int) result;
                        result = result1;
                        textField.setText(String.valueOf(result1));
                        num1 = result;
                        arthkey = 0;
                    }

                    break;

                case 2:
                    if (result < -32768 || result > 32768) {
                        System.out.println("error");
                    } else {
                        result2 = (short) result;
                        result = result2;
                        textField.setText(String.valueOf(result2));
                        num1 = result;
                        arthkey = 0;
                    }
                    break;
                case 3:

                    if (result < -9223372036854775808L || result > 9223372036854775807L) {
                        System.out.println("error");
                    } else {
                        result3 = (long) result;
                        result = result3;
                        textField.setText(String.valueOf(result3));
                        num1 = result;
                        arthkey = 0;
                    }
                    break;
                case 4:

                    if (result < 1.7976931348623157 * (Math.pow(10, -308))
                            || result > 1.7976931348623157 * (Math.pow(3.4, +308))) {

                        textField.setText(String.valueOf(result));
                        num1 = result;
                        arthkey = 0;

                    } else {
                        textField.setText(String.valueOf(result));
                        num1 = result;
                        arthkey = 0;
                    }
                    break;
                case 5:
                    if (result < 3.4 * (Math.pow(10, -38)) || result > 3.4 * (Math.pow(10, 38))) {
                        System.out.println("float");
                    } else {
                        result5 = (float) result;
                        result = result5;
                        textField.setText(String.valueOf(result5));
                        num1 = result;
                        arthkey = 0;
                    }
                    break;

            }

        }

    }

    // public void arth_operations_double(ActionEvent e){
    // if(e.getSource()== onebutton){
    // textField.setText(textField.getText().concat("1"));
    // }
    // if(e.getSource()== twobutton){
    // textField.setText(textField.getText().concat("2"));
    // }
    //
    // if(e.getSource()== threebutton){
    // textField.setText(textField.getText().concat("3"));
    // }
    //
    // if(e.getSource()== fourbutton){
    // textField.setText(textField.getText().concat("4"));
    // }
    //
    // if(e.getSource()== fivebutton){
    // textField.setText(textField.getText().concat("5"));
    // }
    //
    // if(e.getSource()== sixbutton){
    // textField.setText(textField.getText().concat("6"));
    // }
    //
    // if(e.getSource()== sevenbutton){
    // textField.setText(textField.getText().concat("7"));
    // }
    //
    // if(e.getSource()== eightbutton){
    // textField.setText(textField.getText().concat("8"));
    // }
    //
    // if(e.getSource()== ninebutton){
    // textField.setText(textField.getText().concat("9"));
    // }
    //
    // if(e.getSource()== zerobutton){
    // textField.setText(textField.getText().concat("0"));
    // }
    //
    // if(e.getSource()== plusbutton){
    // solokey =1;
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num3=Double.parseDouble(text);
    // num3= Math.sin(num3);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num3=Double.parseDouble(text);
    // num3= Math.log(num3);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    //
    // break;
    //
    // default:
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    //
    // }
    //
    //
    // }
    // if(e.getSource()== minusbutton){
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("-"));
    // operator='-';
    // textField.setText(""); }
    // if(e.getSource()== multibutton){
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("x"));
    // operator='x';
    // textField.setText(""); }
    // if(e.getSource()== divbutton){
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("/"));
    // operator='/';
    // textField.setText(""); }
    // if(e.getSource()== percentagebutton){
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("%"));
    // operator='%';
    // textField.setText(""); }
    // if(e.getSource()== remainderbutton){
    // num3 = Double.parseDouble(textField.getText());
    // textField.setText(textField.getText().concat("rem"));
    // operator='r';
    // textField.setText(""); }
    // if(e.getSource()== dotbutton){
    // textField.setText(textField.getText().concat("."));
    //
    // }
    // if(e.getSource()== negbutton){
    // double temp = Double.parseDouble(textField.getText());
    // temp*=-1;
    // textField.setText(String.valueOf(temp));
    // }
    // if (e.getSource()== cancelbutton){
    // textField.setText("");
    // }
    // if (e.getSource()== backbutton){
    // String string = textField.getText();
    // textField.setText("");
    // for(int i = 0 ; i<string.length()-1;i++){
    // textField.setText(textField.getText()+string.charAt(i));
    // }
    // }
    // if (e.getSource()== radbutton){
    // num3 = Double.parseDouble(textField.getText());
    // num3 = num3 * (pi /180);
    // result2=num3;
    // textField.setText(String.valueOf(result2));
    // }
    // if (e.getSource()== degreebutton){
    //
    // num3 = Double.parseDouble(textField.getText());
    // num3 = num3 * (180/pi);
    // result2=num3;
    // textField.setText(String.valueOf(result2));
    // }
    //
    //
    //
    //
    // if(e.getSource()== equalbutton){
    // if (solokey == 1){
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num4=Double.parseDouble(text);
    // num4= Math.sin(num4);
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num4=Double.parseDouble(text);
    // num4=Math.log(num4);
    // break;
    //
    // default:
    // num4 = Double.parseDouble(textField.getText());
    // break;
    //
    // }
    //
    // switch (operator){
    // case'+':
    // result2 = num3+num4;
    // break;
    // case'-':
    // result2 = num3-num4;
    // break;
    // case'x':
    // result2= num3*num4;
    // break;
    // case'/':
    // result2= num3/num4;
    // break;
    // case'%':
    // result2= (num3/100)*num4;
    // break;
    // case'r':
    // result2= num3%num4;
    // break;
    //
    // }
    // textField.setText(String.valueOf(result2));
    // num3=result2;
    // }
    // else{
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num3=Double.parseDouble(text);
    // num3= Math.sin(num3);
    // result2=num3;
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num3=Double.parseDouble(text);
    // num3=Math.log(num3);
    // result2=num3;
    // break;
    //
    // default:
    // num3 = Double.parseDouble(textField.getText());
    // result2=num3;
    // break;
    // }
    // textField.setText(String.valueOf(result2));
    // num3=result2;
    //
    // }
    //
    //
    // }
    //
    //
    //
    //
    // }
    //

    // public void arth_operations_long(ActionEvent e){
    // long num1=0;
    // long num2=0;
    // long result=0;
    // if(e.getSource()== onebutton){
    //
    // textField.setText(textField.getText().concat("1"));
    // }
    // if(e.getSource()== twobutton){
    // textField.setText(textField.getText().concat("2"));
    // }
    //
    // if(e.getSource()== threebutton){
    // textField.setText(textField.getText().concat("3"));
    // }
    //
    // if(e.getSource()== fourbutton){
    // textField.setText(textField.getText().concat("4"));
    // }
    //
    // if(e.getSource()== fivebutton){
    // textField.setText(textField.getText().concat("5"));
    // }
    //
    // if(e.getSource()== sixbutton){
    // textField.setText(textField.getText().concat("6"));
    // }
    //
    // if(e.getSource()== sevenbutton){
    // textField.setText(textField.getText().concat("7"));
    // }
    //
    // if(e.getSource()== eightbutton){
    // textField.setText(textField.getText().concat("8"));
    // }
    //
    // if(e.getSource()== ninebutton){
    // textField.setText(textField.getText().concat("9"));
    // }
    //
    // if(e.getSource()== zerobutton){
    // textField.setText(textField.getText().concat("0"));
    // }
    //
    // if(e.getSource()== plusbutton){
    // solokey =1;
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Long.parseLong(text);
    // num1= (long) Math.sin(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Long.parseLong(text);
    // num1= (long) Math.log(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    //
    // break;
    //
    // default:
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    //
    // }
    //
    //
    // }
    // if(e.getSource()== minusbutton){
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("-"));
    // operator='-';
    // textField.setText(""); }
    // if(e.getSource()== multibutton){
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("x"));
    // operator='x';
    // textField.setText(""); }
    // if(e.getSource()== divbutton){
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("/"));
    // operator='/';
    // textField.setText(""); }
    // if(e.getSource()== percentagebutton){
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("%"));
    // operator='%';
    // textField.setText(""); }
    // if(e.getSource()== remainderbutton){
    // num1 = Long.parseLong(textField.getText());
    // textField.setText(textField.getText().concat("rem"));
    // operator='r';
    // textField.setText(""); }
    // if(e.getSource()== dotbutton){
    // textField.setText(textField.getText().concat("."));
    //
    // }
    // if(e.getSource()== negbutton){
    // long temp = Long.parseLong(textField.getText());
    // temp*=-1;
    // textField.setText(String.valueOf(temp));
    // }
    // if (e.getSource()== cancelbutton){
    // textField.setText("");
    // }
    // if (e.getSource()== backbutton){
    // String string = textField.getText();
    // textField.setText("");
    // for(int i = 0 ; i<string.length()-1;i++){
    // textField.setText(textField.getText()+string.charAt(i));
    // }
    // }
    // if (e.getSource()== radbutton){
    // num1 = Long.parseLong(textField.getText());
    // num1 = num1 * (pi /180);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    // if (e.getSource()== degreebutton){
    //
    // num1 = Long.parseLong(textField.getText());
    // num1 = num1 * (180/pi);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    //
    //
    //
    //
    // if(e.getSource()== equalbutton){
    // if (solokey == 1){
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Long.parseLong(text);
    // num2= Math.sin(num2);
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Long.parseLong(text);
    // num2=Math.log(num2);
    // break;
    //
    // default:
    // num2 = Long.parseLong(textField.getText());
    // break;
    //
    // }
    //
    // switch (operator){
    // case'+':
    // result = num1+num2;
    // break;
    // case'-':
    // result = num1-num2;
    // break;
    // case'x':
    // result= num1*num2;
    // break;
    // case'/':
    // result= num1/num2;
    // break;
    // case'%':
    // result= (num1/100)*num2;
    // break;
    // case'r':
    // result= num1%num2;
    // break;
    //
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    // }
    // else{
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Long.parseLong(text);
    // num1= Math.sin(num1);
    // result=num1;
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Long.parseLong(text);
    // num1=Math.log(num1);
    // result=num1;
    // break;
    //
    // default:
    // num1 = Long.parseLong(textField.getText());
    // result=num1;
    // break;
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    //
    // }
    //
    //
    // }
    //
    //
    //
    //
    // }
    // public void arth_operations_float(ActionEvent e){
    // float num1;
    // float num2;
    // float result;
    // if(e.getSource()== onebutton){
    // textField.setText(textField.getText().concat("1"));
    // }
    // if(e.getSource()== twobutton){
    // textField.setText(textField.getText().concat("2"));
    // }
    //
    // if(e.getSource()== threebutton){
    // textField.setText(textField.getText().concat("3"));
    // }
    //
    // if(e.getSource()== fourbutton){
    // textField.setText(textField.getText().concat("4"));
    // }
    //
    // if(e.getSource()== fivebutton){
    // textField.setText(textField.getText().concat("5"));
    // }
    //
    // if(e.getSource()== sixbutton){
    // textField.setText(textField.getText().concat("6"));
    // }
    //
    // if(e.getSource()== sevenbutton){
    // textField.setText(textField.getText().concat("7"));
    // }
    //
    // if(e.getSource()== eightbutton){
    // textField.setText(textField.getText().concat("8"));
    // }
    //
    // if(e.getSource()== ninebutton){
    // textField.setText(textField.getText().concat("9"));
    // }
    //
    // if(e.getSource()== zerobutton){
    // textField.setText(textField.getText().concat("0"));
    // }
    //
    // if(e.getSource()== plusbutton){
    // solokey =1;
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Float.parseFloat(text);
    // num1= Math.sin(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Float.parseFloat(text);
    // num1= Math.log(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    //
    // break;
    //
    // default:
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    //
    // }
    //
    //
    // }
    // if(e.getSource()== minusbutton){
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("-"));
    // operator='-';
    // textField.setText(""); }
    // if(e.getSource()== multibutton){
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("x"));
    // operator='x';
    // textField.setText(""); }
    // if(e.getSource()== divbutton){
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("/"));
    // operator='/';
    // textField.setText(""); }
    // if(e.getSource()== percentagebutton){
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("%"));
    // operator='%';
    // textField.setText(""); }
    // if(e.getSource()== remainderbutton){
    // num1 = Float.parseFloat(textField.getText());
    // textField.setText(textField.getText().concat("rem"));
    // operator='r';
    // textField.setText(""); }
    // if(e.getSource()== dotbutton){
    // textField.setText(textField.getText().concat("."));
    //
    // }
    // if(e.getSource()== negbutton){
    // double temp = Float.parseFloat(textField.getText());
    // temp*=-1;
    // textField.setText(String.valueOf(temp));
    // }
    // if (e.getSource()== cancelbutton){
    // textField.setText("");
    // }
    // if (e.getSource()== backbutton){
    // String string = textField.getText();
    // textField.setText("");
    // for(int i = 0 ; i<string.length()-1;i++){
    // textField.setText(textField.getText()+string.charAt(i));
    // }
    // }
    // if (e.getSource()== radbutton){
    // num1 = Float.parseFloat(textField.getText());
    // num1 = num1 * (pi /180);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    // if (e.getSource()== degreebutton){
    //
    // num1 = Float.parseFloat(textField.getText());
    // num1 = num1 * (180/pi);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    //
    //
    //
    //
    // if(e.getSource()== equalbutton){
    // if (solokey == 1){
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Float.parseFloat(text);
    // num2= Math.sin(num2);
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Float.parseFloat(text);
    // num2=Math.log(num2);
    // break;
    //
    // default:
    // num2 = Float.parseFloat(textField.getText());
    // break;
    //
    // }
    //
    // switch (operator){
    // case'+':
    // result = num1+num2;
    // break;
    // case'-':
    // result = num1-num2;
    // break;
    // case'x':
    // result= num1*num2;
    // break;
    // case'/':
    // result= num1/num2;
    // break;
    // case'%':
    // result= (num1/100)*num2;
    // break;
    // case'r':
    // result= num1%num2;
    // break;
    //
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    // }
    // else{
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Float.parseFloat(text);
    // num1= Math.sin(num1);
    // result=num1;
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Float.parseFloat(text);
    // num1=Math.log(num1);
    // result=num1;
    // break;
    //
    // default:
    // num1 = Float.parseFloat(textField.getText());
    // result=num1;
    // break;
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    //
    // }
    //
    //
    // }
    //
    //
    //
    //
    // }
    // public void arth_operations_short(ActionEvent e){
    // short num1;
    // short num2;
    // short result;
    // if(e.getSource()== onebutton){
    // textField.setText(textField.getText().concat("1"));
    // }
    // if(e.getSource()== twobutton){
    // textField.setText(textField.getText().concat("2"));
    // }
    //
    // if(e.getSource()== threebutton){
    // textField.setText(textField.getText().concat("3"));
    // }
    //
    // if(e.getSource()== fourbutton){
    // textField.setText(textField.getText().concat("4"));
    // }
    //
    // if(e.getSource()== fivebutton){
    // textField.setText(textField.getText().concat("5"));
    // }
    //
    // if(e.getSource()== sixbutton){
    // textField.setText(textField.getText().concat("6"));
    // }
    //
    // if(e.getSource()== sevenbutton){
    // textField.setText(textField.getText().concat("7"));
    // }
    //
    // if(e.getSource()== eightbutton){
    // textField.setText(textField.getText().concat("8"));
    // }
    //
    // if(e.getSource()== ninebutton){
    // textField.setText(textField.getText().concat("9"));
    // }
    //
    // if(e.getSource()== zerobutton){
    // textField.setText(textField.getText().concat("0"));
    // }
    //
    // if(e.getSource()== plusbutton){
    // solokey =1;
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Short.parseShort(text);
    // num1= Math.sin(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Short.parseShort(text);
    // num1= Math.log(num1);
    //
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    //
    // break;
    //
    // default:
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("+"));
    // operator='+';
    // textField.setText("");
    // break;
    //
    // }
    //
    //
    // }
    // if(e.getSource()== minusbutton){
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("-"));
    // operator='-';
    // textField.setText(""); }
    // if(e.getSource()== multibutton){
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("x"));
    // operator='x';
    // textField.setText(""); }
    // if(e.getSource()== divbutton){
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("/"));
    // operator='/';
    // textField.setText(""); }
    // if(e.getSource()== percentagebutton){
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("%"));
    // operator='%';
    // textField.setText(""); }
    // if(e.getSource()== remainderbutton){
    // num1 = Short.parseShort(textField.getText());
    // textField.setText(textField.getText().concat("rem"));
    // operator='r';
    // textField.setText(""); }
    // if(e.getSource()== dotbutton){
    // textField.setText(textField.getText().concat("."));
    //
    // }
    // if(e.getSource()== negbutton){
    // double temp = Short.parseShort(textField.getText());
    // temp*=-1;
    // textField.setText(String.valueOf(temp));
    // }
    // if (e.getSource()== cancelbutton){
    // textField.setText("");
    // }
    // if (e.getSource()== backbutton){
    // String string = textField.getText();
    // textField.setText("");
    // for(int i = 0 ; i<string.length()-1;i++){
    // textField.setText(textField.getText()+string.charAt(i));
    // }
    // }
    // if (e.getSource()== radbutton){
    // num1 = Short.parseShort(textField.getText());
    // num1 = num1 * (pi /180);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    // if (e.getSource()== degreebutton){
    //
    // num1 = Short.parseShort(textField.getText());
    // num1 = num1 * (180/pi);
    // result=num1;
    // textField.setText(String.valueOf(result));
    // }
    //
    //
    //
    //
    // if(e.getSource()== equalbutton){
    // if (solokey == 1){
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Short.parseShort(text);
    // num2= Math.sin(num2);
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num2=Short.parseShort(text);
    // num2=Math.log(num2);
    // break;
    //
    // default:
    // num2 = Short.parseShort(textField.getText());
    // break;
    //
    // }
    //
    // switch (operator){
    // case'+':
    // result = num1+num2;
    // break;
    // case'-':
    // result = num1-num2;
    // break;
    // case'x':
    // result= num1*num2;
    // break;
    // case'/':
    // result= num1/num2;
    // break;
    // case'%':
    // result= (num1/100)*num2;
    // break;
    // case'r':
    // result= num1%num2;
    // break;
    //
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    // }
    // else{
    // switch (arthkey){
    // case 1:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Short.parseShort(text);
    // num1= Math.sin(num1);
    // result=num1;
    // break;
    // case 7:
    // text = textField.getText();
    // text =text.replaceAll("[^0-9]", "");
    // num1=Short.parseShort(text);
    // num1=Math.log(num1);
    // result=num1;
    // break;
    //
    // default:
    // num1 = Short.parseShort(textField.getText());
    // result=num1;
    // break;
    // }
    // textField.setText(String.valueOf(result));
    // num1=result;
    //
    // }
    //
    //
    // }
    //
    //
    //
    //
    // }

    // all about the keys
    public void button_placements(ActionEvent e) {
        if (e.getSource() == Inversetrignometricbutton) {
            lowerpanel.removeAll();
            inversetrignometric_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();

        }
        if (e.getSource() == Trignometricradiobutton) {
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();

        }
        if (e.getSource() == Hyperbolicbutton) {
            lowerpanel.removeAll();
            hyperbolic_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();

        }

        if (e.getSource() == hexadecimal) {
            lowerpanel.removeAll();
            hexadecimal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
        }
        if (e.getSource() == decimal) {
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(false);
        }
        if (e.getSource() == binary) {
            lowerpanel.removeAll();
            binary_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();

        }
        if (e.getSource() == octal) {
            lowerpanel.removeAll();
            octal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();

        }

        if (e.getSource() == integer) {
            lowerpanel.removeAll();
            numbersystemkey = 1;
            int num1;
            int num2;
            int result;
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(false);

        }
        if (e.getSource() == double_) {
            numbersystemkey = 2;
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(true);

        }
        if (e.getSource() == short_) {
            numbersystemkey = 3;
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(false);

        }
        if (e.getSource() == long_) {
            numbersystemkey = 4;
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(false);

        }
        if (e.getSource() == float_) {
            numbersystemkey = 5;
            lowerpanel.removeAll();
            normal_keys();
            lowerpanel.revalidate();
            lowerpanel.repaint();
            dotbutton.setEnabled(true);

        }
    }

    public void inversetrignometric_keys() {

        lowerpanel.add(in_sinbutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(in_cosbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(in_tanbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(in_cosecantbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(in_secantbutton);
        lowerpanel.add(in_cotbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);

    }

    public void normal_keys() {

        lowerpanel.add(sinbutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(cosbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(tanbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(cosecantbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(secantbutton);
        lowerpanel.add(cotbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);

        twobutton.setEnabled(true);
        threebutton.setEnabled(true);
        fourbutton.setEnabled(true);
        fivebutton.setEnabled(true);
        sixbutton.setEnabled(true);
        sevenbutton.setEnabled(true);
        eightbutton.setEnabled(true);
        ninebutton.setEnabled(true);
        sinbutton.setEnabled(true);
        cosbutton.setEnabled(true);
        tanbutton.setEnabled(true);
        cosecantbutton.setEnabled(true);
        secantbutton.setEnabled(true);
        cotbutton.setEnabled(true);
        expobutton.setEnabled(true);
        logbutton.setEnabled(true);
        degreebutton.setEnabled(true);
        radbutton.setEnabled(true);
        percentagebutton.setEnabled(true);
        remainderbutton.setEnabled(true);
        dotbutton.setEnabled(true);

    }

    public void hyperbolic_keys() {

        lowerpanel.add(sinhbutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(coshbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(tanhbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(in_sinhbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(in_coshbutton);
        lowerpanel.add(in_tanhbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);
        in_sinhbutton.setEnabled(false);
        in_coshbutton.setEnabled(false);
        in_tanhbutton.setEnabled(false);

    }

    public void hexadecimal_keys() {

        lowerpanel.add(abutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(bbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(cbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(dbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(ebutton);
        lowerpanel.add(fbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);

        expobutton.setEnabled(false);
        logbutton.setEnabled(false);
        degreebutton.setEnabled(false);
        radbutton.setEnabled(false);
        percentagebutton.setEnabled(false);
        remainderbutton.setEnabled(false);

        dotbutton.setEnabled(false);

    }

    public void binary_keys() {

        lowerpanel.add(sinbutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(cosbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(tanbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(cosecantbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(secantbutton);
        lowerpanel.add(cotbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);

        twobutton.setEnabled(false);
        threebutton.setEnabled(false);
        fourbutton.setEnabled(false);
        fivebutton.setEnabled(false);
        sixbutton.setEnabled(false);
        sevenbutton.setEnabled(false);
        eightbutton.setEnabled(false);
        ninebutton.setEnabled(false);
        sinbutton.setEnabled(false);
        cosbutton.setEnabled(false);
        tanbutton.setEnabled(false);
        cosecantbutton.setEnabled(false);
        secantbutton.setEnabled(false);
        cotbutton.setEnabled(false);
        dotbutton.setEnabled(false);
        expobutton.setEnabled(false);
        logbutton.setEnabled(false);
        degreebutton.setEnabled(false);
        radbutton.setEnabled(false);
        percentagebutton.setEnabled(false);
        remainderbutton.setEnabled(false);

    }

    public void octal_keys() {

        lowerpanel.add(sinbutton);
        lowerpanel.add(cancelbutton);
        lowerpanel.add(divbutton);
        lowerpanel.add(multibutton);
        lowerpanel.add(backbutton);
        lowerpanel.add(expobutton);
        lowerpanel.add(cosbutton);
        lowerpanel.add(sevenbutton);
        lowerpanel.add(eightbutton);
        lowerpanel.add(ninebutton);
        lowerpanel.add(minusbutton);
        lowerpanel.add(logbutton);
        lowerpanel.add(tanbutton);
        lowerpanel.add(fourbutton);
        lowerpanel.add(fivebutton);
        lowerpanel.add(sixbutton);
        lowerpanel.add(plusbutton);
        lowerpanel.add(degreebutton);
        lowerpanel.add(cosecantbutton);
        lowerpanel.add(onebutton);
        lowerpanel.add(twobutton);
        lowerpanel.add(threebutton);
        lowerpanel.add(remainderbutton);
        lowerpanel.add(radbutton);
        lowerpanel.add(secantbutton);
        lowerpanel.add(cotbutton);
        lowerpanel.add(zerobutton);
        lowerpanel.add(dotbutton);
        lowerpanel.add(equalbutton);
        lowerpanel.add(percentagebutton);

        twobutton.setEnabled(true);
        threebutton.setEnabled(true);
        fourbutton.setEnabled(true);
        fivebutton.setEnabled(true);
        sixbutton.setEnabled(true);
        sevenbutton.setEnabled(true);
        eightbutton.setEnabled(true);
        ninebutton.setEnabled(true);
        sinbutton.setEnabled(false);
        cosbutton.setEnabled(false);
        tanbutton.setEnabled(false);
        cosecantbutton.setEnabled(false);
        secantbutton.setEnabled(false);
        cotbutton.setEnabled(false);
        dotbutton.setEnabled(false);
        expobutton.setEnabled(false);
        logbutton.setEnabled(false);
        degreebutton.setEnabled(false);
        radbutton.setEnabled(false);
        percentagebutton.setEnabled(false);
        remainderbutton.setEnabled(false);

    }

    public void logic(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("+"));
                        operator = '+';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }
        }
    }

    public void logic1(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("-"));
                        operator = '-';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }
        }
    }

    public void logic2(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("*"));
                        operator = '*';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }
        }
    }

    public void logic3(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';

                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("/"));
                        operator = '/';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("/"));
                operator = '/';
                textField.setText("");
            }
        }
    }

    public void logic4(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("%"));
                        operator = '%';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                textField.setText(textField.getText().concat("%"));
                operator = '%';
            }
        }
    }

    public void logic5(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("r"));
                        operator = 'r';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                textField.setText(textField.getText().concat("r"));
                operator = 'r';
            }
        }
    }

    public void logic6(ActionEvent e) {
        if (2 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");
            check3 = text.contains(".");
            System.out.println(check3);

            if (false == check2 && false == check3) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;

                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;

                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;

                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 11:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 12:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 14:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 15:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 16:

                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else if (true == check3) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                operator = '+';
                textField.setText("");
            }

        }

        if (1 == datatypekey) {
            solokey = 1;
            text = textField.getText();
            check2 = text.matches("[0-9]+");

            if (false == check2) {
                switch (arthkey) {
                    case 1:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sin(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 2:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cos(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 3:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tan(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 4:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.sin(num1));

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 5:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.cos(num1));

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 6:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.tan(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 7:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.log(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");

                        break;
                    case 8:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.asin(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 9:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.acos(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 10:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.atan(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 11:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.asin(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 12:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.acos(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 13:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = 1 / (Math.atan(num1));
                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 14:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.sinh(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 15:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.cosh(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 16:
                        text = textField.getText();
                        text = text.replaceAll("[^0-9]", "");
                        num1 = Double.parseDouble(text);
                        num1 = Math.tanh(num1);

                        textField.setText(textField.getText().concat("^"));
                        operator = '^';
                        textField.setText("");
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;

                }
            } else {
                num1 = Double.parseDouble(textField.getText());
                textField.setText(textField.getText().concat("+"));
                textField.setText(textField.getText().concat("^"));
                operator = '^';
            }
        }
    }
}
