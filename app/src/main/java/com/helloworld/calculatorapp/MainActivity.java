package com.helloworld.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private String   num1        = "";
    private String   num2        = "";
    private int      total       = 0;
    private String   operator    = "";
    private boolean  operatorFlg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ボタンを設定
        Button btnZero     = (Button)findViewById(R.id.zero);
        Button btnOne      = (Button)findViewById(R.id.one);
        Button btnTwo      = (Button)findViewById(R.id.two);
        Button btnThree    = (Button)findViewById(R.id.three);
        Button btnFour     = (Button)findViewById(R.id.four);
        Button btnFive     = (Button)findViewById(R.id.five);
        Button btnSix      = (Button)findViewById(R.id.six);
        Button btnSeven    = (Button)findViewById(R.id.seven);
        Button btnEight    = (Button)findViewById(R.id.eight);
        Button btnNine     = (Button)findViewById(R.id.nine);
        Button btnAdd      = (Button)findViewById(R.id.add);
        Button btnSubtract = (Button)findViewById(R.id.subtract);
        Button btnMultiply = (Button)findViewById(R.id.multiply);
        Button btnDivision = (Button)findViewById(R.id.division);
        Button btnClear    = (Button)findViewById(R.id.clear);
        Button btnEqual    = (Button)findViewById(R.id.equal);

        // TextView の設定
        text = (TextView) findViewById(R.id.text);

        // リスナーをボタンに登録
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "0";
                    text.setText(num2);
                }
                num1 = num1 + "0";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "1";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "1";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "2";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "2";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "3";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "3";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "4";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "4";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "5";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "5";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "6";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "6";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "7";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "7";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "8";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "8";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operatorFlg) {
                    num2 = num2 + "9";
                    text.setText(num2);
                    return;
                }
                num1 = num1 + "9";
                text.setText(num1);
            }
        });
        // リスナーをボタンに登録
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = true;
                operator = "+";
                text.setText("");
                return;
            }
        });
        // リスナーをボタンに登録
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = true;
                operator    = "-";
                text.setText("");
            }
        });
        // リスナーをボタンに登録
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = true;
                operator    = "×";
                text.setText("");
            }
        });
        // リスナーをボタンに登録
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = true;
                operator    = "÷";
                text.setText("");
            }
        });
        // リスナーをボタンに登録
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = false;
                operator    = null;
                num1        = null;
                num2        = null;
                text.setText("");
            }
        });
        // リスナーをボタンに登録
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlg = false;
                operator    = null;
                num1        = null;
                num2        = null;
                text.setText("");
            }
        });
        // リスナーをボタンに登録
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("+".equals(operator)) {
                    total = Integer.parseInt(num1) + Integer.parseInt(num2);
                }
                if ("-".equals(operator)) {
                    total = Integer.parseInt(num1) - Integer.parseInt(num2);
                }
                if ("×".equals(operator)) {
                    total = Integer.parseInt(num1) * Integer.parseInt(num2);
                }
                if ("÷".equals(operator)) {
                    total = Integer.parseInt(num1) / Integer.parseInt(num2);
                }
                operatorFlg = false;
                operator    = "";
                num1        = "";
                num2        = "";
                text.setText(String.valueOf(total));
            }
        });
    }
}
