package a2;

import java.util.Comparator;

/* loaded from: classes.dex */
public class a implements Comparator<int[]> {
    public a(b bVar) {
    }

    @Override // java.util.Comparator
    public int compare(int[] iArr, int[] iArr2) {
        return iArr[0] - iArr2[0];
    }
}
