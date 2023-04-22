package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.o;
import i8.e;
import i8.h;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;
import l8.s;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x;
import w6.x0;
import w6.y;

/* loaded from: classes.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final /* synthetic */ int Q0 = 0;
    public final ImageView A;
    public RecyclerView A0;
    public final View B;
    public h B0;
    public final TextView C;
    public e C0;
    public final TextView D;
    public PopupWindow D0;
    public final o E;
    public boolean E0;
    public final StringBuilder F;
    public int F0;
    public final Formatter G;
    public i8.e G0;
    public final x0.b H;
    public l H0;
    public final x0.c I;
    public l I0;
    public final Runnable J;
    public p J0;
    public final Drawable K;
    public ImageView K0;
    public final Drawable L;
    public ImageView L0;
    public final Drawable M;
    public ImageView M0;
    public final String N;
    public View N0;
    public final String O;
    public View O0;
    public final String P;
    public View P0;
    public final Drawable Q;
    public final Drawable R;
    public final float S;
    public final float T;
    public final String U;
    public final String V;
    public final Drawable W;

    /* renamed from: a0  reason: collision with root package name */
    public final Drawable f6507a0;

    /* renamed from: b0  reason: collision with root package name */
    public final String f6508b0;

    /* renamed from: c  reason: collision with root package name */
    public final c f6509c;

    /* renamed from: c0  reason: collision with root package name */
    public final String f6510c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Drawable f6511d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Drawable f6512e0;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f6513f;

    /* renamed from: f0  reason: collision with root package name */
    public final String f6514f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f6515g0;

    /* renamed from: h0  reason: collision with root package name */
    public n0 f6516h0;

    /* renamed from: i0  reason: collision with root package name */
    public w6.h f6517i0;

    /* renamed from: j  reason: collision with root package name */
    public final View f6518j;

    /* renamed from: j0  reason: collision with root package name */
    public f f6519j0;

    /* renamed from: k0  reason: collision with root package name */
    public d f6520k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6521l0;

    /* renamed from: m  reason: collision with root package name */
    public final View f6522m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6523m0;
    public final View n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6524n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6525o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6526p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6527q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6528r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6529s0;

    /* renamed from: t  reason: collision with root package name */
    public final View f6530t;

    /* renamed from: t0  reason: collision with root package name */
    public long[] f6531t0;

    /* renamed from: u  reason: collision with root package name */
    public final View f6532u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean[] f6533u0;

    /* renamed from: v0  reason: collision with root package name */
    public long[] f6534v0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f6535w;
    public boolean[] w0;

    /* renamed from: x0  reason: collision with root package name */
    public long f6536x0;
    public final TextView y;

    /* renamed from: y0  reason: collision with root package name */
    public com.google.android.exoplayer2.ui.l f6537y0;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f6538z;

    /* renamed from: z0  reason: collision with root package name */
    public Resources f6539z0;

    /* loaded from: classes.dex */
    public final class b extends l {
        public b(a aVar) {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void m(List<Integer> list, List<k> list2, h.a aVar) {
            boolean z10;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    z10 = false;
                    break;
                }
                int intValue = list.get(i11).intValue();
                w7.o oVar = aVar.f10634c[intValue];
                i8.e eVar = StyledPlayerControlView.this.G0;
                if (eVar != null && eVar.d().b(intValue, oVar)) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (!list2.isEmpty()) {
                if (z10) {
                    while (true) {
                        if (i10 >= list2.size()) {
                            break;
                        }
                        k kVar = list2.get(i10);
                        if (kVar.f6558e) {
                            StyledPlayerControlView.this.B0.f6549e[1] = kVar.d;
                            break;
                        }
                        i10++;
                    }
                } else {
                    StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                    styledPlayerControlView.B0.f6549e[1] = styledPlayerControlView.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.B0.f6549e[1] = styledPlayerControlView2.getResources().getString(R.string.exo_track_selection_none);
            }
            this.d = list;
            this.f6559e = list2;
            this.f6560f = aVar;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(i iVar) {
            boolean z10;
            iVar.f6552u.setText(R.string.exo_track_selection_auto);
            i8.e eVar = StyledPlayerControlView.this.G0;
            Objects.requireNonNull(eVar);
            e.d d = eVar.d();
            int i10 = 0;
            while (true) {
                if (i10 >= this.d.size()) {
                    z10 = false;
                    break;
                }
                int intValue = this.d.get(i10).intValue();
                h.a aVar = this.f6560f;
                Objects.requireNonNull(aVar);
                if (d.b(intValue, aVar.f10634c[intValue])) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            iVar.f6553v.setVisibility(z10 ? 4 : 0);
            iVar.f2885a.setOnClickListener(new x3.b(this, 16));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void p(String str) {
            StyledPlayerControlView.this.B0.f6549e[1] = str;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements n0.e, o.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c(a aVar) {
        }

        @Override // w6.n0.c
        public void C(n0 n0Var, n0.d dVar) {
            if (dVar.b(5, 6)) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                int i10 = StyledPlayerControlView.Q0;
                styledPlayerControlView.o();
            }
            if (dVar.b(5, 6, 8)) {
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                int i11 = StyledPlayerControlView.Q0;
                styledPlayerControlView2.q();
            }
            if (dVar.a(9)) {
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                int i12 = StyledPlayerControlView.Q0;
                styledPlayerControlView3.r();
            }
            if (dVar.a(10)) {
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                int i13 = StyledPlayerControlView.Q0;
                styledPlayerControlView4.t();
            }
            if (dVar.b(9, 10, 12, 0, 17, 18)) {
                StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
                int i14 = StyledPlayerControlView.Q0;
                styledPlayerControlView5.n();
            }
            if (dVar.b(12, 0)) {
                StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                int i15 = StyledPlayerControlView.Q0;
                styledPlayerControlView6.u();
            }
            if (dVar.a(13)) {
                StyledPlayerControlView styledPlayerControlView7 = StyledPlayerControlView.this;
                int i16 = StyledPlayerControlView.Q0;
                styledPlayerControlView7.p();
            }
            if (dVar.a(2)) {
                StyledPlayerControlView styledPlayerControlView8 = StyledPlayerControlView.this;
                int i17 = StyledPlayerControlView.Q0;
                styledPlayerControlView8.v();
            }
        }

        @Override // a7.b
        public /* synthetic */ void F(int i10, boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void G(boolean z10, int i10) {
        }

        @Override // l8.l
        public /* synthetic */ void J(int i10, int i11, int i12, float f10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void L(int i10) {
        }

        @Override // a7.b
        public /* synthetic */ void M(a7.a aVar) {
        }

        @Override // l8.l
        public /* synthetic */ void N() {
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // y7.i
        public /* synthetic */ void R(List list) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void W(w7.o oVar, i8.j jVar) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Y(boolean z10, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Z(m0 m0Var) {
        }

        @Override // y6.f
        public /* synthetic */ void a(boolean z10) {
        }

        @Override // l8.l
        public /* synthetic */ void b(s sVar) {
        }

        @Override // l8.l
        public /* synthetic */ void b0(int i10, int i11) {
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void c(o oVar, long j10) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            TextView textView = styledPlayerControlView.D;
            if (textView != null) {
                textView.setText(c0.t(styledPlayerControlView.F, styledPlayerControlView.G, j10));
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void d(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void e(x0 x0Var, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void f(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void g(d0 d0Var) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void g0(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void h(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void i(List list) {
        }

        @Override // o7.e
        public /* synthetic */ void j(o7.a aVar) {
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void k(o oVar, long j10, boolean z10) {
            n0 n0Var;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            int i10 = 0;
            styledPlayerControlView.f6526p0 = false;
            if (!z10 && (n0Var = styledPlayerControlView.f6516h0) != null) {
                x0 M = n0Var.M();
                if (styledPlayerControlView.f6525o0 && !M.q()) {
                    int p10 = M.p();
                    while (true) {
                        long b10 = M.n(i10, styledPlayerControlView.I).b();
                        if (j10 < b10) {
                            break;
                        } else if (i10 == p10 - 1) {
                            j10 = b10;
                            break;
                        } else {
                            j10 -= b10;
                            i10++;
                        }
                    }
                } else {
                    i10 = n0Var.z();
                }
                Objects.requireNonNull((w6.i) styledPlayerControlView.f6517i0);
                n0Var.d(i10, j10);
                styledPlayerControlView.q();
            }
            StyledPlayerControlView.this.f6537y0.i();
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void l(o oVar, long j10) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            styledPlayerControlView.f6526p0 = true;
            TextView textView = styledPlayerControlView.D;
            if (textView != null) {
                textView.setText(c0.t(styledPlayerControlView.F, styledPlayerControlView.G, j10));
            }
            StyledPlayerControlView.this.f6537y0.h();
        }

        @Override // w6.n0.c
        public /* synthetic */ void l0(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void m(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            n0 n0Var = styledPlayerControlView.f6516h0;
            if (n0Var == null) {
                return;
            }
            styledPlayerControlView.f6537y0.i();
            StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
            if (styledPlayerControlView2.f6522m == view) {
                Objects.requireNonNull((w6.i) styledPlayerControlView2.f6517i0);
                n0Var.Q();
            } else if (styledPlayerControlView2.f6518j == view) {
                Objects.requireNonNull((w6.i) styledPlayerControlView2.f6517i0);
                n0Var.A();
            } else if (styledPlayerControlView2.f6530t == view) {
                if (n0Var.g() != 4) {
                    Objects.requireNonNull((w6.i) StyledPlayerControlView.this.f6517i0);
                    n0Var.R();
                }
            } else if (styledPlayerControlView2.f6532u == view) {
                Objects.requireNonNull((w6.i) styledPlayerControlView2.f6517i0);
                n0Var.U();
            } else if (styledPlayerControlView2.n == view) {
                styledPlayerControlView2.e(n0Var);
            } else if (styledPlayerControlView2.f6538z == view) {
                w6.h hVar = styledPlayerControlView2.f6517i0;
                int C = a0.b.C(n0Var.s(), StyledPlayerControlView.this.f6529s0);
                Objects.requireNonNull((w6.i) hVar);
                n0Var.q(C);
            } else if (styledPlayerControlView2.A == view) {
                Objects.requireNonNull((w6.i) styledPlayerControlView2.f6517i0);
                n0Var.l(!n0Var.O());
            } else if (styledPlayerControlView2.N0 == view) {
                styledPlayerControlView2.f6537y0.h();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.f(styledPlayerControlView3.B0);
            } else if (styledPlayerControlView2.O0 == view) {
                styledPlayerControlView2.f6537y0.h();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.f(styledPlayerControlView4.C0);
            } else if (styledPlayerControlView2.P0 == view) {
                styledPlayerControlView2.f6537y0.h();
                StyledPlayerControlView styledPlayerControlView5 = StyledPlayerControlView.this;
                styledPlayerControlView5.f(styledPlayerControlView5.I0);
            } else if (styledPlayerControlView2.K0 == view) {
                styledPlayerControlView2.f6537y0.h();
                StyledPlayerControlView styledPlayerControlView6 = StyledPlayerControlView.this;
                styledPlayerControlView6.f(styledPlayerControlView6.H0);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (styledPlayerControlView.E0) {
                styledPlayerControlView.f6537y0.i();
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void p(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(w6.c0 c0Var, int i10) {
        }

        @Override // y6.f
        public /* synthetic */ void u(float f10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void v(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public final class e extends RecyclerView.Adapter<i> {
        public final String[] d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f6542e;

        /* renamed from: f  reason: collision with root package name */
        public int f6543f;

        public e(String[] strArr, int[] iArr) {
            this.d = strArr;
            this.f6542e = iArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void h(i iVar, final int i10) {
            i iVar2 = iVar;
            String[] strArr = this.d;
            if (i10 < strArr.length) {
                iVar2.f6552u.setText(strArr[i10]);
            }
            iVar2.f6553v.setVisibility(i10 == this.f6543f ? 0 : 4);
            iVar2.f2885a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.e eVar = StyledPlayerControlView.e.this;
                    int i11 = i10;
                    if (i11 != eVar.f6543f) {
                        StyledPlayerControlView.this.setPlaybackSpeed(eVar.f6542e[i11] / 100.0f);
                    }
                    StyledPlayerControlView.this.D0.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public i i(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public final class g extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f6545u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f6546v;

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f6547w;

        public g(View view) {
            super(view);
            if (c0.f11939a < 26) {
                view.setFocusable(true);
            }
            this.f6545u = (TextView) view.findViewById(R.id.exo_main_text);
            this.f6546v = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f6547w = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new u3.c(this, 16));
        }
    }

    /* loaded from: classes.dex */
    public class h extends RecyclerView.Adapter<g> {
        public final String[] d;

        /* renamed from: e  reason: collision with root package name */
        public final String[] f6549e;

        /* renamed from: f  reason: collision with root package name */
        public final Drawable[] f6550f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.d = strArr;
            this.f6549e = new String[strArr.length];
            this.f6550f = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long b(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void h(g gVar, int i10) {
            g gVar2 = gVar;
            gVar2.f6545u.setText(this.d[i10]);
            String[] strArr = this.f6549e;
            if (strArr[i10] == null) {
                gVar2.f6546v.setVisibility(8);
            } else {
                gVar2.f6546v.setText(strArr[i10]);
            }
            Drawable[] drawableArr = this.f6550f;
            if (drawableArr[i10] == null) {
                gVar2.f6547w.setVisibility(8);
            } else {
                gVar2.f6547w.setImageDrawable(drawableArr[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public g i(ViewGroup viewGroup, int i10) {
            return new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f6552u;

        /* renamed from: v  reason: collision with root package name */
        public final View f6553v;

        public i(View view) {
            super(view);
            if (c0.f11939a < 26) {
                view.setFocusable(true);
            }
            this.f6552u = (TextView) view.findViewById(R.id.exo_text);
            this.f6553v = view.findViewById(R.id.exo_check);
        }
    }

    /* loaded from: classes.dex */
    public final class j extends l {
        public j(a aVar) {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void m(List<Integer> list, List<k> list2, h.a aVar) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list2.size()) {
                    break;
                } else if (list2.get(i10).f6558e) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            ImageView imageView = styledPlayerControlView.K0;
            if (imageView != null) {
                imageView.setImageDrawable(z10 ? styledPlayerControlView.W : styledPlayerControlView.f6507a0);
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.K0.setContentDescription(z10 ? styledPlayerControlView2.f6508b0 : styledPlayerControlView2.f6510c0);
            }
            this.d = list;
            this.f6559e = list2;
            this.f6560f = aVar;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: n */
        public void h(i iVar, int i10) {
            super.h(iVar, i10);
            if (i10 > 0) {
                iVar.f6553v.setVisibility(this.f6559e.get(i10 + (-1)).f6558e ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(i iVar) {
            boolean z10;
            iVar.f6552u.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f6559e.size()) {
                    z10 = true;
                    break;
                } else if (this.f6559e.get(i11).f6558e) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            View view = iVar.f6553v;
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
            iVar.f2885a.setOnClickListener(new u3.a(this, 19));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void p(String str) {
        }
    }

    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final int f6555a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6556b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6557c;
        public final String d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6558e;

        public k(int i10, int i11, int i12, String str, boolean z10) {
            this.f6555a = i10;
            this.f6556b = i11;
            this.f6557c = i12;
            this.d = str;
            this.f6558e = z10;
        }
    }

    /* loaded from: classes.dex */
    public abstract class l extends RecyclerView.Adapter<i> {
        public List<Integer> d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public List<k> f6559e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public h.a f6560f = null;

        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            if (this.f6559e.isEmpty()) {
                return 0;
            }
            return this.f6559e.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public i i(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public abstract void m(List<Integer> list, List<k> list2, h.a aVar);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: n */
        public void h(i iVar, int i10) {
            if (StyledPlayerControlView.this.G0 != null && this.f6560f != null) {
                if (i10 == 0) {
                    o(iVar);
                    return;
                }
                boolean z10 = true;
                k kVar = this.f6559e.get(i10 - 1);
                w7.o oVar = this.f6560f.f10634c[kVar.f6555a];
                i8.e eVar = StyledPlayerControlView.this.G0;
                Objects.requireNonNull(eVar);
                boolean b10 = eVar.d().b(kVar.f6555a, oVar);
                int i11 = 0;
                z10 = (b10 && kVar.f6558e) ? false : false;
                iVar.f6552u.setText(kVar.d);
                View view = iVar.f6553v;
                if (!z10) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                iVar.f2885a.setOnClickListener(new q4.f(this, kVar, 2));
            }
        }

        public abstract void o(i iVar);

        public abstract void p(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        void c(int i10);
    }

    static {
        x.a("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        c cVar;
        boolean z19;
        boolean z20;
        boolean z21;
        TextView textView;
        boolean z22;
        this.f6527q0 = 5000;
        this.f6529s0 = 0;
        this.f6528r0 = 200;
        int i11 = R.layout.exo_styled_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o9.b.f13625u, 0, 0);
            try {
                i11 = obtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f6527q0 = obtainStyledAttributes.getInt(21, this.f6527q0);
                this.f6529s0 = obtainStyledAttributes.getInt(9, this.f6529s0);
                boolean z23 = obtainStyledAttributes.getBoolean(18, true);
                boolean z24 = obtainStyledAttributes.getBoolean(15, true);
                boolean z25 = obtainStyledAttributes.getBoolean(17, true);
                boolean z26 = obtainStyledAttributes.getBoolean(16, true);
                boolean z27 = obtainStyledAttributes.getBoolean(19, false);
                boolean z28 = obtainStyledAttributes.getBoolean(20, false);
                boolean z29 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.f6528r0));
                boolean z30 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z11 = z27;
                z16 = z23;
                z12 = z26;
                z15 = z29;
                z10 = z28;
                z17 = z24;
                z13 = z25;
                z14 = z30;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = false;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        c cVar2 = new c(null);
        this.f6509c = cVar2;
        this.f6513f = new CopyOnWriteArrayList<>();
        this.H = new x0.b();
        this.I = new x0.c();
        StringBuilder sb2 = new StringBuilder();
        this.F = sb2;
        this.G = new Formatter(sb2, Locale.getDefault());
        this.f6531t0 = new long[0];
        this.f6533u0 = new boolean[0];
        this.f6534v0 = new long[0];
        this.w0 = new boolean[0];
        this.f6517i0 = new w6.i();
        this.J = new u.a(this, 4);
        this.C = (TextView) findViewById(R.id.exo_duration);
        this.D = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.K0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.L0 = imageView2;
        u3.a aVar = new u3.a(this, 18);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(aVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.M0 = imageView3;
        b4.b bVar = new b4.b(this, 17);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(bVar);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.N0 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar2);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.O0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar2);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.P0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar2);
        }
        o oVar = (o) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (oVar != null) {
            this.E = oVar;
            z18 = z10;
            cVar = cVar2;
            z19 = z11;
            z20 = z12;
            z21 = z13;
            textView = null;
        } else if (findViewById4 != null) {
            textView = null;
            z18 = z10;
            cVar = cVar2;
            z19 = z11;
            z20 = z12;
            z21 = z13;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, 2132017494);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.E = defaultTimeBar;
        } else {
            z18 = z10;
            cVar = cVar2;
            z19 = z11;
            z20 = z12;
            z21 = z13;
            textView = null;
            this.E = null;
        }
        o oVar2 = this.E;
        c cVar3 = cVar;
        if (oVar2 != null) {
            oVar2.b(cVar3);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.n = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar3);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.f6518j = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar3);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.f6522m = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar3);
        }
        Typeface a10 = d0.f.a(context, R.font.roboto_medium_numbers);
        View findViewById8 = findViewById(R.id.exo_rew);
        TextView textView2 = findViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : textView;
        this.y = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a10);
        }
        findViewById8 = findViewById8 == null ? textView2 : findViewById8;
        this.f6532u = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(cVar3);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView3 = findViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : textView;
        this.f6535w = textView3;
        if (textView3 != null) {
            textView3.setTypeface(a10);
        }
        findViewById9 = findViewById9 == null ? textView3 : findViewById9;
        this.f6530t = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(cVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f6538z = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.A = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        Resources resources = context.getResources();
        this.f6539z0 = resources;
        this.S = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.T = this.f6539z0.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.B = findViewById10;
        if (findViewById10 != null) {
            l(false, findViewById10);
        }
        com.google.android.exoplayer2.ui.l lVar = new com.google.android.exoplayer2.ui.l(this);
        this.f6537y0 = lVar;
        lVar.C = z14;
        this.B0 = new h(new String[]{this.f6539z0.getString(R.string.exo_controls_playback_speed), this.f6539z0.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{this.f6539z0.getDrawable(R.drawable.exo_styled_controls_speed), this.f6539z0.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.F0 = this.f6539z0.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.A0 = recyclerView;
        recyclerView.setAdapter(this.B0);
        this.A0.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.A0, -2, -2, true);
        this.D0 = popupWindow;
        if (c0.f11939a < 23) {
            z22 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z22 = false;
        }
        this.D0.setOnDismissListener(cVar3);
        this.E0 = true;
        this.J0 = new com.google.android.exoplayer2.ui.c(getResources());
        this.W = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.f6507a0 = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.f6508b0 = this.f6539z0.getString(R.string.exo_controls_cc_enabled_description);
        this.f6510c0 = this.f6539z0.getString(R.string.exo_controls_cc_disabled_description);
        this.H0 = new j(null);
        this.I0 = new b(null);
        this.C0 = new e(this.f6539z0.getStringArray(R.array.exo_playback_speeds), this.f6539z0.getIntArray(R.array.exo_speed_multiplied_by_100));
        this.f6511d0 = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.f6512e0 = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.K = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.L = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.M = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.Q = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.R = this.f6539z0.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f6514f0 = this.f6539z0.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f6515g0 = this.f6539z0.getString(R.string.exo_controls_fullscreen_enter_description);
        this.N = this.f6539z0.getString(R.string.exo_controls_repeat_off_description);
        this.O = this.f6539z0.getString(R.string.exo_controls_repeat_one_description);
        this.P = this.f6539z0.getString(R.string.exo_controls_repeat_all_description);
        this.U = this.f6539z0.getString(R.string.exo_controls_shuffle_on_description);
        this.V = this.f6539z0.getString(R.string.exo_controls_shuffle_off_description);
        this.f6537y0.j((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.f6537y0.j(findViewById9, z17);
        this.f6537y0.j(findViewById8, z16);
        this.f6537y0.j(findViewById6, z21);
        this.f6537y0.j(findViewById7, z20);
        this.f6537y0.j(imageView5, z19);
        this.f6537y0.j(this.K0, z18);
        this.f6537y0.j(findViewById10, z15);
        this.f6537y0.j(imageView4, this.f6529s0 != 0 ? true : z22);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                int i20 = StyledPlayerControlView.Q0;
                Objects.requireNonNull(styledPlayerControlView);
                int i21 = i15 - i13;
                int i22 = i19 - i17;
                if ((i14 - i12 != i18 - i16 || i21 != i22) && styledPlayerControlView.D0.isShowing()) {
                    styledPlayerControlView.s();
                    styledPlayerControlView.D0.update(view, (styledPlayerControlView.getWidth() - styledPlayerControlView.D0.getWidth()) - styledPlayerControlView.F0, (-styledPlayerControlView.D0.getHeight()) - styledPlayerControlView.F0, -1, -1);
                }
            }
        });
    }

    public static void a(StyledPlayerControlView styledPlayerControlView, View view) {
        if (styledPlayerControlView.f6520k0 == null) {
            return;
        }
        boolean z10 = !styledPlayerControlView.f6521l0;
        styledPlayerControlView.f6521l0 = z10;
        styledPlayerControlView.m(styledPlayerControlView.L0, z10);
        styledPlayerControlView.m(styledPlayerControlView.M0, styledPlayerControlView.f6521l0);
        d dVar = styledPlayerControlView.f6520k0;
        if (dVar != null) {
            dVar.a(styledPlayerControlView.f6521l0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        n0 n0Var = this.f6516h0;
        if (n0Var == null) {
            return;
        }
        w6.h hVar = this.f6517i0;
        m0 m0Var = new m0(f10, n0Var.e().f16679b);
        Objects.requireNonNull((w6.i) hVar);
        n0Var.b(m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.c(android.view.KeyEvent):boolean");
    }

    public final void d(n0 n0Var) {
        int g10 = n0Var.g();
        if (g10 == 1) {
            Objects.requireNonNull((w6.i) this.f6517i0);
            n0Var.f();
        } else if (g10 == 4) {
            int z10 = n0Var.z();
            Objects.requireNonNull((w6.i) this.f6517i0);
            n0Var.d(z10, -9223372036854775807L);
        }
        Objects.requireNonNull((w6.i) this.f6517i0);
        n0Var.C(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!c(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(n0 n0Var) {
        int g10 = n0Var.g();
        if (g10 != 1 && g10 != 4 && n0Var.k()) {
            Objects.requireNonNull((w6.i) this.f6517i0);
            n0Var.C(false);
            return;
        }
        d(n0Var);
    }

    public final void f(RecyclerView.Adapter<?> adapter) {
        this.A0.setAdapter(adapter);
        s();
        this.E0 = false;
        this.D0.dismiss();
        this.E0 = true;
        this.D0.showAsDropDown(this, (getWidth() - this.D0.getWidth()) - this.F0, (-this.D0.getHeight()) - this.F0);
    }

    public final void g(h.a aVar, int i10, List<k> list) {
        w7.o oVar = aVar.f10634c[i10];
        n0 n0Var = this.f6516h0;
        Objects.requireNonNull(n0Var);
        i8.i iVar = n0Var.T().f10637b[i10];
        for (int i11 = 0; i11 < oVar.f16944c; i11++) {
            w7.n nVar = oVar.f16945f[i11];
            for (int i12 = 0; i12 < nVar.f16940c; i12++) {
                y yVar = nVar.f16941f[i12];
                if ((aVar.f10635e[i10][i11][i12] & 7) == 4) {
                    list.add(new k(i10, i11, i12, this.J0.a(yVar), (iVar == null || iVar.d(yVar) == -1) ? false : true));
                }
            }
        }
    }

    public n0 getPlayer() {
        return this.f6516h0;
    }

    public int getRepeatToggleModes() {
        return this.f6529s0;
    }

    public boolean getShowShuffleButton() {
        return this.f6537y0.d(this.A);
    }

    public boolean getShowSubtitleButton() {
        return this.f6537y0.d(this.K0);
    }

    public int getShowTimeoutMs() {
        return this.f6527q0;
    }

    public boolean getShowVrButton() {
        return this.f6537y0.d(this.B);
    }

    public void h() {
        com.google.android.exoplayer2.ui.l lVar = this.f6537y0;
        int i10 = lVar.f6646z;
        if (i10 != 3) {
            if (i10 == 2) {
                return;
            }
            lVar.h();
            if (!lVar.C) {
                lVar.k(2);
            } else if (lVar.f6646z == 1) {
                lVar.f6635m.start();
            } else {
                lVar.n.start();
            }
        }
    }

    public boolean i() {
        com.google.android.exoplayer2.ui.l lVar = this.f6537y0;
        return lVar.f6646z == 0 && lVar.f6624a.j();
    }

    public boolean j() {
        return getVisibility() == 0;
    }

    public void k() {
        o();
        n();
        r();
        t();
        v();
        p();
        u();
    }

    public final void l(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.S : this.T);
    }

    public final void m(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f6511d0);
            imageView.setContentDescription(this.f6514f0);
            return;
        }
        imageView.setImageDrawable(this.f6512e0);
        imageView.setContentDescription(this.f6515g0);
    }

    public final void n() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        n0 n0Var;
        long j11;
        n0 n0Var2;
        if (j() && this.f6523m0) {
            n0 n0Var3 = this.f6516h0;
            if (n0Var3 != null) {
                z11 = n0Var3.H(4);
                z12 = n0Var3.H(6);
                if (n0Var3.H(10)) {
                    Objects.requireNonNull(this.f6517i0);
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (n0Var3.H(11)) {
                    Objects.requireNonNull(this.f6517i0);
                    z14 = true;
                } else {
                    z14 = false;
                }
                z10 = n0Var3.H(8);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (z13) {
                w6.h hVar = this.f6517i0;
                if (!(hVar instanceof w6.i) || (n0Var2 = this.f6516h0) == null) {
                    j11 = 5000;
                } else {
                    Objects.requireNonNull((w6.i) hVar);
                    j11 = n0Var2.W();
                }
                int i10 = (int) (j11 / 1000);
                TextView textView = this.y;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                }
                View view = this.f6532u;
                if (view != null) {
                    view.setContentDescription(this.f6539z0.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            if (z14) {
                w6.h hVar2 = this.f6517i0;
                if (!(hVar2 instanceof w6.i) || (n0Var = this.f6516h0) == null) {
                    j10 = 15000;
                } else {
                    Objects.requireNonNull((w6.i) hVar2);
                    j10 = n0Var.D();
                }
                int i11 = (int) (j10 / 1000);
                TextView textView2 = this.f6535w;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i11));
                }
                View view2 = this.f6530t;
                if (view2 != null) {
                    view2.setContentDescription(this.f6539z0.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i11, Integer.valueOf(i11)));
                }
            }
            l(z12, this.f6518j);
            l(z13, this.f6532u);
            l(z14, this.f6530t);
            l(z10, this.f6522m);
            o oVar = this.E;
            if (oVar != null) {
                oVar.setEnabled(z11);
            }
        }
    }

    public final void o() {
        if (j() && this.f6523m0 && this.n != null) {
            n0 n0Var = this.f6516h0;
            boolean z10 = true;
            if (n0Var == null || n0Var.g() == 4 || this.f6516h0.g() == 1 || !this.f6516h0.k()) {
                z10 = false;
            }
            if (z10) {
                ((ImageView) this.n).setImageDrawable(this.f6539z0.getDrawable(R.drawable.exo_styled_controls_pause));
                this.n.setContentDescription(this.f6539z0.getString(R.string.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.n).setImageDrawable(this.f6539z0.getDrawable(R.drawable.exo_styled_controls_play));
            this.n.setContentDescription(this.f6539z0.getString(R.string.exo_controls_play_description));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.exoplayer2.ui.l lVar = this.f6537y0;
        lVar.f6624a.addOnLayoutChangeListener(lVar.f6645x);
        this.f6523m0 = true;
        if (i()) {
            this.f6537y0.i();
        }
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.exoplayer2.ui.l lVar = this.f6537y0;
        lVar.f6624a.removeOnLayoutChangeListener(lVar.f6645x);
        this.f6523m0 = false;
        removeCallbacks(this.J);
        this.f6537y0.h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f6537y0.f6625b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void p() {
        n0 n0Var = this.f6516h0;
        if (n0Var == null) {
            return;
        }
        e eVar = this.C0;
        float f10 = n0Var.e().f16678a;
        Objects.requireNonNull(eVar);
        int round = Math.round(f10 * 100.0f);
        int i10 = IntCompanionObject.MAX_VALUE;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = eVar.f6542e;
            if (i11 >= iArr.length) {
                eVar.f6543f = i12;
                h hVar = this.B0;
                e eVar2 = this.C0;
                hVar.f6549e[0] = eVar2.d[eVar2.f6543f];
                return;
            }
            int abs = Math.abs(round - iArr[i11]);
            if (abs < i10) {
                i12 = i11;
                i10 = abs;
            }
            i11++;
        }
    }

    public final void q() {
        long j10;
        float f10;
        if (j() && this.f6523m0) {
            n0 n0Var = this.f6516h0;
            long j11 = 0;
            if (n0Var != null) {
                j11 = this.f6536x0 + n0Var.E();
                j10 = this.f6536x0 + n0Var.P();
            } else {
                j10 = 0;
            }
            TextView textView = this.D;
            if (textView != null && !this.f6526p0) {
                textView.setText(c0.t(this.F, this.G, j11));
            }
            o oVar = this.E;
            if (oVar != null) {
                oVar.setPosition(j11);
                this.E.setBufferedPosition(j10);
            }
            f fVar = this.f6519j0;
            if (fVar != null) {
                fVar.a(j11, j10);
            }
            removeCallbacks(this.J);
            int g10 = n0Var == null ? 1 : n0Var.g();
            if (n0Var == null || !n0Var.isPlaying()) {
                if (g10 == 4 || g10 == 1) {
                    return;
                }
                postDelayed(this.J, 1000L);
                return;
            }
            o oVar2 = this.E;
            long min = Math.min(oVar2 != null ? oVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
            postDelayed(this.J, c0.i(n0Var.e().f16678a > 0.0f ? ((float) min) / f10 : 1000L, this.f6528r0, 1000L));
        }
    }

    public final void r() {
        if (j() && this.f6523m0) {
            ImageView imageView = this.f6538z;
            if (imageView == null) {
                return;
            }
            if (this.f6529s0 == 0) {
                l(false, imageView);
                return;
            }
            n0 n0Var = this.f6516h0;
            if (n0Var == null) {
                l(false, imageView);
                this.f6538z.setImageDrawable(this.K);
                this.f6538z.setContentDescription(this.N);
                return;
            }
            l(true, imageView);
            int s10 = n0Var.s();
            if (s10 != 0) {
                if (s10 == 1) {
                    this.f6538z.setImageDrawable(this.L);
                    this.f6538z.setContentDescription(this.O);
                    return;
                } else if (s10 != 2) {
                    return;
                } else {
                    this.f6538z.setImageDrawable(this.M);
                    this.f6538z.setContentDescription(this.P);
                    return;
                }
            }
            this.f6538z.setImageDrawable(this.K);
            this.f6538z.setContentDescription(this.N);
        }
    }

    public final void s() {
        this.A0.measure(0, 0);
        this.D0.setWidth(Math.min(this.A0.getMeasuredWidth(), getWidth() - (this.F0 * 2)));
        this.D0.setHeight(Math.min(getHeight() - (this.F0 * 2), this.A0.getMeasuredHeight()));
    }

    public void setAnimationEnabled(boolean z10) {
        this.f6537y0.C = z10;
    }

    @Deprecated
    public void setControlDispatcher(w6.h hVar) {
        if (this.f6517i0 != hVar) {
            this.f6517i0 = hVar;
            n();
        }
    }

    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f6520k0 = dVar;
        ImageView imageView = this.L0;
        boolean z10 = dVar != null;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        ImageView imageView2 = this.M0;
        boolean z11 = dVar != null;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(n0 n0Var) {
        boolean z10 = true;
        k8.a.f(Looper.myLooper() == Looper.getMainLooper());
        if (n0Var != null && n0Var.N() != Looper.getMainLooper()) {
            z10 = false;
        }
        k8.a.c(z10);
        n0 n0Var2 = this.f6516h0;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.J(this.f6509c);
        }
        this.f6516h0 = n0Var;
        if (n0Var != null) {
            n0Var.j(this.f6509c);
        }
        if (n0Var instanceof w6.n) {
            i8.l m10 = ((w6.n) n0Var).m();
            if (m10 instanceof i8.e) {
                this.G0 = (i8.e) m10;
            }
        } else {
            this.G0 = null;
        }
        k();
    }

    public void setProgressUpdateListener(f fVar) {
        this.f6519j0 = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRepeatToggleModes(int r8) {
        /*
            r7 = this;
            r7.f6529s0 = r8
            r6 = 6
            w6.n0 r0 = r7.f6516h0
            r6 = 6
            r5 = 0
            r1 = r5
            r5 = 1
            r2 = r5
            if (r0 == 0) goto L4f
            r6 = 2
            int r5 = r0.s()
            r0 = r5
            if (r8 != 0) goto L26
            if (r0 == 0) goto L26
            r6 = 2
            w6.h r0 = r7.f6517i0
            r6 = 6
            w6.n0 r3 = r7.f6516h0
            w6.i r0 = (w6.i) r0
            java.util.Objects.requireNonNull(r0)
            r3.q(r1)
            r6 = 7
            goto L50
        L26:
            r5 = 2
            r3 = r5
            if (r8 != r2) goto L3b
            if (r0 != r3) goto L3b
            w6.h r0 = r7.f6517i0
            w6.n0 r3 = r7.f6516h0
            r6 = 6
            w6.i r0 = (w6.i) r0
            r6 = 1
            java.util.Objects.requireNonNull(r0)
            r3.q(r2)
            goto L50
        L3b:
            if (r8 != r3) goto L4f
            if (r0 != r2) goto L4f
            r6 = 5
            w6.h r0 = r7.f6517i0
            r6 = 5
            w6.n0 r4 = r7.f6516h0
            r6 = 2
            w6.i r0 = (w6.i) r0
            r6 = 6
            java.util.Objects.requireNonNull(r0)
            r4.q(r3)
        L4f:
            r6 = 7
        L50:
            com.google.android.exoplayer2.ui.l r0 = r7.f6537y0
            r6 = 2
            android.widget.ImageView r3 = r7.f6538z
            r6 = 2
            if (r8 == 0) goto L59
            r1 = 1
        L59:
            r6 = 7
            r0.j(r3, r1)
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.setRepeatToggleModes(int):void");
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f6537y0.j(this.f6530t, z10);
        n();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f6524n0 = z10;
        u();
    }

    public void setShowNextButton(boolean z10) {
        this.f6537y0.j(this.f6522m, z10);
        n();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f6537y0.j(this.f6518j, z10);
        n();
    }

    public void setShowRewindButton(boolean z10) {
        this.f6537y0.j(this.f6532u, z10);
        n();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f6537y0.j(this.A, z10);
        t();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f6537y0.j(this.K0, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f6527q0 = i10;
        if (i()) {
            this.f6537y0.i();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f6537y0.j(this.B, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f6528r0 = c0.h(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.B;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            l(onClickListener != null, this.B);
        }
    }

    public final void t() {
        if (j() && this.f6523m0) {
            ImageView imageView = this.A;
            if (imageView == null) {
                return;
            }
            n0 n0Var = this.f6516h0;
            if (!this.f6537y0.d(imageView)) {
                l(false, this.A);
            } else if (n0Var == null) {
                l(false, this.A);
                this.A.setImageDrawable(this.R);
                this.A.setContentDescription(this.V);
            } else {
                l(true, this.A);
                this.A.setImageDrawable(n0Var.O() ? this.Q : this.R);
                this.A.setContentDescription(n0Var.O() ? this.U : this.V);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.u():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            r14 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView$l r0 = r14.H0
            java.util.Objects.requireNonNull(r0)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.f6559e = r1
            r11 = 3
            r1 = 0
            r13 = 4
            r0.f6560f = r1
            r13 = 3
            com.google.android.exoplayer2.ui.StyledPlayerControlView$l r0 = r14.I0
            java.util.Objects.requireNonNull(r0)
            java.util.List r2 = java.util.Collections.emptyList()
            r0.f6559e = r2
            r13 = 3
            r0.f6560f = r1
            r13 = 1
            w6.n0 r0 = r14.f6516h0
            r10 = 0
            r1 = r10
            r10 = 1
            r2 = r10
            if (r0 == 0) goto L99
            i8.e r0 = r14.G0
            r12 = 4
            if (r0 != 0) goto L2f
            r13 = 1
            goto L9a
        L2f:
            i8.h$a r0 = r0.f10631c
            if (r0 != 0) goto L34
            goto L9a
        L34:
            r13 = 5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11 = 4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13 = 1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r12 = 2
        L4d:
            int r8 = r0.f10632a
            r12 = 7
            if (r7 >= r8) goto L8c
            r13 = 1
            int[] r8 = r0.f10633b
            r13 = 4
            r8 = r8[r7]
            r10 = 3
            r9 = r10
            if (r8 != r9) goto L74
            r11 = 4
            com.google.android.exoplayer2.ui.l r8 = r14.f6537y0
            android.widget.ImageView r9 = r14.K0
            boolean r8 = r8.d(r9)
            if (r8 == 0) goto L74
            r11 = 2
            r14.g(r0, r7, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8 = r10
            r5.add(r8)
            goto L89
        L74:
            r12 = 7
            int[] r8 = r0.f10633b
            r12 = 2
            r8 = r8[r7]
            if (r8 != r2) goto L88
            r12 = 5
            r14.g(r0, r7, r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8 = r10
            r6.add(r8)
        L88:
            r11 = 7
        L89:
            int r7 = r7 + 1
            goto L4d
        L8c:
            r12 = 6
            com.google.android.exoplayer2.ui.StyledPlayerControlView$l r7 = r14.H0
            r11 = 2
            r7.m(r5, r3, r0)
            r12 = 5
            com.google.android.exoplayer2.ui.StyledPlayerControlView$l r3 = r14.I0
            r3.m(r6, r4, r0)
        L99:
            r13 = 2
        L9a:
            com.google.android.exoplayer2.ui.StyledPlayerControlView$l r0 = r14.H0
            int r0 = r0.a()
            if (r0 <= 0) goto La5
            r12 = 2
            r10 = 1
            r1 = r10
        La5:
            r13 = 4
            android.widget.ImageView r0 = r14.K0
            r14.l(r1, r0)
            r12 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.v():void");
    }
}
