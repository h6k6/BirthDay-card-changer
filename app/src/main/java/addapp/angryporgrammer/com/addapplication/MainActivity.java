package addapp.angryporgrammer.com.addapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public  int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView_BdCard);

        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count = (count) %6+1;
                switch (count)
                {
                    case 1: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard1", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                    case 2: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard2", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                    case 3: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard3", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                    case 4: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard4", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                    case 5: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard5", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                    case 6: {
                        Resources resources = getResources();
                        int resID = resources.getIdentifier("bdcard6", "drawable", getPackageName());
                        imageView.setImageResource(resID);
                    }
                        break;
                }

            }
        });

    }
}
