package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.t0;
import androidx.fragment.app.y;
import com.app.pornhub.R;
import j1.c0;
import j1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    public static a G;
    public static final SparseArray<Drawable.ConstantState> H = new SparseArray<>(2);
    public static final int[] I = {16842912};
    public static final int[] J = {16842911};
    public int A;
    public ColorStateList B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;

    /* renamed from: c  reason: collision with root package name */
    public final j1.l f2434c;

    /* renamed from: f  reason: collision with root package name */
    public final b f2435f;

    /* renamed from: j  reason: collision with root package name */
    public j1.k f2436j;

    /* renamed from: m  reason: collision with root package name */
    public j f2437m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public int f2438t;

    /* renamed from: u  reason: collision with root package name */
    public c f2439u;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f2440w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f2441z;

    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2442a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2443b = true;

        /* renamed from: c  reason: collision with root package name */
        public List<MediaRouteButton> f2444c = new ArrayList();

        public a(Context context) {
            this.f2442a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.f2443b != (!intent.getBooleanExtra("noConnectivity", false))) {
                this.f2443b = z10;
                for (MediaRouteButton mediaRouteButton : this.f2444c) {
                    mediaRouteButton.c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b extends l.b {
        public b() {
        }

        @Override // j1.l.b
        public void a(j1.l lVar, l.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void b(j1.l lVar, l.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void c(j1.l lVar, l.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void d(j1.l lVar, l.i iVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void e(j1.l lVar, l.i iVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void f(j1.l lVar, l.i iVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void g(j1.l lVar, l.i iVar) {
            MediaRouteButton.this.b();
        }

        @Override // j1.l.b
        public void i(j1.l lVar, l.i iVar) {
            MediaRouteButton.this.b();
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final int f2446a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f2447b;

        public c(int i10, Context context) {
            this.f2446a = i10;
            this.f2447b = context;
        }

        @Override // android.os.AsyncTask
        public Drawable doInBackground(Void[] voidArr) {
            if (MediaRouteButton.H.get(this.f2446a) == null) {
                return this.f2447b.getResources().getDrawable(this.f2446a);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                MediaRouteButton.H.put(this.f2446a, drawable2.getConstantState());
            }
            MediaRouteButton.this.f2439u = null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                MediaRouteButton.H.put(this.f2446a, drawable2.getConstantState());
                MediaRouteButton.this.f2439u = null;
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.H.get(this.f2446a);
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                MediaRouteButton.this.f2439u = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable2);
        }
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaRouteButton(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = androidx.mediarouter.app.p.g(r10)
            r0.<init>(r10, r1)
            r10 = 2130969389(0x7f04032d, float:1.7547459E38)
            int r10 = androidx.mediarouter.app.p.i(r0, r10)
            if (r10 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r10)
            r0 = r1
        L18:
            r9.<init>(r0, r11, r12)
            j1.k r10 = j1.k.f11274c
            r9.f2436j = r10
            androidx.mediarouter.app.j r10 = androidx.mediarouter.app.j.f2542a
            r9.f2437m = r10
            r10 = 0
            r9.f2438t = r10
            android.content.Context r7 = r9.getContext()
            int[] r2 = o9.b.y
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r11, r2, r12, r10)
            r6 = 0
            r0 = r9
            r1 = r7
            r3 = r11
            r4 = r8
            r5 = r12
            n0.x.u(r0, r1, r2, r3, r4, r5, r6)
            boolean r11 = r9.isInEditMode()
            r12 = 3
            if (r11 == 0) goto L54
            r11 = 0
            r9.f2434c = r11
            r9.f2435f = r11
            int r10 = r8.getResourceId(r12, r10)
            android.content.res.Resources r11 = r9.getResources()
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.f2440w = r10
            return
        L54:
            j1.l r11 = j1.l.d(r7)
            r9.f2434c = r11
            androidx.mediarouter.app.MediaRouteButton$b r0 = new androidx.mediarouter.app.MediaRouteButton$b
            r0.<init>()
            r9.f2435f = r0
            j1.l$i r11 = r11.g()
            boolean r0 = r11.e()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L70
            int r11 = r11.f11336h
            goto L71
        L70:
            r11 = 0
        L71:
            r9.A = r11
            r9.f2441z = r11
            androidx.mediarouter.app.MediaRouteButton$a r11 = androidx.mediarouter.app.MediaRouteButton.G
            if (r11 != 0) goto L84
            androidx.mediarouter.app.MediaRouteButton$a r11 = new androidx.mediarouter.app.MediaRouteButton$a
            android.content.Context r0 = r7.getApplicationContext()
            r11.<init>(r0)
            androidx.mediarouter.app.MediaRouteButton.G = r11
        L84:
            r11 = 4
            android.content.res.ColorStateList r11 = r8.getColorStateList(r11)
            r9.B = r11
            int r11 = r8.getDimensionPixelSize(r10, r10)
            r9.C = r11
            int r11 = r8.getDimensionPixelSize(r1, r10)
            r9.D = r11
            int r11 = r8.getResourceId(r12, r10)
            r12 = 2
            int r12 = r8.getResourceId(r12, r10)
            r9.y = r12
            r8.recycle()
            int r12 = r9.y
            if (r12 == 0) goto Lba
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = androidx.mediarouter.app.MediaRouteButton.H
            java.lang.Object r12 = r0.get(r12)
            android.graphics.drawable.Drawable$ConstantState r12 = (android.graphics.drawable.Drawable.ConstantState) r12
            if (r12 == 0) goto Lba
            android.graphics.drawable.Drawable r12 = r12.newDrawable()
            r9.setRemoteIndicatorDrawable(r12)
        Lba:
            android.graphics.drawable.Drawable r12 = r9.f2440w
            if (r12 != 0) goto Le8
            if (r11 == 0) goto Le5
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r12 = androidx.mediarouter.app.MediaRouteButton.H
            java.lang.Object r12 = r12.get(r11)
            android.graphics.drawable.Drawable$ConstantState r12 = (android.graphics.drawable.Drawable.ConstantState) r12
            if (r12 == 0) goto Ld2
            android.graphics.drawable.Drawable r10 = r12.newDrawable()
            r9.setRemoteIndicatorDrawableInternal(r10)
            goto Le8
        Ld2:
            androidx.mediarouter.app.MediaRouteButton$c r12 = new androidx.mediarouter.app.MediaRouteButton$c
            android.content.Context r0 = r9.getContext()
            r12.<init>(r11, r0)
            r9.f2439u = r12
            java.util.concurrent.Executor r11 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r10 = new java.lang.Void[r10]
            r12.executeOnExecutor(r11, r10)
            goto Le8
        Le5:
            r9.a()
        Le8:
            r9.f()
            r9.setClickable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private y getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.o) {
            return ((androidx.fragment.app.o) activity).u();
        }
        return null;
    }

    public final void a() {
        if (this.y > 0) {
            c cVar = this.f2439u;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.y, getContext());
            this.f2439u = cVar2;
            this.y = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public void b() {
        l.i g10 = this.f2434c.g();
        boolean z10 = true;
        boolean z11 = !g10.e();
        int i10 = z11 ? g10.f11336h : 0;
        if (this.A != i10) {
            this.A = i10;
            f();
            refreshDrawableState();
        }
        if (i10 == 1) {
            a();
        }
        if (this.n) {
            if (!this.E && !z11) {
                if (this.f2434c.h(this.f2436j, 1)) {
                    setEnabled(z10);
                } else {
                    z10 = false;
                }
            }
            setEnabled(z10);
        }
    }

    public void c() {
        int i10 = this.f2438t;
        if (i10 == 0 && !this.E && !G.f2443b) {
            i10 = 4;
        }
        super.setVisibility(i10);
        Drawable drawable = this.f2440w;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean d() {
        boolean z10 = false;
        if (this.n) {
            Objects.requireNonNull(this.f2434c);
            j1.l.b();
            l.e eVar = j1.l.d;
            c0 c0Var = eVar.n;
            if (c0Var != null) {
                if (c0Var.f11139b && eVar.f11284b) {
                    Context context = getContext();
                    Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f2434c.e());
                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo == null) {
                                break;
                            }
                            ApplicationInfo applicationInfo = activityInfo.applicationInfo;
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 129) != 0) {
                                    context.startActivity(putExtra);
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (z10) {
                        return true;
                    }
                }
                return e(c0Var.f11138a);
            }
            return e(1);
        }
        return false;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2440w != null) {
            this.f2440w.setState(getDrawableState());
            if (this.f2440w.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f2440w.getCurrent();
                int i10 = this.A;
                if (i10 != 1 && this.f2441z == i10) {
                    if (i10 == 2 && !animationDrawable.isRunning()) {
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                }
                if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            }
            invalidate();
        }
        this.f2441z = this.A;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean e(int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.e(int):boolean");
    }

    public final void f() {
        int i10 = this.A;
        String string = getContext().getString(i10 != 1 ? i10 != 2 ? R.string.mr_cast_button_disconnected : R.string.mr_cast_button_connected : R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.F || TextUtils.isEmpty(string)) {
            string = null;
        }
        t0.a(this, string);
    }

    public j getDialogFactory() {
        return this.f2437m;
    }

    public j1.k getRouteSelector() {
        return this.f2436j;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2440w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.n = true;
        if (!this.f2436j.c()) {
            this.f2434c.a(this.f2436j, this.f2435f, 0);
        }
        b();
        a aVar = G;
        if (aVar.f2444c.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            aVar.f2442a.registerReceiver(aVar, intentFilter);
        }
        aVar.f2444c.add(this);
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f2434c == null) {
            return onCreateDrawableState;
        }
        j1.l.b();
        c0 c0Var = j1.l.d.n;
        boolean z10 = false;
        if (c0Var != null) {
            z10 = c0Var.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
        }
        if (z10) {
            return onCreateDrawableState;
        }
        int i11 = this.A;
        if (i11 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        } else if (i11 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.n = false;
            if (!this.f2436j.c()) {
                this.f2434c.i(this.f2435f);
            }
            a aVar = G;
            aVar.f2444c.remove(this);
            if (aVar.f2444c.size() == 0) {
                aVar.f2442a.unregisterReceiver(aVar);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2440w != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f2440w.getIntrinsicWidth();
            int intrinsicHeight = this.f2440w.getIntrinsicHeight();
            int i10 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i11 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.f2440w.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f2440w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r6 = r10
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            int r9 = android.view.View.MeasureSpec.getSize(r12)
            r1 = r9
            int r9 = android.view.View.MeasureSpec.getMode(r11)
            r11 = r9
            int r9 = android.view.View.MeasureSpec.getMode(r12)
            r12 = r9
            int r2 = r6.C
            r9 = 2
            android.graphics.drawable.Drawable r3 = r6.f2440w
            r8 = 3
            r8 = 0
            r4 = r8
            if (r3 == 0) goto L2e
            int r3 = r3.getIntrinsicWidth()
            int r9 = r6.getPaddingLeft()
            r5 = r9
            int r5 = r5 + r3
            int r3 = r6.getPaddingRight()
            int r3 = r3 + r5
            goto L2f
        L2e:
            r3 = 0
        L2f:
            int r9 = java.lang.Math.max(r2, r3)
            r2 = r9
            int r3 = r6.D
            r9 = 4
            android.graphics.drawable.Drawable r5 = r6.f2440w
            r8 = 3
            if (r5 == 0) goto L4b
            int r4 = r5.getIntrinsicHeight()
            int r5 = r6.getPaddingTop()
            int r5 = r5 + r4
            r9 = 1
            int r4 = r6.getPaddingBottom()
            int r4 = r4 + r5
        L4b:
            int r3 = java.lang.Math.max(r3, r4)
            r9 = 1073741824(0x40000000, float:2.0)
            r4 = r9
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r5) goto L5b
            if (r11 == r4) goto L5f
            r9 = 7
            r0 = r2
            goto L60
        L5b:
            int r0 = java.lang.Math.min(r0, r2)
        L5f:
            r8 = 6
        L60:
            if (r12 == r5) goto L67
            if (r12 == r4) goto L6b
            r9 = 6
            r1 = r3
            goto L6c
        L67:
            int r1 = java.lang.Math.min(r1, r3)
        L6b:
            r9 = 3
        L6c:
            r6.setMeasuredDimension(r0, r1)
            r8 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        return d() || performClick;
    }

    public void setAlwaysVisible(boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.F) {
            this.F = z10;
            f();
        }
    }

    public void setDialogFactory(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f2437m = jVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.y = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        c cVar = this.f2439u;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.f2440w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2440w);
        }
        if (drawable != null) {
            if (this.B != null) {
                drawable = f0.a.h(drawable.mutate());
                drawable.setTintList(this.B);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f2440w = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(j1.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f2436j.equals(kVar)) {
            return;
        }
        if (this.n) {
            if (!this.f2436j.c()) {
                this.f2434c.i(this.f2435f);
            }
            if (!kVar.c()) {
                this.f2434c.a(kVar, this.f2435f, 0);
            }
        }
        this.f2436j = kVar;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        this.f2438t = i10;
        c();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2440w) {
            return false;
        }
        return true;
    }
}
