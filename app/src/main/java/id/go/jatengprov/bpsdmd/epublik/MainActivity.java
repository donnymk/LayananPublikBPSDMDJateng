package id.go.jatengprov.bpsdmd.epublik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

//import id.go.jatengprov.bpsdmd.epublik.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    // write permission on external storage
    private static int REQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // write permission on external storage
        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        }, REQUEST_CODE);

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
        webviewactivity.putExtra("title", "Open Data (situs web JatengProv)");
        startActivity(webviewactivity);
    }
    public void webviewopendata2(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://36.89.239.53/alona");
        webviewactivity.putExtra("title", "Open Data (situs web BPSDMD)");
        startActivity(webviewactivity);
    }

    public void webviewagenda(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/siagnes/");
        webviewactivity.putExtra("title", "Agenda Kegiatan");
        startActivity(webviewactivity);
    }

}
