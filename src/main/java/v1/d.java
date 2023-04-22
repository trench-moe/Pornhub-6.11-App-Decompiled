package v1;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.appsflyer.oaid.BuildConfig;
import d0.h;
import e0.d;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class d {

    /* loaded from: classes2.dex */
    public static class a implements TypeEvaluator<d.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f15935a;

        @Override // android.animation.TypeEvaluator
        public d.a[] evaluate(float f10, d.a[] aVarArr, d.a[] aVarArr2) {
            d.a[] aVarArr3 = aVarArr;
            d.a[] aVarArr4 = aVarArr2;
            if (e0.d.a(aVarArr3, aVarArr4)) {
                if (!e0.d.a(this.f15935a, aVarArr3)) {
                    this.f15935a = e0.d.e(aVarArr3);
                }
                for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                    d.a aVar = this.f15935a[i10];
                    d.a aVar2 = aVarArr3[i10];
                    d.a aVar3 = aVarArr4[i10];
                    Objects.requireNonNull(aVar);
                    aVar.f8971a = aVar2.f8971a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = aVar2.f8972b;
                        if (i11 < fArr.length) {
                            aVar.f8972b[i11] = (aVar3.f8972b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return this.f15935a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0371, code lost:
        if (r26 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0373, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0375, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0384, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0386, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0392, code lost:
        if (r27 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0394, code lost:
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0398, code lost:
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x039b, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && d(i13)) || (z11 && d(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 != 2) {
            e eVar = i10 == 3 ? e.f15936a : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
            } else if (!z10) {
                if (z11) {
                    ofInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                }
                if (propertyValuesHolder == null && eVar != null) {
                    propertyValuesHolder.setEvaluator(eVar);
                    return propertyValuesHolder;
                }
            } else {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : d(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        d.a[] c10 = e0.d.c(string);
        d.a[] c11 = e0.d.c(string2);
        if (c10 == null && c11 == null) {
            return null;
        }
        if (c10 == null) {
            if (c11 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), c11);
            }
            return null;
        }
        a aVar = new a();
        if (c11 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c10);
        } else if (!e0.d.a(c10, c11)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c10, c11);
        }
        return ofObject;
    }

    public static boolean d(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray g10 = h.g(resources, theme, attributeSet, v1.a.f15920g);
        TypedArray g11 = h.g(resources, theme, attributeSet, v1.a.f15924k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j10 = h.f(xmlPullParser, "duration") ? g10.getInt(1, 300) : 300;
        int i10 = 0;
        long j11 = !h.f(xmlPullParser, "startOffset") ? 0 : g10.getInt(2, 0);
        int i11 = !h.f(xmlPullParser, "valueType") ? 4 : g10.getInt(7, 4);
        if (h.f(xmlPullParser, "valueFrom") && h.f(xmlPullParser, "valueTo")) {
            if (i11 == 4) {
                TypedValue peekValue = g10.peekValue(5);
                boolean z10 = peekValue != null;
                int i12 = z10 ? peekValue.type : 0;
                TypedValue peekValue2 = g10.peekValue(6);
                boolean z11 = peekValue2 != null;
                i11 = ((z10 && d(i12)) || (z11 && d(z11 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c10 = c(g10, i11, 5, 6, BuildConfig.FLAVOR);
            if (c10 != null) {
                valueAnimator4.setValues(c10);
            }
        }
        valueAnimator4.setDuration(j10);
        valueAnimator4.setStartDelay(j11);
        valueAnimator4.setRepeatCount(!h.f(xmlPullParser, "repeatCount") ? 0 : g10.getInt(3, 0));
        valueAnimator4.setRepeatMode(!h.f(xmlPullParser, "repeatMode") ? 1 : g10.getInt(4, 1));
        if (g11 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String e10 = h.e(g11, xmlPullParser, "pathData", 1);
            if (e10 != null) {
                String e11 = h.e(g11, xmlPullParser, "propertyXName", 2);
                String e12 = h.e(g11, xmlPullParser, "propertyYName", 3);
                if (e11 == null && e12 == null) {
                    throw new InflateException(g11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d = e0.d.d(e10);
                float f11 = 0.5f * f10;
                PathMeasure pathMeasure = new PathMeasure(d, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f12 = 0.0f;
                do {
                    f12 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f12));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d, false);
                int min = Math.min(100, ((int) (f12 / f11)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f13 = f12 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = g10;
                int i13 = 0;
                float f14 = 0.0f;
                while (true) {
                    if (i10 >= min) {
                        break;
                    }
                    int i14 = min;
                    pathMeasure2.getPosTan(f14 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i10] = fArr3[0];
                    fArr2[i10] = fArr3[1];
                    f14 += f13;
                    int i15 = i13 + 1;
                    if (i15 < arrayList.size() && f14 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i10++;
                    min = i14;
                }
                PropertyValuesHolder ofFloat = e11 != null ? PropertyValuesHolder.ofFloat(e11, fArr) : null;
                PropertyValuesHolder ofFloat2 = e12 != null ? PropertyValuesHolder.ofFloat(e12, fArr2) : null;
                if (ofFloat == null) {
                    i10 = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i10 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = g10;
                objectAnimator.setPropertyName(h.e(g11, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = g10;
        }
        if (h.f(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i10 = typedArray2.getResourceId(i10, i10);
        } else {
            typedArray2 = typedArray;
        }
        if (i10 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i10));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (g11 != null) {
            g11.recycle();
        }
        return valueAnimator3;
    }
}
