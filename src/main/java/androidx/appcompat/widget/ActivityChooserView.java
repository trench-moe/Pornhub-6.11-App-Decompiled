package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.app.pornhub.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    public int A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final f f740c;

    /* renamed from: f  reason: collision with root package name */
    public final g f741f;

    /* renamed from: j  reason: collision with root package name */
    public final View f742j;

    /* renamed from: m  reason: collision with root package name */
    public final FrameLayout f743m;
    public final ImageView n;

    /* renamed from: t  reason: collision with root package name */
    public final FrameLayout f744t;

    /* renamed from: u  reason: collision with root package name */
    public n0.b f745u;

    /* renamed from: w  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f746w;
    public ListPopupWindow y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow.OnDismissListener f747z;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: c  reason: collision with root package name */
        public static final int[] f748c = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f748c);
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.a.a(context, resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f740c.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f740c.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().c();
                n0.b bVar = ActivityChooserView.this.f745u;
                if (bVar != null) {
                    bVar.i(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends View.AccessibilityDelegate {
        public c(ActivityChooserView activityChooserView) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* loaded from: classes.dex */
    public class d extends y {
        public d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.y
        public k.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.y
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.y
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            Objects.requireNonNull(ActivityChooserView.this.f740c);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class f extends BaseAdapter {

        /* renamed from: c  reason: collision with root package name */
        public int f753c = 4;

        /* renamed from: f  reason: collision with root package name */
        public boolean f754f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f755j;

        public f() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            if (this.f755j) {
                throw null;
            }
            if (this.f754f) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            if (this.f755j) {
                throw null;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (this.f755j) {
                throw null;
            }
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            getItem(i10);
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f744t) {
                activityChooserView.a();
                Objects.requireNonNull(ActivityChooserView.this.f740c);
                throw null;
            } else if (view != activityChooserView.f743m) {
                throw new IllegalArgumentException();
            } else {
                activityChooserView.d(activityChooserView.A);
                throw null;
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f747z;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            n0.b bVar = ActivityChooserView.this.f745u;
            if (bVar != null) {
                bVar.i(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (((f) adapterView.getAdapter()).f755j) {
                throw null;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            Objects.requireNonNull(activityChooserView);
            boolean z10 = activityChooserView.f740c.f754f;
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f744t) {
                Objects.requireNonNull(activityChooserView.f740c);
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new a();
        this.f746w = new b();
        this.A = 4;
        int[] iArr = b7.k.f3607z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        this.A = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.f741f = gVar;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.f742j = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f744t = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c(this));
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f743m = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(R.id.image);
        this.n = imageView2;
        imageView2.setImageDrawable(drawable);
        f fVar = new f();
        this.f740c = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f746w);
            }
        }
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.B) {
            return false;
        }
        d(this.A);
        throw null;
    }

    public void d(int i10) {
        Objects.requireNonNull(this.f740c);
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public androidx.appcompat.widget.d getDataModel() {
        Objects.requireNonNull(this.f740c);
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.y == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, R.attr.listPopupWindowStyle);
            this.y = listPopupWindow;
            listPopupWindow.p(this.f740c);
            ListPopupWindow listPopupWindow2 = this.y;
            listPopupWindow2.E = this;
            listPopupWindow2.s(true);
            ListPopupWindow listPopupWindow3 = this.y;
            g gVar = this.f741f;
            listPopupWindow3.F = gVar;
            listPopupWindow3.O.setOnDismissListener(gVar);
        }
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Objects.requireNonNull(this.f740c);
        this.B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.requireNonNull(this.f740c);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f746w);
        }
        if (b()) {
            a();
        }
        this.B = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f742j.layout(0, 0, i12 - i10, i13 - i11);
        if (!b()) {
            a();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View view = this.f742j;
        if (this.f744t.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(androidx.appcompat.widget.d dVar) {
        f fVar = this.f740c;
        Objects.requireNonNull(ActivityChooserView.this.f740c);
        fVar.notifyDataSetChanged();
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.n.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.n.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.A = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f747z = onDismissListener;
    }

    public void setProvider(n0.b bVar) {
        this.f745u = bVar;
    }
}
