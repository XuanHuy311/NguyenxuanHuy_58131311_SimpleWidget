package vn.edu.ntu.nguyenxuanhuy.nguyenxuanhuy_58131311_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName , edtDate, edtSoThichKhac;
    RadioGroup rdgGioiTinh;
    CheckBox cbPhim, cbNhac, cbCafe, cbNha, cbBep;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews(){
        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbPhim = findViewById(R.id.cbPhim);
        cbNhac = findViewById(R.id.cbNhac);
        cbCafe = findViewById(R.id.cbCafe);
        cbNha = findViewById(R.id.cbNha);
        cbBep = findViewById(R.id.cbBep);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void addEvents(){
        btnXacNhan.setOnClickListener((v) -> {thongTin(); });
    }
private void thongTin(){
    StringBuilder result=new StringBuilder();
    result.append(edtName.getText().toString() +"\n" + edtDate.getText().toString() +"\nGiới tính:");
    switch (rdgGioiTinh.getCheckedRadioButtonId()){
        case R.id.rbNam:
            result.append("Nam");
            break;
        case R.id.rbNu:
            result.append("Nữ");
            break;
    }
    result.append("\nSở thích:");
    if(cbPhim.isChecked()){
        result.append("Xem Phim;");
    }
    if(cbNhac.isChecked()){
        result.append("Nghe nhạc;");
    }
    if(cbCafe.isChecked()){
        result.append("Đi cafe với bạn;");
    }
    if(cbNha.isChecked()){
        result.append("Ở nhà một mình;");
    }
    if(cbBep.isChecked()){
        result.append("Vào bếp nấu ăn;");
    }
    result.append(edtSoThichKhac.getText().toString());
    Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG).show();
}
}
