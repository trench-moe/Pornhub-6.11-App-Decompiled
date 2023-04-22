package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.util.Arrays;
import java.util.HashMap;
import t9.j0;
import x.c;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: c  reason: collision with root package name */
    public int[] f1601c;

    /* renamed from: f  reason: collision with root package name */
    public int f1602f;

    /* renamed from: j  reason: collision with root package name */
    public Context f1603j;

    /* renamed from: m  reason: collision with root package name */
    public s.a f1604m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public String f1605t;

    /* renamed from: u  reason: collision with root package name */
    public View[] f1606u;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<Integer, String> f1607w;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1601c = new int[32];
        this.f1606u = null;
        this.f1607w = new HashMap<>();
        this.f1603j = context;
        n(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1601c = new int[32];
        this.f1606u = null;
        this.f1607w = new HashMap<>();
        this.f1603j = context;
        n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1601c = new int[32];
        this.f1606u = null;
        this.f1607w = new HashMap<>();
        this.f1603j = context;
        n(attributeSet);
    }

    public final void e(String str) {
        if (str != null) {
            if (str.length() != 0 && this.f1603j != null) {
                String trim = str.trim();
                if (getParent() instanceof ConstraintLayout) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
                }
                int l10 = l(trim);
                if (l10 != 0) {
                    this.f1607w.put(Integer.valueOf(l10), trim);
                    f(l10);
                    return;
                }
                Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
            }
        }
    }

    public final void f(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1602f + 1;
        int[] iArr = this.f1601c;
        if (i11 > iArr.length) {
            this.f1601c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1601c;
        int i12 = this.f1602f;
        iArr2[i12] = i10;
        this.f1602f = i12 + 1;
    }

    public final void g(String str) {
        if (str != null && str.length() != 0 && this.f1603j != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        StringBuilder m10 = a1.a.m("to use ConstraintTag view ");
                        m10.append(childAt.getClass().getSimpleName());
                        m10.append(" must have an ID");
                        Log.w("ConstraintHelper", m10.toString());
                    } else {
                        f(childAt.getId());
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1601c, this.f1602f);
    }

    public void h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            i((ConstraintLayout) parent);
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            View i11 = constraintLayout.i(this.f1601c[i10]);
            if (i11 != null) {
                i11.setVisibility(visibility);
                if (elevation > 0.0f) {
                    i11.setTranslationZ(i11.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        if (str != null) {
            Resources resources = this.f1603j.getResources();
            if (resources == null) {
                return 0;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final int l(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object h10 = constraintLayout.h(0, str);
            if (h10 instanceof Integer) {
                i10 = ((Integer) h10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = k(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f1603j.getResources().getIdentifier(str, "id", this.f1603j.getPackageName()) : i10;
    }

    public View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1606u;
        if (viewArr == null || viewArr.length != this.f1602f) {
            this.f1606u = new View[this.f1602f];
        }
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            this.f1606u[i10] = constraintLayout.i(this.f1601c[i10]);
        }
        return this.f1606u;
    }

    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.n = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1605t = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(a.C0022a c0022a, s.b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        a.b bVar2 = c0022a.f1692e;
        int[] iArr = bVar2.f1726j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f1728k0;
            if (str != null) {
                if (str.length() > 0) {
                    a.b bVar3 = c0022a.f1692e;
                    String[] split = bVar3.f1728k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i11 = 0;
                    for (String str2 : split) {
                        int l10 = l(str2.trim());
                        if (l10 != 0) {
                            iArr2[i11] = l10;
                            i11++;
                        }
                    }
                    if (i11 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i11);
                    }
                    bVar3.f1726j0 = iArr2;
                } else {
                    c0022a.f1692e.f1726j0 = null;
                }
            }
        }
        if (bVar != null) {
            bVar.a();
            if (c0022a.f1692e.f1726j0 != null) {
                while (true) {
                    int[] iArr3 = c0022a.f1692e.f1726j0;
                    if (i10 >= iArr3.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = sparseArray.get(iArr3[i10]);
                    if (constraintWidget != null) {
                        bVar.b(constraintWidget);
                    }
                    i10++;
                }
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.n;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1605t;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void p(ConstraintWidget constraintWidget, boolean z10) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(d dVar, s.a aVar, SparseArray<ConstraintWidget> sparseArray) {
        aVar.a();
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            aVar.b(sparseArray.get(this.f1601c[i10]));
        }
    }

    public void setIds(String str) {
        this.n = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1602f = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1605t = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1602f = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                g(str.substring(i10));
                return;
            } else {
                g(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.n = null;
        this.f1602f = 0;
        for (int i10 : iArr) {
            f(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.n == null) {
            f(i10);
        }
    }

    public void t() {
        if (this.f1604m == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f1647q0 = (ConstraintWidget) this.f1604m;
        }
    }
}
