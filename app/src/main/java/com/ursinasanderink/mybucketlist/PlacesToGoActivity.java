package com.ursinasanderink.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Maldives", "Go to the underwater hotel in the Maldives and enjoy world class kite spots.", R.drawable.maldives, 5),
                new BucketListEntry("Madagascar", "Explore Madagscars unique wildlife such as chameleons and monkeys.", R.drawable.madagascar, 5),
                new BucketListEntry("Los Roques", "Enjoy world class conditions and crystal blue water at this paradise island!", R.drawable.los_roques, 5),
                new BucketListEntry("Mauritius", "Hike and kitesurf in Le Morne and enjoy the natural beauty of this paradise.", R.drawable.mauritius, 4.5f),
                new BucketListEntry("Bahamas", "Kitesurf in the bahamas and enjoy the crystal blue water!", R.drawable.bahamas, 4),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);

    }
}