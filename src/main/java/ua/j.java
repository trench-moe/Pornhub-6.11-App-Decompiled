package ua;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.p0;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f15816a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f15817b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13029y0, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f15817b, "Theme.MaterialComponents");
            }
        }
        c(context, f15816a, "Theme.AppCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r8, android.util.AttributeSet r9, int[] r10, int r11, int r12, int... r13) {
        /*
            r4 = r8
            int[] r0 = m9.a.f13029y0
            r6 = 4
            android.content.res.TypedArray r6 = r4.obtainStyledAttributes(r9, r0, r11, r12)
            r0 = r6
            r1 = 2
            r6 = 3
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L17
            r7 = 6
            r0.recycle()
            return
        L17:
            r6 = 2
            r6 = -1
            r1 = r6
            if (r13 == 0) goto L42
            int r3 = r13.length
            if (r3 != 0) goto L20
            goto L43
        L20:
            r6 = 1
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r9, r10, r11, r12)
            r4 = r7
            int r9 = r13.length
            r7 = 1
            r10 = 0
            r7 = 5
        L2a:
            if (r10 >= r9) goto L3d
            r11 = r13[r10]
            r7 = 5
            int r11 = r4.getResourceId(r11, r1)
            if (r11 != r1) goto L3a
            r4.recycle()
            r7 = 2
            goto L4d
        L3a:
            int r10 = r10 + 1
            goto L2a
        L3d:
            r7 = 5
            r4.recycle()
            goto L4b
        L42:
            r6 = 6
        L43:
            int r7 = r0.getResourceId(r2, r1)
            r4 = r7
            if (r4 == r1) goto L4d
            r7 = 6
        L4b:
            r7 = 1
            r2 = r7
        L4d:
            r0.recycle()
            if (r2 == 0) goto L53
            return
        L53:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r7 = 4
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r9 = r6
            r4.<init>(r9)
            r6 = 7
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.j.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z10 = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException(android.support.v4.media.b.j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static p0 e(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return new p0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }
}
