package nyc.c4q.yojana.finalexamyojanasharma;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;


/**
 * Created by yojanasharma on 2/12/17.
 */

public class NavigationDrawerActivity extends AppCompatActivity {
    ActionBarDrawerToggle drawerToggle;
    Toolbar toolbar;
    RecyclerView recyclerView;
    DrawerLayout.DrawerListener drawerListener;
    DrawerLayout drawerLayout;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);


        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.nav_recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        drawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer);
        recyclerView.setHasFixedSize(true);

        String[] items = getResources().getStringArray(R.array.Profile);

        for (String Item : items) {
            arrayList.add(Item);
        }

        adapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setAdapter(adapter);


        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.drawer_open,
                R.string.drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
    }

    @Override

    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

}
