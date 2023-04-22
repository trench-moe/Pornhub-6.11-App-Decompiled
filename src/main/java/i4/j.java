package i4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PhotosConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class j extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f10523c = new ArrayList<>(PhotosConfig.getAllSegmentsList());

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Integer> f10524f;

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final int f10525c;

        public b(int i10, a aVar) {
            this.f10525c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.dialog_community_albums_segments_row_cbSegment);
            if (!j.this.f10524f.contains(Integer.valueOf(this.f10525c))) {
                j.this.f10524f.add(Integer.valueOf(this.f10525c));
                checkBox.setChecked(true);
            } else if (j.this.f10524f.size() == 1) {
            } else {
                j.this.f10524f.remove(Integer.valueOf(this.f10525c));
                checkBox.setChecked(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public TextView f10527a;

        /* renamed from: b  reason: collision with root package name */
        public CheckBox f10528b;

        public c() {
        }

        public c(a aVar) {
        }
    }

    public j(List<Integer> list) {
        this.f10524f = new ArrayList<>(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10523c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f10523c.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        c cVar;
        if (view == null) {
            cVar = new c(null);
            view2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.include_dialog_community_albums_segments_row, viewGroup, false);
            cVar.f10527a = (TextView) view2.findViewById(R.id.dialog_community_albums_segments_row_txtSegment);
            cVar.f10528b = (CheckBox) view2.findViewById(R.id.dialog_community_albums_segments_row_cbSegment);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (c) view.getTag();
        }
        cVar.f10527a.setText(this.f10523c.get(i10));
        cVar.f10528b.setChecked(this.f10524f.contains(Integer.valueOf(i10)));
        view2.setOnClickListener(new b(i10, null));
        return view2;
    }
}
