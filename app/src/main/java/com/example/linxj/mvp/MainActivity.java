package com.example.linxj.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.linxj.com.example.linxj.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IloginView {
    private EditText name ,password;
    private TextView info;
    private Button btn;
    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.edit_name);
        password = (EditText)findViewById(R.id.edit_pass);
        info = (TextView)findViewById(R.id.txv_info);
        btn = (Button)findViewById(R.id.btn);
        presenter = new Presenter(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setModel();
                presenter.showInfo();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setName(String Name) {
        name.setText(Name);
    }

    @Override
    public void setPass(String Pass) {
        password.setText(Pass);
    }

    @Override
    public void toast() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return name.getText().toString();
    }

    @Override
    public String getPass() {
return password.getText().toString();
    }

    @Override
    public void setInfo(String str ) {
        info.setText(str);
    }


}
