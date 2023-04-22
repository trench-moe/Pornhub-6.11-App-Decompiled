package io.realm;

import io.realm.internal.Table;

/* loaded from: classes2.dex */
public class g extends z {
    public g(a aVar, io.realm.internal.b bVar) {
        super(aVar, bVar);
    }

    @Override // io.realm.z
    public x b(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Null or empty class names are not allowed");
        }
        String l10 = Table.l(str);
        if (this.f11038e.n.hasTable(l10)) {
            return new f(this.f11038e, this, this.f11038e.n.getTable(l10), c(str));
        }
        return null;
    }
}
