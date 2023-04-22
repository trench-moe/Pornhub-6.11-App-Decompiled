package u4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemLayoutVideoBinding;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.google.android.exoplayer2.ui.PlayerView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import t3.o;
import t3.p;
import w6.c0;
import w6.v0;

/* loaded from: classes2.dex */
public final class i extends n1.j<VideoMetaData, b> {

    /* renamed from: f  reason: collision with root package name */
    public a f15540f;

    /* renamed from: g  reason: collision with root package name */
    public v0 f15541g;

    /* renamed from: h  reason: collision with root package name */
    public PlayerView f15542h;

    /* renamed from: i  reason: collision with root package name */
    public c f15543i;

    /* renamed from: j  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f15544j;

    /* renamed from: k  reason: collision with root package name */
    public final k f15545k;

    /* renamed from: l  reason: collision with root package name */
    public final j f15546l;

    /* loaded from: classes.dex */
    public interface a {
        void a(VideoMetaData videoMetaData);
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a binding) {
            super(((ItemLayoutVideoBinding) binding).f4725a);
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public abstract void x(VideoMetaData videoMetaData);
    }

    /* loaded from: classes2.dex */
    public final class c extends b {

        /* renamed from: u  reason: collision with root package name */
        public final ItemLayoutVideoBinding f15547u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i this$0, ItemLayoutVideoBinding itemBinding) {
            super(itemBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f15547u = itemBinding;
        }

        @Override // u4.i.b
        public void x(VideoMetaData videoMetaData) {
            if (videoMetaData == null) {
                return;
            }
            com.bumptech.glide.b.e(this.f15547u.f4728e).o(videoMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).A(this.f15547u.f4728e);
            VideoContentType videoContentType = videoMetaData.getVideoContentType();
            ImageView imageView = this.f15547u.f4727c;
            Intrinsics.checkNotNullExpressionValue(imageView, "itemBinding.icPremium");
            o.b(videoContentType, imageView);
            this.f15547u.f4726b.setVisibility(videoMetaData.isPaid() ? 0 : 8);
            ImageView imageView2 = this.f15547u.d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "itemBinding.imageViewUploaderType");
            o.o(videoMetaData, imageView2);
            this.f15547u.f4731h.setText(videoMetaData.getUserMetaData().getUsername());
            TextView textView = this.f15547u.f4734k;
            o oVar = o.f15126a;
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemBinding.videoType.context");
            textView.setText(o.k(context, videoMetaData));
            this.f15547u.f4733j.setText(videoMetaData.getTitle());
            this.f15547u.f4732i.setText(a0.b.y(videoMetaData.getDuration() * 1000));
            this.f15547u.f4735l.setText(a0.b.u(videoMetaData.getViewCount()));
            this.f15547u.f4730g.setText(a0.b.u(videoMetaData.getRating()));
            this.f15547u.f4725a.setTag(videoMetaData);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f15549f;

        public d(RecyclerView recyclerView) {
            this.f15549f = recyclerView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            u4.i.n(r7.f15548c, r7.f15549f);
            r7.f15549f.getViewTreeObserver().removeOnGlobalLayoutListener(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            return;
         */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onGlobalLayout() {
            /*
                r7 = this;
                r3 = r7
                u4.i r0 = u4.i.this
                java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                n1.a<T> r0 = r0.d
                n1.i<T> r1 = r0.f13179f
                r5 = 6
                if (r1 == 0) goto Ld
                goto L11
            Ld:
                r6 = 7
                n1.i<T> r1 = r0.f13178e
                r5 = 2
            L11:
                r0 = 0
                r5 = 4
                r5 = 1
                r2 = r5
                if (r1 != 0) goto L19
                r6 = 6
                goto L25
            L19:
                boolean r6 = r1.isEmpty()
                r1 = r6
                r1 = r1 ^ r2
                r5 = 5
                if (r1 != r2) goto L25
                r6 = 7
                r6 = 1
                r0 = r6
            L25:
                if (r0 == 0) goto L3b
                r5 = 3
                u4.i r0 = u4.i.this
                androidx.recyclerview.widget.RecyclerView r1 = r3.f15549f
                u4.i.n(r0, r1)
                r6 = 2
                androidx.recyclerview.widget.RecyclerView r0 = r3.f15549f
                r6 = 5
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnGlobalLayoutListener(r3)
                r5 = 2
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.i.d.onGlobalLayout():void");
        }
    }

    public i() {
        this(null, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(androidx.recyclerview.widget.n.e r1, int r2) {
        /*
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto La
            u4.h r1 = new u4.h
            r1.<init>()
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r2 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.<init>(r1)
            u4.k r1 = new u4.k
            r1.<init>(r0)
            r0.f15545k = r1
            u4.j r1 = new u4.j
            r1.<init>(r0)
            r0.f15546l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.i.<init>(androidx.recyclerview.widget.n$e, int):void");
    }

    public static final void n(i iVar, RecyclerView recyclerView) {
        Objects.requireNonNull(iVar);
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int U0 = linearLayoutManager.U0();
        if (U0 < 0) {
            U0 = linearLayoutManager.X0();
        }
        RecyclerView.z G = recyclerView.G(U0);
        if (G == null || !(G instanceof c)) {
            return;
        }
        c cVar = iVar.f15543i;
        if (cVar == null) {
            iVar.o((c) G, U0);
        } else if (Intrinsics.areEqual(cVar, G)) {
        } else {
            iVar.p(true, false);
            iVar.o((c) G, U0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        rv.h(this.f15545k);
        this.f15544j = new d(rv);
        rv.getViewTreeObserver().addOnGlobalLayoutListener(this.f15544j);
        j8.i iVar = new j8.i(true, 65536);
        k8.a.f(!false);
        k8.a.f(!false);
        w6.k.j(1000, 0, "bufferForPlaybackMs", "0");
        w6.k.j(1500, 0, "bufferForPlaybackAfterRebufferMs", "0");
        w6.k.j(1500, 1000, "minBufferMs", "bufferForPlaybackMs");
        w6.k.j(1500, 1500, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        w6.k.j(3000, 1500, "maxBufferMs", "minBufferMs");
        k8.a.f(!false);
        w6.k kVar = new w6.k(iVar, 1500, 3000, 1000, 1500, -1, false, 0, false);
        Intrinsics.checkNotNullExpressionValue(kVar, "Builder()\n            .s…500)\n            .build()");
        v0.b bVar = new v0.b(rv.getContext());
        k8.a.f(!bVar.f16788s);
        bVar.f16776f = kVar;
        v0 a10 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder(rv.context)\n    …rol)\n            .build()");
        this.f15541g = a10;
        a10.p0(0.0f);
        v0 v0Var = this.f15541g;
        v0 v0Var2 = null;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var = null;
        }
        v0Var.C(true);
        v0 v0Var3 = this.f15541g;
        if (v0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            v0Var2 = v0Var3;
        }
        v0Var2.o(this.f15546l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        b holder = (b) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.x(m(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemLayoutVideoBinding a10 = ItemLayoutVideoBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
        a10.f4725a.setOnClickListener(new b4.b(this, 7));
        Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …          }\n            }");
        return new c(this, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        v0 v0Var = this.f15541g;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var = null;
        }
        v0Var.d.n0(this.f15546l);
        v0 v0Var2 = this.f15541g;
        if (v0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var2 = null;
        }
        v0Var2.k0();
        this.f15542h = null;
        p(false, true);
        rv.b0(this.f15545k);
        if (this.f15544j != null) {
            rv.getViewTreeObserver().addOnGlobalLayoutListener(this.f15544j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void k(RecyclerView.z zVar) {
        b holder = (b) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder == this.f15543i) {
            p(false, true);
        }
    }

    public final void o(c cVar, int i10) {
        ItemLayoutVideoBinding itemLayoutVideoBinding = cVar.f15547u;
        VideoMetaData m10 = m(i10);
        if (m10 == null || itemLayoutVideoBinding.f4729f.getVisibility() == 0 || !p.a(m10)) {
            return;
        }
        itemLayoutVideoBinding.f4729f.setVisibility(0);
        v0 v0Var = null;
        PlayerView playerView = new PlayerView(itemLayoutVideoBinding.f4729f.getContext(), null);
        this.f15542h = playerView;
        Intrinsics.checkNotNull(playerView);
        playerView.setUseController(false);
        itemLayoutVideoBinding.f4729f.removeAllViews();
        itemLayoutVideoBinding.f4729f.addView(this.f15542h, new FrameLayout.LayoutParams(-2, -1));
        PlayerView playerView2 = this.f15542h;
        Intrinsics.checkNotNull(playerView2);
        v0 v0Var2 = this.f15541g;
        if (v0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var2 = null;
        }
        playerView2.setPlayer(v0Var2);
        c0 b10 = c0.b(m10.getPreviewUrl());
        Intrinsics.checkNotNullExpressionValue(b10, "fromUri(videoMetaData.previewUrl)");
        v0 v0Var3 = this.f15541g;
        if (v0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var3 = null;
        }
        v0Var3.y(b10);
        v0 v0Var4 = this.f15541g;
        if (v0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            v0Var4 = null;
        }
        v0Var4.f();
        v0 v0Var5 = this.f15541g;
        if (v0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        } else {
            v0Var = v0Var5;
        }
        v0Var.n(0L);
        this.f15543i = cVar;
    }

    public final void p(boolean z10, boolean z11) {
        c cVar = this.f15543i;
        if (cVar == null) {
            return;
        }
        v0 v0Var = null;
        this.f15543i = null;
        ItemLayoutVideoBinding itemLayoutVideoBinding = cVar.f15547u;
        if (z11) {
            v0 v0Var2 = this.f15541g;
            if (v0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                v0Var2 = null;
            }
            if (v0Var2.isPlaying()) {
                v0 v0Var3 = this.f15541g;
                if (v0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                } else {
                    v0Var = v0Var3;
                }
                v0Var.q0(true);
            }
        } else {
            v0 v0Var4 = this.f15541g;
            if (v0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                v0Var4 = null;
            }
            v0Var4.q0(true);
            v0 v0Var5 = this.f15541g;
            if (v0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                v0Var = v0Var5;
            }
            v0Var.n(0L);
        }
        itemLayoutVideoBinding.f4729f.removeAllViews();
        itemLayoutVideoBinding.f4729f.setVisibility(8);
        if (z10) {
            itemLayoutVideoBinding.f4728e.animate().alpha(1.0f).setDuration(100L);
        } else {
            itemLayoutVideoBinding.f4728e.setAlpha(1.0f);
        }
    }
}
