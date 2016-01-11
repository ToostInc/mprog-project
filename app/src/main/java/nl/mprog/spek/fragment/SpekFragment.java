package nl.mprog.spek.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.HashMap;


import nl.mprog.spek.R;
import nl.mprog.spek.model.Hardware;
import nl.mprog.spek.view.adapter.MapAdapter;

/**
 * Superclass for all fragments.
 * Not to be meddled or trifled with! Certainly not to be initialized.
 * Unfortunately can't make it abstract because newInstance makes an instance of this class.
 */

public class SpekFragment extends Fragment {

    static final protected HashMap<String, String> info = new HashMap<>();
    static public MapAdapter infoAdapter;

    public SpekFragment() {
        // Required empty public constructor
    }


    public static SpekFragment newInstance(String param1, String param2) {
        SpekFragment fragment = new SpekFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_spek, container, false);

        //set the data to be shown and adapt it.
        setMapData();
        setAdapter(fragment);

        info.put("Label", "Data");
        infoAdapter.notifyDataSetInvalidated();

        return fragment;
    }

    /**
     * The "meat" of every Fragment.
     * This is where the various Hardware information will be set in key-value entries,
     * the key being a label and the value the actual data you want shown.
     */
    public void setMapData(){

    }


    public void setAdapter(View view){
        //init Adapter and bind it to the Listview
        infoAdapter = new MapAdapter(info);
        ListView infoList = (ListView) view.findViewById(R.id.info_list);
        infoList.setAdapter(infoAdapter);
    }

}
