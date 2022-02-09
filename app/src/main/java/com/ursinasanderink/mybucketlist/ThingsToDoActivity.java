package com.ursinasanderink.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        // Here we create our bucket list entry array
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Freedive with sharks", "Freedive with sharks without cage.", R.drawable.freedive_with_sharks, 5),
                new BucketListEntry("Reach financial freedom", "By doing things I love such as coding!", R.drawable.achieving_financial_freedom, 5),
                new BucketListEntry("Become a Skydiver", "Complete the AFF course to become an independent jumper.", R.drawable.skydiving, 4.5f),
                new BucketListEntry("Climb Mt Kilimanjaro", "Do it the difficult way!", R.drawable.climb_kilimanjaro, 4),
                new BucketListEntry("Climb Grand Canyon", "Go rope climbing in the Grand Canyon and enjoy the view.", R.drawable.climb_grand_canyon, 3.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}