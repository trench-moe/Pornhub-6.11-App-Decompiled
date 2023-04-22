package io.realm;

import io.realm.internal.Table;

/* loaded from: classes2.dex */
public class i extends z {
    public i(a aVar) {
        super(aVar, null);
    }

    @Override // io.realm.z
    public x b(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Null or empty class names are not allowed");
        }
        String l10 = Table.l(str);
        if (this.f11038e.n.hasTable(l10)) {
            return new h(this.f11038e, this, this.f11038e.n.getTable(l10));
        }
        return null;
    }
}
