package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class s {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1079l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1080m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f1081a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1082b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1083c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1084e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1085f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1086g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1087h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1088i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1089j;

    /* renamed from: k  reason: collision with root package name */
    public final c f1090k;

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // androidx.appcompat.widget.s.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) s.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.appcompat.widget.s.a, androidx.appcompat.widget.s.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.s.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) s.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public s(TextView textView) {
        this.f1088i = textView;
        this.f1089j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1090k = new b();
        } else if (i10 >= 23) {
            this.f1090k = new a();
        } else {
            this.f1090k = new c();
        }
    }

    public static Method d(String str) {
        try {
            Method method = f1080m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1080m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t2) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t2;
        }
    }

    public void a() {
        if (i() && this.f1081a != 0) {
            if (this.f1082b) {
                if (this.f1088i.getMeasuredHeight() > 0) {
                    if (this.f1088i.getMeasuredWidth() <= 0) {
                        return;
                    }
                    int measuredWidth = this.f1090k.b(this.f1088i) ? 1048576 : (this.f1088i.getMeasuredWidth() - this.f1088i.getTotalPaddingLeft()) - this.f1088i.getTotalPaddingRight();
                    int height = (this.f1088i.getHeight() - this.f1088i.getCompoundPaddingBottom()) - this.f1088i.getCompoundPaddingTop();
                    if (measuredWidth > 0) {
                        if (height <= 0) {
                            return;
                        }
                        RectF rectF = f1079l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float c10 = c(rectF);
                            if (c10 != this.f1088i.getTextSize()) {
                                f(0, c10);
                            }
                        }
                    }
                }
                return;
            }
            this.f1082b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(android.graphics.RectF r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s.c(android.graphics.RectF):int");
    }

    public void f(int i10, float f10) {
        Context context = this.f1089j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1088i.getPaint().getTextSize()) {
            this.f1088i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f1088i.isInLayout();
            if (this.f1088i.getLayout() != null) {
                this.f1082b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.f1088i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f1088i.forceLayout();
                } else {
                    this.f1088i.requestLayout();
                }
                this.f1088i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1081a == 1) {
            if (!this.f1086g || this.f1085f.length == 0) {
                int floor = ((int) Math.floor((this.f1084e - this.d) / this.f1083c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1083c) + this.d);
                }
                this.f1085f = b(iArr);
            }
            this.f1082b = true;
        } else {
            this.f1082b = false;
        }
        return this.f1082b;
    }

    public final boolean h() {
        int[] iArr = this.f1085f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1086g = z10;
        if (z10) {
            this.f1081a = 1;
            this.d = iArr[0];
            this.f1084e = iArr[length - 1];
            this.f1083c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f1088i instanceof AppCompatEditText);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f1081a = 1;
            this.d = f10;
            this.f1084e = f11;
            this.f1083c = f12;
            this.f1086g = false;
        }
    }
}
