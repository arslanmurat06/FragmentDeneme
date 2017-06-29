package udacity.examples.com.fragmentdeneme;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by HP-PC on 29.06.2017.
 */
//listView fragmentini oluşturuyoruz
public class listFragment extends Fragment {
    View view;
    ListView listView;
    //listview içersinde gösterilecek isim değerlerini array içersine alıyoruz.
     String[] isimler =new String[] {"Murat","Hasan","Kemal","Ayşe","Bekir","Fatma","Gamze","Beril","Can","Ferid","Ferdi","Orhan"};
   //interface oluşturuyoruz.
    OnIsımListener onIsımListener;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.listlayout, container, false);
        listView = (ListView) view.findViewById(R.id.listfrag);
        ArrayAdapter<String> adaptorum = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, isimler);
        listView.setAdapter(adaptorum);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String isim = (String) listView.getItemAtPosition(position);
                //listview'de bir değer tıklandığında interface'in abstaract metoduna isim değerini gönderiyoruz.
                onIsımListener.isimGon(isim);

                Toast.makeText(getContext(), isim, Toast.LENGTH_SHORT).show();

            }
        });
                return view;
    }
//listFragment'tan MainActivity'e değer gönderebilmek için interface oluşturuyoruzç
    public interface OnIsımListener  {

        public void isimGon(String isim);

    }
//interface fragmenta bağlamak için onAttach içersinde interface mizi bağlıyoruz.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
        onIsımListener=(OnIsımListener)context;}
        catch(Exception e ) {}

    }
}