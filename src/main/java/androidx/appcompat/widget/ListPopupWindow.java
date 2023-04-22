package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.app.pornhub.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.x;

/* loaded from: classes.dex */
public class ListPopupWindow implements k.f {
    public static Method P;
    public static Method Q;
    public static Method R;
    public boolean A;
    public int B;
    public int C;
    public DataSetObserver D;
    public View E;
    public AdapterView.OnItemClickListener F;
    public final e G;
    public final d H;
    public final c I;
    public final a J;
    public final Handler K;
    public final Rect L;
    public Rect M;
    public boolean N;
    public PopupWindow O;

    /* renamed from: c  reason: collision with root package name */
    public Context f840c;

    /* renamed from: f  reason: collision with root package name */
    public ListAdapter f841f;

    /* renamed from: j  reason: collision with root package name */
    public w f842j;

    /* renamed from: m  reason: collision with root package name */
    public int f843m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f844t;

    /* renamed from: u  reason: collision with root package name */
    public int f845u;

    /* renamed from: w  reason: collision with root package name */
    public int f846w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f847z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = ListPopupWindow.this.f842j;
            if (wVar != null) {
                wVar.setListSelectionHidden(true);
                wVar.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.b()) {
                ListPopupWindow.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                if (ListPopupWindow.this.O.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && ListPopupWindow.this.O.getContentView() != null) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.K.removeCallbacks(listPopupWindow.G);
                    ListPopupWindow.this.G.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.O) != null && popupWindow.isShowing() && x10 >= 0 && x10 < ListPopupWindow.this.O.getWidth() && y >= 0 && y < ListPopupWindow.this.O.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.K.postDelayed(listPopupWindow.G, 250L);
            } else if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.K.removeCallbacks(listPopupWindow2.G);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = ListPopupWindow.this.f842j;
            if (wVar != null) {
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                if (x.g.b(wVar) && ListPopupWindow.this.f842j.getCount() > ListPopupWindow.this.f842j.getChildCount()) {
                    int childCount = ListPopupWindow.this.f842j.getChildCount();
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    if (childCount <= listPopupWindow.C) {
                        listPopupWindow.O.setInputMethodMode(2);
                        ListPopupWindow.this.c();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f843m = -2;
        this.n = -2;
        this.f846w = 1002;
        this.B = 0;
        this.C = IntCompanionObject.MAX_VALUE;
        this.G = new e();
        this.H = new d();
        this.I = new c();
        this.J = new a();
        this.L = new Rect();
        this.f840c = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b7.k.K, i10, i11);
        this.f844t = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f845u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.y = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i10, i11);
        this.O = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    @Override // k.f
    public boolean b() {
        return this.O.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    @Override // k.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.c():void");
    }

    public int d() {
        return this.f844t;
    }

    @Override // k.f
    public void dismiss() {
        this.O.dismiss();
        this.O.setContentView(null);
        this.f842j = null;
        this.K.removeCallbacks(this.G);
    }

    public void e(int i10) {
        this.f844t = i10;
    }

    public Drawable h() {
        return this.O.getBackground();
    }

    public void j(Drawable drawable) {
        this.O.setBackgroundDrawable(drawable);
    }

    public void k(int i10) {
        this.f845u = i10;
        this.y = true;
    }

    @Override // k.f
    public ListView l() {
        return this.f842j;
    }

    public int o() {
        if (this.y) {
            return this.f845u;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.D;
        if (dataSetObserver == null) {
            this.D = new b();
        } else {
            ListAdapter listAdapter2 = this.f841f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f841f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        w wVar = this.f842j;
        if (wVar != null) {
            wVar.setAdapter(this.f841f);
        }
    }

    public w q(Context context, boolean z10) {
        return new w(context, z10);
    }

    public void r(int i10) {
        Drawable background = this.O.getBackground();
        if (background == null) {
            this.n = i10;
            return;
        }
        background.getPadding(this.L);
        Rect rect = this.L;
        this.n = rect.left + rect.right + i10;
    }

    public void s(boolean z10) {
        this.N = z10;
        this.O.setFocusable(z10);
    }
}
