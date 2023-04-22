package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.app.pornhub.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] y = {16843505};

    /* renamed from: c  reason: collision with root package name */
    public final androidx.appcompat.widget.e f793c;

    /* renamed from: f  reason: collision with root package name */
    public final Context f794f;

    /* renamed from: j  reason: collision with root package name */
    public y f795j;

    /* renamed from: m  reason: collision with root package name */
    public SpinnerAdapter f796m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public f f797t;

    /* renamed from: u  reason: collision with root package name */
    public int f798u;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f799w;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.app.b f801c;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f802f;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f803j;

        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f801c;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f801c;
            if (bVar != null) {
                bVar.dismiss();
                this.f801c = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.f803j;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void i(CharSequence charSequence) {
            this.f803j = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void n(int i10, int i11) {
            if (this.f802f == null) {
                return;
            }
            b.a aVar = new b.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f803j;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f802f;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f496a;
            bVar.n = listAdapter;
            bVar.f488o = this;
            bVar.f491r = selectedItemPosition;
            bVar.f490q = true;
            androidx.appcompat.app.b create = aVar.create();
            this.f801c = create;
            ListView listView = create.f495j.f455g;
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            this.f801c.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f802f.getItemId(i10));
            }
            androidx.appcompat.app.b bVar = this.f801c;
            if (bVar != null) {
                bVar.dismiss();
                this.f801c = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void p(ListAdapter listAdapter) {
            this.f802f = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: c  reason: collision with root package name */
        public SpinnerAdapter f805c;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f806f;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f805c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f806f = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof l0) {
                    l0 l0Var = (l0) spinnerAdapter;
                    if (l0Var.getDropDownViewTheme() == null) {
                        l0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f806f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f805c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f806f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f805c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends ListPopupWindow implements f {
        public CharSequence S;
        public ListAdapter T;
        public final Rect U;
        public int V;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    AppCompatSpinner.this.performItemClick(view, i10, dVar.T.getItemId(i10));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                if (!(x.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(dVar.U))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.c();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f809c;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f809c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f809c);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.U = new Rect();
            this.E = AppCompatSpinner.this;
            s(true);
            this.F = new a(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.S;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void i(CharSequence charSequence) {
            this.S = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(int i10) {
            this.V = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            t();
            this.O.setInputMethodMode(2);
            c();
            w wVar = this.f842j;
            wVar.setChoiceMode(1);
            wVar.setTextDirection(i10);
            wVar.setTextAlignment(i11);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            w wVar2 = this.f842j;
            if (b() && wVar2 != null) {
                wVar2.setListSelectionHidden(false);
                wVar2.setSelection(selectedItemPosition);
                if (wVar2.getChoiceMode() != 0) {
                    wVar2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (b10 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.O.setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.f
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.T = listAdapter;
        }

        public void t() {
            Drawable h10 = h();
            int i10 = 0;
            if (h10 != null) {
                h10.getPadding(AppCompatSpinner.this.f799w);
                i10 = x0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f799w.right : -AppCompatSpinner.this.f799w.left;
            } else {
                Rect rect = AppCompatSpinner.this.f799w;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f798u;
            if (i11 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.T, h());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f799w;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (a10 > i13) {
                    a10 = i13;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i11);
            }
            this.f844t = x0.b(AppCompatSpinner.this) ? (((width - paddingRight) - this.n) - this.V) + i10 : paddingLeft + this.V + i10;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f811c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f811c = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f811c ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean b();

        int d();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void j(Drawable drawable);

        void k(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f799w = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.k0.a(r9, r0)
            int[] r0 = b7.k.R
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r9)
            r9.f793c = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            j.c r3 = new j.c
            r3.<init>(r10, r2)
            r9.f794f = r3
            goto L30
        L2e:
            r9.f794f = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.AppCompatSpinner.y     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Ld0
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Ld0
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L97
            if (r3 == r5) goto L62
            goto La5
        L62:
            androidx.appcompat.widget.AppCompatSpinner$d r3 = new androidx.appcompat.widget.AppCompatSpinner$d
            android.content.Context r6 = r9.f794f
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f794f
            int[] r7 = b7.k.R
            androidx.appcompat.widget.p0 r6 = androidx.appcompat.widget.p0.r(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.l(r7, r8)
            r9.f798u = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.O
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.S = r4
            android.content.res.TypedArray r4 = r6.f1055b
            r4.recycle()
            r9.f797t = r3
            androidx.appcompat.widget.o r4 = new androidx.appcompat.widget.o
            r4.<init>(r9, r9, r3)
            r9.f795j = r4
            goto La5
        L97:
            androidx.appcompat.widget.AppCompatSpinner$b r3 = new androidx.appcompat.widget.AppCompatSpinner$b
            r3.<init>()
            r9.f797t = r3
            java.lang.String r4 = r0.getString(r4)
            r3.i(r4)
        La5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131558675(0x7f0d0113, float:1.8742673E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lbc:
            r0.recycle()
            r9.n = r5
            android.widget.SpinnerAdapter r10 = r9.f796m
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.f796m = r2
        Lca:
            androidx.appcompat.widget.e r10 = r9.f793c
            r10.d(r11, r12)
            return
        Ld0:
            if (r2 == 0) goto Ld5
            r2.recycle()
        Ld5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f799w);
            Rect rect = this.f799w;
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    public void b() {
        this.f797t.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f797t;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f797t;
        return fVar != null ? fVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f797t != null ? this.f798u : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f797t;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f797t;
        return fVar != null ? fVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f794f;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f797t;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f797t;
        if (fVar != null && fVar.b()) {
            this.f797t.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f797t != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f811c && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f797t;
        eVar.f811c = fVar != null && fVar.b();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f795j;
        if (yVar == null || !yVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f797t;
        if (fVar != null) {
            if (!fVar.b()) {
                b();
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.n) {
            this.f796m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f797t != null) {
            Context context = this.f794f;
            if (context == null) {
                context = getContext();
            }
            this.f797t.p(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        f fVar = this.f797t;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        fVar.m(i10);
        this.f797t.e(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        f fVar = this.f797t;
        if (fVar != null) {
            fVar.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f797t != null) {
            this.f798u = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f797t;
        if (fVar != null) {
            fVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(f.a.a(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f797t;
        if (fVar != null) {
            fVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f793c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
