package vn.edu.ntu.hongquanh.hongquanh_59132005_simplewidge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtngaysinh, edtsothichkhac;
    Button btxacnhan;
    RadioGroup radiogroup;

    CheckBox cbxemphim, cbnghenhac, cbcafe, cbonha, cbvaobep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.edtTen);
        edtngaysinh = findViewById(R.id.edtngaysinh);
        edtsothichkhac = findViewById(R.id.edtsothichkhac);
        //----------------------------------------
        cbxemphim = findViewById(R.id.cbxemphim);
        cbnghenhac = findViewById(R.id.cbnghenhac);
        cbcafe = findViewById(R.id.cbcafe);
        cbonha = findViewById(R.id.cbonha);
        cbvaobep = findViewById(R.id.cbvaobep);
        //-----------------------------------
        radiogroup = findViewById(R.id.radiogroup);
        btxacnhan =findViewById(R.id.btxacnhan);

        btxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi ="";
                chuoi+=""+edtTen.getText().toString();
                chuoi+="\n Ngày sinh:"+edtngaysinh.getText().toString();

                switch (radiogroup.getCheckedRadioButtonId()){
                    case R.id.rdbnam: chuoi+="\n Giới tính:"; break;
                    case R.id.rdbnu: chuoi+="\n Giới tính"; break;
                }

                chuoi+="\n Sở thích:";

                if (cbxemphim.isChecked()){
                    chuoi = chuoi+cbxemphim.getText().toString()+"; ";
                }
                if (cbnghenhac.isChecked()){
                    chuoi = chuoi+cbnghenhac.getText().toString()+"; ";
                }
                if (cbcafe.isChecked()){
                    chuoi = chuoi+cbcafe.getText().toString()+"; ";
                }
                if (cbonha.isChecked()){
                    chuoi = chuoi+cbonha.getText().toString()+"; ";
                }
                if (cbvaobep.isChecked()){
                    chuoi = chuoi+cbvaobep.getText().toString();
                }

                chuoi+=edtsothichkhac.getText()+".";
                Toast.makeText(getApplicationContext(),chuoi,Toast.LENGTH_LONG).show();

                }
        });
    }
}
