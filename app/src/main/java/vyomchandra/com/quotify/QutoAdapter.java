package vyomchandra.com.quotify;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class QutoAdapter extends RecyclerView.Adapter<QutoAdapter.QutosViewHolder>
{
    List<String> quotes=null;
    Context context;

    public QutoAdapter(List<String> quotes, Context context) {
        this.quotes = quotes;
        this.context = context;
    }

    @NonNull
    @Override
    public QutosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.list_quotes,viewGroup,false);
        return new QutosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QutosViewHolder qutosViewHolder, int i) {
             String[] colors={"#825930","#249C1B","#41DCCF","#2B4DD3","#8D2ABB"};
             String qutoes=quotes.get(i);
             qutosViewHolder.textQuote.setText(qutoes);
             int color=i%colors.length;
             int intColor= Color.parseColor(colors[color]);
             qutosViewHolder.quoteContainer.setBackgroundColor(intColor);

    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    public class QutosViewHolder extends RecyclerView.ViewHolder{
        TextView textQuote;
        LinearLayout quoteContainer;


        public QutosViewHolder(@NonNull View itemView) {
            super(itemView);
            textQuote=itemView.findViewById(R.id.quotes);
            quoteContainer=itemView.findViewById(R.id.quotoContainer);
        }
    }
}
