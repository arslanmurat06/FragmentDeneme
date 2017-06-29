package udacity.examples.com.fragmentdeneme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP-PC on 29.06.2017.
 */

public class textFragment extends Fragment

{
    View view;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.textlayout,container,false);
        textView=(TextView) view.findViewById(R.id.textView);
        return view;
    }
    public void updateInfo (String isim) {
        textView.setText(isim);

    }
}
