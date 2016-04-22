package Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import yac.tonightyac.R;

/**
 * Created by developer on 4/22/16.
 */
public class ViewPagerAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    String[] No_anggota;
    String[] Nama;
    String[] Umur;
    int[] foto;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, String[] No_anggota, String[] Nama,
                            String[] umur, int[] foto) {
        this.context = context;
        this.No_anggota = No_anggota;
        this.Nama = Nama;
        this.Umur = umur;
        this.foto = foto;

    }

    @Override
    public int getCount() {
        return No_anggota.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView no;
        TextView nama;
        TextView umur;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item, container,
                false);

        // Locate the TextViews in viewpager_item.xml
        no = (TextView) itemView.findViewById(R.id.No);
        nama = (TextView) itemView.findViewById(R.id.Nama);
        umur = (TextView) itemView.findViewById(R.id.umur);

        // Capture position and set to the TextViews
        no.setText(No_anggota[position]);
        nama.setText(Nama[position]);
        umur.setText(Umur[position]);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        // Capture position and set to the ImageView
        imgflag.setImageResource(foto[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((LinearLayout) object);

    }
}


