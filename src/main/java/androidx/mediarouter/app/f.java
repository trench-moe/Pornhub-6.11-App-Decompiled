package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.app.pornhub.R;
import j1.l;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class f extends androidx.appcompat.app.b {
    public static final boolean B0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public static final int C0 = (int) TimeUnit.SECONDS.toMillis(30);
    public Button A;
    public Runnable A0;
    public Button B;
    public ImageButton C;
    public MediaRouteExpandCollapseButton D;
    public FrameLayout E;
    public LinearLayout F;
    public FrameLayout G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public boolean L;
    public LinearLayout M;
    public RelativeLayout N;
    public LinearLayout O;
    public View P;
    public OverlayListView Q;
    public m R;
    public List<l.i> S;
    public Set<l.i> T;
    public Set<l.i> U;
    public Set<l.i> V;
    public SeekBar W;
    public l X;
    public l.i Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f2488a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2489b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f2490c0;

    /* renamed from: d0  reason: collision with root package name */
    public Map<l.i, SeekBar> f2491d0;

    /* renamed from: e0  reason: collision with root package name */
    public MediaControllerCompat f2492e0;

    /* renamed from: f0  reason: collision with root package name */
    public j f2493f0;

    /* renamed from: g0  reason: collision with root package name */
    public PlaybackStateCompat f2494g0;

    /* renamed from: h0  reason: collision with root package name */
    public MediaDescriptionCompat f2495h0;

    /* renamed from: i0  reason: collision with root package name */
    public i f2496i0;

    /* renamed from: j0  reason: collision with root package name */
    public Bitmap f2497j0;

    /* renamed from: k0  reason: collision with root package name */
    public Uri f2498k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2499l0;

    /* renamed from: m  reason: collision with root package name */
    public final j1.l f2500m;

    /* renamed from: m0  reason: collision with root package name */
    public Bitmap f2501m0;
    public final k n;

    /* renamed from: n0  reason: collision with root package name */
    public int f2502n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2503o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f2504p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f2505q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2506r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2507s0;

    /* renamed from: t  reason: collision with root package name */
    public final l.i f2508t;

    /* renamed from: t0  reason: collision with root package name */
    public int f2509t0;

    /* renamed from: u  reason: collision with root package name */
    public Context f2510u;

    /* renamed from: u0  reason: collision with root package name */
    public int f2511u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2512v0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2513w;
    public Interpolator w0;

    /* renamed from: x0  reason: collision with root package name */
    public Interpolator f2514x0;
    public boolean y;

    /* renamed from: y0  reason: collision with root package name */
    public Interpolator f2515y0;

    /* renamed from: z  reason: collision with root package name */
    public int f2516z;

    /* renamed from: z0  reason: collision with root package name */
    public final AccessibilityManager f2517z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.i(true);
            fVar.Q.requestLayout();
            fVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.d(fVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c(f fVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent sessionActivity;
            MediaControllerCompat mediaControllerCompat = f.this.f2492e0;
            if (mediaControllerCompat == null || (sessionActivity = ((MediaControllerCompat.MediaControllerImplApi21) mediaControllerCompat.f383a).f385a.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                f.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            boolean z10 = !fVar.f2505q0;
            fVar.f2505q0 = z10;
            if (z10) {
                fVar.Q.setVisibility(0);
            }
            f fVar2 = f.this;
            fVar2.w0 = fVar2.f2505q0 ? fVar2.f2514x0 : fVar2.f2515y0;
            fVar2.y(true);
        }
    }

    /* renamed from: androidx.mediarouter.app.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0034f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f2522c;

        public ViewTreeObserver$OnGlobalLayoutListenerC0034f(boolean z10) {
            this.f2522c = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i10;
            HashMap hashMap;
            HashMap hashMap2;
            Bitmap bitmap;
            f.this.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            f fVar = f.this;
            if (fVar.f2506r0) {
                fVar.f2507s0 = true;
                return;
            }
            boolean z10 = this.f2522c;
            int l10 = f.l(fVar.M);
            f.t(fVar.M, -1);
            fVar.z(fVar.g());
            View decorView = fVar.getWindow().getDecorView();
            decorView.measure(View.MeasureSpec.makeMeasureSpec(fVar.getWindow().getAttributes().width, 1073741824), 0);
            f.t(fVar.M, l10);
            if (!(fVar.H.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) fVar.H.getDrawable()).getBitmap()) == null) {
                i10 = 0;
            } else {
                i10 = fVar.k(bitmap.getWidth(), bitmap.getHeight());
                fVar.H.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
            }
            int m10 = fVar.m(fVar.g());
            int size = fVar.S.size();
            int size2 = fVar.f2508t.f() ? fVar.f2508t.c().size() * fVar.f2488a0 : 0;
            if (size > 0) {
                size2 += fVar.f2490c0;
            }
            int min = Math.min(size2, fVar.f2489b0);
            if (!fVar.f2505q0) {
                min = 0;
            }
            int max = Math.max(i10, min) + m10;
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int height = rect.height() - (fVar.F.getMeasuredHeight() - fVar.G.getMeasuredHeight());
            if (i10 <= 0 || max > height) {
                if (fVar.M.getMeasuredHeight() + f.l(fVar.Q) >= fVar.G.getMeasuredHeight()) {
                    fVar.H.setVisibility(8);
                }
                max = min + m10;
                i10 = 0;
            } else {
                fVar.H.setVisibility(0);
                f.t(fVar.H, i10);
            }
            if (!fVar.g() || max > height) {
                fVar.N.setVisibility(8);
            } else {
                fVar.N.setVisibility(0);
            }
            fVar.z(fVar.N.getVisibility() == 0);
            int m11 = fVar.m(fVar.N.getVisibility() == 0);
            int max2 = Math.max(i10, min) + m11;
            if (max2 > height) {
                min -= max2 - height;
            } else {
                height = max2;
            }
            fVar.M.clearAnimation();
            fVar.Q.clearAnimation();
            fVar.G.clearAnimation();
            if (z10) {
                fVar.f(fVar.M, m11);
                fVar.f(fVar.Q, min);
                fVar.f(fVar.G, height);
            } else {
                f.t(fVar.M, m11);
                f.t(fVar.Q, min);
                f.t(fVar.G, height);
            }
            f.t(fVar.E, rect.height());
            List<l.i> c10 = fVar.f2508t.c();
            if (c10.isEmpty()) {
                fVar.S.clear();
                fVar.R.notifyDataSetChanged();
            } else if (new HashSet(fVar.S).equals(new HashSet(c10))) {
                fVar.R.notifyDataSetChanged();
            } else {
                if (z10) {
                    OverlayListView overlayListView = fVar.Q;
                    m mVar = fVar.R;
                    hashMap = new HashMap();
                    int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                    for (int i11 = 0; i11 < overlayListView.getChildCount(); i11++) {
                        l.i item = mVar.getItem(firstVisiblePosition + i11);
                        View childAt = overlayListView.getChildAt(i11);
                        hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                    }
                } else {
                    hashMap = null;
                }
                if (z10) {
                    Context context = fVar.f2510u;
                    OverlayListView overlayListView2 = fVar.Q;
                    m mVar2 = fVar.R;
                    hashMap2 = new HashMap();
                    int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                    for (int i12 = 0; i12 < overlayListView2.getChildCount(); i12++) {
                        l.i item2 = mVar2.getItem(firstVisiblePosition2 + i12);
                        View childAt2 = overlayListView2.getChildAt(i12);
                        Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                        childAt2.draw(new Canvas(createBitmap));
                        hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                    }
                } else {
                    hashMap2 = null;
                }
                List<l.i> list = fVar.S;
                HashSet hashSet = new HashSet(c10);
                hashSet.removeAll(list);
                fVar.T = hashSet;
                HashSet hashSet2 = new HashSet(fVar.S);
                hashSet2.removeAll(c10);
                fVar.U = hashSet2;
                fVar.S.addAll(0, fVar.T);
                fVar.S.removeAll(fVar.U);
                fVar.R.notifyDataSetChanged();
                if (z10 && fVar.f2505q0) {
                    if (fVar.U.size() + fVar.T.size() > 0) {
                        fVar.Q.setEnabled(false);
                        fVar.Q.requestLayout();
                        fVar.f2506r0 = true;
                        fVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.g(fVar, hashMap, hashMap2));
                        return;
                    }
                }
                fVar.T = null;
                fVar.U = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends Animation {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2524c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f2525f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ View f2526j;

        public g(f fVar, int i10, int i11, View view) {
            this.f2524c = i10;
            this.f2525f = i11;
            this.f2526j = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10 = this.f2524c;
            f.t(this.f2526j, i10 - ((int) ((i10 - this.f2525f) * f10)));
        }
    }

    /* loaded from: classes.dex */
    public final class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id2 = view.getId();
            int i10 = 1;
            if (id2 != 16908313 && id2 != 16908314) {
                if (id2 == R.id.mr_control_playback_ctrl) {
                    f fVar = f.this;
                    if (fVar.f2492e0 != null && (playbackStateCompat = fVar.f2494g0) != null) {
                        int i11 = 0;
                        if (playbackStateCompat.f433c != 3) {
                            i10 = 0;
                        }
                        if (i10 != 0 && fVar.q()) {
                            ((MediaControllerCompat.f) f.this.f2492e0.b()).f397a.pause();
                            i11 = R.string.mr_controller_pause;
                        } else if (i10 != 0 && f.this.s()) {
                            ((MediaControllerCompat.f) f.this.f2492e0.b()).f397a.stop();
                            i11 = R.string.mr_controller_stop;
                        } else if (i10 == 0 && f.this.r()) {
                            ((MediaControllerCompat.f) f.this.f2492e0.b()).f397a.play();
                            i11 = R.string.mr_controller_play;
                        }
                        AccessibilityManager accessibilityManager = f.this.f2517z0;
                        if (accessibilityManager != null && accessibilityManager.isEnabled() && i11 != 0) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                            obtain.setPackageName(f.this.f2510u.getPackageName());
                            obtain.setClassName(h.class.getName());
                            obtain.getText().add(f.this.f2510u.getString(i11));
                            f.this.f2517z0.sendAccessibilityEvent(obtain);
                            return;
                        }
                    }
                } else if (id2 == R.id.mr_close) {
                    f.this.dismiss();
                    return;
                }
            }
            if (f.this.f2508t.h()) {
                j1.l lVar = f.this.f2500m;
                if (id2 == 16908313) {
                    i10 = 2;
                }
                lVar.k(i10);
            }
            f.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class i extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f2528a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f2529b;

        /* renamed from: c  reason: collision with root package name */
        public int f2530c;
        public long d;

        public i() {
            MediaDescriptionCompat mediaDescriptionCompat = f.this.f2495h0;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.n;
            if (f.o(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.f2528a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = f.this.f2495h0;
            this.f2529b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f367t : null;
        }

        public final InputStream a(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                openInputStream = f.this.f2510u.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i10 = f.C0;
                openConnection.setConnectTimeout(i10);
                openConnection.setReadTimeout(i10);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r11) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.f.i.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            f fVar = f.this;
            fVar.f2496i0 = null;
            if (!Objects.equals(fVar.f2497j0, this.f2528a) || !Objects.equals(f.this.f2498k0, this.f2529b)) {
                f fVar2 = f.this;
                fVar2.f2497j0 = this.f2528a;
                fVar2.f2501m0 = bitmap2;
                fVar2.f2498k0 = this.f2529b;
                fVar2.f2502n0 = this.f2530c;
                fVar2.f2499l0 = true;
                f.this.v(SystemClock.uptimeMillis() - this.d > 120);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            f fVar = f.this;
            fVar.f2499l0 = false;
            fVar.f2501m0 = null;
            fVar.f2502n0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class j extends MediaControllerCompat.a {
        public j() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            f.this.f2495h0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.b();
            f.this.w();
            f.this.v(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void b(PlaybackStateCompat playbackStateCompat) {
            f fVar = f.this;
            fVar.f2494g0 = playbackStateCompat;
            fVar.v(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c() {
            f fVar = f.this;
            MediaControllerCompat mediaControllerCompat = fVar.f2492e0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.d(fVar.f2493f0);
                f.this.f2492e0 = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class k extends l.b {
        public k() {
        }

        @Override // j1.l.b
        public void e(j1.l lVar, l.i iVar) {
            f.this.v(true);
        }

        @Override // j1.l.b
        public void i(j1.l lVar, l.i iVar) {
            f.this.v(false);
        }

        @Override // j1.l.b
        public void k(j1.l lVar, l.i iVar) {
            SeekBar seekBar = f.this.f2491d0.get(iVar);
            int i10 = iVar.f11342o;
            if (f.B0) {
                a1.a.u("onRouteVolumeChanged(), route.getVolume:", i10, "MediaRouteCtrlDialog");
            }
            if (seekBar != null && f.this.Y != iVar) {
                seekBar.setProgress(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class l implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f2533a = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                if (fVar.Y != null) {
                    fVar.Y = null;
                    if (fVar.f2503o0) {
                        fVar.v(fVar.f2504p0);
                    }
                }
            }
        }

        public l() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                l.i iVar = (l.i) seekBar.getTag();
                if (f.B0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i10 + ")");
                }
                iVar.k(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            f fVar = f.this;
            if (fVar.Y != null) {
                fVar.W.removeCallbacks(this.f2533a);
            }
            f.this.Y = (l.i) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            f.this.W.postDelayed(this.f2533a, 500L);
        }
    }

    /* loaded from: classes.dex */
    public class m extends ArrayAdapter<l.i> {

        /* renamed from: c  reason: collision with root package name */
        public final float f2536c;

        public m(Context context, List<l.i> list) {
            super(context, 0, list);
            this.f2536c = p.d(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.f.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            android.content.Context r3 = androidx.mediarouter.app.p.a(r3, r0, r1)
            int r0 = androidx.mediarouter.app.p.b(r3)
            r2.<init>(r3, r0)
            r2.L = r1
            androidx.mediarouter.app.f$a r0 = new androidx.mediarouter.app.f$a
            r0.<init>()
            r2.A0 = r0
            android.content.Context r0 = r2.getContext()
            r2.f2510u = r0
            androidx.mediarouter.app.f$j r0 = new androidx.mediarouter.app.f$j
            r0.<init>()
            r2.f2493f0 = r0
            android.content.Context r0 = r2.f2510u
            j1.l r0 = j1.l.d(r0)
            r2.f2500m = r0
            androidx.mediarouter.app.f$k r1 = new androidx.mediarouter.app.f$k
            r1.<init>()
            r2.n = r1
            j1.l$i r1 = r0.g()
            r2.f2508t = r1
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.e()
            r2.u(r0)
            android.content.Context r0 = r2.f2510u
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165625(0x7f0701b9, float:1.7945472E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r2.f2490c0 = r0
            android.content.Context r0 = r2.f2510u
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.f2517z0 = r0
            r0 = 2131492872(0x7f0c0008, float:1.8609208E38)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r2.f2514x0 = r0
            r0 = 2131492871(0x7f0c0007, float:1.8609206E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r2.f2515y0 = r3
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.f.<init>(android.content.Context):void");
    }

    public static int l(View view) {
        return view.getLayoutParams().height;
    }

    public static boolean o(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public static void t(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void f(View view, int i10) {
        g gVar = new g(this, view.getLayoutParams().height, i10, view);
        gVar.setDuration(this.f2509t0);
        gVar.setInterpolator(this.w0);
        view.startAnimation(gVar);
    }

    public final boolean g() {
        if (this.f2495h0 == null && this.f2494g0 == null) {
            return false;
        }
        return true;
    }

    public void i(boolean z10) {
        Set<l.i> set;
        int firstVisiblePosition = this.Q.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
            View childAt = this.Q.getChildAt(i10);
            l.i item = this.R.getItem(firstVisiblePosition + i10);
            if (!z10 || (set = this.T) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (OverlayListView.a aVar : this.Q.f2458c) {
            aVar.f2468k = true;
            aVar.f2469l = true;
            OverlayListView.a.InterfaceC0032a interfaceC0032a = aVar.f2470m;
            if (interfaceC0032a != null) {
                androidx.mediarouter.app.c cVar = (androidx.mediarouter.app.c) interfaceC0032a;
                cVar.f2485b.V.remove(cVar.f2484a);
                cVar.f2485b.R.notifyDataSetChanged();
            }
        }
        if (!z10) {
            j(false);
        }
    }

    public void j(boolean z10) {
        this.T = null;
        this.U = null;
        this.f2506r0 = false;
        if (this.f2507s0) {
            this.f2507s0 = false;
            y(z10);
        }
        this.Q.setEnabled(true);
    }

    public int k(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.f2516z * i11) / i10) + 0.5f) : (int) (((this.f2516z * 9.0f) / 16.0f) + 0.5f);
    }

    public final int m(boolean z10) {
        if (z10 || this.O.getVisibility() == 0) {
            int paddingBottom = this.M.getPaddingBottom() + this.M.getPaddingTop() + 0;
            if (z10) {
                paddingBottom += this.N.getMeasuredHeight();
            }
            int measuredHeight = this.O.getVisibility() == 0 ? this.O.getMeasuredHeight() + paddingBottom : paddingBottom;
            return (z10 && this.O.getVisibility() == 0) ? measuredHeight + this.P.getMeasuredHeight() : measuredHeight;
        }
        return 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        this.f2500m.a(j1.k.f11274c, this.n, 2);
        u(this.f2500m.e());
    }

    @Override // androidx.appcompat.app.b, e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        h hVar = new h();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new b());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.F = linearLayout;
        linearLayout.setOnClickListener(new c(this));
        Context context = this.f2510u;
        int h10 = p.h(context, 0, R.attr.colorPrimary);
        if (e0.a.c(h10, p.h(context, 0, 16842801)) < 3.0d) {
            h10 = p.h(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(16908314);
        this.A = button;
        button.setText(R.string.mr_controller_disconnect);
        this.A.setTextColor(h10);
        this.A.setOnClickListener(hVar);
        Button button2 = (Button) findViewById(16908313);
        this.B = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.B.setTextColor(h10);
        this.B.setOnClickListener(hVar);
        this.K = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(hVar);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.G = (FrameLayout) findViewById(R.id.mr_default_control);
        d dVar = new d();
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.H = imageView;
        imageView.setOnClickListener(dVar);
        findViewById(R.id.mr_control_title_container).setOnClickListener(dVar);
        this.M = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.P = findViewById(R.id.mr_control_divider);
        this.N = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.I = (TextView) findViewById(R.id.mr_control_title);
        this.J = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.C = imageButton;
        imageButton.setOnClickListener(hVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.O = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.W = seekBar;
        seekBar.setTag(this.f2508t);
        l lVar = new l();
        this.X = lVar;
        this.W.setOnSeekBarChangeListener(lVar);
        this.Q = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.S = new ArrayList();
        m mVar = new m(this.Q.getContext(), this.S);
        this.R = mVar;
        this.Q.setAdapter((ListAdapter) mVar);
        this.V = new HashSet();
        Context context2 = this.f2510u;
        LinearLayout linearLayout3 = this.M;
        OverlayListView overlayListView = this.Q;
        boolean f10 = this.f2508t.f();
        int h11 = p.h(context2, 0, R.attr.colorPrimary);
        int h12 = p.h(context2, 0, R.attr.colorPrimaryDark);
        if (f10 && p.c(context2, 0) == -570425344) {
            h12 = h11;
            h11 = -1;
        }
        linearLayout3.setBackgroundColor(h11);
        overlayListView.setBackgroundColor(h12);
        linearLayout3.setTag(Integer.valueOf(h11));
        overlayListView.setTag(Integer.valueOf(h12));
        p.m(this.f2510u, (MediaRouteVolumeSlider) this.W, this.M);
        HashMap hashMap = new HashMap();
        this.f2491d0 = hashMap;
        hashMap.put(this.f2508t, this.W);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.D = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new e());
        this.w0 = this.f2505q0 ? this.f2514x0 : this.f2515y0;
        this.f2509t0 = this.f2510u.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.f2511u0 = this.f2510u.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f2512v0 = this.f2510u.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f2513w = true;
        x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2500m.i(this.n);
        u(null);
        this.y = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f2508t.l(i10 == 25 ? -1 : 1);
        return true;
    }

    @Override // androidx.appcompat.app.b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    public boolean q() {
        return (this.f2494g0.n & 514) != 0;
    }

    public boolean r() {
        return (this.f2494g0.n & 516) != 0;
    }

    public boolean s() {
        return (this.f2494g0.n & 1) != 0;
    }

    public final void u(MediaSessionCompat.Token token) {
        PlaybackStateCompat a10;
        MediaControllerCompat mediaControllerCompat = this.f2492e0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.d(this.f2493f0);
            this.f2492e0 = null;
        }
        if (token != null && this.y) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f2510u, token);
            this.f2492e0 = mediaControllerCompat2;
            mediaControllerCompat2.c(this.f2493f0);
            MediaMetadataCompat a11 = this.f2492e0.a();
            this.f2495h0 = a11 == null ? null : a11.b();
            MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21) this.f2492e0.f383a;
            if (mediaControllerImplApi21.f388e.a() != null) {
                try {
                    a10 = mediaControllerImplApi21.f388e.a().g();
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
                }
                this.f2494g0 = a10;
                w();
                v(false);
            }
            PlaybackState playbackState = mediaControllerImplApi21.f385a.getPlaybackState();
            a10 = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
            this.f2494g0 = a10;
            w();
            v(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(boolean r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.f.v(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w() {
        /*
            r8 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r8.f2495h0
            r7 = 7
            r1 = 0
            r7 = 7
            if (r0 != 0) goto L9
            r2 = r1
            goto Ld
        L9:
            r7 = 4
            android.graphics.Bitmap r2 = r0.n
            r7 = 6
        Ld:
            if (r0 != 0) goto L10
            goto L13
        L10:
            r7 = 2
            android.net.Uri r1 = r0.f367t
        L13:
            androidx.mediarouter.app.f$i r0 = r8.f2496i0
            if (r0 != 0) goto L1b
            android.graphics.Bitmap r3 = r8.f2497j0
            r7 = 3
            goto L1e
        L1b:
            android.graphics.Bitmap r3 = r0.f2528a
            r7 = 5
        L1e:
            if (r0 != 0) goto L23
            android.net.Uri r0 = r8.f2498k0
            goto L26
        L23:
            android.net.Uri r0 = r0.f2529b
            r7 = 6
        L26:
            r4 = 1
            r6 = 0
            r5 = r6
            if (r3 == r2) goto L2c
            goto L47
        L2c:
            if (r3 != 0) goto L4a
            if (r0 == 0) goto L3a
            r7 = 7
            boolean r6 = r0.equals(r1)
            r2 = r6
            if (r2 == 0) goto L3a
            r7 = 7
            goto L40
        L3a:
            if (r0 != 0) goto L43
            r7 = 4
            if (r1 != 0) goto L43
            r7 = 5
        L40:
            r6 = 1
            r0 = r6
            goto L45
        L43:
            r6 = 0
            r0 = r6
        L45:
            if (r0 != 0) goto L4a
        L47:
            r0 = 1
            r7 = 7
            goto L4d
        L4a:
            r7 = 3
            r0 = 0
            r7 = 1
        L4d:
            if (r0 != 0) goto L50
            goto L66
        L50:
            r7 = 3
            androidx.mediarouter.app.f$i r0 = r8.f2496i0
            if (r0 == 0) goto L58
            r0.cancel(r4)
        L58:
            androidx.mediarouter.app.f$i r0 = new androidx.mediarouter.app.f$i
            r7 = 6
            r0.<init>()
            r7 = 1
            r8.f2496i0 = r0
            java.lang.Void[] r1 = new java.lang.Void[r5]
            r0.execute(r1)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.f.w():void");
    }

    public void x() {
        int a10 = androidx.mediarouter.app.k.a(this.f2510u);
        getWindow().setLayout(a10, -2);
        View decorView = getWindow().getDecorView();
        this.f2516z = (a10 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f2510u.getResources();
        this.Z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f2488a0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f2489b0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f2497j0 = null;
        this.f2498k0 = null;
        w();
        v(false);
    }

    public void y(boolean z10) {
        this.G.requestLayout();
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0034f(z10));
    }

    public final void z(boolean z10) {
        int i10 = 0;
        this.P.setVisibility((this.O.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.M;
        if (this.O.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
