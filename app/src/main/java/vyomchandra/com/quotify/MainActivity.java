package vyomchandra.com.quotify;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView qutoText=findViewById(R.id.quotelist);
        qutoText.setLayoutManager(new LinearLayoutManager(this));
        List<String> quotes=new ArrayList<>();
        quotes.add("Don't cry because it's over, smile because it happened");
        quotes.add("I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst,\n" +
                "then you sure as hell don't deserve me at my best");
        quotes.add("Be yourself; everyone else is already taken");
        quotes.add("Two things are infinite: the universe\n" +
                "and human stupidity; and I'm not sure about the universe");
        quotes.add("So many books, so little time");
        quotes.add("Be who you are and say what you feel, because those who mind\n" +
                "don't matter, and those who matter don't mind");
        quotes.add("A room without books is like a body without a soul");
        quotes.add("You only live once, but if you do it right, once is enough");
        quotes.add("Be the change that you wish to see in the world");
        qutoText.setAdapter(new QutoAdapter(quotes,this));

    }
}
