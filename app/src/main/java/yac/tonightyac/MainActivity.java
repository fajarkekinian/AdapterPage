package yac.tonightyac;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import Adapter.ViewPagerAdapter;

/**
 * Created by developer on 4/22/16.
 */
public class MainActivity extends Activity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] No_anggota;
    String[] Nama;
    String[] Umur;
    int[] foto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.page_main);
        // Generate sample data
        No_anggota = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        Nama = new String[] { "China", "India", "United States",
                "Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
                "Russia", "Japan" };

        Umur = new String[] { "10 Tahun", "20 Tahun",
                "30 Tahun", "4 Tahun", "12 Tahun", "3 Tahun",
                "5 Tahun", "8 Tahun", "1 Tahun", "5 Tahun" };
        //Menampilkan Foto/gambar (Resolusi yg aku pakai 125x80)
        foto = new int[] { R.drawable.china, R.drawable.india,
                R.drawable.unitedstates, R.drawable.indonesia,
                R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria,
                R.drawable.bangladesh, R.drawable.russia, R.drawable.japan };
        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(MainActivity.this, No_anggota, Nama, Umur, foto);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}
