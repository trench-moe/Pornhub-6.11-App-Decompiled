package androidx.media;

import android.util.SparseIntArray;
import w1.c;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2422b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f2423a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.f2423a;
            if (audioAttributesImpl == null) {
                return audioAttributesCompat.f2423a == null;
            }
            return audioAttributesImpl.equals(audioAttributesCompat.f2423a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2423a.hashCode();
    }

    public String toString() {
        return this.f2423a.toString();
    }
}
