package net.spx.demosqlite03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import net.spx.demosqlite03.DAO.CatDAO;
import net.spx.demosqlite03.DTO.CatDTO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CatDAO catDAO;
    ArrayList<CatDTO> listCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Demo 01: Tạo lớp DAO và thực hiện lấy danh sach ghi ra log
        catDAO = new CatDAO(this);
        listCat = catDAO.getList(); // lấy dữ liệu

        Log.d("zzzzzzzzzz", "onCreate: Số lượng bản ghi tb_cat = " + listCat.size() );
        // Trước khi chạy, cần vào file MyDbHelper để insert dữ liệu vào bảng tb_cat
        // hiển thị thì tạo adapter để hiển thị....


    }
}