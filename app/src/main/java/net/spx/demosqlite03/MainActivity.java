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



        // vi dụ thêm mới 1 bản ghi cho bảng tb_cat
        CatDTO objCat = new CatDTO("Ô tô");
        int id_moi = catDAO.addRow( objCat ) ; // thực hiện thêm vào bảng tb_cat
        if( id_moi >0)
            Log.d("zzzzzz", "onCreate: Thêm thành công, id mới = " + id_moi );
        else
            Log.d("zzzzzzz", "onCreate: Không thêm đươ dữ liệu, có thể do sai kiểu dữ liệu hoặc lệnh ...");

        // sau khi thêm mới xong, chạy lại sẽ nhìn thấy số lượng bản ghi tăng ở log.


        listCat = catDAO.getList(); // lấy dữ liệu

        Log.d("zzzzzzzzzz", "onCreate: Số lượng bản ghi tb_cat = " + listCat.size() );
        // Trước khi chạy, cần vào file MyDbHelper để insert dữ liệu vào bảng tb_cat
        // hiển thị thì tạo adapter để hiển thị....
        for(int i =0; i< listCat.size(); i++){

            CatDTO tmp = listCat.get(i );

            Log.d("zzzzzzzzzz","Tên thứ "+ i + "==> "  +  tmp.getName() );
        }


    }
}