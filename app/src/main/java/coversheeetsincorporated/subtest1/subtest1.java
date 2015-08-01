package coversheeetsincorporated.subtest1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class subtest1 extends ActionBarActivity {

    LinearLayout layout;
    Button simple;
    Button detailed;
    LinearLayout simplelayout;
    LinearLayout detaliedlayout;
    Button cardio_yes;
    Button cardio_no;
    Button smoke_yes;
    Button smoke_no;
    Button alcohol_yes;
    Button alcohol_no;
    Button diet_yes;
    Button diet_no;
    Button pregnant_yes;
    Button pregnant_no;
    Button grapefruit_yes;
    Button grapefruit_no;
    Button contra_yes;
    Button contra_no;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.subtestlay);
            //h1/2=f*(log(caffene))/(log(2.875))
        //f=weight*cardio*smoke*pregnant*alcohol*grapefruit*diet*contraceptives
        double weight=1;
        //weight= 1-(0.003434307937522*(weight-150)
        double cardio=1;
        double smoke=1;
        double pregnant =1;
        double alcohol =1;
        double grapefruit =1;
        double diet =1;
        double contraceptives =1;
        double h=0;
        double f=1;
        double a=1;
        f=weight*cardio*smoke*pregnant*alcohol*grapefruit*diet*contraceptives;
        h=f*Math.log(a)/Math.log(2.875);

            layout=(LinearLayout) findViewById(R.id.layout);

            simple=(Button) findViewById(R.id.simple);
            detailed=(Button) findViewById(R.id.detailed);

            simple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.simplelayout);
                }
            }
            );

        cardio_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClicck(View){
                Toast.makeText()


            detailed.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                setContentView(R.layout.detailedlayout);
            }


            }

            );


        }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_subtest1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
