package ya;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f18574a;

    /* renamed from: b  reason: collision with root package name */
    public int f18575b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f18576c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f18577e;

    /* renamed from: f  reason: collision with root package name */
    public int f18578f;

    public c(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f18576c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = m9.a.f13030z;
        ua.j.a(context, attributeSet, i10, i11);
        ua.j.b(context, attributeSet, iArr, i10, i11, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        this.f18574a = za.c.c(context, obtainStyledAttributes, 8, dimensionPixelSize);
        this.f18575b = Math.min(za.c.c(context, obtainStyledAttributes, 7, 0), this.f18574a / 2);
        this.f18577e = obtainStyledAttributes.getInt(4, 0);
        this.f18578f = obtainStyledAttributes.getInt(1, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.f18576c = new int[]{l9.e.d(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.f18576c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.f18576c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = obtainStyledAttributes.getColor(6, -1);
        } else {
            this.d = this.f18576c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = l9.e.b(this.d, (int) (f10 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void a();
}
