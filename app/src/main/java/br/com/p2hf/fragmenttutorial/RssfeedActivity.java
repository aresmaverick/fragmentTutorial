package br.com.p2hf.fragmenttutorial;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by fred on 06/02/16.
 */
public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener {
    @Override
    public void onRssItemSelected(String link) {
        DetailedFragment fragment = (DetailedFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        fragment.setText(link);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
