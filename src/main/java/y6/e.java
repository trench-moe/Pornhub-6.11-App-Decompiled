package y6;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f18443c = new e(new int[]{2}, 8);
    public static final e d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18444e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a  reason: collision with root package name */
    public final int[] f18445a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18446b;

    /* loaded from: classes2.dex */
    public static final class a {
        public static int[] a() {
            int[] iArr;
            kb.a aVar = ImmutableList.f7944f;
            kb.d.b(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i10 = 0;
            boolean z10 = false;
            for (int i11 : e.f18444e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i11).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    Integer valueOf = Integer.valueOf(i11);
                    Objects.requireNonNull(valueOf);
                    int i12 = i10 + 1;
                    if (objArr.length < i12) {
                        objArr = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i12));
                    } else {
                        if (z10) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i10] = valueOf;
                        i10++;
                    }
                    z10 = false;
                    objArr[i10] = valueOf;
                    i10++;
                }
            }
            Objects.requireNonNull(2);
            int i13 = i10 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i13));
            } else if (z10) {
                objArr = (Object[]) objArr.clone();
            }
            objArr[i10] = 2;
            return Ints.b(ImmutableList.p(objArr, i10 + 1));
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f18445a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f18445a = new int[0];
        }
        this.f18446b = i10;
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.f18445a, i10) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return Arrays.equals(this.f18445a, eVar.f18445a) && this.f18446b == eVar.f18446b;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f18445a) * 31) + this.f18446b;
    }

    public String toString() {
        int i10 = this.f18446b;
        String arrays = Arrays.toString(this.f18445a);
        StringBuilder sb2 = new StringBuilder(a0.a.e(arrays, 67));
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
