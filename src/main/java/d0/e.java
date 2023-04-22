package d0;

import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8605a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f8606b;

    public e(int i10, int i11) {
        this.f8605a = new int[]{i10, i11};
        this.f8606b = new float[]{0.0f, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f8605a = new int[]{i10, i11, i12};
        this.f8606b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f8605a = new int[size];
        this.f8606b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f8605a[i10] = list.get(i10).intValue();
            this.f8606b[i10] = list2.get(i10).floatValue();
        }
    }
}
