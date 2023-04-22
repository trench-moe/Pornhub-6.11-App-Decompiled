package e5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import b5.d;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import e5.a0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le5/a0;", "Ld4/a;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a0 extends d4.a {
    public static final /* synthetic */ int C0 = 0;
    public VideoDetailsViewModel A0;
    public b5.d B0;

    /* renamed from: z0  reason: collision with root package name */
    public Map<Integer, View> f9059z0 = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements d.c {
        public a() {
        }

        @Override // c4.j.b
        public void a(VideoMetaData videoMetaData) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            VideoDetailsViewModel X0 = a0.this.X0();
            String vkey = videoMetaData.getVkey();
            Objects.requireNonNull(X0);
            Intrinsics.checkNotNullParameter(vkey, "vkey");
            X0.f5580s.l(vkey);
        }

        @Override // b5.d.c
        public void e(VideoMetaData videoMetaData) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            Context q10 = a0.this.q();
            Intrinsics.checkNotNull(q10);
            t3.l.f(q10, videoMetaData);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends androidx.recyclerview.widget.r {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public int l() {
            return -1;
        }
    }

    @Override // d4.a
    public void K0() {
    }

    @Override // d4.a
    public c4.a L0() {
        return this.B0;
    }

    @Override // d4.a
    public String M0() {
        String I = I(R.string.no_video_to_display);
        Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.no_video_to_display)");
        return I;
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.B0 = new b5.d(new a(), X0());
    }

    @Override // d4.a
    public void W0() {
    }

    public final VideoDetailsViewModel X0() {
        VideoDetailsViewModel videoDetailsViewModel = this.A0;
        if (videoDetailsViewModel != null) {
            return videoDetailsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoDetailsViewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f9059z0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        final b bVar = new b(u0());
        androidx.fragment.app.o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        z.b viewModelFactory = this.f8758n0;
        Intrinsics.checkNotNullExpressionValue(viewModelFactory, "viewModelFactory");
        VideoDetailsViewModel videoDetailsViewModel = (VideoDetailsViewModel) new androidx.lifecycle.z(s02, viewModelFactory).a(VideoDetailsViewModel.class);
        Intrinsics.checkNotNullParameter(videoDetailsViewModel, "<set-?>");
        this.A0 = videoDetailsViewModel;
        X0().f5579r.f(K(), new g4.b(this, 6));
        X0().f5580s.f(K(), new androidx.lifecycle.q() { // from class: e5.z
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                b5.d dVar;
                a0 this$0 = a0.this;
                a0.b smoothScroller = bVar;
                String vkey = (String) obj;
                int i10 = a0.C0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(smoothScroller, "$smoothScroller");
                if (vkey != null && (dVar = this$0.B0) != null) {
                    Intrinsics.checkNotNull(dVar);
                    Intrinsics.checkNotNullParameter(vkey, "vkey");
                    List<T> dataset = dVar.d;
                    Intrinsics.checkNotNullExpressionValue(dataset, "dataset");
                    int i11 = 0;
                    Iterator it = dataset.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (Intrinsics.areEqual(((VideoMetaData) it.next()).getVkey(), vkey)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    smoothScroller.f2853a = i11;
                    if (i11 >= 0) {
                        RecyclerView.l layoutManager = this$0.f8767x0.getLayoutManager();
                        if (layoutManager == null) {
                            return;
                        }
                        layoutManager.K0(smoothScroller);
                    }
                }
            }
        });
    }
}
