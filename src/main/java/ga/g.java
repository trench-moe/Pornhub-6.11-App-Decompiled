package ga;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final p.g<String, h> f9897a = new p.g<>();

    /* renamed from: b  reason: collision with root package name */
    public final p.g<String, PropertyValuesHolder[]> f9898b = new p.g<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return c(arrayList);
            }
            return null;
        } catch (Exception e10) {
            StringBuilder m10 = a1.a.m("Can't load animation resource ID #0x");
            m10.append(Integer.toHexString(i10));
            Log.w("MotionSpec", m10.toString(), e10);
            return null;
        }
    }

    public static g c(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = list.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gVar.f9898b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f9887b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f9888c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.d;
            }
            h hVar = new h(startDelay, duration, interpolator);
            hVar.d = objectAnimator.getRepeatCount();
            hVar.f9902e = objectAnimator.getRepeatMode();
            gVar.f9897a.put(propertyName, hVar);
        }
        return gVar;
    }

    public <T> ObjectAnimator d(String str, T t2, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t2, e(str));
        ofPropertyValuesHolder.setProperty(property);
        f(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public PropertyValuesHolder[] e(String str) {
        if (g(str)) {
            PropertyValuesHolder[] orDefault = this.f9898b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i10 = 0; i10 < orDefault.length; i10++) {
                propertyValuesHolderArr[i10] = orDefault[i10].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f9897a.equals(((g) obj).f9897a);
        }
        return false;
    }

    public h f(String str) {
        if (this.f9897a.getOrDefault(str, null) != null) {
            return this.f9897a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean g(String str) {
        return this.f9898b.getOrDefault(str, null) != null;
    }

    public int hashCode() {
        return this.f9897a.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a0.a.m('\n');
        m10.append(g.class.getName());
        m10.append('{');
        m10.append(Integer.toHexString(System.identityHashCode(this)));
        m10.append(" timings: ");
        m10.append(this.f9897a);
        m10.append("}\n");
        return m10.toString();
    }
}
