package com.example.app11;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    GridView gdv1;
    Integer image[]={R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gdv1= (GridView) findViewById(R.id.gdv);
        gdv1.setAdapter(new ImageAdapter (this,image));
    }
    public class ImageAdapter extends BaseAdapter{
        private Context mContext;
        private Integer[] img;
        public ImageAdapter(Context c, Integer[] imageIds)
        {
            mContext =c;
            img = imageIds;

        }
        @Override
        public int getCount(){
            return img.length;
        }
        @Override
        public Object getItem(int i) {
            return img[i];
        }
        @Override
        public long getItemId(int i) {
            return i;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            imageView= new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
            imageView.setPadding(0,0,0,5);
            imageView.setImageResource(img[i]);
            return imageView;
        } } }

