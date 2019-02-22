package vn.com.it.truongpham.study_android;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import vn.com.it.truongpham.study_android.databinding.ExampleAdapter;
import vn.com.it.truongpham.study_android.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {
    ExampleAdapter exampleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        // UserEntity userEntity=new UserEntity("Dev Android","UserEntity");
        //binding.setUser(userEntity);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.main,new FragmentUser()).commit();
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Object("FirtName" + i, "Last" + i));
        }
        exampleAdapter = new ExampleAdapter(list);
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(exampleAdapter);






    }




}
