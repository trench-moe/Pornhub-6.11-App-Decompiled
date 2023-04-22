package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import j1.h;
import j1.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class n extends e.m {

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f2568f0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public Context A;
    public boolean B;
    public boolean C;
    public long D;
    public final Handler E;
    public RecyclerView F;
    public h G;
    public j H;
    public Map<String, f> I;
    public l.i J;
    public Map<String, Integer> K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ImageButton O;
    public Button P;
    public ImageView Q;
    public View R;
    public ImageView S;
    public TextView T;
    public TextView U;
    public String V;
    public MediaControllerCompat W;
    public e X;
    public MediaDescriptionCompat Y;
    public d Z;

    /* renamed from: a0  reason: collision with root package name */
    public Bitmap f2569a0;

    /* renamed from: b0  reason: collision with root package name */
    public Uri f2570b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2571c0;

    /* renamed from: d0  reason: collision with root package name */
    public Bitmap f2572d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2573e0;

    /* renamed from: j  reason: collision with root package name */
    public final j1.l f2574j;

    /* renamed from: m  reason: collision with root package name */
    public final g f2575m;
    public j1.k n;

    /* renamed from: t  reason: collision with root package name */
    public l.i f2576t;

    /* renamed from: u  reason: collision with root package name */
    public final List<l.i> f2577u;

    /* renamed from: w  reason: collision with root package name */
    public final List<l.i> f2578w;
    public final List<l.i> y;

    /* renamed from: z  reason: collision with root package name */
    public final List<l.i> f2579z;

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                n.this.q();
            } else if (i10 != 2) {
            } else {
                n nVar = n.this;
                if (nVar.J != null) {
                    nVar.J = null;
                    nVar.r();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (n.this.f2576t.h()) {
                n.this.f2574j.k(2);
            }
            n.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class d extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f2583a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f2584b;

        /* renamed from: c  reason: collision with root package name */
        public int f2585c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = n.this.Y;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.n;
            if (n.d(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.f2583a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = n.this.Y;
            this.f2584b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f367t : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.InputStream a(android.net.Uri r7) {
            /*
                r6 = this;
                r2 = r6
                java.lang.String r0 = r7.getScheme()
                java.lang.String r4 = r0.toLowerCase()
                r0 = r4
                java.lang.String r1 = "android.resource"
                java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L45
                java.lang.String r4 = "content"
                r1 = r4
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L45
                r5 = 4
                java.lang.String r5 = "file"
                r1 = r5
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L28
                goto L46
            L28:
                java.net.URL r0 = new java.net.URL
                r5 = 3
                java.lang.String r7 = r7.toString()
                r0.<init>(r7)
                java.net.URLConnection r5 = r0.openConnection()
                r7 = r5
                r0 = 30000(0x7530, float:4.2039E-41)
                r7.setConnectTimeout(r0)
                r7.setReadTimeout(r0)
                java.io.InputStream r5 = r7.getInputStream()
                r7 = r5
                goto L52
            L45:
                r5 = 5
            L46:
                androidx.mediarouter.app.n r0 = androidx.mediarouter.app.n.this
                android.content.Context r0 = r0.A
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.io.InputStream r7 = r0.openInputStream(r7)
            L52:
                if (r7 != 0) goto L57
                r5 = 0
                r7 = r5
                goto L5f
            L57:
                java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
                r5 = 5
                r0.<init>(r7)
                r5 = 7
                r7 = r0
            L5f:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.d.a(android.net.Uri):java.io.InputStream");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r12) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            n nVar = n.this;
            nVar.Z = null;
            if (Objects.equals(nVar.f2569a0, this.f2583a)) {
                if (!Objects.equals(n.this.f2570b0, this.f2584b)) {
                }
            }
            n nVar2 = n.this;
            nVar2.f2569a0 = this.f2583a;
            nVar2.f2572d0 = bitmap2;
            nVar2.f2570b0 = this.f2584b;
            nVar2.f2573e0 = this.f2585c;
            nVar2.f2571c0 = true;
            nVar2.m();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            n nVar = n.this;
            nVar.f2571c0 = false;
            nVar.f2572d0 = null;
            nVar.f2573e0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class e extends MediaControllerCompat.a {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            n.this.Y = mediaMetadataCompat == null ? null : mediaMetadataCompat.b();
            n.this.f();
            n.this.m();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c() {
            n nVar = n.this;
            MediaControllerCompat mediaControllerCompat = nVar.W;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.d(nVar.X);
                n.this.W = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class f extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public l.i f2586u;

        /* renamed from: v  reason: collision with root package name */
        public final ImageButton f2587v;

        /* renamed from: w  reason: collision with root package name */
        public final MediaRouteVolumeSlider f2588w;

        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n nVar = n.this;
                if (nVar.J != null) {
                    nVar.E.removeMessages(2);
                }
                f fVar = f.this;
                n.this.J = fVar.f2586u;
                int i10 = 1;
                boolean z10 = !view.isActivated();
                if (z10) {
                    i10 = 0;
                } else {
                    f fVar2 = f.this;
                    Integer num = n.this.K.get(fVar2.f2586u.f11332c);
                    if (num != null) {
                        i10 = Math.max(1, num.intValue());
                    }
                }
                f.this.y(z10);
                f.this.f2588w.setProgress(i10);
                f.this.f2586u.k(i10);
                n.this.E.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            int b10;
            int b11;
            this.f2587v = imageButton;
            this.f2588w = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(p.f(n.this.A, R.drawable.mr_cast_mute_button));
            Context context = n.this.A;
            if (p.j(context)) {
                b10 = c0.a.b(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
                b11 = c0.a.b(context, R.color.mr_cast_progressbar_background_light);
            } else {
                b10 = c0.a.b(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
                b11 = c0.a.b(context, R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.a(b10, b11);
        }

        public void x(l.i iVar) {
            this.f2586u = iVar;
            int i10 = iVar.f11342o;
            this.f2587v.setActivated(i10 == 0);
            this.f2587v.setOnClickListener(new a());
            this.f2588w.setTag(this.f2586u);
            this.f2588w.setMax(iVar.f11343p);
            this.f2588w.setProgress(i10);
            this.f2588w.setOnSeekBarChangeListener(n.this.H);
        }

        public void y(boolean z10) {
            if (this.f2587v.isActivated() == z10) {
                return;
            }
            this.f2587v.setActivated(z10);
            if (z10) {
                n.this.K.put(this.f2586u.f11332c, Integer.valueOf(this.f2588w.getProgress()));
            } else {
                n.this.K.remove(this.f2586u.f11332c);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class g extends l.b {
        public g() {
        }

        @Override // j1.l.b
        public void d(j1.l lVar, l.i iVar) {
            n.this.q();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // j1.l.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(j1.l r3, j1.l.i r4) {
            /*
                r2 = this;
                androidx.mediarouter.app.n r3 = androidx.mediarouter.app.n.this
                j1.l$i r3 = r3.f2576t
                r1 = 6
                if (r4 != r3) goto L61
                r1 = 2
                j1.h$b r1 = r4.a()
                r3 = r1
                if (r3 == 0) goto L61
                r1 = 6
                j1.l$h r3 = r4.f11330a
                r1 = 2
                java.util.List r3 = r3.b()
                java.util.Iterator r1 = r3.iterator()
                r3 = r1
            L1c:
                r1 = 7
            L1d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L61
                r1 = 7
                java.lang.Object r1 = r3.next()
                r4 = r1
                j1.l$i r4 = (j1.l.i) r4
                androidx.mediarouter.app.n r0 = androidx.mediarouter.app.n.this
                j1.l$i r0 = r0.f2576t
                r1 = 7
                java.util.List r0 = r0.c()
                boolean r1 = r0.contains(r4)
                r0 = r1
                if (r0 == 0) goto L3d
                r1 = 2
                goto L1d
            L3d:
                androidx.mediarouter.app.n r0 = androidx.mediarouter.app.n.this
                r1 = 2
                j1.l$i r0 = r0.f2576t
                j1.l$i$a r1 = r0.b(r4)
                r0 = r1
                if (r0 == 0) goto L1c
                r1 = 4
                boolean r1 = r0.a()
                r0 = r1
                if (r0 == 0) goto L1c
                r1 = 5
                androidx.mediarouter.app.n r0 = androidx.mediarouter.app.n.this
                java.util.List<j1.l$i> r0 = r0.f2578w
                r1 = 3
                boolean r4 = r0.contains(r4)
                if (r4 != 0) goto L1c
                r1 = 2
                r1 = 1
                r3 = r1
                goto L62
            L61:
                r3 = 0
            L62:
                if (r3 == 0) goto L70
                androidx.mediarouter.app.n r3 = androidx.mediarouter.app.n.this
                r3.r()
                androidx.mediarouter.app.n r3 = androidx.mediarouter.app.n.this
                r3.o()
                r1 = 5
                goto L77
            L70:
                r1 = 2
                androidx.mediarouter.app.n r3 = androidx.mediarouter.app.n.this
                r3.q()
                r1 = 5
            L77:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.g.e(j1.l, j1.l$i):void");
        }

        @Override // j1.l.b
        public void f(j1.l lVar, l.i iVar) {
            n.this.q();
        }

        @Override // j1.l.b
        public void g(j1.l lVar, l.i iVar) {
            n nVar = n.this;
            nVar.f2576t = iVar;
            nVar.r();
            n.this.o();
        }

        @Override // j1.l.b
        public void i(j1.l lVar, l.i iVar) {
            n.this.q();
        }

        @Override // j1.l.b
        public void k(j1.l lVar, l.i iVar) {
            f fVar;
            int i10 = iVar.f11342o;
            if (n.f2568f0) {
                a1.a.u("onRouteVolumeChanged(), route.getVolume:", i10, "MediaRouteCtrlDialog");
            }
            n nVar = n.this;
            if (nVar.J != iVar && (fVar = nVar.I.get(iVar.f11332c)) != null) {
                int i11 = fVar.f2586u.f11342o;
                fVar.y(i11 == 0);
                fVar.f2588w.setProgress(i11);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h extends RecyclerView.Adapter<RecyclerView.z> {

        /* renamed from: e  reason: collision with root package name */
        public final LayoutInflater f2592e;

        /* renamed from: f  reason: collision with root package name */
        public final Drawable f2593f;

        /* renamed from: g  reason: collision with root package name */
        public final Drawable f2594g;

        /* renamed from: h  reason: collision with root package name */
        public final Drawable f2595h;

        /* renamed from: i  reason: collision with root package name */
        public final Drawable f2596i;

        /* renamed from: j  reason: collision with root package name */
        public f f2597j;

        /* renamed from: k  reason: collision with root package name */
        public final int f2598k;
        public final ArrayList<f> d = new ArrayList<>();

        /* renamed from: l  reason: collision with root package name */
        public final Interpolator f2599l = new AccelerateDecelerateInterpolator();

        /* loaded from: classes.dex */
        public class a extends Animation {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f2601c;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f2602f;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ View f2603j;

            public a(h hVar, int i10, int i11, View view) {
                this.f2601c = i10;
                this.f2602f = i11;
                this.f2603j = view;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                int i10 = this.f2601c;
                int i11 = this.f2602f;
                n.g(this.f2603j, i11 + ((int) ((i10 - i11) * f10)));
            }
        }

        /* loaded from: classes.dex */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                n nVar = n.this;
                nVar.L = false;
                nVar.r();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                n.this.L = true;
            }
        }

        /* loaded from: classes.dex */
        public class c extends RecyclerView.z {

            /* renamed from: u  reason: collision with root package name */
            public final View f2605u;

            /* renamed from: v  reason: collision with root package name */
            public final ImageView f2606v;

            /* renamed from: w  reason: collision with root package name */
            public final ProgressBar f2607w;

            /* renamed from: x  reason: collision with root package name */
            public final TextView f2608x;
            public final float y;

            /* renamed from: z  reason: collision with root package name */
            public l.i f2609z;

            public c(View view) {
                super(view);
                this.f2605u = view;
                this.f2606v = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.f2607w = progressBar;
                this.f2608x = (TextView) view.findViewById(R.id.mr_cast_group_name);
                this.y = p.d(n.this.A);
                p.l(n.this.A, progressBar);
            }
        }

        /* loaded from: classes.dex */
        public class d extends f {
            public final TextView y;

            /* renamed from: z  reason: collision with root package name */
            public final int f2610z;

            public d(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.y = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = n.this.A.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.f2610z = (int) typedValue.getDimension(displayMetrics);
            }
        }

        /* loaded from: classes.dex */
        public class e extends RecyclerView.z {

            /* renamed from: u  reason: collision with root package name */
            public final TextView f2611u;

            public e(h hVar, View view) {
                super(view);
                this.f2611u = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* loaded from: classes.dex */
        public class f {

            /* renamed from: a  reason: collision with root package name */
            public final Object f2612a;

            /* renamed from: b  reason: collision with root package name */
            public final int f2613b;

            public f(h hVar, Object obj, int i10) {
                this.f2612a = obj;
                this.f2613b = i10;
            }
        }

        /* loaded from: classes.dex */
        public class g extends f {
            public final ProgressBar A;
            public final TextView B;
            public final RelativeLayout C;
            public final CheckBox D;
            public final float E;
            public final int F;
            public final View.OnClickListener G;
            public final View y;

            /* renamed from: z  reason: collision with root package name */
            public final ImageView f2614z;

            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public a() {
                }

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                    	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                    	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                    */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View r13) {
                    /*
                        Method dump skipped, instructions count: 495
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.h.g.a.onClick(android.view.View):void");
                }
            }

            public g(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.G = new a();
                this.y = view;
                this.f2614z = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.A = progressBar;
                this.B = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.C = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.D = checkBox;
                checkBox.setButtonDrawable(p.f(n.this.A, R.drawable.mr_cast_checkbox));
                p.l(n.this.A, progressBar);
                this.E = p.d(n.this.A);
                Resources resources = n.this.A.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.F = (int) typedValue.getDimension(displayMetrics);
            }

            public void A(boolean z10, boolean z11) {
                this.D.setEnabled(false);
                this.y.setEnabled(false);
                this.D.setChecked(z10);
                if (z10) {
                    this.f2614z.setVisibility(4);
                    this.A.setVisibility(0);
                }
                if (z11) {
                    h.this.m(this.C, z10 ? this.F : 0);
                }
            }

            public boolean z(l.i iVar) {
                if (iVar.h()) {
                    return true;
                }
                l.i.a b10 = n.this.f2576t.b(iVar);
                if (b10 != null) {
                    h.b.C0162b c0162b = b10.f11350a;
                    if ((c0162b != null ? c0162b.f11232b : 1) == 3) {
                        return true;
                    }
                }
                return false;
            }
        }

        public h() {
            this.f2592e = LayoutInflater.from(n.this.A);
            this.f2593f = p.e(n.this.A, R.attr.mediaRouteDefaultIconDrawable);
            this.f2594g = p.e(n.this.A, R.attr.mediaRouteTvIconDrawable);
            this.f2595h = p.e(n.this.A, R.attr.mediaRouteSpeakerIconDrawable);
            this.f2596i = p.e(n.this.A, R.attr.mediaRouteSpeakerGroupIconDrawable);
            this.f2598k = n.this.A.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int c(int i10) {
            return (i10 == 0 ? this.f2597j : this.d.get(i10 - 1)).f2613b;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(androidx.recyclerview.widget.RecyclerView.z r12, int r13) {
            /*
                Method dump skipped, instructions count: 590
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.h.h(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.z i(ViewGroup viewGroup, int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
                            return null;
                        }
                        return new c(this.f2592e.inflate(R.layout.mr_cast_group_item, viewGroup, false));
                    }
                    return new g(this.f2592e.inflate(R.layout.mr_cast_route_item, viewGroup, false));
                }
                return new e(this, this.f2592e.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            return new d(this.f2592e.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void l(RecyclerView.z zVar) {
            n.this.I.values().remove(zVar);
        }

        public void m(View view, int i10) {
            a aVar = new a(this, i10, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.f2598k);
            aVar.setInterpolator(this.f2599l);
            view.startAnimation(aVar);
        }

        public Drawable n(l.i iVar) {
            Uri uri = iVar.f11334f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(n.this.A.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e10) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e10);
                }
            }
            int i10 = iVar.f11341m;
            return i10 != 1 ? i10 != 2 ? iVar.f() ? this.f2596i : this.f2593f : this.f2595h : this.f2594g;
        }

        public boolean o() {
            return n.this.f2576t.c().size() > 1;
        }

        public void p() {
            n.this.f2579z.clear();
            n nVar = n.this;
            List<l.i> list = nVar.f2579z;
            List<l.i> list2 = nVar.f2578w;
            ArrayList arrayList = new ArrayList();
            while (true) {
                for (l.i iVar : nVar.f2576t.f11330a.b()) {
                    l.i.a b10 = nVar.f2576t.b(iVar);
                    if (b10 != null && b10.a()) {
                        arrayList.add(iVar);
                    }
                }
                HashSet hashSet = new HashSet(list2);
                hashSet.removeAll(arrayList);
                list.addAll(hashSet);
                this.f2802a.b();
                return;
            }
        }

        public void q() {
            this.d.clear();
            n nVar = n.this;
            this.f2597j = new f(this, nVar.f2576t, 1);
            if (nVar.f2577u.isEmpty()) {
                this.d.add(new f(this, n.this.f2576t, 3));
            } else {
                for (l.i iVar : n.this.f2577u) {
                    this.d.add(new f(this, iVar, 3));
                }
            }
            boolean z10 = false;
            if (!n.this.f2578w.isEmpty()) {
                boolean z11 = false;
                loop1: while (true) {
                    for (l.i iVar2 : n.this.f2578w) {
                        if (!n.this.f2577u.contains(iVar2)) {
                            if (!z11) {
                                h.b a10 = n.this.f2576t.a();
                                String j10 = a10 != null ? a10.j() : null;
                                if (TextUtils.isEmpty(j10)) {
                                    j10 = n.this.A.getString(R.string.mr_dialog_groupable_header);
                                }
                                this.d.add(new f(this, j10, 2));
                                z11 = true;
                            }
                            this.d.add(new f(this, iVar2, 3));
                        }
                    }
                }
            }
            if (!n.this.y.isEmpty()) {
                loop3: while (true) {
                    for (l.i iVar3 : n.this.y) {
                        l.i iVar4 = n.this.f2576t;
                        if (iVar4 != iVar3) {
                            if (!z10) {
                                h.b a11 = iVar4.a();
                                String k10 = a11 != null ? a11.k() : null;
                                if (TextUtils.isEmpty(k10)) {
                                    k10 = n.this.A.getString(R.string.mr_dialog_transferable_header);
                                }
                                this.d.add(new f(this, k10, 2));
                                z10 = true;
                            }
                            this.d.add(new f(this, iVar3, 4));
                        }
                    }
                }
            }
            p();
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements Comparator<l.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f2616c = new i();

        @Override // java.util.Comparator
        public int compare(l.i iVar, l.i iVar2) {
            return iVar.d.compareToIgnoreCase(iVar2.d);
        }
    }

    /* loaded from: classes.dex */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                l.i iVar = (l.i) seekBar.getTag();
                f fVar = n.this.I.get(iVar.f11332c);
                if (fVar != null) {
                    fVar.y(i10 == 0);
                }
                iVar.k(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            n nVar = n.this;
            if (nVar.J != null) {
                nVar.E.removeMessages(2);
            }
            n.this.J = (l.i) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            n.this.E.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.p.a(r2, r0, r0)
            int r0 = androidx.mediarouter.app.p.b(r2)
            r1.<init>(r2, r0)
            j1.k r2 = j1.k.f11274c
            r1.n = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2577u = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2578w = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.y = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2579z = r2
            androidx.mediarouter.app.n$a r2 = new androidx.mediarouter.app.n$a
            r2.<init>()
            r1.E = r2
            android.content.Context r2 = r1.getContext()
            r1.A = r2
            j1.l r2 = j1.l.d(r2)
            r1.f2574j = r2
            androidx.mediarouter.app.n$g r0 = new androidx.mediarouter.app.n$g
            r0.<init>()
            r1.f2575m = r0
            j1.l$i r0 = r2.g()
            r1.f2576t = r0
            androidx.mediarouter.app.n$e r0 = new androidx.mediarouter.app.n$e
            r0.<init>()
            r1.X = r0
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.e()
            r1.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.<init>(android.content.Context):void");
    }

    public static boolean d(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public static void g(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public void e(List<l.i> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            l.i iVar = list.get(size);
            if (!(!iVar.e() && iVar.f11335g && iVar.i(this.n) && this.f2576t != iVar)) {
                list.remove(size);
            }
        }
    }

    public void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.Y;
        Uri uri = null;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.n;
        if (mediaDescriptionCompat != null) {
            uri = mediaDescriptionCompat.f367t;
        }
        d dVar = this.Z;
        Bitmap bitmap2 = dVar == null ? this.f2569a0 : dVar.f2583a;
        Uri uri2 = dVar == null ? this.f2570b0 : dVar.f2584b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            d dVar2 = this.Z;
            if (dVar2 != null) {
                dVar2.cancel(true);
            }
            d dVar3 = new d();
            this.Z = dVar3;
            dVar3.execute(new Void[0]);
        }
    }

    public final void i(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.W;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.d(this.X);
            this.W = null;
        }
        if (token != null && this.C) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.A, token);
            this.W = mediaControllerCompat2;
            mediaControllerCompat2.c(this.X);
            MediaMetadataCompat a10 = this.W.a();
            if (a10 != null) {
                mediaDescriptionCompat = a10.b();
            }
            this.Y = mediaDescriptionCompat;
            f();
            m();
        }
    }

    public void j(j1.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(kVar)) {
            return;
        }
        this.n = kVar;
        if (this.C) {
            this.f2574j.i(this.f2575m);
            this.f2574j.a(kVar, this.f2575m, 1);
            o();
        }
    }

    public final boolean k() {
        if (this.J == null && !this.L) {
            return !this.B;
        }
        return true;
    }

    public void l() {
        getWindow().setLayout(k.b(this.A), !this.A.getResources().getBoolean(R.bool.is_tablet) ? -1 : -2);
        this.f2569a0 = null;
        this.f2570b0 = null;
        f();
        m();
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.n.m():void");
    }

    public void o() {
        this.f2577u.clear();
        this.f2578w.clear();
        this.y.clear();
        this.f2577u.addAll(this.f2576t.c());
        while (true) {
            for (l.i iVar : this.f2576t.f11330a.b()) {
                l.i.a b10 = this.f2576t.b(iVar);
                if (b10 != null) {
                    if (b10.a()) {
                        this.f2578w.add(iVar);
                    }
                    h.b.C0162b c0162b = b10.f11350a;
                    if (c0162b != null && c0162b.f11234e) {
                        this.y.add(iVar);
                    }
                }
            }
            e(this.f2578w);
            e(this.y);
            List<l.i> list = this.f2577u;
            i iVar2 = i.f2616c;
            Collections.sort(list, iVar2);
            Collections.sort(this.f2578w, iVar2);
            Collections.sort(this.y, iVar2);
            this.G.q();
            return;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
        this.f2574j.a(this.n, this.f2575m, 1);
        o();
        i(this.f2574j.e());
    }

    @Override // e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        p.k(this.A, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.O = imageButton;
        imageButton.setColorFilter(-1);
        this.O.setOnClickListener(new b());
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.P = button;
        button.setTextColor(-1);
        this.P.setOnClickListener(new c());
        this.G = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.F = recyclerView;
        recyclerView.setAdapter(this.G);
        this.F.setLayoutManager(new LinearLayoutManager(this.A));
        this.H = new j();
        this.I = new HashMap();
        this.K = new HashMap();
        this.Q = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.R = findViewById(R.id.mr_cast_meta_black_scrim);
        this.S = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.T = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.U = textView2;
        textView2.setTextColor(-1);
        this.V = this.A.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.B = true;
        l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        this.f2574j.i(this.f2575m);
        this.E.removeCallbacksAndMessages(null);
        i(null);
    }

    public void q() {
        if (this.C) {
            if (SystemClock.uptimeMillis() - this.D < 300) {
                this.E.removeMessages(1);
                this.E.sendEmptyMessageAtTime(1, this.D + 300);
            } else if (k()) {
                this.M = true;
            } else {
                this.M = false;
                if (this.f2576t.h()) {
                    if (this.f2576t.e()) {
                    }
                    this.D = SystemClock.uptimeMillis();
                    this.G.p();
                }
                dismiss();
                this.D = SystemClock.uptimeMillis();
                this.G.p();
            }
        }
    }

    public void r() {
        if (this.M) {
            q();
        }
        if (this.N) {
            m();
        }
    }
}
