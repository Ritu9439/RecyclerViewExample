package eazy.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import eazy.recyclerviewexample.Adapters.MyAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    ArrayList<GetSet> al=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.rc1);
        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        GetSet g1=new GetSet(R.drawable.cupcake,"Cupcake");
        GetSet g2=new GetSet(R.drawable.donut,"Donut");
        GetSet g3=new GetSet(R.drawable.eclair,"Eclair");
        GetSet g4=new GetSet(R.drawable.froyo,"Froyo");


        al.add(g1);
        al.add(g2);
        al.add(g3);
        al.add(g4);



        //RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        MyAdapter myAdapter=new MyAdapter(al,MainActivity.this);
        recyclerView.setAdapter(myAdapter);




    }
}
