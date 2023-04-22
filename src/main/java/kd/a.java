package kd;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import jd.j;

/* loaded from: classes2.dex */
public final class a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f12065a;

    public a(f<T> fVar) {
        this.f12065a = fVar;
    }

    @Override // com.squareup.moshi.f
    public T fromJson(JsonReader jsonReader) {
        if (jsonReader.v() != JsonReader.Token.NULL) {
            return this.f12065a.fromJson(jsonReader);
        }
        StringBuilder m10 = a1.a.m("Unexpected null at ");
        m10.append(jsonReader.f());
        throw new JsonDataException(m10.toString());
    }

    @Override // com.squareup.moshi.f
    public void toJson(j jVar, T t2) {
        if (t2 != null) {
            this.f12065a.toJson(jVar, (j) t2);
            return;
        }
        StringBuilder m10 = a1.a.m("Unexpected null at ");
        m10.append(jVar.h());
        throw new JsonDataException(m10.toString());
    }

    public String toString() {
        return this.f12065a + ".nonNull()";
    }
}
