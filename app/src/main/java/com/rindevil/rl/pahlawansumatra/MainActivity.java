package com.rindevil.rl.pahlawansumatra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Si Singamangaradja XII",
            "Dr. Ferdinand Lumban Tobing",
            "K.H. Zainul Arifin",
            "Mayjen. TNI. Anm.D.I. Pandjaitan",
            "Tengku Amir Hamzah",
            "Tuanku Imam Bonjol",
            "Dr.H.Mohammad Hatta",
            "K.H. AGUS SALIM",
            "Prof.Dr.Buya Hamka",
            "H. Adam Malik",
            "Silas Papare",
            "Raden Inten II",
            "Sultan Thaha Syaifuddin",
            "Prof. Dr. Hazairin",
            "Dr. Gerungan Saul Samuel Jacob Ratulangi",
            "Sultan Mahmud Badaruddin II ",
            "Prof. Mohammad Yamin, S.H.",
    };

    Integer[] imgid = {
            R.mipmap.ic_launcher_round,
            ,
            R.drawable.daus2,
            R.drawable.daus3,
            R.drawable.daus4,
            R.drawable.daus5,
            R.drawable.daus6,
            R.drawable.daus7,
            R.drawable.daus8,
            R.drawable.daus9,
            R.drawable.daus10,
            R.drawable.daus11,
            R.drawable.daus12,
            R.drawable.daus13,
            R.drawable.daus14,
            R.drawable.daus15,
            R.drawable.daus16,
    };

    String[] descriptionitem = {
            "1"/*,
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16"*/

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IsiList adapter = new IsiList(this, itemname, imgid, descriptionitem);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
