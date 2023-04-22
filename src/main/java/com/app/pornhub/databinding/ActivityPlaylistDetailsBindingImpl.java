package com.app.pornhub.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import kotlin.jvm.internal.Intrinsics;
import p3.a;

/* loaded from: classes.dex */
public class ActivityPlaylistDetailsBindingImpl extends ActivityPlaylistDetailsBinding implements a.InterfaceC0242a {
    public static final SparseIntArray E;
    public final View.OnClickListener A;
    public final View.OnClickListener B;
    public final View.OnClickListener C;
    public long D;
    public final View.OnClickListener y;

    /* renamed from: z  reason: collision with root package name */
    public final View.OnClickListener f4464z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.error_view, 9);
        sparseIntArray.put(R.id.guide_start, 10);
        sparseIntArray.put(R.id.guide_end, 11);
        sparseIntArray.put(R.id.pds_info_header_divider, 12);
        sparseIntArray.put(R.id.progress_loading, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityPlaylistDetailsBindingImpl(androidx.databinding.c r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.databinding.ActivityPlaylistDetailsBindingImpl.<init>(androidx.databinding.c, android.view.View):void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public void e() {
        long j10;
        String str;
        int i10;
        int i11;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        Playlist playlist = this.f4463x;
        String str2 = null;
        if ((j10 & 10) == 0 || playlist == null) {
            str = null;
            i10 = 0;
        } else {
            i10 = playlist.getVideoCount();
            str2 = playlist.getUsername();
            str = playlist.getTitle();
        }
        int i12 = ((j10 & 12) > 0L ? 1 : ((j10 & 12) == 0L ? 0 : -1));
        if (i12 != 0) {
            if (i12 != 0) {
                j10 |= 16;
            }
            i11 = 8;
        } else {
            i11 = 0;
        }
        if ((8 & j10) != 0) {
            this.f4453m.setOnClickListener(this.f4464z);
            this.n.setOnClickListener(this.C);
            this.f4454o.setOnClickListener(this.y);
            this.f4455p.setOnClickListener(this.A);
            this.f4456q.setOnClickListener(this.B);
        }
        if ((12 & j10) != 0) {
            this.f4453m.setVisibility(i11);
        }
        if ((j10 & 10) != 0) {
            u0.a.a(this.f4456q, str2);
            u0.a.a(this.f4457r, str);
            u0.a.a(this.f4458s, str);
            TextView textView = this.f4459t;
            Intrinsics.checkNotNullParameter(textView, "textView");
            textView.setText(textView.getContext().getResources().getQuantityString(R.plurals.plural_n_videos, i10, Integer.valueOf(i10)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g() {
        synchronized (this) {
            return this.D != 0;
        }
    }

    @Override // com.app.pornhub.databinding.ActivityPlaylistDetailsBinding
    public void n(PlaylistDetailsActivity.a aVar) {
        this.f4462w = aVar;
        synchronized (this) {
            this.D |= 1;
        }
        a(1);
        m();
    }

    @Override // com.app.pornhub.databinding.ActivityPlaylistDetailsBinding
    public void o(Playlist playlist) {
        this.f4463x = playlist;
        synchronized (this) {
            this.D |= 2;
        }
        a(2);
        m();
    }

    @Override // com.app.pornhub.databinding.ActivityPlaylistDetailsBinding
    public void p(PlaylistDetailsViewModel playlistDetailsViewModel) {
        this.f4461v = playlistDetailsViewModel;
        synchronized (this) {
            try {
                this.D |= 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        a(3);
        m();
    }
}
