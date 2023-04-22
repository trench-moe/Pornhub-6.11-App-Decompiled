package ja;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;
import wa.d;

/* loaded from: classes2.dex */
public class b extends d {
    public final int U;
    public final int V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f11652a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f11653b0;

    /* renamed from: c0  reason: collision with root package name */
    public int[] f11654c0;

    public b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.U = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.V = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.W = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f11652a0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.f11654c0 = new int[5];
    }

    @Override // wa.d
    public wa.a e(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (x.e.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        e menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (f(getLabelVisibilityMode(), size2) && this.f11653b0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i12 = this.f11652a0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.W, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
                i12 = Math.max(i12, childAt.getMeasuredWidth());
            }
            int i13 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.V * i13), Math.min(i12, this.W));
            int i14 = size - min;
            int min2 = Math.min(i14 / (i13 == 0 ? 1 : i13), this.U);
            int i15 = i14 - (i13 * min2);
            int i16 = 0;
            while (i16 < childCount) {
                if (getChildAt(i16).getVisibility() != 8) {
                    this.f11654c0[i16] = i16 == getSelectedItemPosition() ? min : min2;
                    if (i15 > 0) {
                        int[] iArr = this.f11654c0;
                        iArr[i16] = iArr[i16] + 1;
                        i15--;
                    }
                } else {
                    this.f11654c0[i16] = 0;
                }
                i16++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.W);
            int i17 = size - (size2 * min3);
            for (int i18 = 0; i18 < childCount; i18++) {
                if (getChildAt(i18).getVisibility() != 8) {
                    int[] iArr2 = this.f11654c0;
                    iArr2[i18] = min3;
                    if (i17 > 0) {
                        iArr2[i18] = iArr2[i18] + 1;
                        i17--;
                    }
                } else {
                    this.f11654c0[i18] = 0;
                }
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f11654c0[i20], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i19 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i19, View.MeasureSpec.makeMeasureSpec(i19, 1073741824), 0), View.resolveSizeAndState(size3, i11, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f11653b0 = z10;
    }
}
