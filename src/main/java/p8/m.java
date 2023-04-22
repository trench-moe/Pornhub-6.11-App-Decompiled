package p8;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class m implements Comparator<q> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(q qVar, q qVar2) {
        return qVar.getClass().getCanonicalName().compareTo(qVar2.getClass().getCanonicalName());
    }
}
