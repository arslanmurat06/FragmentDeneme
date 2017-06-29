package udacity.examples.com.fragmentdeneme;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//interface MainActivity'e implement ediyoruz.

public class MainActivity extends AppCompatActivity implements listFragment.OnIsımListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void isimGon(String isim) {
        //MainActivity den textFragment'a değer gönderebilmek için fragmentin örneğini oluşturup listFragmenttan aldığımız değeri gönderiyoruz.
       textFragment f2=(textFragment) getSupportFragmentManager().findFragmentById(R.id.textFragment);
        f2.updateInfo(isim);
    }
}
