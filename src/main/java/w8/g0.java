package w8;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.app.pornhub.R;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g0 extends ArrayAdapter<MediaTrack> implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final Context f17017c;

    /* renamed from: f  reason: collision with root package name */
    public int f17018f;

    public g0(Context context, List<MediaTrack> list, int i10) {
        super(context, (int) R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList<>() : list);
        this.f17017c = context;
        this.f17018f = i10;
    }

    public final MediaTrack a() {
        int i10 = this.f17018f;
        if (i10 < 0 || i10 >= getCount()) {
            return null;
        }
        return getItem(this.f17018f);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        f0 f0Var;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.f17017c.getSystemService("layout_inflater");
            Objects.requireNonNull(layoutInflater, "null reference");
            view = layoutInflater.inflate(R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            f0Var = new f0((TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio));
            view.setTag(f0Var);
        } else {
            f0Var = (f0) view.getTag();
            Objects.requireNonNull(f0Var, "null reference");
        }
        f0Var.f17006b.setTag(Integer.valueOf(i10));
        f0Var.f17006b.setChecked(this.f17018f == i10);
        view.setOnClickListener(this);
        MediaTrack item = getItem(i10);
        Objects.requireNonNull(item, "null reference");
        String str = item.n;
        Locale forLanguageTag = TextUtils.isEmpty(item.f6807t) ? null : Locale.forLanguageTag(item.f6807t);
        if (TextUtils.isEmpty(str)) {
            if (item.f6808u == 2) {
                str = this.f17017c.getString(R.string.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (forLanguageTag != null) {
                    str = forLanguageTag.getDisplayLanguage();
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                str = this.f17017c.getString(R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i10 + 1));
            }
        }
        f0Var.f17005a.setText(str);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f0 f0Var = (f0) view.getTag();
        Objects.requireNonNull(f0Var, "null reference");
        Object tag = f0Var.f17006b.getTag();
        Objects.requireNonNull(tag, "null reference");
        this.f17018f = ((Integer) tag).intValue();
        notifyDataSetChanged();
    }
}
