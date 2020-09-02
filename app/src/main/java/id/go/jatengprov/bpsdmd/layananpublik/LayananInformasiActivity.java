package id.go.jatengprov.bpsdmd.layananpublik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class LayananInformasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan_informasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void webview_formulirpi(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://epublic.bpsdmd.jatengprov.go.id/#/formulir-permohonan");
        startActivity(webviewactivity);
    }

    public void webview_formulirkeberatan(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://epublic.bpsdmd.jatengprov.go.id/#/formulir-keberatan");
        startActivity(webviewactivity);
    }

    public void webview_formulirpelaporan(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://epublic.bpsdmd.jatengprov.go.id/#/lapor");
        startActivity(webviewactivity);
    }

    public void webview_formulirsewaswp(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://infosewa.bpsdmd.jatengprov.go.id/?page=menu_pesan");
        startActivity(webviewactivity);
    }

    public void webview_inforiwayatpelatihan(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=pencarianriwayat");
        startActivity(webviewactivity);
    }

    public void webview_elibrary(View view) {
        Intent webviewactivity= new Intent(LayananInformasiActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://36.89.239.53/inlislite3");
        startActivity(webviewactivity);
    }
}