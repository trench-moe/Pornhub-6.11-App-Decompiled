package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.app.pornhub.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class w extends ListView {
    public boolean A;
    public q0.f B;
    public b C;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1129c;

    /* renamed from: f  reason: collision with root package name */
    public int f1130f;

    /* renamed from: j  reason: collision with root package name */
    public int f1131j;

    /* renamed from: m  reason: collision with root package name */
    public int f1132m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f1133t;

    /* renamed from: u  reason: collision with root package name */
    public Field f1134u;

    /* renamed from: w  reason: collision with root package name */
    public a f1135w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1136z;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: f  reason: collision with root package name */
        public boolean f1137f;

        public a(Drawable drawable) {
            super(drawable);
            this.f1137f = true;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1137f) {
                this.f9688c.draw(canvas);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1137f) {
                this.f9688c.setHotspot(f10, f11);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1137f) {
                this.f9688c.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1137f) {
                return this.f9688c.setState(iArr);
            }
            return false;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1137f) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = w.this;
            wVar.C = null;
            wVar.drawableStateChanged();
        }
    }

    public w(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1129c = new Rect();
        this.f1130f = 0;
        this.f1131j = 0;
        this.f1132m = 0;
        this.n = 0;
        this.f1136z = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1134u = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f1135w;
        if (aVar != null) {
            aVar.f1137f = z10;
        }
    }

    public int a(int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i13 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < count) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i17 = layoutParams.height;
            view.measure(i10, i17 > 0 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i13 += dividerHeight;
            }
            i13 += view.getMeasuredHeight();
            if (i13 >= i11) {
                return (i12 < 0 || i14 <= i12 || i16 <= 0 || i13 == i11) ? i11 : i16;
            }
            if (i12 >= 0 && i14 >= i12) {
                i16 = i13;
            }
            i14++;
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.A && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1129c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1129c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.C != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f1136z && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f1136z && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f1136z && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (this.f1136z) {
            if (!this.y) {
            }
        }
        return super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.C == null) {
            b bVar = new b();
            this.C = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            c();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1133t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.C;
        if (bVar != null) {
            w wVar = w.this;
            wVar.C = null;
            wVar.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.y = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1135w = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1130f = rect.left;
        this.f1131j = rect.top;
        this.f1132m = rect.right;
        this.n = rect.bottom;
    }
}
