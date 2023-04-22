package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.app.pornhub.R;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: c  reason: collision with root package name */
    public final Calendar f7348c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7349f;

    /* loaded from: classes.dex */
    public class a extends n0.a {
        public a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.q(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7348c = y.e();
        if (m.T0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f7349f = m.U0(getContext(), R.attr.nestedScrollable);
        n0.x.v(this, new a(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public r getAdapter2() {
        return (r) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int width;
        int a11;
        int width2;
        int width3;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        r adapter2 = getAdapter2();
        d<?> dVar = adapter2.f7405f;
        c cVar = adapter2.f7407m;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.d(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<m0.b<Long, Long>> it = dVar.w().iterator();
        while (it.hasNext()) {
            m0.b<Long, Long> next = it.next();
            Long l10 = next.f12856a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (next.f12857b != null) {
                long longValue = l10.longValue();
                long longValue2 = next.f12857b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean f10 = ua.n.f(this);
                    if (longValue < item.longValue()) {
                        width = max % adapter2.f7404c.f7400m == 0 ? 0 : !f10 ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                        a10 = max;
                    } else {
                        materialCalendarGridView.f7348c.setTimeInMillis(longValue);
                        a10 = adapter2.a(materialCalendarGridView.f7348c.get(5));
                        View b10 = materialCalendarGridView.b(a10);
                        width = (b10.getWidth() / 2) + b10.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % adapter2.f7404c.f7400m == 0 ? getWidth() : !f10 ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                        a11 = min;
                    } else {
                        materialCalendarGridView.f7348c.setTimeInMillis(longValue2);
                        a11 = adapter2.a(materialCalendarGridView.f7348c.get(5));
                        View b11 = materialCalendarGridView.b(a11);
                        width2 = (b11.getWidth() / 2) + b11.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(a10);
                    int i11 = max;
                    int i12 = min;
                    int itemId2 = (int) adapter2.getItemId(a11);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b12 = materialCalendarGridView.b(numColumns);
                        int top = b12.getTop() + cVar.f7366a.f7361a.top;
                        r rVar = adapter2;
                        int bottom = b12.getBottom() - cVar.f7366a.f7361a.bottom;
                        if (f10) {
                            int i13 = a11 > numColumns2 ? 0 : width2;
                            width3 = numColumns > a10 ? getWidth() : width;
                            i10 = i13;
                        } else {
                            i10 = numColumns > a10 ? 0 : width;
                            width3 = a11 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i10, top, width3, bottom, cVar.f7372h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = rVar;
                    }
                    materialCalendarGridView = this;
                    max = i11;
                    min = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
        } else if (i10 == 33) {
            setSelection(getAdapter2().d());
        } else if (i10 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < getAdapter2().b()) {
                if (19 == i10) {
                    setSelection(getAdapter2().b());
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f7349f) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, IntCompanionObject.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i10);
        }
    }
}
