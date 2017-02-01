package manish.subjectchooser.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import manish.subjectchooser.R;
import manish.subjectchooser.adapter.Adapter;
import manish.subjectchooser.model.MyData;

public class Subjects extends AppCompatActivity {
    private RecyclerView recView;
    private Adapter adapter;
    //private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        recView= (RecyclerView) findViewById(R.id.rec_view);

        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new Adapter(MyData.getListData(),this);
        recView.setAdapter(adapter);

     /*   b=(Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment subject=new Subject();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment,subject);
                fragmentTransaction.commit();

            }
        });
             */
    }
}
