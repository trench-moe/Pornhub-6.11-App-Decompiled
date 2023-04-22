package androidx.media;

import a1.a;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2424a;

    /* renamed from: b  reason: collision with root package name */
    public int f2425b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2424a.equals(((AudioAttributesImplApi21) obj).f2424a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2424a.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a.m("AudioAttributesCompat: audioattributes=");
        m10.append(this.f2424a);
        return m10.toString();
    }
}
