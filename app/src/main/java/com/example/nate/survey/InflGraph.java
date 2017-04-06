package com.example.nate.survey;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class InflGraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infl_graph);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(1, 0),
                new DataPoint(2, 0),
                new DataPoint(3, 0),
                new DataPoint(4, 0),
                new DataPoint(5, 0),
                new DataPoint(6, 0),
                new DataPoint(7, 0),
                new DataPoint(8, 0),
                new DataPoint(9, 0),
                new DataPoint(10, 0),
                new DataPoint(11, 0),
                new DataPoint(12, 0),
                new DataPoint(13, 0),
                new DataPoint(14, 0),
                new DataPoint(15, 0),
                new DataPoint(16, 0),
                new DataPoint(17, 0),
                new DataPoint(18, 0),
                new DataPoint(19, 0),
                new DataPoint(20, 0),
                new DataPoint(21, 0),
                new DataPoint(22, 0),
                new DataPoint(23, 0),
                new DataPoint(24, 0),
                new DataPoint(25, 0),
                new DataPoint(26, 0),
                new DataPoint(27, 0),
                new DataPoint(28, 0),
                new DataPoint(29, 0),
                new DataPoint(30, 0),
                new DataPoint(31, 0),
                new DataPoint(32, 0),
                new DataPoint(33, 0),
                new DataPoint(34, 0),
                new DataPoint(35, 0),
                new DataPoint(36, 0)
        });
        graph.setClickable(true);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMaxY(1);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMaxX(40);

        graph.getGridLabelRenderer().setVerticalAxisTitle("Percentage");
        graph.getGridLabelRenderer().setHorizontalAxisTitle("Month in School");

        graph.getGridLabelRenderer().setNumHorizontalLabels(9);

        graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX);
                } else {
                    // show currency for y values
                    return super.formatLabel(value, isValueX) ;
                }
            }
        });


    }

}
