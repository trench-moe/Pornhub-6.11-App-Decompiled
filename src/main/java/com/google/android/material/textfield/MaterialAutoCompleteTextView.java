package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import ua.j;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final ListPopupWindow n;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f7744t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f7745u;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Object item;
            if (i10 < 0) {
                ListPopupWindow listPopupWindow = MaterialAutoCompleteTextView.this.n;
                item = !listPopupWindow.b() ? null : listPopupWindow.f842j.getSelectedItem();
            } else {
                item = MaterialAutoCompleteTextView.this.getAdapter().getItem(i10);
            }
            MaterialAutoCompleteTextView.a(MaterialAutoCompleteTextView.this, item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view != null && i10 >= 0) {
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.n.f842j, view, i10, j10);
                }
                ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.this.n;
                view = listPopupWindow2.b() ? listPopupWindow2.f842j.getSelectedView() : null;
                ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.n;
                i10 = !listPopupWindow3.b() ? -1 : listPopupWindow3.f842j.getSelectedItemPosition();
                ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.n;
                j10 = !listPopupWindow4.b() ? Long.MIN_VALUE : listPopupWindow4.f842j.getSelectedItemId();
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.n.f842j, view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.n.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 0), attributeSet, i10);
        this.f7745u = new Rect();
        Context context2 = getContext();
        TypedArray d = j.d(context2, attributeSet, m9.a.T, i10, 2132017963, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f7744t = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2, null, R.attr.listPopupWindowStyle);
        this.n = listPopupWindow;
        listPopupWindow.s(true);
        listPopupWindow.E = this;
        listPopupWindow.O.setInputMethodMode(2);
        listPopupWindow.p(getAdapter());
        listPopupWindow.F = new a();
        d.recycle();
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        return (b10 == null || !b10.U) ? super.getHint() : b10.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.U && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null) {
                if (b10 != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                    ListPopupWindow listPopupWindow = this.n;
                    int min = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.b() ? -1 : listPopupWindow.f842j.getSelectedItemPosition()) + 15);
                    View view = null;
                    int i13 = 0;
                    for (int max = Math.max(0, min - 15); max < min; max++) {
                        int itemViewType = adapter.getItemViewType(max);
                        if (itemViewType != i12) {
                            view = null;
                            i12 = itemViewType;
                        }
                        view = adapter.getView(max, view, b10);
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        }
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                        i13 = Math.max(i13, view.getMeasuredWidth());
                    }
                    Drawable h10 = this.n.h();
                    if (h10 != null) {
                        h10.getPadding(this.f7745u);
                        Rect rect = this.f7745u;
                        i13 += rect.left + rect.right;
                    }
                    i12 = b10.getEndIconView().getMeasuredWidth() + i13;
                }
                setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.n.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f7744t;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.n.c();
        }
    }
}
