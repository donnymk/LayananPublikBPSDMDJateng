package id.go.jatengprov.bpsdmd.epublik;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

//import id.go.jatengprov.bpsdmd.epublik.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/
    }

    public void activityLayananInformasi(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, LayananInformasiActivity.class);
        startActivity(webviewactivity);
    }

    public void activityInfoStatistik(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, InfoStatistikActivity.class);
        startActivity(webviewactivity);
    }

    public void webviewportal(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id");
        webviewactivity.putExtra("title", "Portal Berita");
        startActivity(webviewactivity);
    }

    public void webviewppid(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/v2/ppid");
        webviewactivity.putExtra("title", "Portal PPID");
        startActivity(webviewactivity);
    }

    public void webviewopendata(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://data.jatengprov.go.id/organization/badan-pengembangan-sumber-daya-manusia-provinsi-jawa-tengah");
        webviewactivity.putExtra("title", "Open Data");
        startActivity(webviewactivity);
    }


    public void webviewagenda(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/siagnes/");
        webviewactivity.putExtra("title", "Agenda Kegiatan");
        startActivity(webviewactivity);
    }

}
