package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public boolean f820c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f821f;

    /* renamed from: j  reason: collision with root package name */
    public int f822j;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f822j = -1;
        int[] iArr = b7.k.G;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f820c = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f820c);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f821f != z10 && (!z10 || this.f820c)) {
            this.f821f = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z10) {
        if (this.f820c != z10) {
            this.f820c = z10;
            if (!z10 && this.f821f) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
