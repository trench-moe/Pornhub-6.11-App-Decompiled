package io.realm;

import io.realm.internal.Table;
import io.realm.x;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class f extends x {
    public f(a aVar, z zVar, Table table) {
        super(aVar, zVar, table, new x.a(table));
    }

    public f(a aVar, z zVar, Table table, io.realm.internal.c cVar) {
        super(aVar, zVar, table, cVar);
    }

    @Override // io.realm.x
    public x a(String str, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.x
    public ee.c f(String str, RealmFieldType... realmFieldTypeArr) {
        a0 a0Var = new a0(this.f11030a);
        Table table = this.f11032c;
        Pattern pattern = ee.c.f9313h;
        return ee.c.c(a0Var, table, str, null, new HashSet(Arrays.asList(realmFieldTypeArr)));
    }

    @Override // io.realm.x
    public x g(String str) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.x
    public x h(x.c cVar) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}
