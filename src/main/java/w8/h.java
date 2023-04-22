package w8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends androidx.fragment.app.l {
    public boolean D0;
    public List<MediaTrack> E0;
    public List<MediaTrack> F0;
    public long[] G0;
    public Dialog H0;
    public g I0;

    public static int R0(List<MediaTrack> list, long[] jArr, int i10) {
        if (jArr != null && list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                for (long j10 : jArr) {
                    if (j10 == list.get(i11).f6803c) {
                        return i11;
                    }
                }
            }
        }
        return i10;
    }

    public static ArrayList<MediaTrack> S0(List<MediaTrack> list, int i10) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        for (MediaTrack mediaTrack : list) {
            if (mediaTrack.f6804f == i10) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        int R0 = R0(this.E0, this.G0, 0);
        int R02 = R0(this.F0, this.G0, -1);
        g0 g0Var = new g0(n(), this.E0, R0);
        g0 g0Var2 = new g0(n(), this.F0, R02);
        AlertDialog.Builder builder = new AlertDialog.Builder(n());
        View inflate = n().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(R.id.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tab_host);
        tabHost.setup();
        if (g0Var.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) g0Var);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(R.id.text_list_view);
            newTabSpec.setIndicator(n().getString(R.string.cast_tracks_chooser_dialog_subtitles));
            tabHost.addTab(newTabSpec);
        }
        if (g0Var2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) g0Var2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(R.id.audio_list_view);
            newTabSpec2.setIndicator(n().getString(R.string.cast_tracks_chooser_dialog_audio));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(n().getString(R.string.cast_tracks_chooser_dialog_ok), new e0(this, g0Var, g0Var2)).setNegativeButton(R.string.cast_tracks_chooser_dialog_cancel, new d0(this));
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.cancel();
            this.H0 = null;
        }
        AlertDialog create = builder.create();
        this.H0 = create;
        return create;
    }

    public final void T0() {
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.cancel();
            this.H0 = null;
        }
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.D0 = true;
        this.F0 = new ArrayList();
        this.E0 = new ArrayList();
        this.G0 = new long[0];
        v8.d c10 = v8.b.c(q()).b().c();
        if (c10 != null && c10.c()) {
            g l10 = c10.l();
            this.I0 = l10;
            if (l10 != null && l10.j() && this.I0.f() != null) {
                g gVar = this.I0;
                u8.o g10 = gVar.g();
                if (g10 != null) {
                    this.G0 = g10.A;
                }
                MediaInfo f10 = gVar.f();
                if (f10 == null) {
                    this.D0 = false;
                    return;
                }
                List<MediaTrack> list = f10.f6798t;
                if (list == null) {
                    this.D0 = false;
                    return;
                }
                this.F0 = S0(list, 2);
                ArrayList<MediaTrack> S0 = S0(list, 1);
                this.E0 = S0;
                if (S0.isEmpty()) {
                    return;
                }
                this.E0.add(0, new MediaTrack(-1L, 1, BuildConfig.FLAVOR, null, n().getString(R.string.cast_tracks_chooser_dialog_none), null, 2, null, null));
                return;
            }
            this.D0 = false;
            return;
        }
        this.D0 = false;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Y() {
        Dialog dialog = this.f2188y0;
        if (dialog != null && this.R) {
            dialog.setDismissMessage(null);
        }
        super.Y();
    }
}
