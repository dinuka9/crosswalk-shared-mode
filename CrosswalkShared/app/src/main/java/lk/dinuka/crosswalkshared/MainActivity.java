package lk.dinuka.crosswalkshared;

import android.os.Bundle;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkView;

public class MainActivity extends XWalkActivity {
    XWalkView mXWalkView;

    @Override
    protected void onXWalkReady() {
        mXWalkView.loadUrl("file:///android_asset/test.html", null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mXWalkView = (XWalkView) findViewById(R.id.xwalkview);
    }

}
