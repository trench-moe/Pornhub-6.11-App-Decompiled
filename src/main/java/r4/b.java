package r4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import g4.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z2.cp;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lr4/b;", "Lcom/google/android/material/bottomsheet/b;", "Lz2/cp;", "<init>", "()V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b extends com.google.android.material.bottomsheet.b implements cp {
    public static final /* synthetic */ int E0 = 0;
    public Map<Integer, View> D0 = new LinkedHashMap();

    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_playlist_bottom_sheet, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.pbs_checkbox_container);
        new ArrayList();
        new ArrayList();
        Bundle bundle2 = this.f2019u;
        String string = bundle2 == null ? null : bundle2.getString("vkey");
        ((TextView) inflate.findViewById(R.id.pbs_new_playlist)).setOnClickListener(new l(this, string, 1));
        ((TextView) inflate.findViewById(R.id.pbs_done)).setOnClickListener(new x3.c(string, this, 2));
        return inflate;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.D0.clear();
    }
}
