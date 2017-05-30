package th.in.thana.testcustomlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by thana on 5/30/2017 AD.
 */

public class MainListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MainListItem item;
        if (view != null)
            item = (MainListItem) view;
        else
            item = new MainListItem(viewGroup.getContext());
        return item;
    }
}
